/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad;

/**
 *
 * @author Laboratorio
 */
public class Trabajador {
    private String run;
    private String dv;
    private String nombre;

    
    //consturctiorres
    public Trabajador() {}

    public Trabajador(String run, String dv, String nombre) {
        this.run = run;
        this.dv = dv;
        this.nombre = nombre;
    }

    //getter
    public String getRun() {
        return this.run;
    }

    public String getDv() {
        return this.dv;
    }

    public String getNombre() {
        
            return this.nombre;
    }
    //setter
    public void setRun(String run) {
        if (run.length()>=10){
            this.run = run;
        }else{
              System.out.println("ERROR: run debe ser mayor a 9 digitos ");
        }
    }

    public void setDv(String dv) {
        if (dv.length()>0){
            this.dv = dv;
        }else{
            System.out.println("ERROR: run debe ser mayor a 9 digitos ");
        }
        
    }
    public void setNombre(String nombre) {
        if(nombre.length()< 3){
            this.nombre = nombre;
        }else{
            System.out.println("ERROR: nombre no puede ir vacio ");
        }
    }
      
    //metodos custom
    public void datosTrabajador(){
        System.out.println("RUN: " +run +"-"+dv);
        System.out.println("NOMBRE: " +nombre);
    }
    //       
    
    
}
