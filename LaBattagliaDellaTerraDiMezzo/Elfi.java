public class Elfi extends Personaggio{
    private String forza;

    public Elfi(String forza){
        this.forza=forza;

    }

    public Elfi(){
        super();

        forza="";
    }

    public Elfi (Elfi that){
        super(that);
        this.forza=that.forza;
    }

    public String getForza(){
        return forza;
    }
    
    public void setForza(String forza){
        this.forza=forza;
    }

    public String toString(){

        return " Elfi: esp < 5 forza = 20 + "  + this.forza  + "| esp > 5 forza = 80 + 2";
    }
}
