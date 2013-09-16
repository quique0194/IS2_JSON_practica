
public class Main {


	public static void main(String[] args) {
		
		Alumno a1 = new Alumno();
		
		a1.setId(1L);
		a1.setNombres("Jos� Enrique");
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
    c1.setNombre("Teolog?a");
    c1.setIdCursoSgt(2L);
    c1.setProfesor(p1);
    
    System.out.println(c1.toJSON());

		Horario h1 = new Horario();
		h1.setId(1454545L);
		h1.setDia(1);
		h1.setHora_fin(7);
		h1.setHora_fin(8);
		h1.setId_curso(45L);
		
		System.out.println(h1.toJSON());
		
		Tema t1 = new Tema();
		t1.setId(1L);
		t1.setIdCurso(c1.getId());
		t1.setNombre("Santo Tomas de Aquino");
		t1.setTemaPadre(0);
		
		System.out.println(t1.toJSON());
		
		
	}
	
	
}
