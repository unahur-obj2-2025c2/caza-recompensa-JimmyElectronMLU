package ar.edu.unahur.obj2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.cazador.CazadorRural;
import ar.edu.unahur.obj2.cazador.CazadorSigiloso;
import ar.edu.unahur.obj2.cazador.CazadorUrbano;
import ar.edu.unahur.obj2.profugo.Profugo;

public class IntimidacionTest {
    @Test
    public void urbanoIntimidaYDejaDeSerNerviosoYDisminuyeInocencia(){
        CazadorUrbano c = new CazadorUrbano(10);
        Profugo p = new Profugo(50, 40,true);
        c.intimidar(p);
        assertFalse(p.esNervioso());
        assertEquals(Integer.valueOf(40), p.getInocencia());;
    }
     @Test
    public void ruralIntimidaYSeVuelveNerviosoYDisminuyeInocencia(){
        CazadorRural c = new CazadorRural(10);
        Profugo p = new Profugo(50, 40,false);
        c.intimidar(p);
        assertTrue(p.esNervioso());
        assertEquals(Integer.valueOf(40), p.getInocencia());;
    }
     @Test
    public void sigilosoIntimidaReduciendoHabilidadYReduceInocencia(){
        CazadorSigiloso c = new CazadorSigiloso(10);
        Profugo p = new Profugo(50, 40,false);
        c.intimidar(p);
        assertEquals(Integer.valueOf(35), p.getHabilidad());
        assertEquals(Integer.valueOf(48), p.getInocencia());
    }
}
