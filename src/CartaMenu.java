import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class CartaMenu {

    //creamos las funciones donde se introducen los elementos del fichero
    public void meter_entrantes (String comida,String archivo){
        FileWriter escribir;

        try{ //creamos una nueva entrada donde se escribe y se cierra una vez introducido el entrante que queramos
            escribir = new FileWriter(archivo,true);
            escribir.write(comida + "");
            escribir.close();
        }catch (IOException e){
            System.out.println(e.toString()); //recojo en un mensaje la excepcion si no se cumple la primera parte del try-catch

        }



    }
    public void meter_primeros (String comida,String archivo){
        FileWriter escribir;
        try{//IDEM pero para los primeros
            escribir = new FileWriter(archivo,true);
            escribir.write(comida + "");
            escribir.close();
        }catch (IOException e){
            System.out.println(e.toString());

        }



    }
    public void meter_segundos (String comida,String archivo){
        FileWriter escribir;
        try{//Idem para los segundos
            escribir = new FileWriter(archivo,true);
            escribir.write(comida + "");
            escribir.close();
        }catch (IOException e){
            System.out.println(e.toString());

        }


    }
    public void meter_postres (String comida,String archivo){
        FileWriter escribir;
        try{//Idem para los terceros
            escribir = new FileWriter(archivo,true);
            escribir.write(comida + "");
            escribir.close();
        }catch (IOException e){
            System.out.println(e.toString());

        }

    }
    //creo la funcion donde guardo el menu
    public void guardar_menu (ArrayList <String> menu, int numero){
        FileWriter escribir;
        try {
            escribir= new FileWriter("menu.txt",false);
            for (String comida:menu){
                escribir.write(comida + "");
            }
            escribir.close();//cerramos el fichero una vez se haya llenado de los elementos que queramos
        }catch (IOException e){
            System.out.println(e.toString());
        }



    }
}
