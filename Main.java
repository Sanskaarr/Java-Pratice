// Abstract Class: Shape
abstract class Shape {
    protected int dimension1;
    protected int dimension2;

    // Constructor to initialize dimensions
    public Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    // Abstract method to print area, must be implemented by subclasses
    public abstract void printArea();
}

// Concrete Class: Rectangle extends Shape
class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Concrete Class: Triangle extends Shape
class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    public void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}

// Concrete Class: Circle extends Shape
// Note: For simplicity, we'll consider dimension1 as the diameter and calculate the radius from it.
class Circle extends Shape {
    public Circle(int diameter) {
        super(diameter, 0); // dimension2 not used for Circle in this example
    }

    @Override
    public void printArea() {
        double radius = dimension1 / 2.0;
        double area = Math.PI * (radius * radius);
        System.out.println("Area of Circle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating instances and printing areas
        Shape rectangle = new Rectangle(10, 5);
        Shape triangle = new Triangle(8, 12);
        Shape circle = new Circle(14); // Diameter of the circle

        System.out.println("Shape Areas:");
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
