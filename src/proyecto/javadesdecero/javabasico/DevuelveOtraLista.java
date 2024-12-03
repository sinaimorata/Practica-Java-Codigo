package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class DevuelveOtraLista {

	public static void main(String[] args) {
		
		ArrayList<Integer>list = new ArrayList<>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(17);
		
		System.out.println(mundoCambiado(list));
		
	}
	//RECUERDA "OBJECT" ES LA CLASE PADRE
	public static ArrayList<Object> mundoCambiado(ArrayList<Integer> list) {
		ArrayList<Object> mezcla = new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			int numerin = list.get(i);
			if(numerin %3==0) {
				mezcla.add("Fizz");
			}else if(numerin %5==0) {
				mezcla.add("Buzz");
			}else if(numerin %3==0 && numerin %5==0) {
				mezcla.add("Fizz Buzz");
			}else {
				mezcla.add(numerin);
			}
			
}
		return mezcla;
}
	
}	