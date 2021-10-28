package primerparcial;

public class Actor {
	// atributos
	public String nombre;
	public String apellido;
	public String pais;
	public int anioNacimiento;

	// constructor
	public Actor(String nombre, String apellido, String pais, int anioNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.pais = pais;
		this.anioNacimiento = anioNacimiento;
	}

	// metodos
	
	public int calcularEdad (int anioActual) {
		return anioActual-anioNacimiento;
	}

	@Override
	public String toString() {
		return "Actor :" + nombre + " " + apellido + ",(" + pais + ")";
	}
	
	
	

}
