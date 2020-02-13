/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package articulo;

/**
 *
 * @author dam
 */
public class Articulo {

    
    String Codigo;
    String denominacion;
    int existencias;
    int exisMinimias;
    float pvp;

    public Articulo(int exitencias, float pvp) {
        this.existencias = exitencias;
        this.pvp = pvp;
    }
    
    
    public void recepcionMercancias(int cantidad,float preciocompra){
    
    pvp = (((existencias *pvp) + (cantidad * preciocompra*1.1f))/(existencias+cantidad));
            
	existencias= existencias+ cantidad;
    
    
    }
}
