package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class LIstaDeListas {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(34);	
		list.add(4);
		list.add(340);
		list.add(14);
		list.add(41);
		list.add(33);
		list.add(36);
	
		System.out.println(conversora(list));
	
	}

	public static ArrayList conversora(ArrayList<Integer> list) {
		ArrayList <ArrayList<Integer>> ListaDeListas = new ArrayList<>();
		for(int i=0; i<list.size();i++) {
			ArrayList<Integer>miniLista = new ArrayList<>();
			miniLista.add(list.get(i));
			ListaDeListas.add(miniLista);
				
			}
		
		return ListaDeListas;
		
	}

}
