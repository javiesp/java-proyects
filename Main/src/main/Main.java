/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Javi
 */
public class Main {
    
    
    public static void main (String[]args){
        //codigos principales
        //crear 2 canciones
        Cancion c1 = new Cancion("Torero","Chayanne",180,true,false);
        Cancion c2 = new Cancion("Ahora te puedes marchar","Luis Miguel",160,true,false);
        Cancion c3 = new Cancion("Thriller","Michael Jackson",560,true,false);
        
        
        //mostrar informacion
        c1.mostrarDatosCancion();
        System.out.println("        ");
        c2.mostrarDatosCancion();
        System.out.println("        ");
        c3.mostrarDatosCancion();
        
    }
}