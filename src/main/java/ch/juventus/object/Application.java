package ch.juventus.object;

public class Application {
    public static void main(String[] args) {

        Address address = new Address("Mainstreet", 2, 666, "Mein Block");
        Person person = new Person("Hans", "Meier", 65, true, address);


        Address address2 = new Address("Mainstreet", 2, 666, "Mein Block");
        Person person2 = new Person("Hans", "Meier", 65, false, address2);

        System.out.println(person.equals(person2));
    }
}
