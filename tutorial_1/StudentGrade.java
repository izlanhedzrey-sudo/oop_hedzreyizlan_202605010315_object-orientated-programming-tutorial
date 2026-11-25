public class StudentGrade {
    public static void main(String[] args) {
        String name = "Ahmad";
        int mark = 85;
        
        System.out.println("Student Name: " + name);
        System.out.println("Mark: " + mark);
        
        if (mark >= 50) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}
