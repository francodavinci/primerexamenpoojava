package primerparcial;

import java.util.ArrayList;

public class Pelicula {
	// atributos
	private String titulo;
	private int duracion;
	private int anio;
	private String categoria;
	private ArrayList<Actor> actores = new ArrayList<>();
	
	//constructores
	public Pelicula(String titulo, int duracion, int anio, String categoria) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.anio = anio;
		this.categoria = categoria;
	}
	
	public Pelicula (String titulo) {
		this.titulo=titulo;
	}
	
	//metodos

	public void agregarActor(Actor actor){
		this.actores.add(actor);
	}
	
	public void eliminarActor(Actor actor) {
		this.actores.remove(actor);
	}
	
	public void mostrarActores() {
		System.out.println("Pelicula:"+this.titulo);
		for (Actor actor : actores) {
			System.out.println("Actor: "+actor.toString()+"\n");
		}
	}

	@Override
	public String toString() {
		return "Pelicula = " + titulo + ", (" + anio + ")";
	}
	
	
	
	
	
	
}
