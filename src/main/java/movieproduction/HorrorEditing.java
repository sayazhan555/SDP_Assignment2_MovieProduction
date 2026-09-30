package movieproduction;

public class HorrorEditing implements Editing {

    @Override
    public void edit() {
        System.out.println("Editing horror scenes with suspense and dark effects.");
    }

    @Override
    public int getProductionTime() {
        return 6;
    }
}