public class Clock{
	private int 	hr,
			min,
			sec;

	public Clock(){
		this(6,30,0); //tiene que ser la primer linea de codigo
	}
	
	public Clock(int hr,int min,int sec){
		this.setTime(hr,min,sec);
	}

	public void setTime(int hr, int min, int sec){
		if(hr>=0 && hr<24){
			this.hr=hr;
		} 
		else{
			this.hr=12;
		} 

		if(min>=0 && min<60){
			this.min=min;
		} 
		else{
			this.min=0;
		} 

		if(sec>=0 && sec<60){
			this.sec=sec;
		} 
		else{
			this.sec=0;
		} 
	}

	public void printTime(){
		String 	hora=(this.hr<10)?"0"+this.hr:""+this.hr,
			minuto=(this.min<10)?"0"+this.min:""+this.min,
			segundo=(this.sec<10)?"0"+this.sec:""+this.sec;

		System.out.println("La hora es "+hora+":"+minuto+":"+segundo);
	}

	public int getHours(){
		return this.hr;
	}

	public int getMinutes(){
		return this.min;
	}
	
	public int getSeconds(){
		return this.sec;
	}

	public void incrementHours(){
		this.hr=(++this.hr)%24;
	}
	public void incrementMinutes(){
		if(this.min==59){
			this.incrementHours();
		}
		this.min=(++this.min)%60;
	}
	public void incrementSeconds(){
		if(this.sec==59){
			this.incrementMinutes();
		}
		this.sec=(++this.sec)%60;
	}
	
	public boolean equals(Clock C){
		return (this.hr==C.hr && this.min==C.min &&this.sec==C.sec);
	}
	
	public void makeCopy(Clock C){
		this.hr=C.hr;
		this.min=C.min;
		this.sec=C.sec;	
	}
	
	public Clock getCopy(){
		return new Clock(this.hr,this.min,this.sec);
	}
}