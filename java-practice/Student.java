class Student {
    String name;
    int mark1, mark2;

    // Constructor
    Student(String name, int mark1, int mark2) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    void display() {
        double average = (mark1 + mark2) / 2.0;

        System.out.println("Student Name: " + name);
        System.out.println("Subject 1 Marks: " + mark1);
        System.out.println("Subject 2 Marks: " + mark2);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {
        Student s = new Student("Keerthana", 90, 80);
        s.display();
    }
}
