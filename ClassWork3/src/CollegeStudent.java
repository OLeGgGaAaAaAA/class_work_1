public class CollegeStudent extends Student {
    private String electricalEngineering;
    private String communications;
    private String undeclared;

    public CollegeStudent() {

    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "electricalEngineering='" + electricalEngineering + '\'' +
                ", communications='" + communications + '\'' +
                ", undeclared='" + undeclared + '\'' +
                '}';
    }

    public String getElectricalEngineering() {
        return electricalEngineering;
    }

    public void setElectricalEngineering(String electricalEngineering) {
        this.electricalEngineering = electricalEngineering;
    }

    public String getCommunications() {
        return communications;
    }

    public void setCommunications(String communications) {
        this.communications = communications;
    }

    public String getUndeclared() {
        return undeclared;
    }

    public void setUndeclared(String undeclared) {
        this.undeclared = undeclared;
    }

    CollegeStudent(int age, String name, String gender, String idNumber, double gpa, int year, String major) {
        super(age, name, gender);
        this.electricalEngineering = major;
        this.communications = major;
        this.undeclared = major;



    }
}