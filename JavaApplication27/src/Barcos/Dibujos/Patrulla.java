package Barcos.Dibujos;

import Accion.Piezas;

public class Patrulla extends Piezas{

    @Override
    public void dibujar() {
        System.out.print("p");
    } 

    @Override
    public void dibujarFuego() {
        System.out.print("#");
    }
}
