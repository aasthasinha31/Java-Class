package Lab2;
import java.util.Scanner;

public class Rectangle {

    double length;
    double breadth;
    double area;
    double perimeter;

    void read() {
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        breadth = sc.nextDouble();
    }

    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.read();
        r.calculate();
        r.display();
    }
}

