/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giftcard;

/**
 *
 * @author Javi
 */
public class Trabajador {
    private String run;
    private int dv;
    private String nombre;
    
    //construcctor

    public Trabajador() { }

    public Trabajador(String run, int dv, String nombre) {
        this.run = run;
        this.dv = dv;
        this.nombre = nombre;
    }
    
    //Getter

    public String getRun() {
        return run;
    }

    public int getDv() {
        return dv;
    }

    public String getNombre() {
        return nombre;
    }
    
    //Setter

    public void setRun(String run) {
        this.run = run;
    }

    public void setDv(int dv) {
        this.dv = dv;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodos Custom
    public void datosTrabajador(){
        System.out.println("DATOS TRABAJADOR");
        System.out.println("------------------------------");
        System.out.println("Run: "+run+"-"+dv);
        System.out.println("Nombre"+nombre);
    }
}
