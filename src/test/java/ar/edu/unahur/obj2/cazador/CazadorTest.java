package ar.edu.unahur.obj2.cazador;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.profugo.Profugo;

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
}
