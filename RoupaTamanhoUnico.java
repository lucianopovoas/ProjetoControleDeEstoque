
public class RoupaTamanhoUnico extends Peca implements Item{

	public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
	}

	@Override
	public void venda() {
		if(this.getQuantidade() > 0) {
			this.setQuantidade(getQuantidade() - 1);
			System.out.println("Vendeu 1, Tem no Estoque: " + this.getQuantidade());
		}
		if(this.getQuantidade() <= 0){
			reposicaoEstoque();
		}
	
	}
}
