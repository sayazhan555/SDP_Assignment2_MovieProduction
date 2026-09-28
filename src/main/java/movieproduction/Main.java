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

        VisualCreator visualCreator;

        if (choice == 1) {
            visualCreator = new ActionVisualCreator();

        } else if (choice == 2) {
            visualCreator = new DocumentaryVisualCreator();

        } else if (choice == 3) {
            visualCreator = new AnimationVisualCreator();

        } else {
            System.out.println("Invalid choice");
            scanner.close();
            return;
        }

        visualCreator.produceVisualScene();

        scanner.close();
    }
}