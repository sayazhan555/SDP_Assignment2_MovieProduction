package movieproduction;

public class DocumentaryEditing implements Editing {

    @Override
    public void edit() {
        System.out.println("Editing documentary footage into a clear story.");
    }

    @Override
    public int getProductionTime() {
        return 5;
    }
}