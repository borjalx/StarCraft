package especies;

import excepciones.ExcepcionStarcraft;

public abstract class Especie implements Comparable<Especie> {
    private String nombre;
    private double ataque;
    private double defensa;
    private int numeroVictorias;
//    private String especie;
    
    public Especie() {
    }

    public Especie(String nombre, double ataque, double defensa) throws ExcepcionStarcraft{
        
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public int getNumeroVictorias() {
        return numeroVictorias;
    }

    public void setNumeroVictorias(int numeroVictorias) {
        this.numeroVictorias = numeroVictorias;
    }

//    public String getEspecie() {
//        return especie;
//    }
//
//    public void setEspecie(String especie) {
//        this.especie = especie;
//    }
    
    @Override
    public int compareTo(Especie e){
        if (getNumeroVictorias() < e.getNumeroVictorias()) {
            return 1;
        }
        if (getNumeroVictorias() > e.getNumeroVictorias()) {
            return -1;
        }
        return 0;
    }
    
    public abstract double aumentarDefensa();
    
    public abstract double aumentarAtaque();
    

}
