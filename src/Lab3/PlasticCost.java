package Lab3;

import java.util.Scanner;

class Plastic2D {
    double length, width;

    void get2D(double l, double w) {
        length = l;
        width = w;
    }

    double cost2D() {
        return length * width * 40;
    }
}

class Plastic3D extends Plastic2D {
    double height;

    void get3D(double l, double w, double h) {
        get2D(l, w);
        height = h;
    }

    double cost3D() {
        return length * width * height * 60;
    }
}

public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and width:");
        double l = sc.nextDouble();
        double w = sc.nextDouble();

        Plastic2D sheet = new Plastic2D();
        sheet.get2D(l, w);
        System.out.println("Cost of 2D plastic = Rs " + sheet.cost2D());

        System.out.println("Enter height:");
        double h = sc.nextDouble();

        Plastic3D box = new Plastic3D();
        box.get3D(l, w, h);
        System.out.println("Cost of 3D plastic = Rs " + box.cost3D());

        sc.close();
    }
}
