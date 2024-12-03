package proyecto.javadesdecero.javabasico;

public class Ejercicio9 {

	public static void main(String[] args) {
		int edadPapa = 51;
		int edadMama = 50;
		int edadHijo = 23;
		int promedio = edadPromedio(edadPapa,edadMama,edadHijo);
		int promediopapis = edadPromedioPapas(edadPapa,edadMama);
		int diferenciapapihijo = diferenciaedadPapiHijo( edadPapa, edadHijo);
		int mayorMamaQHijo = mayorMamiQHijo (edadMama, edadHijo);
		System.out.println("La edad promedio de la familia es: " + promedio);
		System.out.println("La edad promedio de los papis es: " + promediopapis);
		System.out.println("El padre saca al hijo: " + diferenciapapihijo);
		System.out.println("La madre saca al hijo: " + mayorMamaQHijo );
	}
	public static int edadPromedio(int a, int b, int c) {
		return (a+b+c)/3;
	}
	public static int edadPromedioPapas (int a, int b) {
		
		return (a+b)/3;
	}
	public static int diferenciaedadPapiHijo (int a,int c) {
		
		return a-c;
	}
	public static int mayorMamiQHijo (int b, int c){
		
		return b-c;
	}
}
