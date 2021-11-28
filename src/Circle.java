public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public static double CheckCorrectRadius(String value) {
        double side = -1;
        try {
            side = Double.parseDouble(value) > 0 ? Double.parseDouble(value) : -1;
        } catch (NumberFormatException e) {
            side = -1;
        }

        return side;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    @Override
    public String toString() {
        return getRadius() > 0 ? "Circle{" +
                "radius=" + radius + ", square = " + getSquare() + ", circumference = " + getCircumference() +
                '}' : "Error circle";
    }

    public double getSquare() {
        return getRadius() * getRadius() * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * getRadius();
    }
}
