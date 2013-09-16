
public class Main {


	public static void main(String[] args) {
		
		Alumno a1 = new Alumno();
		
		a1.setId(1L);
		a1.setNombres("José Enrique");
		a1.setApellidos("Carrillo Pino");
		
		System.out.println(a1.toJSON());
		
		Matricula m1 = new Matricula();
		
		m1.setIdAlumno(1111023149L);
		m1.setIdCurso(742L);
		m1.setNota(15.5);
		
		System.out.println(m1.toJSON());
		
		Curso c1 = new Curso();
		Profesor p1 = new Profesor();
		
		c1.setId(1L);
		c1.setNombre("Teología");
		c1.setIdCursoSgt(2L);
		c1.setProfesor(p1);
		
		System.out.println(c1.toJSON());
	}
	
	
}
