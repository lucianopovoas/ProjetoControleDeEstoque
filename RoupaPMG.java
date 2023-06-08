import java.util.Scanner;

public class RoupaPMG implements Item{
	private String descricao;
	private int quantidadeP;
	private int quantidadeM;
	private int quantidadeG;
	private int estoqueMinimo;
	private int estoqueMaximo;
	
	public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo,
			int estoqueMaximo) {
		this.descricao = descricao;
		this.quantidadeP = quantidadeP;
		this.quantidadeM = quantidadeM;
		this.quantidadeG = quantidadeG;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}
	
	@Override
	public String toString() {
		return "[Descricao=" + descricao + ", QuantidadeP=" + quantidadeP + ", QuantidadeM=" + quantidadeM
				+ ", QuantidadeG=" + quantidadeG + ", EstoqueMinimo=" + estoqueMinimo + ", EstoqueMaximo="
				+ estoqueMaximo + "]";
	}



	Scanner scan = new Scanner(System.in);
	
	public void venda() {
		System.out.println("Escreva Qual o Modelo Vendeu P, M OU G");
		String tamanho = scan.nextLine();
			if(tamanho.equalsIgnoreCase("P") && this.getQuantidadeP() > 0) {
				this.setQuantidadeP(getQuantidadeP() - 1);
				System.out.println("1 P vendida, restam: " + this.getQuantidadeP());
			}
			if(tamanho.equalsIgnoreCase("P") && this.getQuantidadeP() <= 0){
				reposicaoEstoque();
				System.out.println("Reposição feita com sucesso " + this.getQuantidadeP() + " P Disponiveis");
			}
			
			if(tamanho.equalsIgnoreCase("M") && this.getQuantidadeP() > 0) {
				this.setQuantidadeM(getQuantidadeM() - 1);
				System.out.println("1 M vendida, restam: " + this.getQuantidadeM());
			}
			
			if(tamanho.equalsIgnoreCase("M") && this.getQuantidadeM() <= 0){
				reposicaoEstoque();
				System.out.println("Reposição feita com sucesso " + this.getQuantidadeM() + " M Disponiveis");
			}

			if(tamanho.equalsIgnoreCase("G") && this.getQuantidadeP() > 0) {
				this.setQuantidadeG(getQuantidadeG() - 1);
				System.out.println("1 G vendida, restam: " + this.getQuantidadeG());
			}
			
			if(tamanho.equalsIgnoreCase("G") && this.getQuantidadeG() <= 0){
				reposicaoEstoque();
				System.out.println("Reposição feita com sucesso " + this.getQuantidadeG() + " G Disponiveis");
			}
	}
	
	public void reposicaoEstoque() {
		if(this.getQuantidadeP() < this.getEstoqueMinimo()) {
			this.setQuantidadeP(getEstoqueMaximo());
		}
		if(this.getQuantidadeM() < this.getEstoqueMinimo()) {
			this.setQuantidadeM(getEstoqueMaximo());
		}
		if(this.getQuantidadeG() < this.getEstoqueMinimo()) {
			this.setQuantidadeG(getEstoqueMaximo());
		}
	}
	
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidadeP() {
		return quantidadeP;
	}
	public void setQuantidadeP(int quantidadeP) {
		this.quantidadeP = quantidadeP;
	}
	public int getQuantidadeM() {
		return quantidadeM;
	}
	public void setQuantidadeM(int quantidadeM) {
		this.quantidadeM = quantidadeM;
	}
	public int getQuantidadeG() {
		return quantidadeG;
	}
	public void setQuantidadeG(int quantidadeG) {
		this.quantidadeG = quantidadeG;
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
