package proyecto.javadesdecero.javabasico;

public class Ejercicio6 {

	public static void main(String[] args) {
		float numero =30;
		System.out.println(numero);
		numeroFinal(numero);
		//System.out.println(numero);
		

	}
	public static void numeroFinal(float a) {
		if (a >= 15) {
		float b = (a - 15)/2;
		System.out.println("Una parte sera: " + b);
		System.out.println("La otra parte sera: " + (b+15));
		
	}else {
		System.out.println("no vale el número registrado");
	}
}

}
