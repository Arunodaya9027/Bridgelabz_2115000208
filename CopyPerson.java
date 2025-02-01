class Person {
    private String name;
    private int age;
    private String address;
    private String UID;

    public Person(String name, int age, String UID) {
        this.name = name;
        this.age = age;
        this.address = "India";
        this.UID = UID;
    }

    public Person(String name, int age, String address, String UID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.UID = UID;
    }

    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
        this.address = person.address;
        this.UID = person.UID;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("UID: " + UID);
    }
}

public class CopyPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Umesh Saraswat", 25, "5848-3114-2446");
        person1.display();
        System.out.println();
        Person person2 = new Person("Ankit Kumar", 21, "Raigad, Maharastra", "3722-1815-4466");
        person2.display();
        System.out.println();
        Person person3 = new Person(person2);
        person3.display();
    }
}