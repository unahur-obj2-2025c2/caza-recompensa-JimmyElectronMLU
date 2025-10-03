package ar.edu.unahur.obj2.profugo;

public class ProteccionLegal extends ProfugoEntrenado{

    public ProteccionLegal(IProfugo profugo) {
        super(profugo);
    }

    @Override
    public void disminuirInocencia() {
        //no hace nada.
    }

    @Override
    public Integer getInocencia() {
        return Math.max(40, profugo.getInocencia());
    }

}
