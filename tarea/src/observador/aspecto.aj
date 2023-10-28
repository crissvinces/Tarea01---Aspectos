package observador;

import java.util.ArrayList;

public aspect aspecto {
	
	pointcut RealizarAccionAspect(): call(void Accion.RealizarAccion());
	
	before(): RealizarAccionAspect(){
		System.out.println("Se lanzara un aviso de  accion");
	}
	pointcut ObservadorAspect() : execution(* Accion.RealizarAccion(..));

    
    before() : ObservadorAspect() {
        System.out.println("Evento capturado");
    }	
    

    }


