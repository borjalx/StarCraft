package especies;

import excepciones.ExcepcionStarcraft;


public class Zerg extends Especie{
    private int esbirros;
    private int overlords;
    
    
    public Zerg(){};

    public Zerg(String nombre, double ataque, double defensa, int esbirros, int overlords) throws ExcepcionStarcraft {
        super(nombre, ataque, defensa);
        this.esbirros = esbirros;
        this.overlords = overlords;
        this.setNumeroVictorias(0);
        
    }

    public int getEsbirros() {
        return esbirros;
    }

    public void setEsbirros(int esbirros) {
        this.esbirros = esbirros;
    }

    public int getOverlords() {
        return overlords;
    }

    public void setOverlords(int overlords) {
        this.overlords = overlords;
    }
    
    

    @Override
    public double aumentarDefensa() {
        
        double total = 0;
        
        total += esbirros * (0.3 * getDefensa());
        
        return total;
    }

    @Override
    public double aumentarAtaque() {
        
        double total = 0;
        
        total += esbirros * (0.15 * getAtaque());
        total += overlords * (0.4 * getAtaque());
        
        return total;
        
    }

    @Override
    public int compareTo(Especie e) {
       if (getNumeroVictorias() < e.getNumeroVictorias()) {
            return -1;
        }
        if (getNumeroVictorias() > e.getNumeroVictorias()) {
            return 1;
        }
        return 0;
    }
    
    
    
}
