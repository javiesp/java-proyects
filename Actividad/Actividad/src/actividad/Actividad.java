/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad;

import java.util.Scanner;
/**
 *
 * @author Laboratorio
 */
public class Actividad {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String run;
        String dv;
        String nombre;
        int op = 0;
        
        do{
            System.out.println("INGRESE RUN: "); 
            run = scan.nextLine();            
        }while(run.length()>=10);
        do{
            System.out.println("INGRESE DV: "); //
            dv = scan.nextLine();            
        }while(dv.length() !=1);        
        do{
            System.out.println("INGRESE NOMBRE: "); //
            nombre = scan.nextLine();            
        }while(nombre.length()<1);        
        
        System.out.println("OPCIONES");
        System.out.println("[1]-Datos Trabajador");    
        System.out.println("[2]-Datos Tarjeta");
        System.out.println("[3]-Datos de compra");
        
        Trabajador tra = new Trabajador(run,dv,nombre);
        Tarjeta tar = new Tarjeta(1231231,1234,350000,"30 de octubre 2020",tra);
        
        
        do{
            op = scan.nextInt();
            switch(op){
                case 1:
                    tra.datosTrabajador();
                    break;
                case 2:
                    tar.mostrarTarjeta();
            }                                  
        }while(op <=3);

    }
    

    
}
