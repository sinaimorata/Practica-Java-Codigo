package proyecto.javadesdecero.javabasico;

public class TestString {

	public static void main(String[] args) {
		String str = "My awesome String";
		
		char resultante = atestCharAt(str);
		System.out.println(resultante);
		
		
		System.out.println("Length: " + str.length());
		//longitud es 17
		System.out.println("Contains: " + str.contains("aw"));
		//si contiene aw
		System.out.println("Substring begin y end: " + str.substring(11,13));
		//salen dos por el tema del espacio
		System.out.println("Substring sólo begin: " + str.substring(11));
		//dame la que empieza en 11
		System.out.println("ChartAt a la primera posición: " + str.charAt(0));
		//dame la primera letra de la cadena
		System.out.println("ChartAt a la ultima posición: " + str.charAt(12));
		
		
	}
	public static char atestCharAt(String str) {
		return str.charAt(0);
		
	}
}
