package movieproduction;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class BusinessBehaviorTest {

    @Test
    void actionProductionCalculatesCorrectTotalTime() {
        String output = runProduction(new ActionProductionFactory());

        assertTrue(output.contains("Total production time: 14 hours"));
    }

    @Test
    void documentaryProductionCalculatesCorrectTotalTime() {
        String output = runProduction(new DocumentaryProductionFactory());

        assertTrue(output.contains("Total production time: 11 hours"));
    }

    @Test
    void animationProductionCalculatesCorrectTotalTime() {
        String output = runProduction(new AnimationProductionFactory());

        assertTrue(output.contains("Total production time: 19 hours"));
    }

    @Test
    void horrorProductionCalculatesCorrectTotalTime() {
        String output = runProduction(new HorrorProductionFactory());

        assertTrue(output.contains("Total production time: 16 hours"));
    }

    @Test
    void actionProductsWorkTogetherInBusinessProcess() {
        String output = runProduction(new ActionProductionFactory());

        assertTrue(output.contains("Shooting an action scene"));
        assertTrue(output.contains("Recording loud effects"));
        assertTrue(output.contains("Editing action scenes"));
    }

    @Test
    void clientWorksWithFactoryAbstraction() {
        MovieProductionFactory factory = new DocumentaryProductionFactory();

        MovieProduction production = new MovieProduction(factory);

        assertNotNull(production);
    }

    private String runProduction(MovieProductionFactory factory) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;

        try {
            System.setOut(new PrintStream(output));

            MovieProduction production = new MovieProduction(factory);
            production.prepareProduction();
            production.produceScene();
            production.finalizeProduction();

        } finally {
            System.setOut(originalOutput);
        }

        return output.toString();
    }
}