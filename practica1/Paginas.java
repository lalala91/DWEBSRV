package practica1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class Paginas extends Agenda{
	
	private boolean festivo;
	private List<Citas> citas;
	

	
	public Paginas( boolean festivo,int any) {
		super(any);
		//this.citas=citas;
		this.festivo=festivo;		
	}
	

	public String getDate(){
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd").format(Calendar.getInstance().getTime());
		System.out.println(timeStamp);
		return timeStamp;
	}
	
	public boolean esFestivo(boolean festivo){
		if(festivo){
			System.out.println("Es un día festivo");
		}else{
			System.out.println("Dia no festivo");
		}
		return festivo;
	}
	
	public static void main(String[] args) {
		Paginas p= new Paginas(false, 1991);
		p.esFestivo(true);
		p.getDate();
	}


}
