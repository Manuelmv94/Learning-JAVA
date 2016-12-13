//Manuel Madrigal Valenzuela
//A01114070

public class PruebaArreglos{
	
	public void imprimir(String[][] arreglo){
		String fila;
		for(int i=0;i<arreglo.length;i++){
			fila="";
			for(int j=0;j<arreglo[i].length;j++){
				fila+=arreglo[i][j]+"\t";
			}
			System.out.println(fila);
		}
	}	

	public static void main(String[] args){
		PruebaArreglos pb=new PruebaArreglos();
		int 	x=Integer.parseInt(args[0]),
			y=Integer.parseInt(args[1]);

		String[][] arreglo=new String[x][y];

		int k=2;
		for(int i=0;i<arreglo.length;i++){
			for(int j=0; j<arreglo[i].length;j++){
				arreglo[i][j]=args[k];
				k++;
			}
		}
		pb.imprimir(arreglo);
	}
}