package ar.edu.unahur.obj2.cazador;

import ar.edu.unahur.obj2.profugo.Profugo;

public class CazadorSigiloso extends Cazador{

    public CazadorSigiloso(Integer experiencia) {
        super(experiencia);
    }

    @Override
    protected boolean condicionEspecifica(Profugo profugo) {
        return profugo.getHabilidad() < 50;
    }

    @Override
    public void intimidacionEspecifica(Profugo profugo) {
        profugo.reducirHabilidad();
    }

}
