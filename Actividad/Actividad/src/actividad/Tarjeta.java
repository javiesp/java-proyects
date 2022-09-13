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
public class Tarjeta {
    private long codigo;
    private int clave;
    private int monto;
    private String vigencia;
    private Trabajador trabajador;
    
    //constructores

    public Tarjeta(){}

    public Tarjeta(long codigo, int calve, int monto, String vigencia, Trabajador trabajador) {
        this.codigo = codigo;
        this.clave = clave;
        this.monto = monto;
        this.vigencia = vigencia;
        this.trabajador = trabajador;
    }
    
    //getter

    public long getCodigo() {
        return this.codigo;
    }

    public int getClave() {
        return this.clave;
    }

    public int getMonto() {
        return this.monto;
    }

    public String getVigencia() {
        return this.vigencia;
    }

    public Trabajador getTrabajador() {
        return this.trabajador;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setMonto(int monto) {
        if(monto >=0){
            this.monto = monto;
        }else{
            System.out.println("ERROR:  ");
        }
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }
    
    //metodos custom 
    public void mostrarTarjeta(){
        System.out.println("CODIGO: "+codigo);
        System.out.println("CLAVE: "+clave);
        System.out.println("MONTO: "+monto);
        System.out.println("VIGENCIA: "+vigencia);
        trabajador.datosTrabajador();
    }
    
}
