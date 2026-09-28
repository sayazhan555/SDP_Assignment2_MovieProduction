package movieproduction;

public class AnimationEditing implements Editing {

    @Override
    public void edit() {
        System.out.println("Editing animation, sound, and visual effects together.");
    }

    @Override
    public int getProductionTime() {
        return 7;
    }
}