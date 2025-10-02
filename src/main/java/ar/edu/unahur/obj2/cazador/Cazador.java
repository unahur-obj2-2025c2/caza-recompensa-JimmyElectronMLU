package ar.edu.unahur.obj2.cazador;

import ar.edu.unahur.obj2.profugo.Profugo;

public abstract class Cazador {
    protected Integer experiencia;
    
    public Cazador(Integer experiencia) {
        this.experiencia = experiencia;
    }

    //condicion general
    public Boolean puedeCapturar(Profugo profugo) {
        return this.experiencia > profugo.getInocencia() 
        && condicionEspecifica(profugo);
    }

    //condicion especifica
    protected abstract boolean condicionEspecifica(Profugo profugo);

    public void intimidar(Profugo profugo){
        profugo.disminuirInocencia();
        intimidacionEspecifica(profugo);
    }

    public abstract void intimidacionEspecifica(Profugo profugo);

}  
