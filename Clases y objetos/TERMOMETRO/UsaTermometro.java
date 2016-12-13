public class UsaTermometro{
	public static void main(String[] args){
		Termometro gda=new Termometro();
		Termometro mty=new Termometro(40);

		System.out.println("La temperatura en Guadalajara es "+gda.getTemp());
		System.out.println("La temperatura en Monterrey es "+mty.getTemp());
	}

}