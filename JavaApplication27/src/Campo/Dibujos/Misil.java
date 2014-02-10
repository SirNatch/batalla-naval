package Campo.Dibujos;

import Accion.Piezas;

public class Misil extends Piezas{

    @Override
    public void dibujar() {
        System.out.print("*");
    }

    @Override
    public void dibujarFuego() {
        System.out.print("#");
    }
    
}
