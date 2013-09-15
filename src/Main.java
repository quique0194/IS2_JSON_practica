
public class Main {


	public static void main(String[] args) {
		
		Alumno a1 = new Alumno();
		
		a1.setId(1L);
		a1.setNombres("José Enrique");
		a1.setApellidos("Carrillo Pino");
		
		System.out.println(a1.toJSON());

	}
	
	
}
