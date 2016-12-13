//Manuel Madrigal Valenzuela
//A01114070

import javax.swing.*;

public class UsaComplejo{
	public static void main(String[] args){
		int sel;
		System.out.println();
		do{
			sel=Integer.parseInt(JOptionPane.showInputDialog("Seleccione la operaci�n a realizar:\n1.Suma\n2.Resta\n3.Multiplicaci�n\n4.Conjugado"));
			if (sel!=1 && sel!=2 && sel!=3 && sel!=4){
				JOptionPane.showMessageDialog(null,"Opci�n incorrecta");
			}
			
		}while(sel!=1 && sel!=2 && sel!=3 && sel!=4);
		
		double x1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la parte real del primer n�mero"));
		double y1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la parte imaginaria respectiva"));	
		Complejo Z1=new Complejo(x1,y1);

		String Y1;
		if(y1<0){
			Y1=Double.toString(y1);
		}
		else{
			Y1="+"+y1;
		}

		loop0:		
		if(sel==1 || sel==2 || sel==3){
			
			if (sel==3){
				int ans;
				do{
					ans=Integer.parseInt(JOptionPane.showInputDialog("Seleccione la opci�n deseada:\n1.Multiplicaci�n por n�mero real\n2.Multiplicaci�n por n�mero complejo"));
					if(ans!=1 && ans!=2){
						JOptionPane.showMessageDialog(null,"Opci�n incorrecta");
					}
				}while(ans!=1 && ans!=2);
				if(ans==1){
					double q1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el n�mero real a multiplicar"));
					System.out.println("("+x1+Y1+"i)*("+q1+")=");
					(Z1.multiplicaci�n(q1)).imprimir();
					break loop0;
				}
			}
				
			double x2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la parte real del segundo n�mero"));
			double y2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la parte imaginaria respectiva"));
			
			Complejo Z2=new Complejo(x2,y2);

			String Y2;
			if(y2<0){
				Y2=Double.toString(y2);
			}
			else{
				Y2="+"+y2;
			}
			
			
			switch(sel){
				case 1:
				System.out.println("("+x1+Y1+"i)+("+x2+Y2+"i)=");
				(Z1.suma(Z2)).imprimir();
				break;

				case 2:
				System.out.println("("+x1+Y1+"i)-("+x2+Y2+"i)=");
				(Z1.resta(Z2)).imprimir();
				break;
				
				case 3:
				System.out.println("("+x1+Y1+"i)*("+x2+Y2+"i)=");
				(Z1.multiplicaci�n(Z2)).imprimir();
				break;
				
			}
		}
		else{
			System.out.println("El conjugado de ("+x1+Y1+"i) es:");
			(Z1.conjugado()).imprimir();
		}
	
	}
}