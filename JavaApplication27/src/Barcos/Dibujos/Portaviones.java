package Barcos.Dibujos;

import Accion.Piezas;

public class Portaviones extends Piezas{

    public void dibujar() {
        System.out.print("P");
    }

    @Override
    public void dibujarFuego() {
        System.out.print("#");
    }
}
