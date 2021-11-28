public class Circles {
    Circle[] circle;

    public Circles(int quantity) {
        this.circle = new Circle[quantity];
    }

    int indexMaxSquare = 0;

    public int findMaxCircleSquare() {
        for (int i = 0; i < circle.length; i++) {
            if (circle[i].getSquare() > circle[indexMaxSquare].getSquare())
                indexMaxSquare = i;
        }

        return indexMaxSquare;
    }

}
