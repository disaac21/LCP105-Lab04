package lab4p2_danieljuarez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
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
                    for (int i = 0; i < spidermans.size(); i++) {
                        System.out.println(i + "-" + spidermans.get(i));
                    }

                    System.out.print("Ingrese el Spiderman a Modificar: ");
                    int modspider = lea.nextInt();
                    lea.nextLine();
                    System.out.println("Ingrese el Nombre: ");
                    String nombre = lea.nextLine();
                    System.out.println("Ingrese los Puntos de Ataque: ");
                    int puntosataque = lea.nextInt();
                    System.out.println("Ingrese los Puntos de Vida: ");
                    int puntosvida = lea.nextInt();
                    lea.nextLine();
                    System.out.println("Ingrese el Universo: ");
                    String universo = lea.nextLine();

                    spidermans.get(modspider).setNombre(nombre);
                    spidermans.get(modspider).setPuntosataque(puntosataque);
                    spidermans.get(modspider).setPuntosvida(puntosvida);
                    spidermans.get(modspider).setNombreuniverso(universo);

                }
                break;
                case 4: {
                    
                    for (int i = 0; i < malos.size(); i++) {
                        System.out.println(i + "-" + malos.get(i));
                    }

                    System.out.print("Ingrese el Villano a Modificar: ");
                    int modmalos = lea.nextInt();
                    lea.nextLine();
                    System.out.println("Ingrese el Nombre: ");
                    String nombre = lea.nextLine();
                    System.out.println("Ingrese los Puntos de Ataque: ");
                    int puntosataque = lea.nextInt();
                    System.out.println("Ingrese los Puntos de Vida: ");
                    int puntosvida = lea.nextInt();
                    lea.nextLine();
                    System.out.println("Ingrese el Universo: ");
                    String universo = lea.nextLine();

                    malos.get(modmalos).setNombre(nombre);
                    malos.get(modmalos).setPuntosataque(puntosataque);
                    malos.get(modmalos).setPuntosvida(puntosvida);
                    malos.get(modmalos).setNombreuniverso(universo);
                    
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

    public static Personaje Modificar() {
        //nombre, puntos de ataque, puntos de vida, nombre de universo.
        return null;
    }

} // fin clase
