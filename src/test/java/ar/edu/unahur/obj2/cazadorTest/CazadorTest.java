package ar.edu.unahur.obj2.cazadorTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.cazador.*;
import ar.edu.unahur.obj2.profugo.Profugo;
import ar.edu.unahur.obj2.zona.Zona;

public class CazadorTest {
    @Test
    public void urbanoCapturaSiExperienciaMayorYNoNervioso() {
        CazadorUrbano c = new CazadorUrbano(60);
        Profugo p = new Profugo(40, 70, false);
        assertTrue(c.puedeCapturar(p));
    }
    @Test
    public void ruralNoCapturaSiNoEsNervioso() {
        CazadorRural c = new CazadorRural(70);
        Profugo p = new Profugo(30, 60, false);
        assertFalse(c.puedeCapturar(p));
    }
    @Test
    public void sigilosoNoCapturaSiHabilidadAlta() {
        CazadorSigiloso c = new CazadorSigiloso(80);
        Profugo p = new Profugo(20, 90, true);
        assertFalse(c.puedeCapturar(p));
    }
    @Test 
    public void despuesDeCazarElCazadorAumentaSuExperiencia(){
        CazadorRural c = new CazadorRural(75);
        Profugo p = new Profugo(20, 50, true);
        Zona z = new Zona("este",new ArrayList<>());
        z.aniadirProfugo(p);
        c.procesoDeCaptura(z);
        assertTrue(c.getExperiencia() > 75);
    }
}
