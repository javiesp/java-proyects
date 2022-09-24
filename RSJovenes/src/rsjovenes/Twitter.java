
package rsjovenes;

import java.util.Date;
/**
 *
 * @author Javi
 */
public class Twitter extends RedSocial{
    private int id;//id propio de twitter
    private String noticia;
    private Date fecha;

    public Twitter() {
    }

    public Twitter(int id, String noticia, Date fecha, String usuario, String password) {
        super(usuario, password);//atributos super clase
        this.id = id;
        this.noticia = noticia;
        this.fecha = fecha;
    }
    
    //accesadores y mutadores

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public void redTwitter(){
        System.out.println("Red Twitter");
        System.out.println("ID: "+id);
        System.out.println("Noticia: "+noticia);
    }
}
