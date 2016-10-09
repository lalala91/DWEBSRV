package practica1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class Citas extends Agenda{

	List <Citas> citas;
	
	public Citas(int any) {
		super(any);
		
	}
	
	public String getHora(){
		String timeStamp = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
		System.out.println(timeStamp);
		return timeStamp;
	}
	

	public static void main(String[] args) {
		
	}
}
