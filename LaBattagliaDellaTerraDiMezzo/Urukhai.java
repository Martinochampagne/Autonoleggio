public class Urukhai extends Personaggio{
    private String forza;

    public Urukhai( String forza){
        
        this.forza = forza;
    }

    public Urukhai(){
        super();
        this.forza="";
    }

    public Urukhai(Urukhai that){
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

        return " Urukhai: forza = 50 +"+ this.forza;
    }
}
