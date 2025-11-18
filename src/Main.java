// M03Ex13_9 Exercise 13.9
// Scott Parrish
// 11/17/25
public class Main {
    public static void main(String[] args) {
        // Create 2 circle objects, print their toString() getPerimeter() and printCircle() methods then
        // use the compareTo method to compare them.
        Circle circle1 = new Circle(1.0);
        Circle circle2 = new Circle(.9);
        System.out.println(circle1);
        System.out.println(circle1.getPerimeter());
        circle1.printCircle();
        System.out.println(circle2);
        System.out.println(circle2.getPerimeter());
        circle2.printCircle();
        System.out.println(circle1.compareTo(circle2));
    }
}
