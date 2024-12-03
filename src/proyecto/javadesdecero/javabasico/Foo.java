package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class Foo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
			list.add(2);
			list.add(15);
			list.add(25);
			list.add(19);
			
			System.out.println(transformer(list));
				
	}

	public static ArrayList<String> transformer(ArrayList<Integer> list) {
		ArrayList<String> cambiada = new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			int element = list.get(i);
			if (element  %3 ==0) {
				cambiada.add("Fizz");
			}else if(element %5 ==0) {
				cambiada.add("Buzz");
			}else if(element %3==0 && element %5==0) {
				cambiada.add("FizzBuzz");
			}else {
			element= list.get(i);
			cambiada.add(String.valueOf(element));
		}
		
	}
		return cambiada;

	}
	
}
