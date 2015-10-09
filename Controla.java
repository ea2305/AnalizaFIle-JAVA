/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package block_notas;

/**
 *
 * @author andre
 */
public class Controla {
     public static int cont=0;
   String[ ] Contenedor = new String[100];
    
    public void setString(String cadena){
        Contenedor[cont] = cadena;
        cont++;
    }
    
    public String rehacer(){
        cont++;
        return Contenedor[cont];
    }
    
    public String deshacer(){
        cont --;
        return Contenedor[cont];
    }
}
