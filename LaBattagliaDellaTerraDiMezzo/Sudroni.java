public class Sudroni extends Personaggio{
    private String forza;

    public Sudroni ( String forza){
        
        this.forza = forza;
    }

    public Sudroni(){
        super();
        this.forza="";
    }

    public Sudroni(Sudroni that){
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

        return " Sudroni: forza = 40 +"+ this.forza;
    }
}
