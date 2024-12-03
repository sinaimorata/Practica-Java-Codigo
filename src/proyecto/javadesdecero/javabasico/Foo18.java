package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class Foo18 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(22);
		list.add(41);
		list.add(15);
		
		System.out.println(conversorito(list));

	}

	public static ArrayList<Integer> conversorito(ArrayList<Integer> list) {
		ArrayList<Integer> apaniada = new ArrayList<>();
		for(int i=0; i<list.size();i++) {
			Integer cosito = list.get(i);
			if(cosito %2==0){
				cosito = cosito*2;
				apaniada.add(cosito);
			}else if(cosito%3==0) {
				cosito = cosito/4;
				apaniada.add(cosito);
			}else {
				cosito= cosito*2;
				apaniada.add(cosito);
			}
		}
		return apaniada;
	}

}
