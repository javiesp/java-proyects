/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package giftcard;

/**
 *
 * @author Javi
 */
public class GiftCard {

    public static void main(String[] args) {
         // 
         Trabajador t1 = new Trabajador("21.475.447",9,"Javiera");
         Tarjeta ta1 = new Tarjeta(123412353,"$13123","04 de septiembre",t1) ;
         
    t1.datosTrabajador();
    ta1.mostrarTodo();
    }
    //


}
