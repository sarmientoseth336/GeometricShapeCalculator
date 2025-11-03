package project.shapecalculator;

public abstract class ShapeBase {

    protected String shapeName;
    protected String imageLink;
    protected ShapeButtonDisplay button;
    protected ShapeDimensionDisplay display;

    public void loadInputValues() {
        var values = display.getAllValues();

        for (String key : values.keySet()) {
            String value = values.get(key);
            if (value.isEmpty()) {
                continue;
            }

            try {
                double number = Double.parseDouble(value);

                switch (key.toLowerCase()) {
                    case "radius" ->
                        this.setRadius(number);
                    case "diameter" ->
                        this.setDiameter(number);
                    case "length" ->
                        this.setLength(number);
                    case "width" ->
                        this.setWidth(number);
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input for " + key);
            }
        }
    }

    protected abstract double calculate(int choice);

    protected void setRadius(double r){}

    protected void setDiameter(double d){}

    protected void setLength(double l){}

    protected void setWidth(double w){}

}
