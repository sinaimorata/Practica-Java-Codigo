package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class ConversionDecimales {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(5);
		list.add(7);
		
		System.out.println(toFloats(list));

	}

	private static ArrayList<Float> toFloats(ArrayList<Integer> list) {
		
		ArrayList<Float> vacia = new ArrayList<>();
		
		for (int i=0; i<list.size();i++) {
		float decimal =list.get(i).floatValue();
		vacia.add(decimal);
	
		
	}
	  return vacia;
}

}