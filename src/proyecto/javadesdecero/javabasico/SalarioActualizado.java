package proyecto.javadesdecero.javabasico;

public class SalarioActualizado {

	public static void main(String[] args) {
		double nomina = 1500;
		String resultado = salary(nomina);
		System.out.println(resultado);
	}
	public  static String salary (double a) {
		if (a<=1000) {
			return "Te corresponde una subida salarial y por tanto pasas a cobrar :" + (a*0.8);
		}else { 
			return "No te corresponde ninguna subida salarial, te quedas como estas";
			
		}
	}
}
