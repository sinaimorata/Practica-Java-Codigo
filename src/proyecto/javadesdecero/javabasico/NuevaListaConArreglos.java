package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class NuevaListaConArreglos {

	public static void main(String[] args) {
		ArrayList<Integer> listiña = new ArrayList<>();
		listiña.add(4);
		listiña.add(15);
		listiña.add(3);
		
		
		System.out.println(conversor(listiña));

	}

	public static ArrayList conversor(ArrayList<Integer> listiña) {
		ArrayList<Integer> nuevaLista = new ArrayList <>();
		for(int i=0;i<listiña.size();i++) {
			int elemento = listiña.get(i);
			if (i %2==0) {
				elemento = elemento*2;
				
			}else if (i%3==0) {
				elemento = (elemento/4);
				
			}
			else {
				elemento = elemento*elemento;
				
			}
			nuevaLista.add(elemento);
		}
		return nuevaLista;
	}

}
