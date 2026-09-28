package movieproduction;

public class ActionEditing implements Editing {

    @Override
    public void edit() {
        System.out.println("Editing action scenes with fast cuts and effects.");
    }

    @Override
    public int getProductionTime() {
        return 6;
    }
}