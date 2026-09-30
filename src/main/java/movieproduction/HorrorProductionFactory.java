package movieproduction;

public class HorrorProductionFactory implements MovieProductionFactory {

    @Override
    public Visual createVisual() {
        return new HorrorVisual();
    }

    @Override
    public Sound createSound() {
        return new HorrorSound();
    }

    @Override
    public Editing createEditing() {
        return new HorrorEditing();
    }
}