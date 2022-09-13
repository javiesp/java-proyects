/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Javi
 */
public class Solicitud {
    
    private int numero;
    private String fecha;
    private String cliente;
    private String total;
    private String productos;
    
    //constructores 

    public Solicitud() {}

    public Solicitud(int numero, String fecha, String cliente, String total, String productos) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.total = total;
        this.productos = productos;
    }

    //getter
    public int getNumero() {
        return numero;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public String getTotal() {
        return total;
    }

    public String getProductos() {
        return productos;
    }
    //setter

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }
    
    public void mostrarDatosSol(){
        System.out.println("SOLICITUD");
        System.out.println("NUMERO: "+numero);
        System.out.println("FECHA: "+fecha);
        System.out.println("CLIENTE: "+cliente);
        System.out.println("TOTAL $: "+total);
        System.out.println("PRODUCTOS: "+productos);
    }
}
