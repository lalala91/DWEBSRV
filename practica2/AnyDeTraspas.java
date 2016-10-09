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
2.Implementa una nova classe anomenada AnyDeTrespas que determini si una determinada data pertany a un any de trespàs (per simplificar l'algoritmia considerarem que els anys de trespàs son tots els anys parells). Reflexiona sobre:
    2.1 A què pots accedir de la superclasse? 
	-> Només pots accedir als métodes publics ( getAny, setAny y getData )
    2.2 A què no pots accedir?
	-> Als métodes privats descomposaData()
3.Ara canvia la implementació de la classe Data. Fes-la amb la representació de la data amb tres atributs enters. 
Segueix funcionant la classe AnyDeTrespas ?
Què hauria passat si per algun motiu haguesis pogut emprar el mètode privat descomposaData.*/