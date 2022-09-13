/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

/**
 *
 * @author Javi
 */
import java.util.Scanner;

public class Principal {

          /**
          * @param args the command line arguments
          */
    
         public static void main(String[] args) {
                  Scanner scan = new Scanner(System.in);
                  String nombre;
                  String rut;
                  String dv;
                  //int fono;
                  // objetos
                  //validacion cliente                 
                  do{
                  System.out.print("Ingrese Rut: ");
                  rut = scan.nextLine();
                  } while(rut.length() < 8);                     
                  do{
                  System.out.print("Ingrese dv (1 caracter): ");
                  dv = scan.nextLine();
                  } while(dv.length() < 1);          
                  do{
                  System.out.print("Ingrese Nombre: ");
                  nombre = scan.nextLine();
                  } while(nombre.length()<3);
                
                   //verduras
                  Verduras v1 = new Verduras(1,"verdura","zapallof","$5344","12445 gramos");
                  //solicitud
                  Solicitud so1 = new Solicitud(2,"1/211/2","1","12312","verdura $1000 v1 1 unidad");
                  //clientes
                  Cliente c1 = new Cliente(rut,"-k",nombre,"espinaja","los paltos",8976987,so1);
                  
                  
                  
                  System.out.println("[1] - Registrar cliente");
                  System.out.println("[2] - Ver canasta");
                  System.out.println("[3] - Comprar verdura");
                  System.out.println("[5] - Salir");
                  
                  int op = scan.nextInt();
                  
                  switch(op){
                      case 1:
                           c1.mostrarDatosCli();
                           break;
                      case 2:
                           v1.mostrarDatosVer();
                           break;
                  }
                  
                  
                  
                  
                  // do{
                  //System.out.print("Ingrese Nombre: ");
                  //fono = scan.nextInt();
                  //} while(fono.length()<8);

         //v1.mostrarDatosVer();
         //c1.mostrarDatosCli();
         //so1.mostrarDatosSol();

    }
    
}
