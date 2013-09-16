import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class Tema {
	private long id;
	private long idCurso;
	private String nombre;
	private long temaPadre;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public long getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(long idCurso) {
		this.idCurso = idCurso;
	}
	
	public long getTemaPadre() {
		return temaPadre;
	}
	
	public void setTemaPadre(long temaPadre) {
		this.temaPadre = temaPadre;
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
				// TODO Auto-generated catch block
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
