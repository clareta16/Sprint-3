package org.example;

import T1.Undo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Undo undo = Undo.getInstance();
        while (true) {
            System.out.println("Opcions:");
            System.out.println("1- Afegir comanda");
            System.out.println("2- Esborrar comanda");
            System.out.println("3- Llistar comandes");
            System.out.println("4- Sortir");
            System.out.print("Tria opció: ");
            int opcio = scanner.nextInt();
            scanner.nextLine();

            switch (opcio) {
                case 1:
                    System.out.println("Escriu la comanda ");
                    String comando = scanner.nextLine();
                    undo.afegirComanda(comando);
                    break;
                case 2:
                    System.out.println("Escriu la comanda a eliminar ");
                    String comanda = scanner.nextLine();
                    undo.eliminarComanda(comanda);
                    break;
                case 3:
                    System.out.println("Aquesta és la llista de comandes ");
                    undo.listHistoryComandos();
                    break;
                case 4:
                    System.out.println("Sortint de l'aplicació.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opció incorrecte. Prova de nou.");
            }

        }

    }

}