package movieproduction;

public class AnimationProductionFactory implements MovieProductionFactory {

    @Override
    public Visual createVisual() {
        return new AnimationVisual();
    }

    @Override
    public Sound createSound() {
        return new AnimationSound();
    }

    @Override
    public Editing createEditing() {
        return new AnimationEditing();
    }
}