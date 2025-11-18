import java.util.Collection;

public class Circle extends GeometicObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }

    // Override java.lang.Comparable compareTo(Circle)
    @Override
    public int compareTo(Circle o) {
        if (this.radius == o.radius) {
            return 0;
        } else if (this.radius > o.radius) {
            return 1;
        } else
            return - 1;
    }
}
