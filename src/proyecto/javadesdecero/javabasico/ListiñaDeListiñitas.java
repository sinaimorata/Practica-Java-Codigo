package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class ListiñaDeListiñitas {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList <>();
		list.add(40);
		list.add(0);
		list.add(100);
		list.add(7);
		
		System.out.println(definitiva(list));

	}

	public static ArrayList<ArrayList<Integer>> definitiva(ArrayList<Integer> a) {
		ArrayList<ArrayList<Integer>> acumuladora = new ArrayList<>();
		for(int i=0;i<a.size();i++) {
			ArrayList<Integer>sublistica = new ArrayList <>();
			sublistica.add(a.get(i));
			acumuladora.add(sublistica);
		
		
	}
		return acumuladora;
		

}
	
}	
	
