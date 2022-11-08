
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Javi
 */
public class ColeccionRegistro {
    
    ArrayList<Registro> listaRegistro = new ArrayList<Registro>();
    
    public String addRegistro(Registro registro){
         try {
            listaRegistro.add(registro);
            return "Regstro agregado";
        } catch (Exception e) {
            return "No Agregado";
        }
    }
    
        public String listarRegistros(){
        String temp ="";
        for(Registro u : listaRegistro){
            temp= temp+u.toString()+"\n";
        }
        return temp;
    }
    
    
    
    
}//Intocable
