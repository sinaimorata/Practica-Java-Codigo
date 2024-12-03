package proyecto.javadesdecero.javabasico;

public class PrimaveraCorteIngles {

	public static void main(String[] args) {
		double compra = 1600;
		int porcentaje = 15;
		String resultadoFinal = descuento(compra, porcentaje);
		System.out.println(resultadoFinal);

	}
	public static String descuento(double a,int b){
	
		if (a>1400) {
			
			return "Con el 15% de descuento sobre tu compra, solo tienes que abonar :" + (a -(a*1/b));
	
	
	}else {
		return "Tienes que abonar la cantidad integra :" +a;
	}

		
	}
	
}