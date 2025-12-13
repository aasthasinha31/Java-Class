package Lab2;
import java.util.Scanner;

public class RectArea {

    double length;
    double breadth;

    RectArea() {
        length = 0;
        breadth = 0;
    }

    RectArea(double l, double b) {
        length = l;
        breadth = b;
    }

    void displayArea() {
        System.out.println("Area = " + (length * breadth));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double l = sc.nextDouble();
        double b = sc.nextDouble();

        RectArea r = new RectArea(l, b);
        r.displayArea();
    }
}
