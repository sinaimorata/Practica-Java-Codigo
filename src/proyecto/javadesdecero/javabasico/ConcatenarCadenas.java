package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class ConcatenarCadenas {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("tomate");
		list.add("lechuga");
		list.add("aceitunas");
		list.add("atun");
		list.add("ensalada");	
				 
	    System.out.print(sumaCadenas(list));

	}

	public static String sumaCadenas(ArrayList<String> list) {
		String variablica = "";
		for(int i=0; i<list.size();i++) {
		variablica += list.get(i);
	}
		return variablica;
}

}