/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package articulo;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestPara {

    int exIni;
    int exFin;
    float preIni;
    float preFin;
    int can;
    float precio;

    public TestPara(int exIni, int exFin, float preIni, float preFin, int can, float precio) {
        this.exIni = exIni;
        this.exFin = exFin;
        this.preIni = preIni;
        this.preFin = preFin;
        this.can = can;
        this.precio = precio;
    }

    public static Collection<Object[]> fatos() {

        return Arrays.asList(new Object[][]{
            {5, 7, 10, 12, 2, 11},
            {0, 5, 0, 9.9f, 5, 9.9f}});

    }

    @Test
    public void testRecepcionMercancias() {
        Articulo a = new Articulo(exIni, preIni);
        a.recepcionMercancias(can, precio);
        assertEquals("Error en la existencias", exFin, a.existencias);
        assertEquals("Error en el pvp", preFin,a.existencias,0.01);
    }
    
    @Test
    public void testMercancias() {
        Articulo a = new Articulo(exIni, preIni);
        a.recepcionMercancias(can, precio);
        assertEquals("Error en la existencias", exFin, a.existencias);
    }
    
    @Test
    public void testpvp() {
        Articulo a = new Articulo(exIni, preIni);
        a.recepcionMercancias(can, precio);
        assertEquals("Error en el pvp", preFin,a.existencias,0.01);
    }

}
