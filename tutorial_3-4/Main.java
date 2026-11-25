public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ali", "P001");
        Person s1 = new Student("Siti", "S001");
        Person l1 = new Lecturer("Dr. Ahmad", "L001");

        p1.introduce();
        s1.introduce();
        l1.introduce();
    }
}
