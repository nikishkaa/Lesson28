package by.itstep.goutor.javalesson.lesson28.shapes.model.data;


public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public  double calcPerimeter(){
        return 2 * Math.PI * radius;
    };
    public double calcSquare(){
        return  Math.PI * radius * radius;
    };

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + "Start point = (" + point + ") }";
    }
}
