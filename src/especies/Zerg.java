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
    public String printInfo() {
        return this.toString();
    }
    
    
    
}
