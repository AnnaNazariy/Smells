package Laba6.Part1.t4;

public class Person {
    private String name;
    private String street;
    private String city;
    private String country;

    public Person(String name, String street, String city, String country) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public void printAddress() {
        System.out.println("Meet " + name + "!");
        System.out.println("Address: " + street + ", " + city + ", " + country);
    }

    public static void main(String[] args) {
        System.out.println("task4");
        Person person = new Person("Олена", "Шевченка, 10", "Львів", "Україна");
        person.printAddress();

        System.out.println("---------------------------------------------------------");
    }
}
