package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class Multiplo3True {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList <>();
		list.add(40);
		list.add(0);
		list.add(100);
		list.add(7);
		
		System.out.println("Es multiplo de tres: " + multiplo(list));
		

	}

	public static boolean multiplo(ArrayList<Integer> list) {
		int variablica = 1;
		for(int i =1; i<list.size();i++) {
			int numero = list.get(i);
			if(numero %3 != 0) {
				return false;
			}
		}
		return true;
		
	}	
}
	
