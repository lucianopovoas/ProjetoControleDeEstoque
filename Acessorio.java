import java.util.Scanner;

public class Acessorio extends Peca implements Item{

	public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
	}

	Scanner scan = new Scanner(System.in);
	
	@Override
	public void venda() {
		if(this.getQuantidade() > 0) {
			System.out.println("Tem no Estoque: " + this.getQuantidade() + " Digite a Quantidade que Vendeu: ");
			int v = scan.nextInt();
				if(v <= this.getQuantidade()) {
					this.setQuantidade(getQuantidade() - v);
					System.out.println("Ainda Tem no Estoque: " + this.getQuantidade());
				}else {
					System.out.println("Erro, não tem essa quantidade de peças");
				}
		}
		if(this.getQuantidade() <= 0){
			reposicaoEstoque();
		}
	}
}
