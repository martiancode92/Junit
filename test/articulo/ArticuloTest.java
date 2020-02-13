/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package articulo;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author dam
 */
public class ArticuloTest {
    
   static Articulo a;
    
    public ArticuloTest() {
    }

    @Test
    public void testRecepcionMercancias() {
        System.out.println("recepcionMercancias");
        int cantidad = 5;
        float preciocompra = 10F;
        Articulo instance = new Articulo(1,10);
        instance.recepcionMercancias(cantidad, preciocompra);
        assertEquals("Error en la existencias",6,instance.existencias);
        assertEquals("Error en la existencias",10.83f,instance.pvp,0.01f);
    }
    
    @BeforeClass
    
    public static void crearArticulo(){
    
    a= new Articulo(1,10);
    
    
    }
    @Test
        public void testMercancias() {
        System.out.println("recepcionMercancias");
        int cantidad = 5;
        float preciocompra = 10F;
        a.recepcionMercancias(cantidad, preciocompra);
        assertEquals("Error en la existencias",6,a.existencias);
       
    }
    
        
    @AfterClass

    public static void anular(){
        
        a=null;
        
    }
    
     @Test
        public void testPvp() {
        System.out.println("recepcionMercancias");
        int cantidad = 5;
        float preciocompra = 10F;
        a.recepcionMercancias(cantidad, preciocompra);
         assertEquals("Error en la existencias",10.83f,a.pvp,0.01f);
       
    }
}

        //assertEquals("Error en la existencias",6,instance.existencias);
        //assertEquals("Error en la existencias",10.83f,instance.pvp,0.01f);