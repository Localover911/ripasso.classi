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
}