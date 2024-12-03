package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class SumaMultiplosTres {

	public static void main(String[] args) {
		ArrayList <Integer> listinina = new ArrayList<Integer>();
		listinina.add(1);
		listinina.add(3);
		listinina.add(6);
		listinina.add(9);
		listinina.add(21);
		
		int acumulador = 0;
		for (int i =0; i<listinina.size(); i++) {
			int numero = listinina.get(i);
			if (numero %3 ==0) {
				acumulador += numero;
			}else{
				 System.out.println( "No es multiplo de tres: " + numero);
			}
	}
	System.out.println("Las suma de los múltiplos de tres es :" + acumulador);
	}

}
