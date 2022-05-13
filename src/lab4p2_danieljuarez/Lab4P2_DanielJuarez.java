package lab4p2_danieljuarez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab4P2_DanielJuarez {

    static Scanner lea = new Scanner(System.in);
    static ArrayList<Personaje> spidermans = new ArrayList();
    static ArrayList<Personaje> malos = new ArrayList();

    public static void main(String[] args) {

        spidermans.add(new SpiderPunk("SpiderPunk 1", 100, 500, "Universo 1"));
        spidermans.add(new SpiderPunk("SpiderPunk 2", 100, 500, "Universo 1"));
        spidermans.add(new SuperiorSpiderman("Superior 1", 100, 500, "Universo 2"));
        spidermans.add(new SuperiorSpiderman("Superior 2", 100, 500, "Universo 2"));
        spidermans.add(new Clasico("Clásico 1", 100, 500, "Universo 3"));
        spidermans.add(new Clasico("Clásico 2", 100, 500, "Universo 3"));
        
        malos.add(new Blindado("Blindado 1", 100, 500, "Universo 1"));
        malos.add(new Blindado("Blindado 2", 100, 500, "Universo 1"));
        malos.add(new Alienígena("Alienigena 1", 100, 500, "Universo 2"));
        malos.add(new Alienígena("Alienigena 2", 100, 500, "Universo 2"));
        malos.add(new Alterado("Alterado 1", 100, 500, "Universo 3"));
        malos.add(new Alterado("Alterado 2", 100, 500, "Universo 3"));
        
        int menu = 1;
        while (menu != 0) {
            System.out.println("0. Salir\n"
                    + "1. Listar Spiderman\n"
                    + "2. Listar Enemigos\n"
                    + "3. Modificar Spiderman\n"
                    + "4. Modificar Enemigos\n"
                    + "5. Jugar");
            System.out.print("Ingrese una Opción: ");
            menu = lea.nextInt();
            System.out.println();

            switch (menu) {
                case 1: {
                    System.out.println(spidermans);
                    System.out.println();
                }
                break;
                case 2: {
                    System.out.println(malos);
                    System.out.println();
                }
                break;
                case 3: {

                }
                break;
                case 4: {

                }
                break;
                case 5: {
                    Collections.shuffle(spidermans);
                    Collections.shuffle(malos);
                }
                break;
            } // fin switch menu
        } //fin while menu
    } // fin main
} // fin clase
