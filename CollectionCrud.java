package JavaCollectionException;

import java.util.*;

public class CollectionCrud {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		int op;
		
		// Criação da ArrayList
		ArrayList<String> Est = new ArrayList();
		
		do {	// Menu de Opções
			try {
			System.out.print("\n --------------------------------------------");
			System.out.print("\n\t      Gestão de Estoque");
			System.out.print("\n --------------------------------------------");
			System.out.print("\n 1) Adicionar produtos");
			System.out.print("\n 2) Remover produtos");
			System.out.print("\n 3) Atualizar produtos");
			System.out.print("\n 4) Dados do estoque");
			System.out.print("\n 0) Sair");
			System.out.print("\n\n Opção: "); op = ler.nextInt();
			
			switch(op) {
			
			case 1:
				ler.nextLine();
				System.out.print("\n Digite o nome do produto: "); String prod1 = ler.nextLine();
				Est.add(prod1); // Adiciona produto na Array
				break;
				
			case 2:
				ler.nextLine();
				System.out.print("\n Digite o produto a ser removido: "); String prod2 = ler.nextLine();
				if (Est.contains(prod2)) { Est.remove(prod2); }	// Remove produto da Array se houver.
				else { System.out.print("\n Este produto não existe no estoque!"); }
				break;
			
			case 3:
				ler.nextLine();
				System.out.print("\n Digite o produto a ser atualizado: "); String verifica = ler.nextLine();
				if (Est.contains(verifica)) {
					System.out.print("\n Produto: "+verifica+"\n Digite o nome do novo produto: ");
					String prod3 = ler.nextLine(); Est.add(prod3); Est.remove(verifica);	// Atualiza o produto, removendo o antigo e implementando o novo
				}
				else { System.out.print("\n Este produto não existe no estoque!"); }
				break;
			
			case 4:
				ler.nextLine();
				System.out.print(" --------------------------------------------");
				System.out.print("\n\t\t  ESTOQUE\n");
				for (String P: Est) {	// FOR EACH para exibir ArrayList
					System.out.print("\n "+P);
				}
				System.out.print("\n --------------------------------------------");
				break;
			
			default: System.out.println("\n OPÇÃO INVÁLIDA!!"); break;
				}
			} catch (InputMismatchException I) {
				// system.ERR.print mostra a mensagem de outra cor para informar um ERRO
				System.err.printf("\n Exception: %s\n", I);
				
				System.out.print("\n Você deve entrar com um valor do tipo INTEIRO...\n "
						+ "Por favor tente novamente! ");
				ler.nextLine(); // Limpa o cache, para não ficar no loop infinito
				op = 1;	// Retorna para o loop Do/While
			}
			
		} while (op != 0);
	}	
}
