public class Biglietti {
    private double costo;
    private String validità;
    private String classe;

    public Biglietti(double costo, String validità, String classe){
        this.costo=costo;
        this.validità=validità;
        this.classe=classe;
    }

    public Biglietti(){
        costo=0.0;
        validità="";
        classe="";
    }

    public Biglietti(Biglietti that){
        this.costo=that.costo;
        this.validità=that.validità;
        this.classe=that.classe;
    }

    public double getCosto(){
        return costo;
    }

    public String getValidità(){
        return validità;
    }

    public String getClasse(){
        return classe;
    }

    public void setCosto(double costo){
        this.costo=costo;
    }

    public void setValidità(String validità){
        this.validità=validità;
    }

    public void setClasse(String classe){
        this.classe=classe;
    }

    public String toString (){
        return "Il biglietto costa " +this.costo+"E, ed è valido per " +this.validità+ " e viaggerete in " +this.classe;
    }
}
