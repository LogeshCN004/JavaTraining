class Student {
    String name;
    int rollno;
    void display() {
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+rollno);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Dinesh Ram";
        s1.rollno = 20;
        s1.display();
    }
}
