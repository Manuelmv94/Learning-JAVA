public class Cuadrado extends Rectangulo{
	
	public Cuadrado(){
		this(5.0);
	}

	public Cuadrado(double lado){
		this.largo=this.ancho=lado;
	}
	
	public String toString(){
		return "Cuadrado con lado "+this.largo;
	}


}