public class Uomini extends Personaggio {

    private String forza;

    public Uomini ( String forza){
        
        this.forza = forza;
    }

    public Uomini(){
        super();
        this.forza="";
    }

    public Uomini(Uomini that){
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

        return " Uomini: forza = 30 +"+ this.forza;
    }
    
}
