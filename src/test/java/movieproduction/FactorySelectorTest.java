package movieproduction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorySelectorTest {

    @Test
    void selectsActionFactory() {
        MovieProductionFactory factory = FactorySelector.selectFactory(1);

        assertInstanceOf(ActionProductionFactory.class, factory);
    }

    @Test
    void selectsDocumentaryFactory() {
        MovieProductionFactory factory = FactorySelector.selectFactory(2);

        assertInstanceOf(DocumentaryProductionFactory.class, factory);
    }

    @Test
    void selectsAnimationFactory() {
        MovieProductionFactory factory = FactorySelector.selectFactory(3);

        assertInstanceOf(AnimationProductionFactory.class, factory);
    }

    @Test
    void selectsHorrorFactory() {
        MovieProductionFactory factory = FactorySelector.selectFactory(4);

        assertInstanceOf(HorrorProductionFactory.class, factory);
    }

    @Test
    void rejectsUnknownPositiveChoice() {
        assertThrows(
                IllegalArgumentException.class,
                () -> FactorySelector.selectFactory(9)
        );
    }

    @Test
    void rejectsNegativeChoice() {
        assertThrows(
                IllegalArgumentException.class,
                () -> FactorySelector.selectFactory(-1)
        );
    }
}