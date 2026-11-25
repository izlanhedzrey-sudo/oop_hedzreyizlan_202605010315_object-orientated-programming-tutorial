public class Student {
    private String studentID;
    private String name;
    private double cgpa;
    private String programme;

    public Student(String studentID, String name, double cgpa, String programme) {
        this.studentID = studentID;
        this.name = name;
        this.cgpa = cgpa;
        this.programme = programme;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getProgramme() {
        return programme;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA value.");
        }
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Programme: " + programme);
    }
}
