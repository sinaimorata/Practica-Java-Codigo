package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class TodosIguales {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList <>();
		list.add(40);
		list.add(40);
		list.add(40);
		list.add(40);
		
		System.out.println( "Resultado: " +igual(list));
	

	}

	public static String igual (ArrayList<Integer> list) {
		int variable = list.get(0);
		for(int i=1; i<list.size();i++) {
			int elemento = list.get(i);
			if (elemento != variable){
				return "No todos los elementos de tu lista son iguales";
			}
		
	}
		return  "todos los elementos de tu lista son iguales";
}

}