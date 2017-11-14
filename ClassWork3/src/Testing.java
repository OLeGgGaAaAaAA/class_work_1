public class Testing {
    @Override
    public String toString() {
        return "Testing{}";
    }

    public static void main(String[] args) {
        Person myPerson =  new Person();
        Student myStudent = new Student();
        Teacher myTeacher = new Teacher();
        CollegeStudent myCollegeStudent = new CollegeStudent();

        Person[] persons = new Person[4];
        persons[0] = new Person();
        persons[1] = new Student();
        persons[2] = new Teacher();
        persons[3] = new CollegeStudent();


    }
}
