package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;



		public class ConvertidorCadenetas {

			public static void main(String[] args) {
				ArrayList <Double>list = new ArrayList<>();
				list.add(1.23);
				list.add(3.0);
				list.add(1.5);
				list.add(51.00);
				
				System.out.println(magiador(list));
			}

			public static ArrayList<String> magiador(ArrayList<Double> list) {
				ArrayList<String> nueva = new ArrayList<>();
				for(int i=0; i<list.size();i++) {
					double elemento = list.get(i);
					nueva.add(Double.toString(elemento));
				}
				return nueva;
			}

		}


