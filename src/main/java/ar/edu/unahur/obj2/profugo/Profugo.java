package ar.edu.unahur.obj2.profugo;

public class Profugo implements IProfugo{
    private Integer inocencia;
    private Integer habilidad;
    private boolean esNervioso;

    public Profugo(Integer inocencia, Integer habilidad, boolean esNervioso) {
        this.inocencia = inocencia;
        this.habilidad = habilidad;
        this.esNervioso = esNervioso;
    }
    @Override
    public Integer getInocencia() {
        return inocencia;
    }
    @Override
    public Integer getHabilidad() {
        return habilidad;
    }
    @Override
    public Boolean esNervioso() {
        return esNervioso;
    }
    @Override
    public void disminuirInocencia() {
        this.inocencia = Math.max(0, this.inocencia - 2);
    }
    @Override
    public void reducirHabilidad() {
        this.habilidad = Math.max(0, this.habilidad - 5);
    }
    @Override
    public void volverseNervioso() {
        this.esNervioso = true;
    }
    @Override
    public void dejarDeEstarNervioso() {
        this.esNervioso = false;
    }

}
