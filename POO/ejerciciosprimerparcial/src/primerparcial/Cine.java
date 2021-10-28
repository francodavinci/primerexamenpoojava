package primerparcial;

import java.util.ArrayList;

public class Cine {
	
	// atributos
	private String nombre;
	private String ciudad;
	private ArrayList<Pelicula> peliculas = new ArrayList<>();

	// constructores
	public Cine(String nombre, String ciudad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

	public Cine(String nombre) {
		this.nombre = nombre;
	}

	//metodos
	public void agregarPeliculas(Pelicula pelicula) {
		this.peliculas.add(pelicula);
	}

	public void eliminarPelicula(Pelicula pelicula) {
		this.peliculas.remove(pelicula);
	}

	public void mostrarPeliculas() {
		System.out.printf("Peliculas de la cartelera en %s\n", this.nombre);
		for (Pelicula pelicula : peliculas) {
			System.out.printf("%s\n", pelicula);
		}
	}

	@Override
	public String toString() {
		return "Bienvenido al cine " + nombre + "";
	}

}
