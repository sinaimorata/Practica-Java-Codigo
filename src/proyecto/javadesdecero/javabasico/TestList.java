package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class TestList {

	public static void main(String[] args) {
		ArrayList <String>listica = new ArrayList<>();
		listica.add("Uno");
		listica.add("Dos");
		
		for (String str:listica) {
		System.out.println(str);
		}
		for(int i= 0; i<listica.size(); i++) {
			System.out.println(listica.get(i));
		}
	}

}
