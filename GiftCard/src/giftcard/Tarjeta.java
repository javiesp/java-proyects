/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giftcard;

/**
 *
 * @author Javi
 */
public class Tarjeta {
    private long codigo;
    private String monto;
    private String vigencia;
    private Trabajador trabajador;
    
    //Constructor

    public Tarjeta() { }

    public Tarjeta(long codigo, String monto, String vigencia, Trabajador trabajador) {
        this.codigo = codigo;
        this.monto = monto;
        this.vigencia = vigencia;
        this.trabajador = trabajador;
    }
    
    //Accesadores y mutadores
    public long getCodigo() {
        return codigo;
    }

    public String getMonto() {
        return monto;
    }

    public String getVigencia() {
        return vigencia;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }
    
    //setter
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }
    
    //Metodos Custom
    public void mostrarTodo(){
         System.out.println("Codigo"+codigo);
         System.out.println("Monto"+monto);
         System.out.println("Vigencia"+vigencia);
         getTrabajador().datosTrabajador();
    }
          
}
