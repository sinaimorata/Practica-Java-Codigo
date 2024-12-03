package proyecto.javadesdecero.javabasico;

public class Ejercicio5 {

	public static void main(String[] args) {
		double compraSinDescuento = 3522.03;
		System.out.println(compraSinDescuento);
		compraSinDescuento = descuento (compraSinDescuento);
		System.out.println(compraSinDescuento);

	}
	public static double descuento(double a){
		return a - (a*0.15);
		
		
	}

}