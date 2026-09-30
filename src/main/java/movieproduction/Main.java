package movieproduction;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose movie production type:");
        System.out.println("1 - Action");
        System.out.println("2 - Documentary");
        System.out.println("3 - Animation");

        int choice = scanner.nextInt();

        try {
            MovieProductionFactory factory =
                    FactorySelector.selectFactory(choice);

            MovieProduction production =
                    new MovieProduction(factory);

            production.prepareProduction();
            production.produceScene();
            production.finalizeProduction();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}