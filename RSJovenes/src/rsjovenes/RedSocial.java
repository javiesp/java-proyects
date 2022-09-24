
package rsjovenes;

/**
 *
 * @author Javi
 */
public class RedSocial {
    //Clase padre
    protected String usuario, password;//atributos protected para heredar a las sub clases
    
    //Construcctor

    public RedSocial() {
    }

    public RedSocial(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }
    //Accesadores y mutadores 

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //metodos custom
    public void mostrar(){
        System.out.println("Redes Sociales");
        System.out.println("Usuario: "+usuario);
        System.out.println("Password: "+password);
    }

}
