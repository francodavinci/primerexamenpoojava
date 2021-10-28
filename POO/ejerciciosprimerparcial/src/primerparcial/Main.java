package primerparcial;
/*
 * @author Franco Cicirelli
 */

public class Main {
	public static void main(String[] args) {

		// Actores
		Actor primerActor = new Actor("Franco", "Cicirelli", "Argentina", 1980);
		Actor segundoActor = new Actor("Franco", "Cicirelli", "Argentina", 1980);
		Actor tercerActor = new Actor("Franco", "Cicirelli", "Argentina", 1980);
		Actor cuartoActor = new Actor("Franco", "Cicirelli", "Argentina", 1980);

		// Peliculas
		Pelicula primerPelicula = new Pelicula("Titanic", 120, 2000, "Romance");
		Pelicula segundaPelicula = new Pelicula("El Rey León", 120, 2000, "Infantil");

		// Cine
		Cine nuevoCine = new Cine("Nuevo Cine ", "Buenos Aires");

		// al obejto primera pelicula agregue actores usando el metodo agregarActor
		primerPelicula.agregarActor(primerActor);
		primerPelicula.agregarActor(segundoActor);

		// al objeto segunda pelicula agregue actores usando el metodo agregarActor
		segundaPelicula.agregarActor(tercerActor);
		segundaPelicula.agregarActor(cuartoActor);

		// al objeto nuevoCine agregue las peliculas con el metodo agregarPeliculas
		nuevoCine.agregarPeliculas(primerPelicula);
		nuevoCine.agregarPeliculas(segundaPelicula);

		//Muestro las peliculas en cartelera 
		nuevoCine.mostrarPeliculas();

	}
}
