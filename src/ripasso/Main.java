package ripasso;
import java.util.Scanner;

public class Main {
public static void main (String [] args){

    Scanner in = new Scanner (System.in);
    String [] arrayMarca = new String [100];
    String [] arrayModello = new String [100];
    String [] arrayPrezzo = new String [100];

    String marca;
    String modello;
    String prezzo;
    int contaAuto = 0;

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
                System.out.println("inserisci la marca dell'auto");
                marca = in.next();
                System.out.println("inserisci il modello");
                modello = in.next();
                System.out.println("inserisci il prezzo");
                prezzo = in.next();
                Metodi.AggiuntaAuto(marca, modello, prezzo, arrayMarca, arrayModello, arrayPrezzo);
                contaAuto = contaAuto + 1;
                break;

            case 2:
                if (contaAuto == 0){
                    System.out.println ("non ci sono auto nel catalogo, inseriscine una");
                    break;
                }

                for (int i = 0; i < arrayMarca.length; i ++){
                    if (arrayMarca [i] == null){
                        break;
                    }
                    else {
                        System.out.println(arrayMarca [i]+ " " + arrayModello [i] + " " + arrayPrezzo [i]);
                    }
                }
                System.out.println(" ");

                break;

            case 3:
                if (contaAuto == 0){
                    System.out.println ("non ci sono auto nel catalogo, inseriscine una");
                    break;
                }

                int numeroRicerca;
                System.out.println("inserisci marca");
                marca = in.next();

                System.out.println("inserisci modello");
                modello = in.next();

                numeroRicerca = Metodi.ricercaMarcaModello(marca, modello, arrayMarca, arrayModello, contaAuto);
                if (numeroRicerca == -1){
                    System.out.println("non ci sono auto con questa marca e modello");
                }
                else {
                    System.out.println("L'auto che hai cercato è disponibile per: " + arrayPrezzo [numeroRicerca] + "€");
                }

                break;




            case 4:
                if (contaAuto == 0){
                    System.out.println ("non ci sono auto nel catalogo, inseriscine una");
                    break;
                }

                int ricercaDaEliminare = -1;
                System.out.println("inserisci la marca dell'auto da eliminare");
                marca = in.next();
                System.out.println("inserisci il modello");
                modello = in.next();
                System.out.println("inserisci il prezzo");
                prezzo = in.next();

                for (int i = 0; i < contaAuto; i ++){
                    if (arrayMarca[i].equalsIgnoreCase(marca) && arrayModello[i].equalsIgnoreCase(modello) && arrayPrezzo[i].equalsIgnoreCase(prezzo) ){
                        ricercaDaEliminare = i;
                        break;
                    }
                }
                if (ricercaDaEliminare == -1){
                    System.out.println("non esiste un auto con queste caratteristiche");
                    break;
                }

                contaAuto = Metodi.eliminaAuto (arrayMarca, arrayModello, arrayPrezzo, ricercaDaEliminare, contaAuto);

                break;

            case 5:
                if (contaAuto == 0){
                    System.out.println ("non ci sono auto nel catalogo, inseriscine una");
                    break;
                }

                int ricerca = -1;
                String newMarca;
                String newModello;
                String newPrezzo;

                System.out.println("inserisci la marca dell'auto");
                marca = in.next();
                System.out.println("inserisci il modello");
                modello = in.next();
                System.out.println("inserisci il prezzo");
                prezzo = in.next();

                for (int i = 0; i < contaAuto; i ++){
                    if (arrayMarca[i].equalsIgnoreCase(marca) && arrayModello[i].equalsIgnoreCase(modello) && arrayPrezzo[i].equalsIgnoreCase(prezzo) ){
                        ricerca = i;
                        break;
                    }
                }
                if (ricerca == -1){
                    System.out.println("non esiste un auto con queste caratteristiche");
                    break;
                }

                System.out.println("inserisci la marca da sostituire");
                newMarca = in.next();
                System.out.println("inserisci il modello da sostituire");
                newModello = in.next();
                System.out.println("inserisci il prezzo da sostituire");
                newPrezzo = in.next();

                Metodi.modificaDati (arrayMarca, arrayModello, arrayPrezzo, newMarca, newModello, newPrezzo, ricerca);
                break;

            case 6:
                break;

            case 7:
                if (contaAuto == 0){
                    System.out.println ("non ci sono auto nel catalogo, inseriscine una");
                    break;
                }

                for (int i = 0; i < arrayMarca.length; i ++){
                    if (arrayModello [i] == null){
                        break;
                    }
                    else if (arrayModello [i].contains("diesel")){
                        System.out.println(arrayMarca [i]+ " " + arrayModello [i] + " " + arrayPrezzo [i]);
                    }
                }
                System.out.println(" ");

                break;

            case 8:
                System.out.println("programma concluso");
                closecode = false;
                break;

        }
    }while (closecode);
}
}
