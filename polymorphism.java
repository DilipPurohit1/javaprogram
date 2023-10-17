// The base class
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Subclass 1
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Subclass 2
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

// Subclass 3
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a triangle");
    }
}

// Main class to demonstrate polymorphism
public class PolymorphismExample {
    public static void main(String[] args) {
        // Creating objects of different subclasses
        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();

        // Calling the draw method on each object
        circle.draw();   // Calls the draw method in Circle class
        square.draw();   // Calls the draw method in Square class
        triangle.draw(); // Calls the draw method in Triangle class
    }
}
