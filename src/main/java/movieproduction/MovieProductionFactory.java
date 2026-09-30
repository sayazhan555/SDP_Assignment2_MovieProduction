package movieproduction;

public interface MovieProductionFactory {

    Visual createVisual();

    Sound createSound();

    Editing createEditing();
}