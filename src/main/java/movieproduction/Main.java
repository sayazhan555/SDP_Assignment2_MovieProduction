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

        if (choice == 1) {
            ActionVisual visual = new ActionVisual();
            ActionSound sound = new ActionSound();
            ActionEditing editing = new ActionEditing();

            visual.createScene();
            sound.recordSound();
            editing.edit();

            int totalTime = visual.getProductionTime()
                    + sound.getProductionTime()
                    + editing.getProductionTime();

            System.out.println("Total production time: " + totalTime + " hours");

        } else if (choice == 2) {
            DocumentaryVisual visual = new DocumentaryVisual();
            DocumentarySound sound = new DocumentarySound();
            DocumentaryEditing editing = new DocumentaryEditing();

            visual.createScene();
            sound.recordSound();
            editing.edit();

            int totalTime = visual.getProductionTime()
                    + sound.getProductionTime()
                    + editing.getProductionTime();

            System.out.println("Total production time: " + totalTime + " hours");

        } else if (choice == 3) {
            AnimationVisual visual = new AnimationVisual();
            AnimationSound sound = new AnimationSound();
            AnimationEditing editing = new AnimationEditing();

            visual.createScene();
            sound.recordSound();
            editing.edit();

            int totalTime = visual.getProductionTime()
                    + sound.getProductionTime()
                    + editing.getProductionTime();

            System.out.println("Total production time: " + totalTime + " hours");

        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}