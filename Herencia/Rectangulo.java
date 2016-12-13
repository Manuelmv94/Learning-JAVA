public class Rectangulo implements Figura{
	protected double largo,
			 ancho;
	
	public Rectangulo(){
		this(5.0,10.0);
	}

	public Rectangulo(double largo, double ancho){
		this.largo=largo;
		this.ancho=ancho;
	}	
	
	public double perimetro(){
		return 2*(this.largo+this.ancho);
	}

	public double area(){
		return this.largo*this.ancho;
	}
	
	public double volumen(){
		return 0.0;
	}

	public String toString(){
		return "Rectangulo de largo: "+this.largo+" y ancho: "+this.ancho ;
	}
	
	

	public static void main(String[] args){
		Figura[] figs={	new Rectangulo(3.0,4.0),
				new Cuadrado(7.0),
				new Caja(2.0,3.0,4.0)};
		for(int i=0;i<figs.length;i++){
			System.out.println(figs[i]);
			System.out.println("El perimetro es: "+figs[i].perimetro());
			System.out.println("El área es: "+figs[i].area());
			System.out.println("El volumen es: "+figs[i].volumen());	
			if(figs[i] instanceof Caja){
				((Caja)figs[i]).saluda();
			}			

			System.out.println();
		}
	}
		



}