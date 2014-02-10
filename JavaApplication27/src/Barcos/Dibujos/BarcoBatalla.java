package Barcos.Dibujos;

import Accion.Piezas;

public class BarcoBatalla extends Piezas{

    @Override
    public void dibujar() {
        System.out.print("B");
    }

    @Override
    public void dibujarFuego() {
        System.out.print("#");
    }
}
