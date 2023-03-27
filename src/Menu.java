import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Menu {

    public ArrayList<String> MenuCarta(){
    ArrayList<String> PlatosDeLaCarta = new ArrayList<>();
    ArrayList<String> MenuAleatorio = new ArrayList<>();
        FileReader leo;
        String[] archivo = {"entrantes.txt","primeros.txt","segundos.txt","postres.txt"};
        try {//inicio el bucle para rellenar la carta con los platos
         for (int i = 0; i<archivo.length,i++){ // me resalta esta linea como mal, no veo el error
             leo=new FileReader(archivo[i]);
                BufferedReader nuevo = new BufferedReader(leo);
                String nuevoplato;
                while (nuevoplato != nuevo.readLine()) != null);
                PlatosDeLaCarta.add(nuevoplato);
            }
         //funcion aleatoria para que me escoja al azar cada uno de los elementos
            Random ale = new Random();
          int ale_entrante =ale.nextInt(4);
           int ale_primero=ale.nextInt(5)+5;
          int ale_segundo=ale.nextInt(5)+10;
           int ale_postre=ale.nextInt(5)+15;

         MenuAleatorio.add(PlatosDeLaCarta.get(ale_entrante));
         MenuAleatorio.add(PlatosDeLaCarta.get(ale_primero));
         MenuAleatorio.add(PlatosDeLaCarta.get(ale_segundo));
         MenuAleatorio.add(PlatosDeLaCarta.get(ale_postre));
            System.out.println("tu menu se forma por " + MenuAleatorio.get(0) + "de entrante, " + MenuAleatorio.get(1) + " de primer plato, " + MenuAleatorio.get(2) + " de segundo plato, y " + MenuAleatorio.get(3) + " de postre");

        } catch (Exception e) {
            System.out.println("Se ha producido un error");;
        }
        return MenuAleatorio;

    }
}
