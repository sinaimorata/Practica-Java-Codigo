package proyecto.javadesdecero.javabasico;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListaSalariosActualizados {

	public static void main(String[] args) {
		ArrayList<Double>list = new ArrayList<>();
		list.add(800.00);
		list.add(1000.01);
		list.add(1600.00);
		list.add(6100.31);
		
		System.out.println(updateSalaries(list));
		System.out.println(sumAll(list));
	}

	public static double sumAll(ArrayList<Double> list) {
		double acumulador= 0;
		for(int i = 0;i<list.size();i++) {
			acumulador = acumulador+list.get(i);
		}
		return acumulador;
	}

	public static ArrayList<Double> updateSalaries(ArrayList<Double> list) {
		ArrayList<Double> nuevasNominas = new ArrayList<>();
		
		for(int i=0;i<list.size();i++) {
			double nomina = list.get(i);
			if(nomina<900) {
				nomina = nomina*1.30;
				nuevasNominas.add(nomina);
			}
			else if(nomina >= 900 && nomina <= 1500) {
				nomina = nomina*1.12;
				nuevasNominas.add(nomina);
				
			}
			else if(nomina>6000) {
				nomina = nomina*2;
				nuevasNominas.add(nomina);
				
			}
			else {
				 nomina=nomina;
				 nuevasNominas.add(nomina);
			}
			
		}
		return nuevasNominas;
	}

}
