public class Pizza {
    // Calories per sq. cm
    private double QPC = 40;
    // Diameter, cm
    private double diameter;
    // Area, sq. cm
    private double area;

    // Constructors
    public Pizza(double diameter) {
        this.diameter = diameter;
        area = getArea();
    }
    public Pizza() {
        this(24); // use default value
    }

    // Method for area calculation
    private double getArea() {
        return Math.PI * Math.pow(diameter / 2, 2);
    }

    // Method for calories calculation
    public double getCalories() {
        return QPC * area;
    }
}
