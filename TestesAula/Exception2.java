package JavaCollectionException;

import java.util.*;

public class Exception2 {

	public static int quociente (int numerador, int denominador) throws ArithmeticException {
		return numerador / denominador;
	}
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		boolean loop = true;
		
		do {
			
			try { // Lê dois números e calcula o quociente
				
				System.out.print("\n Digite o numerador: "); int numerador = ler.nextInt();
				System.out.print("\n Digite o denominador: "); int denominador = ler.nextInt();
				
				int result = quociente(numerador,denominador);
				
				System.out.printf("\n Resultado: %d / %d = %d",numerador,denominador,result);
				
				loop = false;	// Para sair do laço
				
			} catch (InputMismatchException I) { 
				
				// system.ERR.print mostra a mensagem de outra cor para informar um ERRO
				System.err.printf("\n Exception: %s\n", I);
				
				System.out.print("\n Você deve entrar com um valor do tipo INTEIRO...\n "
						+ "Por favor tente novamente! ");
				ler.nextLine(); // Limpa o cache, para não ficar no loop infinito
				
			} catch (ArithmeticException E) {
				
				System.err.printf("\n Exception: %s\n", E);
				System.out.print("\n Zero é um denominador INVÁLIDO...\n "
						+ "Por favor tente novamente! ");
				ler.nextLine();// Limpa o cache, para não ficar no loop infinito

			}
			
		} while (loop);
	}
}
