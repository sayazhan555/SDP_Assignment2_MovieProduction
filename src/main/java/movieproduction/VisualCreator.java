package movieproduction;

public abstract class VisualCreator {

    public abstract Visual createVisual();

    public void produceVisualScene() {
        Visual visual = createVisual();

        System.out.println("Starting visual production...");
        visual.createScene();

        int time = visual.getProductionTime();
        System.out.println("Visual production time: " + time + " hours");
    }
}