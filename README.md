# Tarea01---Aspectos

Funcionalidad de 
package part2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public aspect aspecto {
    pointcut cambiarFondoCall(String color) :
        call(void Botones.cambiarFondo(String)) && args(color);

    before(String color) : cambiarFondoCall(color) {
        System.out.println("Cambiando color de fondo a: " + color);
    }
}

El objetivo de este aspecto es poder manejar la preocupacion (o el concern) al momento de imprimir en consola el color el cual esta siendo cambiado el fondo sin interferir con el condigo principal, por lo cual se hizo un punto de corte (pointcut) en cambiarFondo de lo cual nos interesaba el argumento (Color) para que de esta manera podamos pedir el advice de manera que cada vez que se cambia el color del fondo nos imprima el color al cual se cambia. 
