package proyecto.javadesdecero.javabasico;

public class Temperatura {
	
	public static void main(String[] args) {
		int frecuencia = 32;
		int resultado = temperatura(frecuencia);
		System.out.println(resultado);
	}
	public static int temperatura (int a) {
		return 10+(a-40/7);
	}
	}

