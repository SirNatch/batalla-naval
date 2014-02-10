package Barcos.Dibujos;

import Accion.Piezas;

public class Interceptor extends Piezas{

    @Override
    public void dibujar() {
        System.out.print("I");
    }  

    @Override
    public void dibujarFuego() {
        System.out.print("#");
    }
}
