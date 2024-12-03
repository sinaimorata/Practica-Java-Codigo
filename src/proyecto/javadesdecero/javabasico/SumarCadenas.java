package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class SumarCadenas {

	public static void main(String[] args) {
		ArrayList <String> cadeninasJuntas = new ArrayList<String>();
		cadeninasJuntas.add("hola");
		cadeninasJuntas.add("adios");
		cadeninasJuntas.add("ciao");
		cadeninasJuntas.add("buenos dias");
		cadeninasJuntas.add("buenas noches");
		
		System.out.println(atarCadenas(cadeninasJuntas));
		

	}
	public static String atarCadenas(ArrayList<String>a) {
		String sandalia = "";
		for( int i=0; i<a.size();i++) {
			sandalia += a.get(i);
			
		}
		
		return sandalia ;
	}
	
}