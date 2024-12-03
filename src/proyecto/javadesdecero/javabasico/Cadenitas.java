package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class Cadenitas {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("hola");
		list.add("hola mundo");
		list.add("ciao pescao");
		
		System.out.println(SumaCadenas(list));
				

	}
	public static int SumaCadenas (ArrayList<String>list) {
		int acumulador = 0;
		for (int i=0; i<list.size();i++){
			 acumulador ++;//Incrementamos el contador por cadena en la lista
		}
		return acumulador;
	}
}
