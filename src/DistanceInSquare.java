import processing.core.PApplet;
import processing.core.PVector;

public class DistanceInSquare extends PApplet {
    private int squareSize = 100;
    private PVector[] loc = new PVector[squareSize*squareSize];

    public static void main(String[] args) {
        PApplet.main("DistanceInSquare", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(squareSize, squareSize);
    }

    @Override
    public void setup() {
        super.setup();



    }

    @Override
    public void draw() {
        super.draw();
        background(0);

    }
}
