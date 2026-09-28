package movieproduction;

public class AnimationVisual implements Visual{

     @Override
    public void createScene() {
        System.out.println("Creating an animated scene with digital visuals.");
    }

     @Override
    public int getProductionTime() {
        return 8;
    }
}