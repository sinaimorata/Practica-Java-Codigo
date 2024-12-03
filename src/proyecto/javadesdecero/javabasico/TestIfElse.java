package proyecto.javadesdecero.javabasico;

public class TestIfElse {

	public static void main(String[] args) {
		int aprobado = 7;
		int notaAlumno = 7;
		String resultado = poderAprobar(aprobado,notaAlumno);
		System.out.println(resultado);
		
	}
	public static String poderAprobar(int aprob, int b) {
	if (b < aprob) {
		return "has suspendido";
	}else {
		return "has aprobado";
		}
		
	}
}

