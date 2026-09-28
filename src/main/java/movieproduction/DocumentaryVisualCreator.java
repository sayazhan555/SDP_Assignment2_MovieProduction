package movieproduction;

public class DocumentaryVisualCreator extends VisualCreator {

    @Override
    public Visual createVisual() {
        return new DocumentaryVisual();
    }
}