package Lab2;
import java.util.Scanner;

public class BoxDemo {

    double length;
    double width;
    double height;

    void volume() {
        double vol = length * width * height;
        System.out.println("Volume = " + vol);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BoxDemo b = new BoxDemo();

        b.length = sc.nextDouble();
        b.width = sc.nextDouble();
        b.height = sc.nextDouble();

        b.volume();
    }
}

