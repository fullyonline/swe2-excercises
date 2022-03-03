package ch.juventus.object;

public class Person {

    private String firstname;
    private String lastname;
    private int age;
    private Boolean hasPet;
    private Address address;

    public Person(String firstname, String lastname, int age, Boolean hasPet, Address address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.hasPet = hasPet;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", hasPet=" + hasPet +
                ", address=" + address.toString() +
                '}';
    }
}
