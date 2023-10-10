public class Veicolo {
    private int codice;
    private int targa;
    private String marca;
    private int posti;

    public Veicolo(int codice, int targa, String marca, int posti ){
        this.targa=targa;
        this.codice=codice;
        this.marca=marca;
        this.posti=posti;
    }

    public Veicolo(){
        targa=0;
        codice=0;
        marca="";
        posti=0;
    }

    
}
