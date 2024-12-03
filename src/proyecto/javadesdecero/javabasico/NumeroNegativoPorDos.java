package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class NumeroNegativoPorDos {

	

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();
		list.add(-1.0);
		list.add(-7.1);
		list.add(17.2);
		list.add(11.0);
		
		System.out.println(multiplicaPorDos(list));
		

	}

	public static ArrayList multiplicaPorDos(ArrayList<Double> list) {
		ArrayList<Double> acumuladora = new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			double number = list.get(i);
			if(number<0) {
				number = (number*2);
				acumuladora.add(number);
			}else {
				acumuladora.add(number);
			}
		}
		return acumuladora;
	}

}

		