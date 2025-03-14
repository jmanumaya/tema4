package crud.ejercicio4;

import java.util.Objects;

public class Disco {
	
	private int codigo;
	
	private String autor;
	
	private String titulo;
	
	private int duracion;
	
	private Genero genero;
	
	private enum Genero { ROCK, POP, JAZZ, BLUES };

	public Disco(int codigo, String autor, String genero, String titulo, int duracion) {
		
		this.codigo = codigo;
		
		if(autor != null && !autor.isBlank()) {
		 this.autor = autor;
		} else {
			throw new IllegalArgumentException("Autor No Válido");
		}
		
		switch (genero.toUpperCase()) {
		case "ROCK", "POP", "JAZZ", "BLUES" -> this.genero = Genero.valueOf(genero.toUpperCase());
		default -> { throw new IllegalArgumentException("Genero Indicado No Válido."); }
		}
		
		if(titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		} else {
			throw new IllegalArgumentException("Titulo No Válido");
		}
		
		if(duracion >= 0) {
			this.duracion = duracion;
		} else {
			throw new IllegalArgumentException("Duración indicada no valida. Debe ser de valor positiva");
		}
	}
	
	public Disco (int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	@Override
	public String toString() {
		return "💠 Codigo: " + codigo
				+ "\nAutor: " + autor
				+ "\nGenero: " + genero
				+ "\nTitulo: " + titulo
				+ "\nDuración: " + duracion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		
		Disco aux = (Disco) obj;
		
		return this.codigo == aux.codigo;
	};

}
