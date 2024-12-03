package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class ElevandoAUnNumero {

	public static void main(String[] args) {
		int numero = 2;
		ArrayList<Integer>list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(cosa(numero,list));

	}

	public static ArrayList<Integer> cosa(int numero, ArrayList<Integer> list) {
		ArrayList<Integer> zapato = new ArrayList<>();
		int elevacion =0;
		for(int i=0; i<list.size();i++) {
			int resultado = (int) Math.pow(list.get(i), numero);
			zapato.add(resultado);
		}
		return zapato;
	}

}
