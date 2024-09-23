package ripasso;

public class Metodi {


    public static void AggiuntaAuto( String marca, String modello, String prezzo, String [] arrayMarca, String [] arrayModello, String [] arrayPrezzo) {

        for (int i = 0; i < arrayMarca.length; i ++){
           if (arrayMarca [i] == null){
               arrayMarca [i] = marca;
               break;
           }
       }
        for (int i = 0; i < arrayModello.length; i ++){
            if (arrayModello [i] == null){
                arrayModello [i] = modello;
                break;
            }
        }
        for (int i = 0; i < arrayPrezzo.length; i ++){
            if (arrayPrezzo [i] == null){
                arrayPrezzo [i] = prezzo;
                break;
            }
        }
    }


    public static int ricercaMarcaModello (String marca, String modello, String [] arrayMarca, String [] arrayModello, int contaAuto){
    int numeroRicerca = -1;
        for (int i = 0; i < contaAuto; i ++){
            if (arrayMarca[i].equalsIgnoreCase(marca) && arrayModello[i].equalsIgnoreCase(modello)){
                numeroRicerca = i;
                break;
            }
            }
    return numeroRicerca;
    }


    public static void modificaDati (String [] arrayMarca, String [] arrayModello, String [] arrayPrezzo, String newMarca, String newModello, String newPrezzo, int ricerca){
        arrayMarca [ricerca] = newMarca;
        arrayModello [ricerca] = newModello;
        arrayPrezzo [ricerca] = newPrezzo;

    }


    public static int eliminaAuto (String [] arrayMarca, String [] arrayModello, String [] arrayPrezzo, int ricerca, int contaAuto){

        for (int i = ricerca; i < contaAuto; i ++){
            arrayMarca [i] = arrayMarca [i+1];
            arrayModello [i] = arrayModello [i+1];
            arrayPrezzo [i] = arrayPrezzo [i+1];

        }
        contaAuto = contaAuto - 1;
        return contaAuto;
    }
}