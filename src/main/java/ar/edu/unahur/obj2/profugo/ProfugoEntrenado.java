package ar.edu.unahur.obj2.profugo;

public abstract class ProfugoEntrenado implements IProfugo{
    protected IProfugo profugo;

    public ProfugoEntrenado(IProfugo profugo) {
        this.profugo = profugo;
    }

    @Override
    public void dejarDeEstarNervioso() {
        profugo.dejarDeEstarNervioso();
    }

    @Override
    public void disminuirInocencia() {
        profugo.disminuirInocencia();
    }

    @Override
    public Boolean esNervioso() {
        return profugo.esNervioso();
    }

    @Override
    public Integer getHabilidad() {
        return profugo.getHabilidad();
    }

    @Override
    public Integer getInocencia() {
        return profugo.getInocencia();
    }

    @Override
    public void reducirHabilidad() {
        profugo.reducirHabilidad();
    }

    @Override
    public void volverseNervioso() {
        profugo.volverseNervioso(); 
    }
    
}
