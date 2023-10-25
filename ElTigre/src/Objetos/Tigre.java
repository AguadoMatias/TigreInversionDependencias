package Objetos;

public class Tigre {
	
	// ATRIBUTOS
	private String nombre;
	private String fragilidad;
	private String peligrosidad;
	private String vitalidad;
	private String belleza;
	private String tipoAtaque;
	private String Velocidad;
	
	// COMPORTAMIENTO (GETTERS Y SETTERS, CONSTRUCTOR)
	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	protected String getFragilidad() {
		return fragilidad;
	}
	protected void setFragilidad(String fragilidad) {
		this.fragilidad = fragilidad;
	}
	protected String getPeligrosidad() {
		return peligrosidad;
	}
	protected void setPeligrosidad(String peligrosidad) {
		this.peligrosidad = peligrosidad;
	}
	protected String getVitalidad() {
		return vitalidad;
	}
	protected void setVitalidad(String vitalidad) {
		this.vitalidad = vitalidad;
	}
	protected String getBelleza() {
		return belleza;
	}
	protected void setBelleza(String belleza) {
		this.belleza = belleza;
	}
	protected String getTipoAtaque() {
		return tipoAtaque;
	}
	protected void setTipoAtaque(String tipoAtaque) {
		this.tipoAtaque = tipoAtaque;
	}
	protected String getVelocidad() {
		return Velocidad;
	}
	protected void setVelocidad(String velocidad) {
		Velocidad = velocidad;
	}
	// Constructor
	public Tigre(String nombre, String fragilidad, String peligrosidad, String vitalidad, String belleza, String tipoAtaque)
	{
		this.setNombre(nombre); 
		this.setFragilidad(fragilidad);
		this.setPeligrosidad(peligrosidad);
		this.setVitalidad(vitalidad);
		this.setBelleza(belleza);
		this.setTipoAtaque(tipoAtaque);	
	}
	public Tigre()
	{
	
	}
	
	

}
