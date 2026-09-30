package movieproduction;

public class FactorySelector {

    public static MovieProductionFactory selectFactory(int choice) {

        if (choice == 1) {
            return new ActionProductionFactory();
        } else if (choice == 2) {
            return new DocumentaryProductionFactory();
        } else if (choice == 3) {
            return new AnimationProductionFactory();
        } else if (choice == 4) {
            return new HorrorProductionFactory();
        }

        throw new IllegalArgumentException("Unknown production type: " + choice);
    }
}
