public class Cylinder extends Circle {

    private double height;

    public static double CheckCorrectHeight(String value) {
        double side = -1;
        try {
            side = Double.parseDouble(value) > 0 ? Double.parseDouble(value) : -1;
        } catch (NumberFormatException e) {
            side = -1;
        }

        return side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getSquare() {
        return super.getSquare() * 2 + super.getCircumference() * getHeight();
    }

    public double getVolume() {
        return super.getSquare() * getHeight();
    }

    @Override
    public String toString() {
        return getRadius() > 0 && getHeight() > 0 ? "Cylinder{" + "radius = " + getRadius()
                + ", height=" + height + ", square = " + this.getSquare()
                + ", volume = " + this.getVolume() + '}' : "Error cylinder";
    }
}
