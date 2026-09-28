package movieproduction;

public class ActionSound implements Sound {

    @Override
    public void recordSound() {
        System.out.println("Recording loud effects and action scene sounds.");
    }

    @Override
    public int getProductionTime() {
        return 3;
    }
}