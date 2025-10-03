package ar.edu.unahur.obj2.zonaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.cazador.CazadorRural;
import ar.edu.unahur.obj2.profugo.Profugo;
import ar.edu.unahur.obj2.zona.Zona;

public class ZonaTest {
    @Test
    public void unCazadorRealizaProcesodeCapturaYAhoraZonaSinEsosProfugos(){
        CazadorRural cr = new CazadorRural(70);
        Profugo p1 = new Profugo(15,50, true);
        Profugo p2 = new Profugo(20,80, true);
        Profugo p3 = new Profugo(80,50, true);
        Zona z = new Zona("este", new ArrayList<>(List.of(p1, p2, p3)));
        cr.procesoDeCaptura(z);
        assertEquals(z.getProfugos().size(), 1);
    }
}
