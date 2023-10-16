
public class Treno {
    private String modello;
    private String capienza;
    private String velocità;
    

    public Treno(String modello, String capienza, String velocità){
        this.modello=modello;
        this.capienza=capienza;
        this.velocità=velocità;
        
    }

    public Treno(){
        modello="";
        capienza="";
        velocità="";          
        
    }

    public Treno(Treno that){
        this.modello=that.modello;
        this.capienza=that.capienza;
        this.velocità=that.velocità;
        
    }

    public String getModello(){
        return modello;
    }

    public String getCapienza(){
        return capienza; 
    }

    public String getVelocità(){
        return velocità;
    }

   
    

    public void setModello(String modello){
        this.modello=modello;
    }

    public void setCapienza(String capienza){
        this.capienza=capienza;
    }

    public void setVelocità(String velocità){
        this.velocità=velocità;
    }

    

    public boolean equals(Treno that){
       boolean r=false;
       if(this.modello==that.modello && this.capienza==that.capienza && this.velocità==that.velocità){
           r=true;
           System.out.println("");
           System.out.println("il treno è acceso: ");
       }
       return r;
    }
    public String toString(){
        return "il modello del treno è "+ this.modello + ", la sua capienza è di " + this.capienza + ", va ad una velocità di " + this.velocità;
        
    }
    
}