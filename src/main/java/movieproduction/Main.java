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

        MovieProductionFactory factory;

        if (choice == 1) {
            factory = new ActionProductionFactory();
        } else if (choice == 2) {
            factory = new DocumentaryProductionFactory();
        } else if (choice == 3) {
            factory = new AnimationProductionFactory();
        } else {
            System.out.println("Invalid choice");
            scanner.close();
            return;
        }

        MovieProduction production = new MovieProduction(factory);
        production.produceMovie();

        scanner.close();
    }
}