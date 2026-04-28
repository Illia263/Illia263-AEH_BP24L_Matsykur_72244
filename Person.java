
public class Person {

    String name;
    int age;
    String address;
    int year_of_birth;

    public Person(String name, int age, String address, int year_of_birth) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.year_of_birth = year_of_birth;
    }

    public void growOld(int years) {
        this.age += years;
    }

    public void beYounger() {
        this.age--;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address + ", Year of Birth: " + year_of_birth);
    }
}
