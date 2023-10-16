public class Orari {
    private String tratta;
    
    

    public Orari(String tratta){
        
        this.tratta=tratta;
        
        
    }

    public Orari(){
        tratta="";
        
    }

    public Orari(Orari that){
        this.tratta=that.tratta;
       
    }

    public String getTratta(){
        return tratta;
    }

    

   
    public void setTratta(String tratta){
        this.tratta=tratta;
    }
    
    

    
    public boolean equals(Orari that){
       boolean r=false;
       if(this.tratta==that.tratta){
           r=true;
           System.out.println("");
           System.out.println("il treno è puntuale: ");
       }
       return r;
    }
    public String toString(){
        return "la seguente tratta: "+ this.tratta ;
        
    }
    
}