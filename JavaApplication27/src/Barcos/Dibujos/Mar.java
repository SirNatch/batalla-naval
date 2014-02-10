package Barcos.Dibujos;

import Accion.Piezas;

public class Mar extends Piezas{

    @Override
    public void dibujar() {
        System.out.print(".");
    }

    @Override
    public void dibujarFuego() {
        System.out.print("#");
    }
}
