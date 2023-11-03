public class Nani extends Personaggio{
    private String forza;

    public Nani(String forza){
        this.forza=forza;

    }

    public Nani(){
        super();

        forza="";
    }

    public Nani (Nani that){
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

        return " Nani: forza = 20 + " + this.forza;
    }
}


