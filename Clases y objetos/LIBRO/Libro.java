//Manuel Madrigal Valenzuela
//A01114070

public class Libro{
	private String	titulo,
			autor,
			editorial,
			isbn;

	public Libro(){
		titulo="El laberinto de la soledad";
		autor="Octavio Paz";
		editorial="Fondo de Cultura Económica";
		isbn="8437501784";
	}

	public Libro(String tit, String aut, String ed, String isb){
		titulo=tit;
		autor=aut;
		editorial=ed;
		isbn=isb;
	}	

	public void setTitulo(String tit){
		titulo=tit;
	}

	public void setAutor(String aut){
		autor=aut;
	}

	public void setEditorial(String ed){
		editorial=ed;
	}

	public void setIsbn(String isb){
		isbn=isb;
	}

	public String getTitulo(){
		return titulo;
	}

	public String getAutor(){
		return autor;
	}

	public String getEditorial(){
		return editorial;
	}

	public String getIsbn(){
		return isbn;
	}

}