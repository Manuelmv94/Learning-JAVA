public class ProbarLibro{
	public static void main(String[] args){
		Libro oct=new Libro();
		Libro ej=new Libro("mimi","walt","disney","6568432");

		System.out.println("Autor en oct: "+oct.getAutor());
		System.out.println("Titulo en oct: "+oct.getTitulo());
		System.out.println("Editorial en oct: "+oct.getEditorial());
		System.out.println("ISBN en oct: "+oct.getIsbn());

		System.out.println("Autor en oct: "+ej.getAutor());
		System.out.println("Titulo en oct: "+ej.getTitulo());
		System.out.println("Editorial en oct: "+ej.getEditorial());
		System.out.println("ISBN en oct: "+ej.getIsbn());
		
		oct.setAutor("manuel");
		oct.setTitulo("camiones");
		oct.setEditorial("itesm");
		oct.setIsbn("54652");

		System.out.println("Autor en oct: "+oct.getAutor());
		System.out.println("Titulo en oct: "+oct.getTitulo());
		System.out.println("Editorial en oct: "+oct.getEditorial());
		System.out.println("ISBN en oct: "+oct.getIsbn());
	}
}