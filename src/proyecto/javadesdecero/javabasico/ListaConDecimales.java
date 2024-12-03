package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class ListaConDecimales {

	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(conversor(list));
	}

	public static ArrayList<Double> conversor(ArrayList<Integer> list) {
		ArrayList <Double> resultante = new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			Double numerico = (double) list.get(i); 
			resultante.add(numerico);
		}
		return resultante;
	}

}
