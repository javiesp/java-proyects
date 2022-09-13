
package musicastreaming;

/**
 *
 * @author Javi
 */
public class Musica {
    //Variables
    private String titulo;
    private String artista;
    private int duracion;
    private boolean favorita;
    private boolean descargada;
           
    // Accesador y Mutador

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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
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
    
    //Constructores

    public Musica() {
    }

    public Musica(String titulo, String artista, int duracion, boolean favorita, boolean descargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.favorita = favorita;
        this.descargada = descargada;
    }
    
}
