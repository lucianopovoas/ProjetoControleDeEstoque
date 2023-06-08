import java.util.Scanner;

public class Testar {

	public static void main(String[] args) {

		RoupaPMG camisa = new RoupaPMG("Camisa",2,3,6,1,10);
		RoupaPMG saia = new RoupaPMG("Saia",5,3,6,1,10);
		Acessorio cinto = new Acessorio("Cinto",3,1,10);
		Acessorio pulseira = new Acessorio("Pulseira",3,1,10);
		RoupaTamanhoUnico saidaDePraia = new RoupaTamanhoUnico("Saida de Praia",3,1,10);
		
		
		String[] vetor = new String[5];
        vetor[0] = "Camisa";
        vetor[1] = "Saia";
        vetor[2] = "Cinto";
        vetor[3] = "Pulseira";
        vetor[4] = "Saída de praia";

        Scanner scanner = new Scanner(System.in);

        int opcao = -1;
        while (opcao != 5) {
            System.out.println("Escolha uma opção:");
            for (int i = 0; i < vetor.length; i++) {
                System.out.println(i + " - " + vetor[i]);
            }
            System.out.println("5 - Sair do sistema");

            opcao = scanner.nextInt();

            if (opcao >= 0 && opcao < vetor.length) {
                System.out.println("Você escolheu: " + vetor[opcao]);
                
                switch(opcao) {
                
                case 0:
                	camisa.venda();
               	break;
               	
                case 1:
                	saia.venda();
                break;
                
                case 2:
                	cinto.venda();
                break;
                
                case 3:
                	pulseira.venda();
                break;
                
                case 4:
                	saidaDePraia.venda();
                break;
                
                }
                
            } else if (opcao != 5) {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("Sistema encerrado.");
    }

	}
