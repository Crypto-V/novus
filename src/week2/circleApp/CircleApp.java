package week2.circleApp;

public class CircleApp {

    public static void main(String[] args) {

        var circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getColor());

        var circle1 = new Circle(3);
        System.out.println(circle1.getRadius());
    }
}
