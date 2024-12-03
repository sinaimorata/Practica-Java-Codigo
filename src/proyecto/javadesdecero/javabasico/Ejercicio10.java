package proyecto.javadesdecero.javabasico;

public class Ejercicio10 {

	public static void main(String[] args) {
		double p1 = 5;
		double p2 = 4.5;
		double p3 = 7.1;
		double t  = 5.5;
		double e  = 4.6;
		double solucionA = mitadPromedio(p1, p2, p3);
		double solucionB = trabajoFinal(t);
		double solucionC = examenFinal(e);
		double calificacionFinal = calificacionResultante (solucionA,solucionB,solucionC);
		System.out.println("La calificacion de Paco en Inglés es :" + calificacionFinal);

	}
	public static double mitadPromedio(double a, double b, double c) {
		return (a+b+c)/2;
		
	}
	public static double trabajoFinal (double t) {
		return (t*20)/100;
	}
	public static double examenFinal (double e) {
		return (e*30)/100;
	}
	public static double calificacionResultante (double j, double k, double l) {
		
		return (j+k+l)/3;
	}

}
