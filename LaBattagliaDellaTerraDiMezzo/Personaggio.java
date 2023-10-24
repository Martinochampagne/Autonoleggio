public class Personaggio {
    private int esperienza;
    private String fazione;
    private String scelta;

public Personaggio(int esperienza, String fazione, String scelta){
    this.esperienza=esperienza;
    this.fazione=fazione;
    this.scelta=scelta;
}

public Personaggio(){
    esperienza=0;
    fazione="";
    scelta="";
}

public Personaggio(that personaggio){
    this.esperienza=that.esperienza;
    this.fazione=that.fazione;
    this.scelta=that.scelta;
}

public int getEsperienza(){
    return esperienza;
}

public String getFazione(){
    return fazione;
}
public String getScelta(){
    return scelta;
}

public void setEsperienza(int esperienza){
    this.esperienza=esperienza;
}
public void setFazione(String fazione){
    this.fazione=fazione;
}
public void setScelta(String scelta){
    this.scelta=scelta;
}

public String toString(){
 return "Benvenuto alla battaglia della Terra di Mezzo, il tuo personaggio ha un esperienza"+ this.esperienza + " da 1 a 10 in base al combattimento. Il gioco è composto da due " + this.fazione + "devi fare una " +this.scelta ;
}
}

