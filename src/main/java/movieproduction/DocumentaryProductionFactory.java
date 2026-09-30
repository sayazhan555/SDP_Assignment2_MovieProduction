package movieproduction;

public class DocumentaryProductionFactory implements MovieProductionFactory {

    @Override
    public Visual createVisual() {
        return new DocumentaryVisual();
    }

    @Override
    public Sound createSound() {
        return new DocumentarySound();
    }

    @Override
    public Editing createEditing() {
        return new DocumentaryEditing();
    }
}