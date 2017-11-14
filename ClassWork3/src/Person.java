public class Person {
        String name;
        int age;
        String gender;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Person(int age, String name, String gender) {
            this.age = age;
            this.name = name;
            this.gender = gender;

    }
}

