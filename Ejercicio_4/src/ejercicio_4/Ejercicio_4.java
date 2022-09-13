/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        
        System.out.print("Introduzca un numero: ");
        int num=sn.nextInt();// introducir un caracter
        
        if(num%2==0){
            System.out.println("El numero '"+num+"' es par");
        }else{
            System.out.println("El numero '"+num+"' no es par");
        }
    }
    
    
}
