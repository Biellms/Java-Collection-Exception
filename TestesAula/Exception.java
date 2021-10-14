package JavaCollectionException;

public class Exception {

	public static void main(String[] args) {
	
		String frase = null;
		String novaFrase = null;
		
		// Criando um exception, onde a frase não pode ser nula para colocar em maiusculo
		try {
			
			novaFrase = frase.toUpperCase(); // Frase Maiuscula
			
		} catch (NullPointerException e) { // Captura de uma possível exceção
			
			// Tratando a exceção
			System.out.print("\n A frase inicial está nula, para solucionar tal problema,\n foi atribuido um valor NULL.");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		
		System.out.print("\n Franse Antiga: "+frase);
		System.out.print("\n Franse Nova: "+novaFrase);
		
	}
}
