package movieproduction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieProductionFactoryTest {

    @Test
    void actionFactoryCreatesCorrectProducts() {
        MovieProductionFactory factory = new ActionProductionFactory();

        assertInstanceOf(ActionVisual.class, factory.createVisual());
        assertInstanceOf(ActionSound.class, factory.createSound());
        assertInstanceOf(ActionEditing.class, factory.createEditing());
    }

    @Test
    void documentaryFactoryCreatesCorrectProducts() {
        MovieProductionFactory factory = new DocumentaryProductionFactory();

        assertInstanceOf(DocumentaryVisual.class, factory.createVisual());
        assertInstanceOf(DocumentarySound.class, factory.createSound());
        assertInstanceOf(DocumentaryEditing.class, factory.createEditing());
    }

    @Test
    void animationFactoryCreatesCorrectProducts() {
        MovieProductionFactory factory = new AnimationProductionFactory();

        assertInstanceOf(AnimationVisual.class, factory.createVisual());
        assertInstanceOf(AnimationSound.class, factory.createSound());
        assertInstanceOf(AnimationEditing.class, factory.createEditing());
    }

    @Test
    void horrorFactoryCreatesCorrectProducts() {
        MovieProductionFactory factory = new HorrorProductionFactory();

        assertInstanceOf(HorrorVisual.class, factory.createVisual());
        assertInstanceOf(HorrorSound.class, factory.createSound());
        assertInstanceOf(HorrorEditing.class, factory.createEditing());
    }

    @Test
void actionFactoryCreatesCompatibleFamily() {
    MovieProductionFactory factory = new ActionProductionFactory();

    Visual visual = factory.createVisual();
    Sound sound = factory.createSound();
    Editing editing = factory.createEditing();

    assertInstanceOf(ActionVisual.class, visual);
    assertInstanceOf(ActionSound.class, sound);
    assertInstanceOf(ActionEditing.class, editing);
}

@Test
void documentaryFactoryCreatesCompatibleFamily() {
    MovieProductionFactory factory = new DocumentaryProductionFactory();

    Visual visual = factory.createVisual();
    Sound sound = factory.createSound();
    Editing editing = factory.createEditing();

    assertInstanceOf(DocumentaryVisual.class, visual);
    assertInstanceOf(DocumentarySound.class, sound);
    assertInstanceOf(DocumentaryEditing.class, editing);
}

@Test
void horrorFactoryCreatesCompatibleFamily() {
    MovieProductionFactory factory = new HorrorProductionFactory();

    Visual visual = factory.createVisual();
    Sound sound = factory.createSound();
    Editing editing = factory.createEditing();

    assertInstanceOf(HorrorVisual.class, visual);
    assertInstanceOf(HorrorSound.class, sound);
    assertInstanceOf(HorrorEditing.class, editing);
}

}