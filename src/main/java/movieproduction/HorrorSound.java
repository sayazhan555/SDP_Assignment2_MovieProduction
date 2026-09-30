package movieproduction;

public class HorrorSound implements Sound {

    @Override
    public void recordSound() {
        System.out.println("Recording suspenseful music and horror sound effects.");
    }

    @Override
    public int getProductionTime() {
        return 4;
    }
}