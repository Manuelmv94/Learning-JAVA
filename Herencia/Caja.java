public class Caja extends Rectangulo{
	protected double alto;

	public Caja(){
		this(5.0,10.0,7.0);
	}

	public Caja(double largo, double ancho, double alto){
		super(largo,ancho);
		this.alto=alto;
	}

	public double perimetro(){
		return 8*this.alto+4*this.largo+2*this.ancho;
	}

	public double area(){
		return 2*(super.area()+this.alto*(this.largo+this.ancho));
	}

	public double volumen(){
		return super.area()*this.alto;
	}

	public String toString(){
		return "Caja de largo: "+this.largo+" ancho: "+this.ancho+" y alto: "+this.alto;
	}

	public void saluda(){
		System.out.println("Hola");
	}

}