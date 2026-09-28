package movieproduction;

public class ActionVisual implements Visual {

    @Override
    public void createScene() {
        System.out.println("Shooting an action scene with dynamic camera movement.");
    }

    @Override
    public int getProductionTime() {
        return 5;
    }
}