/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Javi
 */
public class Cancion {
    //Variables
    
    private String titulo;
    private String artista;
    private int segundoDuracion;
    private boolean favorita;
    private boolean descargada;
    private int segundo;    
    
    //Metodos accesores y mutadores
    
    public int getSegundo(){
        return segundo;
    }
    
    public void setSegundo(int nuevoSegundo){
        this.segundo = nuevoSegundo;
    
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getSegundoDuracion() {
        return segundoDuracion;
    }

    public void setSegundoDuracion(int segundoDuracion) {
        this.segundoDuracion = segundoDuracion;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public boolean isDescargada() {
        return descargada;
    }

    public void setDescargada(boolean descargada) {
        this.descargada = descargada;
    }
    
            // los contructores
    
    public Cancion() {
       this.setSegundo(0);
        
        
    }
    
    public Cancion(String titulo, String artista, int segundoDuracion, boolean favorita, boolean descargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.segundoDuracion = segundoDuracion;
        this.favorita = favorita;
        this.descargada = descargada;
        this.segundo = 765;     
    }
      
               //mostrar datos
    public void mostrarDatosCancion(){
        /*
         Negro:\033[30m
         Rojo:\033[31m
         Verde:\033[32m
         Amarillo:\033[33m
         Azul:\033[34m
         Magenta:\033[35m
         Blanco:\033[37m
         Cyan:\033[36m
         Reset:\u001B[0m*/
        //accion a realizar cuando llame al metodo
        System.out.println("\033[35m♪                MÚSICA               ♪");
        System.out.println("\033[35m     ↳           《▣》           ↺     ");
        System.out.println(getSegundo()+"\033[35m----------➣-------------------------0"+getSegundoDuracion() / 60+":00");
        System.out.println("\033[36m⇢Nombre: "+getTitulo());
        System.out.println("\033[36m⇢Artista: "+getArtista());
        //System.out.println("Duracion : "+duracionTotal());
        duracionTotal();
        System.out.println("\033[36m⇢¿Es Favorita?: "+isFavorita());
        System.out.println("\033[36m⇢¿Está Descargada?: "+isDescargada());
        System.out.println("\033[36m⇢Segundo Actual: "+getSegundo());
        
        if (isLarga() ==true){
            System.out.println("\033[36m⇢Canción de larga duración");    
        }else {
            System.out.println("\033[36m⇢Canción de corta duración");
            System.out.println("");
        }
                
    }
     
    //Metodo para adelantar la cancion
    public void adelantarSegundos(int cantSegundos){
        int segundoActual = this.getSegundo()+ cantSegundos;
        this.setSegundo(segundoActual);
        
    }  
    
    
    //metodo para cambiar de segundo a minuto
    public void duracionTotal(){
        int minuto = this.getSegundoDuracion() / 60;
        int segundos = this.getSegundoDuracion() % 60;
        String segundos2;
    
        if (segundos <= 9){segundos2 = "0"+segundos;}
        else {segundos2 = segundos+"";}                     
        String duracion = minuto + ":" +segundos2;
        System.out.println("\033[36m⇢Duración: "+duracion);
        
    }
    
      //metodo si la cancion es larga
        
    public boolean isLarga ()  {
        if (getSegundoDuracion() >=300 ) {
            return true;
        
        }else {
            return false;
        
        }
    
    
    }
        
}

    
