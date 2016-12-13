public class ZonaHoraria{
	private Clock[] zonaHoraria;
	
	public ZonaHoraria(){
		this.zonaHoraria=new Clock[10];
	}
	

	public void ponerHora(int pos, int hr,int min, int sec, String cd){
		if(this.zonaHoraria[pos]==null){		
			this.zonaHoraria[pos]=new Clock(hr,min,sec,cd);
		}
		else{
			this.zonaHoraria[pos].setTime(hr,min,sec);
			this.zonaHoraria[pos].setCiudad(cd);
		}
	}
	

	public void imprimeZonasHorarias(){
		for(int i=0;i<this.zonaHoraria.length;i++){
			if(this.zonaHoraria[i]!=null){
				this.zonaHoraria[i].printTime();
			}
		}
	}

	
	public void cambiarHorarioInvierno(){
		for(int i=0;i<this.zonaHoraria.length;i++){
			if(this.zonaHoraria[i]!=null){
				this.zonaHoraria[i].incrementHours();
			}
		}
	}


	public static void main(String[] args){
		ZonaHoraria zh= new ZonaHoraria();
		zh.ponerHora(0,10,57,0,"Guadalajara");
		zh.ponerHora(1,8,0,30,"LA");
		zh.ponerHora(2,9,0,0,"Tepic");
		zh.ponerHora(3,0,0,0,"Tokio");
		zh.imprimeZonasHorarias();
	}

}