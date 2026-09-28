package movieproduction;

public class AnimationSound implements Sound {

    @Override
    public void recordSound() {
        System.out.println("Recording voice acting and animation sound effects.");
    }

    @Override
    public int getProductionTime() {
        return 4;
    }
}