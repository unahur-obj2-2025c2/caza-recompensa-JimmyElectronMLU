package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.profugo.Profugo;

public class Zona {
    private String nombre;
    private List<Profugo> profugos = new ArrayList<>();

    public Zona(String nombre, List<Profugo> profugos) {
        this.nombre = nombre;
        this.profugos = profugos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Profugo> getProfugos() {
        return profugos;
    }
    
    public void aniadirProfugo(Profugo unProfugo){
        profugos.add(unProfugo);
    }

    public void quitarProfugo(Profugo unProfugo){
        profugos.remove(unProfugo);
    }
}
