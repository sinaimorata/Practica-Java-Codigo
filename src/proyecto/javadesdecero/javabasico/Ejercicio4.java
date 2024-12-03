package proyecto.javadesdecero.javabasico;

public class Ejercicio4 {

	public static void main(String[] args) {
		double cantidad= 1255.03;
		System.out.println(cantidad);
		cantidad = porcentaje (cantidad);
		System.out.println("Ganarás: " + cantidad);
		
		

	}

	public static double porcentaje (double a) {
		return (a *3/100) + a;
		
	}
}
