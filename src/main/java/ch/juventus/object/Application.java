package ch.juventus.object;

public class Application {
    public static void main(String[] args) {

        Address address = new Address("Mainstreet", 2, 666, "Mein Block");
        Person person = new Person("Hans", "Meier", 65, true, address);

        System.out.println(person);
    }
}
