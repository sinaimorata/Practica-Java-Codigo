package proyecto.javadesdecero.javabasico;

public class caracteresIguales {

	public static void main(String[] args) {
		String palabra = "tomate";
		
		System.out.println(allEqualChars(palabra));
		
	}
	public static boolean allEqualChars (String palabra){
		
		String cadena1 = "tomate";
		String cadena2 = "tomate";
		if(cadena1 ==cadena2) {
			return true;
		}
		return false;


}

}