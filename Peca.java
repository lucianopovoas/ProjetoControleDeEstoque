import java.util.Scanner;

public abstract class Peca {
	private String descricao;
	private int quantidade;
	private int estoqueMinimo;
	private int estoqueMaximo;
	
	public Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		super();
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}

	
	
	@Override
	public String toString() {
		return "[Descricao=" + descricao + ", Quantidade=" + quantidade + ", EstoqueMinimo=" + estoqueMinimo
				+ ", EstoqueMaximo=" + estoqueMaximo + "]";
	}



	Scanner scan = new Scanner(System.in);	
	
	public abstract void venda();
	
	public void reposicaoEstoque() {
			if(this.getQuantidade() <= this.getEstoqueMinimo()) {
				this.setQuantidade(this.getEstoqueMaximo());
				System.out.println("Reposição de Estoque Feita! " + this.getQuantidade() + " Peças Disponiveis");
			}
		}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}
	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}
	public int getEstoqueMaximo() {
		return estoqueMaximo;
	}
	public void setEstoqueMaximo(int estoqueMaximo) {
		this.estoqueMaximo = estoqueMaximo;
	}

	
}
