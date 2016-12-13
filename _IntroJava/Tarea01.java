//Manuel Madrigal Valenzuela
//A01114070

import javax.swing.*;
import java.math.*; 
import java.io.*;

public class Tarea01{
	public static void ternaPitagorica(){
		double c;
		for(int a=1;a<501;a++){
			for(int b=a;b<501;b++){
				c= Math.sqrt((a*a)+(b*b));
				if(c/(int)c==1 && c<501){
					System.out.println("a:"+a+ "  b:"+ b+"  c:"+(int)c);
				}
			}
		}
	}	
	
	public static void numerosRomanos(){
		String num=JOptionPane.showInputDialog("Ingresa un numero entre 0 y 3999 para ser convertido a romano");
		int q=num.length();
		String	part1="";
		String	part2="";
		String	part3="";
		String	part4="";
		if (q>0){
			switch (num.charAt(q-1)){
				case '0':
				part4="";
				break;
				
				case '1':
				part4="I";
				break;

				case '2':
				part4="II";
				break;
				
				case '3':
				part4="III";
				break;

				case '4':
				part4="IV";
				break;

				case '5':
				part4="V";
				break;

				case '6':
				part4="VI";
				break;

				case '7':
				part4="VII";
				break;

				case '8':
				part4="VIII";
				break;

				case '9':
				part4="IX";
				break;

				default:
				part4="error";
				break;			
			}
			if(q>1){
				switch (num.charAt(q-2)){
					case '0':
					part3="";
					break;
				
					case '1':
					part3="X";
					break;

					case '2':
					part3="XX";
					break;
				
					case '3':
					part3="XXX";
					break;

					case '4':
					part3="XL";
					break;

					case '5':
					part3="L";
					break;

					case '6':
					part3="LX";
					break;

					case '7':
					part3="LXX";
					break;

					case '8':
					part3="LXXX";
					break;

					case '9':
					part3="XC";
					break;

					default:
					part3="error";
					break;			
				}
				if(q>2){
					switch (num.charAt(q-3)){
						case '0':
						part2="";
						break;
				
						case '1':
						part2="C";
						break;

						case '2':
						part2="CC";
						break;
					
						case '3':
						part2="CCC";
						break;	

						case '4':
						part2="CD";
						break;

						case '5':
						part2="D";
						break;

						case '6':
						part2="DC";
						break;

						case '7':
						part2="DCC";
						break;

						case '8':
						part2="DCCC";
						break;

						case '9':
						part2="CM";
						break;

						default:
						part2="error";
						break;			
					}
					if(q>3){
						switch (num.charAt(q-4)){
							case '0':
							part1="";
							break;
				
							case '1':
							part1="M";
							break;

							case '2':
							part1="MM";
							break;
				
							case '3':
							part1="MMM";
							break;

							default:
							part1="error";
							break;			
						}

					}

				}
			}
		}
		if(q>4 || part1=="error" || part2=="error" || part3=="error" || part4=="error"){
			System.out.println("Error: Número invalido"); 
		}
		else{
			System.out.println("El número "+num+" en romano es: "+part1+part2+part3+part4);
		}
		
	}
	
	public static void main(String[] args){
		ternaPitagorica();
		numerosRomanos();
	}


}