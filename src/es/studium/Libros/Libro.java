package es.studium.Libros;

public class Libro {

	private String libro;
	private String autor;
	private int paginas;

	public Libro() {

		libro = "";
		autor = "";
		paginas = 0;
	}

	public Libro(String li, String au, int pag) {
		libro = li;
		autor = au;
		paginas = pag;
	}

	public String getLibro() {
		return libro;
	}

	public void setLibro(String libro) {
		this.libro = libro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	

	
}
