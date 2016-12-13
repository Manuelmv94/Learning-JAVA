import java.io.*;

public class EjemploLector{
	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("C:\\Users\\manuel\\Documents\\ITESM\\V semestre\\Programación Orientada a Objetos\\arch.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String linea=null;
		while((linea=br.readLine()) !=null){
			System.out.println(linea);
		}
	}

}