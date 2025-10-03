package ar.edu.unahur.obj2.profugo;

public class ArtesMarciales extends ProfugoEntrenado{

    public ArtesMarciales(IProfugo profugo) {
        super(profugo);
    }

    @Override
    public Integer getHabilidad() {
        return Math.min(100, profugo.getHabilidad()*2);
    }

}
