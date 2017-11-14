public class Student extends Person {
    public Student() {

    }

    private String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private double gpa;
    public String idNumber;

    Student(int age, String name, String genDer) {
        super(age, name, genDer);
        String idNumber;
        double gpa;


    }
}
