/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Javi
 */
public class Verduras {
    private int codigo;
    private String subcategoria;
    private String descripcion;
    private String precio;
    private String unidadG;

    public Verduras() {}

    public Verduras(int codigo, String subcategoria, String descripcion, String precio, String unidadG) {
        this.codigo = codigo;
        this.subcategoria = subcategoria;
        this.descripcion = descripcion;
        this.precio = precio;
        this.unidadG = unidadG;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public String getUnidadG() {
        return unidadG;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setUnidadG(String unidadG) {
        this.unidadG = unidadG;
    }
    
    
     public void mostrarDatosVer(){
              System.out.println("\033[32m❖Verdureria online❖");
              System.out.println("►VERDURA: ");
              System.out.println("►CODIGO: "+codigo);
              System.out.println("►SUBCATEGORIA: "+subcategoria);
              System.out.println("►DESCRIPCION: "+descripcion);
              System.out.println("►PRECIO: "+precio);
              System.out.println("►UNIDAD / GRAMOS: "+unidadG);
              System.out.println("⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆⋆");

              
          }
          
    
}
