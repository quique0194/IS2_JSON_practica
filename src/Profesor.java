import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class Profesor {
	
	private Long id;
	private String nombres;
	private String apellidos;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
