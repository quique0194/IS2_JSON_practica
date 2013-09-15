IS2_JSON_practica
=================

IS2 Practica de JSON

=================

Class Alumno		// Enrique
- id: Long
- nombres: String
- apellidos: String

Class Matricula		// Miguel
- idAlumno: Long
- idCurso: Long
- nota: double

Class Curso		// Jean
- id: Long
- nombre: String
- idCursoQueAbre: Long
- profesor: Profesor

Class Horario 		// Stephany
- id: Long
- dia: int 		// 0->Lunes, 1->Martes, ... 7->Domingo
- horaInicio: int	// 0->0:00, 1->1:00, ... 23->23:00
- horaFin: int
- idCurso: Long

Class Tema		// Jhoel
- id: Long
- idCurso: Long
- nombre: String
- idTemaPadre: Long

Class Profesor		// Rossmery
- id: Long
- nombres: String
- apellidos: String
