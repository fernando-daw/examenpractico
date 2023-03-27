import java.awt.Menu;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        CartaMenu nueva = new CartaMenu();


        //creacion de variables para el menu

        boolean menu_opciones = true;
        boolean carta_menu=false;
        int vueltas = 1;
        Scanner pedir = new Scanner(System.in);

        ArrayList<String>Menu_Inicial = new ArrayList<>();


        while (menu_opciones){ //creacion de las opciones del menu
            System.out.println("Selecciona una opcion de la carta:");
            System.out.println("1. Crear un nuevo menú");
            System.out.println("2. Ver menú actual");
            System.out.println("3. Guardar menú actual");
            System.out.println("4. Salir");

            int opcion = pedir.nextInt();

            switch (opcion){
            case 1:
                Menu_Inicial = Menu.MenuCarta();
                carta_menu=true;
                do {
                    int guardo_menu=0;
                    guardo_menu=pedir.nextInt();

                    switch (guardo_menu){
                        case 1:
                        nueva.guardar_menu(Menu_Inicial,vueltas);
                        vueltas= vueltas+1;
                        System.out.println("Menu guardado");
                        break;
                        case 2:
                            Menu_Inicial = Menu.Menucarta();
                            break;
                    }
                }
            case 2:
                System.out.println("Tu menu es " + Menu_Inicial);
                break;
                case 3:
                    if (carta_menu =true){
                        do{
                        int borrar=0;
                         borrar= pedir.nextInt();
                         if (borrar==1){
                             Menu_Inicial = Menu.MenuCarta();
                             System.out.println("Este es tu menu, quieres guardarlo o borrar y hacer uno nuevo?");
                             int guardo = 0;
                             guardo=pedir.nextInt();
                             switch (guardo){
                                 case 1:
                                     nueva.guardar_menu(Menu_Inicial,vueltas);
                                     vueltas=vueltas+1;
                                     System.out.println("Menu guardado");
                                     break;
                                     }

                                 }
                            } while (//no se que iria aqui)
                         }
                    break;
            }
            

        }

    }
}