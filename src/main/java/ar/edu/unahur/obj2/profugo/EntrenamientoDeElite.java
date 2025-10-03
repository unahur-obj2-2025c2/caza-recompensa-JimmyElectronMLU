package ar.edu.unahur.obj2.profugo;

public class EntrenamientoDeElite extends ProfugoEntrenado{

    public EntrenamientoDeElite(IProfugo profugo) {
        super(profugo);
    }

    @Override
    public Boolean esNervioso() {
        return Boolean.FALSE;
    }

    
}
