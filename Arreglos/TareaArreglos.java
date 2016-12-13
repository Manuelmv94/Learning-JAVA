//Manuel Madrigal Valenzuela
//A01114070

public class TareaArreglos{
	public static void reverse(String[] arr){
		String[] inv= new String[arr.length];
		int j=0;
		for(int i=arr.length-1;i>-1;i--){
			inv[j]=arr[i];
			j++;
		}
		
		for(int i=0;i<arr.length;i++){
			arr[i]=inv[i];
		}
	}


	public static void longitud(String[] arr){
		int total=0;
		for(int i=0;i<arr.length;i++){
			total+=(arr[i]).length();
		}
		System.out.println("La longitud total de los objetos String es: "+total);
	}


	public static int rowWithMostOnes(int[][] arr){
		int[] ones=new int[arr.length];
		int z=0;
	
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				String x=Integer.toString(arr[i][j]);
				for (int k=0;k<x.length();k++){
					if(x.charAt(k)=='1'){
						ones[z]++;
					}
				}
			}
			z++;
		}
		int max=ones[0];
		int maxrow=0;
		for(int i=0;i<ones.length;i++){
			if(max<ones[i]){
				max=ones[i];
				maxrow=i;
			}
		}
		return maxrow;
	}


	public int countChars(String str, char ch){
		int total=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				total++;
			}
		}
		return total;
	}

	public int countChars(String[] str, char ch){
		int total=0;
		for(int i=0;i<str.length;i++){
			total+=this.countChars(str[i],ch);
		}
		return total;
	}

}