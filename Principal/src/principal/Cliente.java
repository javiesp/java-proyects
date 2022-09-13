/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Javi
 */
public class Cliente {
    private String rut;
    private String dv;
    private String nombre;
    private String mail;
    private String direccion;
    private int telefono;
    private Solicitud solicitud;

    //constructor
    public Cliente() {}

    public Cliente(String rut, String dv, String nombre, String mail, String direccion, int telefono, Solicitud solicitud) {
        this.rut = rut;
        this.dv = dv;
        this.nombre = nombre;
        this.mail = mail;
        this.direccion = direccion;
        this.telefono = telefono;
        this.solicitud = solicitud;
    }

     // gettter
    public String getRut() {
        return rut;
    }

    public String getDv() {
        return dv;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMail() {
        return mail;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }
    
    //setter
    public void setRut(String rut) {
         if(rut.length() > 9){
         this.rut = rut;
         }else{
            System.out.println("\033[31mERROR: el rut debe tener 10");
         }
    }

   public void setDv(String dv) {
         if(dv.length() > 1) {
         this.dv = dv;
         }else{
             System.out.println("\033[31mERROR: el dv no puede tener menos de un caracter");
         }

    }

    public void setNombre(String nombre) {
        if(nombre.length()>3){
            this.nombre = nombre;
        }else{
            System.out.println("\033[31mERROR: el nombre debe tener 3 o mas caracteres");
           
        }
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
         //if(telefono.lenght() > 8){
         this.telefono = telefono;
        //}else{
          //  System.out.println("\033[31mERROR: el nombre debe tener 8 caracteres");
      //  }
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }
    
    
    public void mostrarDatosCli(){
        System.out.println("►CLIENTE");
        System.out.println("►RUT: "+rut);
        System.out.println("►DV: -"+dv);
        System.out.println("►NOMBRE: "+nombre);
        System.out.println("►MAIL: "+mail);
        System.out.println("►DIRECCION: "+direccion);
        System.out.println("►TELEFONO: "+telefono);
        getSolicitud().mostrarDatosSol();
        System.out.println("⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆");
    }
}
