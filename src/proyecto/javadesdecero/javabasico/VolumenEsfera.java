package proyecto.javadesdecero.javabasico;

public class VolumenEsfera {

	public static void main(String[] args) {
		double numero = 2;
		double resultado = Math.pow(numero, 3);
		double apañao = VolEsfe(resultado);
		System.out.println(apañao);
	}
	public static double VolEsfe (double a) {
		return (4* Math.PI*a)/3;
		
	}
}
