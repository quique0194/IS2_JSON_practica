
public class Main {


	public static void main(String[] args) {
		
		Alumno a1 = new Alumno();
		
		a1.setId(1L);
		a1.setNombres("José Enrique");
		a1.setApellidos("Carrillo Pino");
		
		System.out.println(a1.toJSON());
		
		Horario h1 = new Horario();
		h1.setId(1454545L);
		h1.setDia(1);
		h1.setHora_fin(7);
		h1.setHora_fin(8);
		h1.setId_curso(45L);
		
		System.out.println(h1.toJSON());
		

	}
	
	
}
