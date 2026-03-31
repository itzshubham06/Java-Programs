class Shape {
    void display() {
        System.out.print("Shape: ");
    }
}

class Circle extends Shape {
    void area(double r) {
        
        System.out.println("Circle");
        System.out.println("Area of Circle:"+Math.PI * r * r);
    }
}

class Rectangle extends Shape {
    void area(double l, double b) {
        System.out.println("Rectangle");
        System.out.println("Area of Rectangle:"+l * b);
    }
}

public class Question11 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.area(5);

        r.display();
        r.area(4, 6);
    }
}