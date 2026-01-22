abstract class Student {
    int rollno;
    long regno;

    void getinput(int r, long reg) {
        rollno = r;
        regno = reg;
    }

    abstract void course();
}

    class Kiitian extends Student {

    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {

        Kiitian k = new Kiitian();
        k.getinput(24052599, 1234567890L);

        System.out.println("Rollno - 24052599");
        System.out.println("Registration no - 1234567890");
        k.course();
    }
}


