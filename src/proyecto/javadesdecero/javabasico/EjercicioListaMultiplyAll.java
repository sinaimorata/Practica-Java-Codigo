package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class EjercicioListaMultiplyAll {

	public static void main(String[] args) {
		ArrayList <Integer> listiña = new ArrayList<Integer>();
		listiña.add(7);
		listiña.add(2);
		listiña.add(3);
	
	Integer acumulador = 1;
	for(int i=0;i<listiña.size();i++) {
		acumulador = acumulador * listiña.get(i);
	}
	System.out.println("El resultado de la multiplicación es: " + acumulador);
}
}
 