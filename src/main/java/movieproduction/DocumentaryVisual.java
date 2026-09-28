package movieproduction;

public class DocumentaryVisual implements Visual{

     @Override
    public void createScene() {
        System.out.println("Shooting a documentary scene with natural camera work.");
    }

     @Override
    public int getProductionTime() {
        return 4;
    }
}