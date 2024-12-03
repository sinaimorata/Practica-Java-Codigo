package proyecto.javadesdecero.javabasico;

import java.util.ArrayList;

public class SalariosActualizados {



	public static void main(String[] args) {
		ArrayList <Double> list = new ArrayList<>();
		list.add(1315.00);
		list.add(725.10);
		list.add(6521.12);
		
		

		System.out.println(NuevosSalarios(list));
		System.out.println(SumaSalarios(list ));
	}



	public static Double SumaSalarios(ArrayList<Double> list) {
		double total = 0;
		for(int i=0;i<list.size();i++) {
			total += list.get(i);
		}
		return total;
	}



	public static ArrayList NuevosSalarios(ArrayList<Double>list) {
		ArrayList<Double> definitiva = new ArrayList<>();
		for (int i =0;i<list.size();i++) {
			double nomina = list.get(i);
			if (nomina<900) {
				nomina= (nomina-(nomina*0.30));
			}else if (900<nomina&& nomina<1500) {
				nomina = (nomina + (nomina*12));
			}else if (1500<nomina&& nomina<6000) {
				nomina = list.get(i);
			}else if (nomina>600) {
				nomina = nomina*2;
			}
			definitiva.add(nomina);
		}
		return definitiva ;
	}

}
