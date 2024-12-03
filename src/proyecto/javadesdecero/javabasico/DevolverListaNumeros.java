package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class DevolverListaNumeros {

	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<>();
		list.add("la");
		list.add("tres");
		list.add("aa");
		
		System.out.println(apanio(list));


	}

	public static ArrayList<Integer> apanio(ArrayList<String> list) {
		ArrayList<Integer>definitiva = new ArrayList<>();
		for(int i=0; i<list.size();i++) {
			int variablina = list.get(i).length();
			definitiva.add(variablina);
		}
		return definitiva;
		
	}
		
}
