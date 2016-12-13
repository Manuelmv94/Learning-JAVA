public class UsaClock{
	public static void main(String[] args){
		Clock gda=new Clock(10,22,0);
		Clock tij=new Clock(8,22,0);
		Clock ny=new Clock();
		Clock enAlgunLugar=new Clock(6546,6546,6465);
		
		gda.printTime();
		tij.printTime();
		ny.printTime();
		enAlgunLugar.printTime();

		gda.setTime(11,16,20);
		tij.setTime(9,16,30);
		ny.setTime(22,59,59);
		System.out.println();
		gda.printTime();
		tij.printTime();
		ny.printTime();
		enAlgunLugar.printTime();
		
		ny.incrementHours();
		ny.printTime();
		
		ny.incrementSeconds();
		ny.printTime();
		
		boolean x=ny.equals(gda);
		System.out.println(x);
	}	

}