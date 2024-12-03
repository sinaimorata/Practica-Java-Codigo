package proyecto.javadesdecero.javabasico;

public class IndiceMasaCorporal {

	public static void main(String[] args) {
		double peso = 61.5;
		double altura = 1.69;
		double resultado  = bmi(peso,altura);
		System.out.println(resultado);

	}
	public static double bmi(double a, double b) {
		return a/(b*b);
	}
	
	
}
