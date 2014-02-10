package Barcos.Dibujos;

import Accion.Piezas;

public class Submarino extends Piezas{
    
    public void dibujar(){
        System.out.println("S");
    }

    @Override
    public void dibujarFuego() {
        System.out.print("#");
    }
}
