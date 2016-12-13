public class Naipe{
	private int valor;
	private int palo;

	private static final String[] valores={"As","Dos","Tres","Cuatro","Cinco","Seis","Siete", 	//satic: atributo de clase no se guarda en cada instancia
				  "Ocho","Nueve","Diez","Joto","Reina","Rey"};				//final: son constantes y no cambiará el arreglo

	private static final String[] palos={"Espadas","Corazones","Treboles","Diamantes"};

	public Naipe(int valor,int palo){
		this.valor=valor;
		this.palo=palo;
	}
	
	public String toString(){
		return Naipe.valores[this.valor]+" de "+ Naipe.palos[this.palo];
	}

	public static void main(String[] args){
		//crear el 5 de corazones
		Naipe carta=new Naipe(4,1);
		System.out.println(carta);
	
		//Crear el rey de treboles
		Naipe carta2=new Naipe(12,2);
		System.out.println(carta2);
	
		//Imprimir baraja
		Baraja baraja=new Baraja();
		System.out.println(baraja);

		System.out.println();

		//Imprimir baraja mezclada
		baraja.mezclar();
		System.out.println(baraja);
	}



}