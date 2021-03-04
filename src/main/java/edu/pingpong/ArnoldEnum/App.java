package edu.pingpong.ArnoldEnum;

import edu.pingpong.ArnoldEnum.domain.Planeta;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {


        String entradaConfirmacion = "";

        while (!entradaConfirmacion.equals("N")) {
            System.out.println("========NOW YOUR WEIGHT IN OTHER PLANETS========!");
            System.out.println("Type your weight in KG:");
            String entradaTeclado = "";
            Scanner entradaEscaner = new Scanner(System.in);
            entradaTeclado = entradaEscaner.nextLine();


            double peso = Double.parseDouble(entradaTeclado); // kg

            System.out.println("==============" + "WITH " + peso + "==============");
            for (Planeta planeta : Planeta.values()) {
                System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
            }

            System.out.println("\nYour weight only on the terrestrial planets: ");
            for (Planeta planeta : Planeta.getPlanetasTerrestres()) {
                System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
            }

            System.out.println("\nYour weight only on the gas giant planets: ");
            for (Planeta planeta : Planeta.getGigantesGaseosos()) {
                System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
            }
            System.out.println("=========================================" + '\n' + '\n' + '\n');

            System.out.println("========OTHER TIME?========!");
            System.out.println('\n' + "Y/N");

            Scanner entradaEscanerConfirmacion = new Scanner(System.in);
            entradaConfirmacion = entradaEscanerConfirmacion.nextLine();
            clearScreen();

        }
        clearScreen();
        System.out.println('\n' + "BYE!");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
