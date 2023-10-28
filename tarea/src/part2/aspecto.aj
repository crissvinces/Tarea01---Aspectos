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
