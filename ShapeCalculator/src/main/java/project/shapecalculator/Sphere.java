package project.shapecalculator;

public class Sphere extends RoundBase implements Shape3D {

    public Sphere(Frame frame) {
        this.shapeName = "Sphere";
        this.imageLink = "";

        this.display = new ShapeDimensionDisplay(parameters);
        this.button = new ShapeButtonDisplay(frame, this, display, imageLink, shapeName, false);

    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateVolume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public ShapeButtonDisplay buttonDisplay() {
        return button;
    }

    @Override
    public ShapeDimensionDisplay displayDimensions() {
        return display;
    }

    @Override
    protected double calculate(int choice) {
        return calculateArea();
    }

}
