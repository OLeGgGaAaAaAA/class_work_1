public class Teacher extends Person {
    private String chemistry;
    private String computerScience;
    private String english;
    private double salary;

    public Teacher() {

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "chemistry='" + chemistry + '\'' +
                ", computerScience='" + computerScience + '\'' +
                ", english='" + english + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getChemistry() {
        return chemistry;
    }

    public void setChemistry(String chemistry) {
        this.chemistry = chemistry;
    }

    public String getComputerScience() {
        return computerScience;
    }

    public void setComputerScience(String computerScience) {
        this.computerScience = computerScience;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    Teacher(int age, String name, String gender, String subject, double salary) {
        super(age, name, gender);
        this.chemistry = subject;
        this.computerScience = subject;
        this.english = subject;
        this.salary = salary;





    }
}
