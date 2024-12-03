package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class DoubleIfNeg {

	public static void main(String[] args) {
		double pedro = 2;
		ArrayList<Double> otra = new ArrayList<>();
		otra.add(5.00);
		otra.add(-25.4);
		otra.add(44.00);
		otra.add(-4567.2);
		
		System.out.println(cambiador(otra, pedro));
			
			
		
	}

	public static ArrayList<Double> cambiador(ArrayList<Double>a,double b) {
		
		ArrayList<Double> nueva = new ArrayList<>();
		for (int i=0;i<a.size();i++) {
			double numero = a.get(i);
			if (numero<0) {
				numero = a.get(i)*b;
			}else {
				numero = a.get(i);
			}
			nueva.add(numero);
		}
			
		return nueva;
	}

}


	