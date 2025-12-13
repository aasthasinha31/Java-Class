package Lab2;
import java.util.Scanner;

public class ObjCount {

    static int count = 0;

    ObjCount() {
        count++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            new ObjCount();
        }

        System.out.println("Number of objects = " + count);
    }
}

