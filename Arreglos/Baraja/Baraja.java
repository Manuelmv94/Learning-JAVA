import java.util.*;
public class Baraja{
	private Naipe[] cartas;
	private static Naipe[] aux;
	Random ran=new Random();
	
	public Baraja(){
		this.cartas = new Naipe[52];
		
		int c=0;
		for(int i=0;i<4;i++){
			for(int j=0;j<13;j++){
				this.cartas[c++]=new Naipe(j,i);
			}
		}
	} 

	public void mezclar(){
		
		Baraja.aux=new Naipe[1];
		int pos;
		for(int i=0;i<this.cartas.length;i++){
			pos=ran.nextInt(52);
			Baraja.aux[0]=this.cartas[i];
			this.cartas[i]=this.cartas[pos];
			this.cartas[pos]=Baraja.aux[0];	
		}
	}

	public String toString(){
		String resultado="";
		for (int i=0;i<this.cartas.length;i++){
			resultado+=this.cartas[i]+"\n";
		}
		return resultado;
	}
}