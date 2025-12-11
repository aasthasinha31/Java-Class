import java.util.*;
public class avg {

    public static double circlearea(double r) {
        double area = 3.14 * r * r ;
        return area;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();

        double area= circlearea(r);


        System.out.println(area);
    }
}
