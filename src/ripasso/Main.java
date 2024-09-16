package ripasso;
import java.util.Scanner;

public class Main {
public static void main (String [] args){

    Scanner in = new Scanner (System.in);
    String [] concessionario = new String [100];

    String auto;

    boolean closecode = true;
    do {
        System.out.println("1 - aggiunta di una nuova auto");
        System.out.println("2 - visualizzazione di tutte le auto");
        System.out.println("3 - ricerca di un'auto tramite marca e modello");
        System.out.println("4 - cancellazione di un'auto");
        System.out.println("5 - modifica dei dati di un'auto");
        System.out.println("6 - visualizzazione delle auto in ordine crescente");
        System.out.println("7 - visualizzare tutti i modelli che diese");
        System.out.println("8 - termina");


        int scelta = in.nextInt();

        switch (scelta){
            case 1:
                System.out.println("quale auto vuoi aggiungere?");
                auto = in.next();
                 Metodi.AggiuntaAuto(concessionario);
                break;

            case 2:
                break;

            case 3:
                break;


            case 4:
                break;

            case 5:
                break;

            case 6:
                break;

            case 7:
                break;

            case 8:
                System.out.println("programma concluso");
                closecode = false;
                break;

        }
    }while (closecode);
}
}
