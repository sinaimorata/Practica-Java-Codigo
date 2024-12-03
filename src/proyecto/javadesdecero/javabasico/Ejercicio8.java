package proyecto.javadesdecero.javabasico;

public class Ejercicio8 {

	public static void main(String[] args) {
		long año1 = 2024;
		long año2 = 1978;
		long resultado = tiempoTranscurrido(año1,año2);
		System.out.println(resultado);
		

	}
	public static long tiempoTranscurrido(long a,long b) {
		long c = a-b;
		return c;
	}

}
		
