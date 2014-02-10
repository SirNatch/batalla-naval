package Accion;

import java.util.Scanner;

/**
 *
 * @author Francisco Ignacio Nuñez Valdivieso
 */
public class Menu {
    
    public static void accion(int n){
        switch(n){
            
        }
    }

    
    public static void main(String[] args) {
     Scanner respuesta = new Scanner(System.in);
     int seleccion;
     boolean bandera = true;
     
     do{
          System.out.println("Escoga una opcion\n1.Ingreesar barcos\n2.Ver estado\n3.Disparar\n5.Ver Radar"
                  + "\n6.Salir");
          seleccion = respuesta.nextInt();
          
          if(seleccion == 6)
              bandera = false;
          else
              accion(seleccion);
              
      }while(bandera);
    }
}