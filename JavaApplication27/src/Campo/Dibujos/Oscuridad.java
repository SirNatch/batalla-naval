package Campo.Dibujos;

import Accion.Piezas;
public class Oscuridad extends Piezas{

    @Override
    public void dibujar() {
        System.out.print(". .");
    }

    @Override
    public void dibujarFuego() {
        System.out.print(" * ");
    }
    
}
