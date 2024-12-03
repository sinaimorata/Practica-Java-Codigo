package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;
import java.util.List;

public class CadenaConvertidaLista {

	public static void main(String[] args) {
		String paraConvertir = "la bola de cristal";
		List<Character>listaDeCaracteres = convertirACadenaEnLista(paraConvertir);

		System.out.println(listaDeCaracteres);
			
		}

	public static List<Character> convertirACadenaEnLista(String paraConvertir) {
		List<Character>listanueva = new ArrayList<>();
		for(char c:paraConvertir.toCharArray()) {
			listanueva.add(c);
		}
		
	
		return listanueva;
	}
	}


