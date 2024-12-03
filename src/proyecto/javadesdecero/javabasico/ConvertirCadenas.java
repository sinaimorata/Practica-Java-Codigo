package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class ConvertirCadenas {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.println(convertirACadenas(list));
	}

	public static ArrayList<String> convertirACadenas(ArrayList<Integer> list) {
		ArrayList<String> cadeninas = new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			String elemento = String.valueOf(list.get(i));
			cadeninas.add(elemento);
			
		}
		return cadeninas;
	}

}
