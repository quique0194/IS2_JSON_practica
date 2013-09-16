import java.lang.reflect.*;
import java.util.Arrays;
import java.util.List;

public class Horario {

	private Long id;
	private int dias;
	private int hora_ini;
	private int hora_fin;
	private Long id_curso;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getDia() {
		return dias;
	}
	public void setDia(int dias) {
		this.dias = dias;
	}
	public int getHora_inicio(){
		return hora_ini;
	}
	public void setHora_ini(int hora_ini){
		this.hora_ini=hora_ini;
	}
	public int getHora_fin(){
		return hora_fin;
	}
	public void setHora_fin(int hora_fin){
		this.hora_fin=hora_fin;
	} 
	public Long getId_curso(){
		return id_curso;
	}
	public void setId_curso(Long id_curso){
		
		this.id_curso=id_curso;
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
