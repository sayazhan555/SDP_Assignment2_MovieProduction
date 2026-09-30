package movieproduction;

public class ActionProductionFactory implements MovieProductionFactory {

    @Override
    public Visual createVisual() {
        return new ActionVisual();
    }

    @Override
    public Sound createSound() {
        return new ActionSound();
    }

    @Override
    public Editing createEditing() {
        return new ActionEditing();
    }
}