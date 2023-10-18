import org.omg.CORBA.SystemException;

public class Main
{
	public static void main(String[] args) {
	    Treno p= new Treno ("Caravaggio", "563 persone", "140 km/h");
	    System.out.println("------------------------------");
	    System.out.println("         STAZIONE             ");
	    System.out.println("------------------------------");
		System.out.println(p.toString());
		Treno e= new Treno(p);
		System.out.println(p.equals(e));

		Orari g= new Orari ("Edolo-Brescia");
		System.out.println("------------------------------");
	    System.out.println("             ORARI           ");
	    System.out.println("------------------------------");
		System.out.println(g.toString());
		Orari f= new Orari(g);
		System.out.println(g.equals(f));

		Biglietti l= new Biglietti (9.65, "1h 30m", "2a classe");
		System.out.println("------------------------------");
	    System.out.println("          BIGLIETTI           ");
	    System.out.println("------------------------------");
		System.out.println(l.toString());

		try{
			int result= 10/0;
		}

		catch(ArithmeticException b){
			System.out.println("Errore: divisione per zero non consentita");
		}

		finally{
			System.out.println("Operazione completata");
		}
		
	}

}
