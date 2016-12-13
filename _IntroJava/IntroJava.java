import javax.swing.*;

public class IntroJava{
	public static void evalua(){
		String nota=JOptionPane.showInputDialog("Dime la nota obtenida");
		int calif=Integer.parseInt(nota);
		if(calif>=70){
			System.out.println("Aprobado");
		}
		else{
			System.out.println("Reprobado");
		}
	}
	
	public static void mayor(){
		int a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero")),
		    b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero")),
		    c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero"));
		if(a>b){
			if(a>c){
				System.out.println("el valor mayor es "+a);
			}
			else {
				System.out.println("el valor mayor es "+c);
			}
		}
		else{
			if(b>c){
				System.out.println("el valor mayor es "+b);
			}
			else {
				System.out.println("el valor mayor es "+c);
			}
		}
	}

	public static void numerosdel1al10(){
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}
	
	public static void serie(int x){
		int t=0;
		for(int i=0;i<50;i++){
			t=t+x;
			System.out.println(t);
		}
	}

	public static int calorias(){
		int c=Integer.parseInt(JOptionPane.showInputDialog("Cuantas comidas realizaste?"));
		int t=0;
		for(int i=0;i<c;i++){
			int z=Integer.parseInt(JOptionPane.showInputDialog("Cuantas calorias consumiste en la comida numero " + (i+1)));
			t=t+z;
		}
		//JOptionPane.showMessageDialog(null,"El numero de calorias consumidas en el dia es de "+ t);
		return t;
	}

	public static void main(String[] args){
		//int valor=Integer.parseInt(JOptionPane.showInputDialog("Cual serie quieres?"));
		int totalcalorias=calorias();
		JOptionPane.showMessageDialog(null,"El numero de calorias consumidas en el dia es de "+ totalcalorias);
		//serie(valor);
		//evalua();
		//mayor();
		//numerosdel1al10();

	}
}