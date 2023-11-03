public class Hobbit extends Personaggio{
    private String forza;

    public Hobbit ( String forza){
        
        this.forza = forza;
    }

    public Hobbit(){
        super();
        this.forza="";
    }

    public Hobbit(Hobbit that){
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

        return " Hobbit: forza = 10 +"+ this.forza;
    }
}
