package practica2;

public class AnyDeTraspas extends Data {
	public boolean esAnyDeTraspas(){		
		if((getAny() % 2)==0){
			return true;
		}					
		return false;
	}

	
	

}
/*
1.Reflexiona sobre les linies marcades amb #1 i #2.
2.Implementa una nova classe anomenada AnyDeTrespas que determini si una determinada data pertany a un any de tresp�s (per simplificar l'algoritmia considerarem que els anys de tresp�s son tots els anys parells). Reflexiona sobre:
    2.1 A qu� pots accedir de la superclasse? 
	-> Nom�s pots accedir als m�todes publics ( getAny, setAny y getData )
    2.2 A qu� no pots accedir?
	-> Als m�todes privats descomposaData()
3.Ara canvia la implementaci� de la classe Data. Fes-la amb la representaci� de la data amb tres atributs enters. 
Segueix funcionant la classe AnyDeTrespas ?
Qu� hauria passat si per algun motiu haguesis pogut emprar el m�tode privat descomposaData.*/