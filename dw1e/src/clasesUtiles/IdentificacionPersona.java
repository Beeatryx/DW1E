package clasesUtiles;

public class IdentificacionPersona 
{
	private String nombre;
	private int id;
	private String acceso;
	
	public IdentificacionPersona(String n, int id, String acc)
	{
		nombre=n;
		this.id=id;
		acceso=acc;
	}
	public IdentificacionPersona(String n)
	{
		nombre=n;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getAcceso() 
	{
		return acceso;
	}

	public void setAcceso(String acceso) 
	{
		this.acceso = acceso;
	}

}
