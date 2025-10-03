package ar.edu.unahur.obj2.cazador;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.Zona;
import ar.edu.unahur.obj2.profugo.Profugo;

public abstract class Cazador {
    protected Integer experiencia;
    protected List<Profugo> capturados = new ArrayList<>();
    
    public Cazador(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
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

    public void procesoDeCaptura(Zona unaZona) {
        List<Profugo> intimidados = new ArrayList<>(); 
        unaZona.getProfugos().stream().forEach(profugo -> { if (puedeCapturar(profugo)){
            capturarEnZona(profugo, unaZona);
        } else {
            intimidar(profugo);
            intimidados.add(profugo);
        }
        incrementarExperiencia(intimidados);
    });
    }

    private void capturarEnZona(Profugo unProfugo, Zona unaZona) {
        unaZona.quitarProfugo(unProfugo); 
        capturados.add(unProfugo);
    }

    private void incrementarExperiencia(List<Profugo> intimidados) {
        if (!intimidados.isEmpty()) {
        Integer minimaHabilidad = intimidados.stream().mapToInt(p -> p.getHabilidad()).min().getAsInt(); // en vez de if, tambien podria utilizar .orElse(0);
        this.experiencia += minimaHabilidad + capturados.size() * 2;
        } else {
            this.experiencia += capturados.size() * 2;
        }
    }

    public int obtenerExperiencia() {
        return this.experiencia;    
    }
}  
