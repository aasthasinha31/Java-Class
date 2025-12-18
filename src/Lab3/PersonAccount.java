package Lab3;
import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input(Scanner sc) {
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();

        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account No: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    @Override
    void input(Scanner sc) {
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLine();

        super.input(sc);
    }

    @Override
    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar No: " + aadhar_no);
        super.disp();
    }
}

public class PersonAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] p = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");
            p[i] = new Person();
            p[i].input(sc);
        }

        System.out.println("\n--- Displaying Details ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nDetails of Person " + (i + 1) + ":");
            p[i].disp();
        }

        sc.close();
    }
}
