package observador;

public class Motor implements Observador{

	@Override
	public void update() {
		//accion realizada
		System.out.println("aviso de accion");
	}

}
