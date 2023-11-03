public class Main {
    public static void main(String[] args) {
        Personaggio m = new Personaggio(1, "fazioni ", "scelta: ");
        

        System.out.println("------------------------------------------------------");
	    System.out.println("            LA BATTAGLIA DELLA TERRA DI MEZZO             ");
	    System.out.println("------------------------------------------------------");

        System.out.println("");

        System.out.println(m.toString());

        System.out.println("");
        

        System.out.println("------------------------------------------------------");
	    System.out.println("                SELEZIONE DEL PERSONAGGIO             ");
	    System.out.println("------------------------------------------------------");

        System.out.println("");

        System.out.println("BUONI:");

        Uomini elle = new Uomini(" 6");
        System.out.println(elle.toString());
        System.out.println("");
        Elfi e = new Elfi("2 ");
        System.out.println(e.toString());
        System.out.println("");
        Nani k = new Nani("4 ");
        System.out.println(k.toString());
        System.out.println("");
        Hobbit r = new Hobbit("3 ");
        System.out.println(r.toString());
        System.out.println("");

        System.out.println("CATTIVI:");

        Orchi x = new Orchi("2 ");
        System.out.println(x.toString());
        System.out.println("");
        Urukhai y = new Urukhai("5 ");
        System.out.println(y.toString());
        System.out.println("");
        Sudroni u = new Sudroni("5 ");
        System.out.println(u.toString());

        System.out.println("");

        System.out.println("------------------------------------------------------");
	    System.out.println("                 SVOLGIMENTO DEL GIOCO             ");
	    System.out.println("------------------------------------------------------");
    }
}
