package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class CadeninaXCaracterito {


	public static void main(String[] args) {
		String cadenus= "hola mundo";
		
		System.out.println(conversor(cadenus));

	}
	public static ArrayList<Character> conversor(String cadenus){
		ArrayList <Character> definitiva = new ArrayList<>();
		for (int i =0; i<cadenus.length();i++) {
			char letruki = cadenus.charAt(i);
			definitiva.add(letruki);
		}
		return definitiva;
		
	}
}

