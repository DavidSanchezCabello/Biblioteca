package es.studium.Libros;

public class VerLibro {

	public static void main(String[] args) {
		
		Libro l1=new Libro("Diez negritos","Agatha Cristie", 258 );
		Libro l2=new Libro("El Hobbit","J.R.R.Tolkien",305);		
		
		System.out.println(l1.getAutor()+l1.getLibro()+l1.getPaginas());
		System.out.println(l2.getAutor()+l2.getLibro()+l2.getPaginas());
		System.out.println(l1.getAutor()+l1.getLibro()+l1.getPaginas());
	}

}
