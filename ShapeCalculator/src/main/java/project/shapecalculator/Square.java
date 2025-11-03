package project.shapecalculator;

public class Square extends FlatBase implements Shape2D {

    public Square(Frame frame) {
        this.shapeName = "Square";
        this.imageLink = "";

        this.display = new ShapeDimensionDisplay(parameters);
        this.button = new ShapeButtonDisplay(frame, this, display, imageLink, shapeName, true);

    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
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
