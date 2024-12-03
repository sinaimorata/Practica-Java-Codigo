package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class GranCadena {

	public static void main(String[] args) {
	
		ArrayList<String> GranCadena = new ArrayList<>();
		
		GranCadena.add("hola");
		GranCadena.add("hola mundo");
		GranCadena.add("ciao pescao");
		
		System.out.println(encadena(GranCadena));
	}

	public static String encadena(ArrayList<String> GranCadena) {
		String acumulador = "";
		for (int i=0;i< GranCadena.size(); i++) {
			acumulador += GranCadena.get(i);
		}
		return acumulador;
	}

	
	}
	
