package movieproduction;

public class DocumentarySound implements Sound {

    @Override
    public void recordSound() {
        System.out.println("Recording interviews and natural background sounds.");
    }

    @Override
    public int getProductionTime() {
        return 2;
    }
}