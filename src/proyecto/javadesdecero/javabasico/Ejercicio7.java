package proyecto.javadesdecero.javabasico;

public class Ejercicio7 {

	public static void main(String[] args) {
		int test = 33;
		int nueva = valorNumeroIngresado(test);
		int ultimita = nombredelafuncion(nueva+1);
		System.out.println("Este es el primer número: " +nueva);
		System.out.println("Este es el primer número: " + (nueva+1));
		System.out.println("Este es el primer número: " + (+nueva+2));
		System.out.println(ultimita);
		
	}
	public static int valorNumeroIngresado(int a) {
		int b = (a-3)/3;
		return b;
		
	
	}
	public static int nombredelafuncion(int c) {
		return  c*4;
		
	}
}
