package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class TestList2 {

	public static void main(String[] args) {
		//testArrayList();
		testWhile();
		//testDoWhile();

	}
	public static void testWhile() {
		ArrayList<Integer>list = new ArrayList<>();
		list.add(1);
		list.add(2);
		
		//pseudocodigo
		/* contador = 0;
		 * mientras contador < longitud de la lista. MENOR NUNCA IGUAL xq cm el contador empieza
		 * desde cero, el contador no tiene qu alcanzar la longuitud de la lista, siempre la longitud 
		 * de la lista -1
		 * tomamos el elemento cero de la lista y ya aumentamos uno el contador de la lista
		 */
		
		/*i = 0
		 * i <2? Sí
		 * print del elemento 0 que es 1
		 * se incrementa el contardor en 1 i = 0+1 = 1
		 * 1<2? Sí
		 * print de posición 1 que es dos
		 * i=2
		 * 2<2? NO . ENTONCES SALIMOS DEL BUCLE.
		 */
		
		int i = 0;
		while (i<list.size()) {
			System.out.println(list.get(i));
			i++;
		}
		
	
			
	}
	public static void testDoWhile() {
		ArrayList<Integer>list = new ArrayList<>();
		list.add(1);
		list.add(2);
		
		/*inicializar contaddor, luego ejecutar lo q diga el bucle como tal, luego se actualiza
		 * valor contador yluego preguntar mientras contador sea menor q...
		 * [0, n-1] es 1 <size II i <= (size-1)
		 * contador = 0
		 * get elemento (contador)
		 * incrementar contaedor
		 * mientrs contador <longitud de la lista
		 */
		
		int i = 0;
		
		do {
			System.out.println(list.get(i));
			i++;
		}while(i<list.size());
	}
	public static void testArrayList() {
		//AQUÍ VAN CLASES Y NO TIPOS BÁSICOS
		ArrayList<Integer>list = new ArrayList<>();
		list.add(1);
		list.add(2);
		
		//ITERAR
		for(Integer str: list) {
			System.out.println(str);
		}
		for(int i = 0;i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		/*
		 * i = 0
		 * o<2? Si
		 * print del número q ocupe la posicion i =0 y x tt, 0 es 1.
		 * i = 0 +1= 1
		 * i <2? Sí..
		 * 
		 */
		
		
		
		//Print de la lista  completa
		System.out.println(list);
	}
}
