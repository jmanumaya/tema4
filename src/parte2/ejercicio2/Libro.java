package parte2.ejercicio2;

public class Libro {
	
	
	private enum Genero {
		NARRATIVO, LÍRICO, DRAMÁTICO, DIDÁCTICO, POÉTICO
	}
	
	private String titulo;
	
	private String autor;
	
	private int numEjemplares;
	
	private int numEjemplaresPrestados;
	
	private Genero genero;
	
	public Libro(String titulo, String autor) {
		
		this.titulo = compruebaTitulo(titulo);
		this.autor = compruebaAutor(autor);
		
	}
	
	public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
		
		this.titulo = compruebaTitulo(titulo);
		this.autor = compruebaAutor(autor);
		
		if (numEjemplares >= 0) {
			this.numEjemplares = numEjemplares;
		} else {
			this.numEjemplares = 0;
		}
		
		if ((numEjemplaresPrestados + numEjemplares) >= 0) {
			this.numEjemplaresPrestados = numEjemplaresPrestados;
		}
	}
	
	public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados, String genero) {
		
		this.titulo = compruebaTitulo(titulo);
		this.autor = compruebaAutor(autor);
		
		if (numEjemplares >= 0) {
			this.numEjemplares = numEjemplares;
		} else {
			this.numEjemplares = 0;
		}
		
		if ((numEjemplaresPrestados + numEjemplares) >= 0) {
			this.numEjemplaresPrestados = numEjemplaresPrestados;
		}
		
		this.genero = compruebaGenero(genero);
	}
	
	private Genero compruebaGenero(String genero2) {
		
		return switch 

	}

	private String compruebaAutor(String autor) {
		
		if (autor != null && !autor.isBlank()) {
		return autor;
		} else {
			throw new IllegalArgumentException("Autor introducido no válido");
		}
	}

	private String compruebaTitulo(String titulo) {
		if(titulo != null && !titulo.isBlank()) {
			return titulo;
		} else {
			throw new IllegalArgumentException("Titulo introducido no válido");
		}
	}

}
