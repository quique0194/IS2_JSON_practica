import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;


public class Matricula {
	
	private Long idAlumno;
	private Long idCurso;
	private Double nota;
	
	public Long getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(Long i) {
		this.idAlumno = i;
	}
	public Long getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Long idCurso) {
		this.idCurso = idCurso;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	public String toJSON()
	{
		String ret="{\n";
		List<Field> fields = Arrays.asList(this.getClass().getDeclaredFields());
		for(Field field:fields)
		{
			String atributo = field.getName();
			String value="";
			try {
				value = field.get(this).toString();
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
			if( field.getType() == String.class )
			{
				value = "\"" + value + "\"";
			}
			ret = ret + "\t\"" + atributo + "\"" + ": " + value +",\n";
		}
		ret = ret.substring(0, ret.length()-2);
		ret = ret + "\n};";
		return ret;
	}

}
