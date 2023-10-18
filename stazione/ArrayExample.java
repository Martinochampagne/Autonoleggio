public class ArrayExample { 

  public static void main(String[] args) { 

        // Chiamata al metodo e ricezione dell'array restituito 

        int[] risultato = creaArray(1); 

         

        // Stampare gli elementi dell'array restituito 
        System.out.println("------------------------------");
	    System.out.println("             N.VAGONI           ");
	    System.out.println("------------------------------");
        System.out.print(" il treno è composto da: "); 

        for (int numero : risultato) { 

            System.out.print(numero + " vagoni " ); // Output: 1 2 3 4 5 

        } 

    } 

    // Metodo che restituisce un array di interi 

    public static int[] creaArray(int lunghezza) { 

        int[] nuovoArray = new int[lunghezza]; 

        for (int i = 0; i < lunghezza; i++) { 

            nuovoArray[i] = 1 + 4; 

        } 

        return nuovoArray; 

    } 
    
    
   
}