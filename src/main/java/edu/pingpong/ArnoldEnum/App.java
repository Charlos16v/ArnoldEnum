package edu.pingpong.ArnoldEnum;

import edu.pingpong.ArnoldEnum.domain.Planeta;


public class App {

    public static void main(String[] args) {

        int i;
        for (i = 0; i < args.length; i++) {

            double peso = Double.parseDouble(args[i]); // kg

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
        }

    }
}
