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

    public Veicolo(Veicolo that){
        this.targa=that.targa;
        this.codice=that.codice;
        this.marca=that.marca;
        this.posti=that.posti;
    }

    public int getCodice(){
         return codice;
    }
    public int getTarga(){
         return targa;
    }
    public String getMarca(){
         return marca;
    }
    public int getPosti(){
         return posti;
    }

    public String toString(){
        return "codice: " + codice + " targa: " + targa + " marca: " + marca + " posti: " + posti;
    }
}
