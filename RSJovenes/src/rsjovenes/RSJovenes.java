
package rsjovenes;

import java.util.Date;

/**
 *
 * @author Javi
 * fecha: 23.09.2022
 * 
 */
public class RSJovenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[ ] args) {
        //objetos
        RedSocial rs = new RedSocial("Javiera", "javi1234");
        
        Instagram ig = new Instagram(1, "boomerang","Javiera", "javi1234");
        
        Date fecha = new Date();
        Twitter tw = new Twitter(1, "Muere reyna Isabel II", fecha, "Javiera", "javi1234");
        
        rs.mostrar();
        ig.redInstagram();
        tw.redTwitter();
    }
    
}
