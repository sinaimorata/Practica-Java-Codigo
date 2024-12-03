package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class resolverProblemaTipoEntrevista {

	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(15);
		list.add(1);
		list.add(7);
		
		System.out.println(siEsDivisible(list));
	}

	private static ArrayList<String> siEsDivisible(ArrayList<Integer> list) {
		ArrayList<String> definitiva = new ArrayList<>();
		for(int i=0; i<list.size();i++) {
			int elemento = list.get(i);
			if (elemento % 3==0 && elemento %5==0){
				definitiva.add("fizz buzz");
			}else if (elemento %3==0){
				definitiva.add("fizz");
			}else if (elemento %5==0){
				definitiva.add("buzz");
			}else {
				definitiva.add(String.valueOf(elemento));
			}
			
			
			
		}
		return definitiva;
		
	}
	
}


