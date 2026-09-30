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

    public void prepareProduction() {
        System.out.println("Preparing movie production...");
        System.out.println("Visual, sound, and editing teams are ready.");
    }

    public void produceScene() {
        System.out.println("Producing scene...");

        visual.createScene();
        sound.recordSound();
    }

    public void finalizeProduction() {
        System.out.println("Finalizing movie production...");

        editing.edit();

        int totalTime = visual.getProductionTime()
                + sound.getProductionTime()
                + editing.getProductionTime();

        System.out.println("Total production time: " + totalTime + " hours");
    }
}