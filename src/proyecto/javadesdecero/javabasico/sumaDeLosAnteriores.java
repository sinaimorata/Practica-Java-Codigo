package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class sumaDeLosAnteriores {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		//list.add(0);
		
		System.out.println(sumaAnteriores(list));
	}

	public static boolean sumaAnteriores(ArrayList<Integer> list) {
		int variablica = list.get(0) + list.get(1);
		for(int i=2; i<list.size();i++) {
			int number = list.get(i);
			if(number != variablica) {
				return false;
			}
		}
		return true;
	}

}
