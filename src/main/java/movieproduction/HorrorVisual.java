package movieproduction;

public class HorrorVisual implements Visual {

    @Override
    public void createScene() {
        System.out.println("Creating a dark horror scene with suspenseful visuals.");
    }

    @Override
    public int getProductionTime() {
        return 6;
    }
}