
package rsjovenes;

/**
 *
 * @author Javi
 */
public class Instagram extends RedSocial{
    private int id;//id propio de instagram
    private String historia;
    private boolean estado;

    //Metodos construcctores
    public Instagram() {
    }

    public Instagram(int id, String historia, String usuario, String password) {
        super(usuario, password);//llama al construcctor con parametros de la super clase
        this.id = id;
        this.historia = historia;
    }
    
    //metodos accesadore y mutadores

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    //metodos custom
    public void redInstagram(){
        System.out.println("Instagram");
        System.out.println("ID: "+id);
        System.out.println("Historia: "+historia);
    }

    
}
