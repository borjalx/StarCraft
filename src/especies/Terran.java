package especies;

import excepciones.ExcepcionStarcraft;

public class Terran extends Especie{
    private int edificios;
    private int tecnologia;

    
    public Terran(){
    };
    
    public Terran(String nombre, double ataque, double defensa, int edificios, int tecnologia) throws ExcepcionStarcraft {
        super(nombre, ataque, defensa);
        this.edificios = edificios;
        this.tecnologia = tecnologia;
        this.setNumeroVictorias(0);
    }

    public int getEdificios() {
        return edificios;
    }

    public void setEdificios(int edificios) {
        this.edificios = edificios;
    }

    public int getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(int tecnologia) {
        this.tecnologia = tecnologia;
    }

    @Override
    public double aumentarDefensa() {
        double total = 0;
        
        total += edificios * (0.25 * getDefensa());
        
        return total;
    }

    @Override
    public double aumentarAtaque() {
        double total = 0;
        
        total += tecnologia * (0.5 * getAtaque());
        
        return total;
    }

    @Override
    public String toString() {
        return "Terran{" + " nombre = " + this.getNombre() +
                           ", victorias = " + this.getNumeroVictorias() +
                           ", edificios = " + edificios + 
                           ", tecnologia = " + tecnologia + '}';
    }

    
    
}
