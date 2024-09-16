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


    public static int ricercaMarcaModello (String marca, String modello, String [] arrayMarca, String [] arrayModello){
    int numeroRicerca = 101;
        for (int i = 0; i < arrayMarca.length; i ++){
            if (arrayMarca[i].equalsIgnoreCase(marca) && arrayModello[i].equalsIgnoreCase(modello)){
                numeroRicerca = i;
                break;
            }
            else {
            }
            }
    return numeroRicerca;
    }

}