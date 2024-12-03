package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class ConcatenacionU {

	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList <>();
		list.add("zapato");
		list.add("mauzana");
		list.add("turtilla");
		
		System.out.println(concatenacionU(list));
		
	}
	public static String concatenacionU(ArrayList<String> toas) {
		String cajon ="";
		for(int i=0; i<toas.size();i++) {
			String elemento = toas.get(i);
			if(elemento.contains("u")){
				cajon += elemento;
			}
		}
		
	
		
		
		
		return cajon;
	}
}

