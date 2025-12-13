package Lab2;
import java.util.Scanner;

public class student {

    int roll;
    String name;
    double cgpa;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        student[] s = new student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new student();

            s[i].roll = sc.nextInt();
            sc.nextLine();
            s[i].name = sc.nextLine();
            s[i].cgpa = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(s[i].roll + " " + s[i].name + " " + s[i].cgpa);
        }

        double min = s[0].cgpa;
        String lowName = s[0].name;

        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < min) {
                min = s[i].cgpa;
                lowName = s[i].name;
            }
        }

        System.out.println("Student with lowest CGPA: " + lowName);
    }
}

