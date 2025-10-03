package ar.edu.unahur.obj2.profugoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.profugo.Profugo;

public class ProfugoTest {
    @Test
    public void guardaYDevuelveAtributos(){
        //preparacion
        Profugo p = new Profugo(50, 60, true);

        //contrastacion
        //resolucion
        assertEquals(Integer.valueOf(50),p.getInocencia());
        assertEquals(Integer.valueOf(60),p.getHabilidad());
        assertTrue(p.esNervioso());
    }
    @Test 
    public void disminuirInocenciaNoBajaDeCero(){
        Profugo p = new Profugo(1,30, true);
        p.disminuirInocencia();
        p.disminuirInocencia();
        assertEquals(Integer.valueOf(0), p.getInocencia());
    }
    @Test 
    public void reducirHabilidadNoBajaDeCero(){
        Profugo p = new Profugo(10,3, true);
        p.reducirHabilidad();
        p.reducirHabilidad();
        assertEquals(Integer.valueOf(0), p.getHabilidad());
    }
}
