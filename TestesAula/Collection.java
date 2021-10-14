package JavaCollectionException;

import java.util.*;

public class Collection {

	public static void main(String[] args) {
		
		// Cria um ArrayList
		List<Integer> lista = new ArrayList<Integer>();
		
		// Adiciona Elementos
		lista.add(8);
		lista.add(10);
		lista.add(19);
		lista.add(29);
		lista.add(8);
	
		// Print da ArrayList
		int a = 1;
		for(Integer L: lista) {
			System.out.println(" "+a+") "+L);
			a++;
		}
		
		System.out.println("\n Remover");
		System.out.println();
		lista.remove(4);
		
		for(Integer L: lista) {
			System.out.println(" "+L);
		}
		
		int first = lista.get(0);
		System.out.print("\n O primeiro numero é: "+first);
		
		System.out.println();
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\n Elemento: "+lista.get(i));
		}
		
		Collections.sort(lista);
		System.out.println("\n Depois de Ordenado...");
		System.out.println(" "+lista);
		
		System.out.println();
		System.out.println(" ----------------------------");
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(8);
		meuSet.add(19);
		meuSet.add(2002);
		meuSet.add(29);
		meuSet.add(1);
		
		for(Integer L: meuSet) {
			System.out.println(" "+L);
		}
		
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext()) {
			System.out.println(" "+iMeuSet.next());
		}	
	}	
}
