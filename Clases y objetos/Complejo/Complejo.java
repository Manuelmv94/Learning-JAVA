//Manuel Madrigal Valenzuela
//A01114070

public class Complejo{
	private double 	real,
			imag;

	public Complejo(){
		this(0,0);
	}
	
	public Complejo(double real,double imag){
		this.establecer(real,imag);
	}
	
	public void establecer(double real, double imag){
		this.real=real;
		this.imag=imag;
	}
	
	public void imprimir(){
		String imag;
		if(this.imag<0){
			imag=Double.toString(this.imag);
		}else{
			imag="+"+this.imag;
		}

		System.out.println("El número complejo es: "+this.real+imag+" i");
	}
	
	public void agregar(double real, double imag){
		this.real+=real;
		this.imag+=imag;
	}
	
	public void agregar(Complejo Z){
		this.real+=Z.real;
		this.imag+=Z.imag;
	}
	
	public Complejo suma(Complejo Z){
		double 	R=this.real+Z.real,
			I=this.imag+Z.imag;
		return new Complejo(R,I);
	}
	
	public Complejo resta(Complejo Z){
		double 	R=this.real-Z.real,
			I=this.imag-Z.imag;
		return new Complejo(R,I);
	}
	
	public Complejo multiplicación(Complejo Z){
		double 	R=(this.real*Z.real)-(this.imag*Z.imag),
			I=(this.real*Z.imag)+(this.imag*Z.real);
		return new Complejo(R,I);
	}

	public Complejo multiplicación(double x){
		double 	R=this.real*x,
			I=this.imag*x;
		return new Complejo(R,I);
	}
	
	public Complejo conjugado(){
		double 	R=this.real,
			I=-this.imag;
		return new Complejo(R,I);
	}	
}









