public class EjemploArreglos{
	public int suma(int[] arreglo){
		int suma=0;
		for(int i=0;i<arreglo.length;i++){
			suma+=arreglo[i];
		}
		return suma;		
	}

	public int max(int[] arreglo){
		int max=arreglo[0];
		for(int i=0;i<arreglo.length;i++){
			if(max<arreglo[i]){
				max=arreglo[i];
			}
		}
		return max;
	}

	public int min(int[] arreglo){
		int min=arreglo[0];
		for(int i=0;i<arreglo.length;i++){
			if(min>arreglo[i]){
				min=arreglo[i];
			}
		}
		return min;
	}
	
	public double promedio(int[] arreglo){
		double prom=((double)this.suma(arreglo))/arreglo.length;
		return prom;
	}	
	
	
	public static void main(String[] args){
		EjemploArreglos ea=new EjemploArreglos();
		int[] valores={5,2,1,6,7,-8};
		System.out.println(valores.length);
		System.out.println("La suma es: "+ea.suma(valores));
		System.out.println("El máximo es: "+ea.max(valores));
		System.out.println("El mínimo es: "+ea.min(valores));
		System.out.println("El promedio es: "+ea.promedio(valores));
	}

}