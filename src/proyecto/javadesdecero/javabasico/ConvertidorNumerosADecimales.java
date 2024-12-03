package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class ConvertidorNumerosADecimales {

	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<>();
		list.add(500);
		list.add(42);
		list.add(66);
		
		System.out.println(transformer(list));

	}

	public static ArrayList<Double> transformer(ArrayList<Integer> list) {
		ArrayList<Double> nueva = new ArrayList<>();
		for(int i=0; i<list.size();i++) {
			int elemento = list.get(i);
			nueva.add(Double.valueOf(elemento));
		}
		return nueva;
	}

}
