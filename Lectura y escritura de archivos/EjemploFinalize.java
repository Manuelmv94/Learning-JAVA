public class EjemploFinalize{
	String soy;
	protected void finalize(){
		System.out.println("Adios mundo cruel "+this.soy);
		
	}	

	public static void main(String[] args){
		EjemploFinalize a=new EjemploFinalize();
		a.soy="A";
		EjemploFinalize b=new EjemploFinalize();
		b.soy="B";
		a=b;
		System.gc();			//Manda a llamar al garbage colector
		System.out.println("Fin");


	}




}