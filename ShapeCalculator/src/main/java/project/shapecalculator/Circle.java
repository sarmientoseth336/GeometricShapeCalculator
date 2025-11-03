
package project.shapecalculator;

public class Circle extends RoundBase implements Shape2D {
          
    public Circle(Frame frame) {        
        this.shapeName = "Circle";
        this.imageLink = "";
        
        this.display = new ShapeDimensionDisplay(parameters);
        this.button = new ShapeButtonDisplay(frame, this, display, imageLink, shapeName, true);
    }
    
    
    @Override
    public void setRadius(double r) {
        radius = r;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    @Override
    public double calculatePerimeter() {
        circumference = Math.PI * radius * 2;
        return circumference;
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
        if (choice == 1) {
            return calculateArea();
        } else if (choice == 3) {
            return calculatePerimeter();
        }
        return 0;
    }
}
