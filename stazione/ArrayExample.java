public class ArrayExample { 

  public static void main(String[] args) { 

        

        int[] risultato = creaArray(1); 

         

       
        System.out.println("------------------------------");
	    System.out.println("             N.VAGONI           ");
	    System.out.println("------------------------------");
        System.out.print(" il treno è composto da: "); 

        for (int numero : risultato) { 

            System.out.print(numero + " vagoni " );  

        } 

    } 

     

    public static int[] creaArray(int lunghezza) { 

        int[] nuovoArray = new int[lunghezza]; 

        for (int i = 0; i < lunghezza; i++) { 

            nuovoArray[i] = 1 + 4; 

        } 

        return nuovoArray; 

    } 
    
    
   
}