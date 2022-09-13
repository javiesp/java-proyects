/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        
        System.out.print("Introduzca un numero: ");
        int num=sn.nextInt();// introducir un caracter
        
        char caracter=(char)num; //char e int son compatibles
       
        System.out.println("El numero: "+num+"  corresponde al caracter: '"+caracter+"'");
    }
    
}
