package ar.edu.unahur.obj2.cazador;

import ar.edu.unahur.obj2.profugo.Profugo;

public class CazadorRural extends Cazador {

    public CazadorRural(Integer experiencia) {
        super(experiencia);
    }

    @Override
    protected boolean condicionEspecifica(Profugo profugo) {
        return profugo.esNervioso();
    }

    @Override
    public void intimidacionEspecifica(Profugo profugo) {
        profugo.volverseNervioso();
    }

}
