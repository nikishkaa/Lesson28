package by.itstep.goutor.javalesson.lesson28.shapes.model.data;

public class Rectangle extends Figure {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(Point point, double a, double b) {
        super(point);
        this.a = a;
        this.b = b;
    }

    public Rectangle(int x, int y, double a, double b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "a = " + a + ", b = " + b + "Start point = (" + point + ") }";
    }
}
