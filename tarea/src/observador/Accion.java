package observador;

import java.util.ArrayList;

public class Accion implements SujetoObservable{
	private ArrayList<Observador> observadores;
	public Accion() {
		observadores = new ArrayList<Observador>();
	}
	
	public void enlace(Observador o) {
		observadores.add(o);
}
		
	@Override
	public void notificar() {
		for (Observador o : observadores) {
			o.update();
			
		}

	
	}
		
}
	
		
	
