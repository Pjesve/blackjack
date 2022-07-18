package modelo;

import java.util.ArrayList;

public class Mano extends Mazo{
	
	public Mano() {
		this.cartas = new ArrayList<> ();
		
	}


		
		public int valorMano() {
			int suma=0;
			for (Carta carta:cartas) {
				suma=suma+carta.getValor();
			}
			return suma;
		}
		
		public boolean finDeJuego() {
			if(valorMano()>=21) {
				return true;
			}
			return false;
		}
		

	@Override
	public String toString() {
		return "Valor de la mano:" + valorMano() + "\n" + super.toString();
				
	}

	public void pedirCarta(Mazo m) {
		if (!finDeJuego()){
			Carta c = m.solicitarCarta();
			this.cartas.add(c);
		}
	}
	
	}	