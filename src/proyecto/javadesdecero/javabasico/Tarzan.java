package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class Tarzan {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(15);
		list.add(17);

		System.out.println(conversorito(list));

	}

	public static ArrayList<String> conversorito(ArrayList<Integer> list) {
		ArrayList<String> apaniada = new ArrayList<>();
		for(int i=0; i<list.size();i++) {
			Integer cosito = list.get(i);
			if(cosito %3==0 && cosito %5==0 ){
				apaniada.add("aaa");
				
			}else if(cosito%3==0)  {
				apaniada.add("ooo");
	        }else if(cosito%5==0)  {
				apaniada.add("uuu");
	        }else {
	        	apaniada.add(cosito.toString());
	        }
       
		}
		return apaniada;
		
	}
}