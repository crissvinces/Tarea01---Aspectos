package observador;

public class Main {
	public static void main(String[] args) {
		Motor xyz = new Motor();
		Accion gear5 = new Accion();
		gear5.enlace(xyz);	
	}
	
}
