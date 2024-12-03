package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class AlgunoMultiploTres {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(7);
		list.add(17);
		list.add(11);
		
		System.out.println(anyMultTres(list));
	}

	public static boolean anyMultTres(ArrayList<Integer>list) {
		for(int i =0; i<list.size(); i++) {
			int number = list.get(i);
			if (number %3==0) {
				return true;
		
		}
		
	}
		return false;

}

}