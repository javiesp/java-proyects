/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        
        System.out.print("Introduzca un numero  A : ");
        int num1=sn.nextInt();// introducir un caracter
        
        System.out.print("Introduzca un numero B : ");
        int num2=sn.nextInt();
        
        if(num1<=num2){
            
            if(num1==num2){
                System.out.print("Son iguales");
            }else{
                System.out.print("El numero B '"+num2+"' es el mayor");
            }   
        }else{
            System.out.print("El numero A '"+num1+"' es el mayor");
        }
    }
    
}
