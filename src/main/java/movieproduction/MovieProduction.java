package movieproduction;

public class MovieProduction {

    private final Visual visual;
    private final Sound sound;
    private final Editing editing;

    public MovieProduction(MovieProductionFactory factory) {
        visual = factory.createVisual();
        sound = factory.createSound();
        editing = factory.createEditing();
    }

    public void produceMovie() {
        System.out.println("Starting movie production...");

        visual.createScene();
        sound.recordSound();
        editing.edit();

        int totalTime = visual.getProductionTime()
                + sound.getProductionTime()
                + editing.getProductionTime();

        System.out.println("Total production time: " + totalTime + " hours");
    }
}