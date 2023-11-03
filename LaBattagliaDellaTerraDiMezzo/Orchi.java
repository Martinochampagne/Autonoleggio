public class Orchi extends Personaggio{
    private String forza;

    public Orchi ( String forza){
        
        this.forza = forza;
    }

    public Orchi(){
        super();
        this.forza="";
    }

    public Orchi(Orchi that){
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

        return " Orchi: esp < 5 forza = 30 + "  + this.forza  + "| esp > 5 forza = 70 + 3";
    }
}
