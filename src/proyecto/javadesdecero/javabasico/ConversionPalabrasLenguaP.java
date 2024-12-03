package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;
import java.util.List;

public class ConversionPalabrasLenguaP {

	public static void main(String[] args) {
		String palabra ="papelico";
		ArrayList<String> listaDeCaracteres = conversor(palabra);
		System.out.println(listaDeCaracteres);

	}

	public static ArrayList<String> conversor(String palabra) {
		ArrayList<String>listaPalabras = new ArrayList<>();
		for(char c: palabra.toCharArray()) {
			
			  if (c == 'a') {
	                listaPalabras.add("apa");
	            } else if (c == 'e') {
	                listaPalabras.add("epe");
	            } else if (c == 'i') {
	                listaPalabras.add("ipi");
	            } else {
	                listaPalabras.add(String.valueOf(c));  // Si no es 'a', 'e', ni 'i', se agrega el carácter tal cual
	            }
	        }

		return listaPalabras;
	}

}
