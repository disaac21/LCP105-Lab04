package lab4p2_danieljuarez;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4P2_DanielJuarez {

    static Scanner lea = new Scanner(System.in);
    static ArrayList<Personaje> spidermans = new ArrayList();
    static ArrayList<Personaje> malos = new ArrayList();

    public static void main(String[] args) {

        int menu = 1;
        while (menu != 0) {
            System.out.println("0. Salir\n"
                    + "1. Listar Spiderman\n"
                    + "2. Listar Enemigos\n"
                    + "3. Modificar Spiderman\n"
                    + "4. Modificar Enemigos\n"
                    + "5. Jugar");
            menu = lea.nextInt();
            System.out.println();

            switch (menu) {
                case 1: {

                }
                break;
                case 2: {

                }
                break;
                case 3: {

                }
                break;
                case 4: {

                }
                break;
                case 5: {

                }
                break;
            } // fin switch menu
        } //fin while menu
    } // fin main
} // fin clase
