package proyecto.javadesdecero.javabasico;

public class SufjoSegundaPrimera {

	public static void main(String[] args) {
		String principal = "hola mundo";
		String secundario = "CACA";
		boolean definitivo = has_suffix(principal,secundario);
		System.out.println(definitivo);
	}
	public static boolean has_suffix (String a, String b) {
		if (a.contains(b)) {
		return  true;
	}else {
		return false;
	}
}
}

//public class SufjoSegundaPrimera {

 // public static void main(String[] args) {
   //     String principal = "hola mundo";
  //      String secundario = "hola";
        
    //    if (has_suffix(principal, secundario)) {
    //        System.out.println("La frase \"" + principal + "\" contiene la palabra \"" + secundario + "\".");
    //    } else {
     //       System.out.println("La frase \"" + principal + "\" no contiene la palabra \"" + secundario + "\".");
     //   }
   // }

   // public static boolean has_suffix(String a, String b) {
   //     // Verifica si la cadena 'a' contiene la cadena 'b'
    //    return a.contains(b);
   // }