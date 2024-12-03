package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;
import java.util.Collections;

public class MayorElemento {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList <>();
		list.add(40);
		list.add(0);
		list.add(100);
		list.add(7);
		
		System.out.println("El mayor elemento es: " + mayor(list));
		
	}
	public static int mayor(ArrayList <Integer> list) {
		int acumulador = list.get(0);
		for(int i=1; i<list.size();i++) {
			int elemento = list.get(i);
			if (elemento>acumulador) {
				acumulador = elemento;
			}
		}
		return acumulador;
		
	}

}