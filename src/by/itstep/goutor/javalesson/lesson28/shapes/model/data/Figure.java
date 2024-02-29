package by.itstep.goutor.javalesson.lesson28.shapes.model.data;

public class Figure {

    protected Point point;

    public Figure() {
        this.point = new Point();
    }

    public Figure(Point point) {
        this.point = point;
    }

    public Figure(int x, int y) {
        this.point = new Point(x , y);
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }






    @Override
    public String toString() {
        return "Figure{" +
                "point=" + point +
                '}';
    }
}
