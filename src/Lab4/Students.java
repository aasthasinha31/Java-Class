class Students {
    int rollno;
    String name;

    Students(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public boolean equals(Object obj) {
        Students s = (Students) obj;
        return rollno == s.rollno && name.equals(s.name);
    }

    public static void main(String[] args) {

        Students s1 = new Students(101, "Aastha");
        Students s2 = new Students(101, "Aastha");

        if (s1.equals(s2))
            System.out.println("Students are equal");
        else
            System.out.println("Students are not equal");
    }
}

