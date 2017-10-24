package especies;

import excepciones.ExcepcionStarcraft;

public class Protoss extends Especie{
    private int pilones;

    public Protoss(String nombre, double ataque, double defensa, int pilones) throws ExcepcionStarcraft {
        super(nombre, ataque, defensa);
        this.pilones = pilones;
        this.setNumeroVictorias(0);
    }

    public Protoss(){};

    public int getPilones() {
        return pilones;
    }

    public void setPilones(int pilones) {
        this.pilones = pilones;
    }
    
    
    
    @Override
    public double aumentarDefensa() {        
        double total = 0;
        
        total += pilones * (0.5 * getDefensa());
        
        return total;
    }

    @Override
    public double aumentarAtaque() {
        double total = 0;
        
        total += pilones * (0.5 * getAtaque());
        
        return total;    
    }
    
    @Override
    public String printInfo() {
        return this.toString();
    }
}
