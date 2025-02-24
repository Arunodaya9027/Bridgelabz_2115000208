import java.lang.reflect.*;

class Person {
    String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class AccessPrivateFields {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Person.class;
        Constructor<?> constructor = cls.getConstructor(String.class, int.class);
        Person person = (Person) constructor.newInstance("Arun", 23);
        person.display();

        Field field = cls.getDeclaredField("age");
        field.setAccessible(true);
        System.out.println("Old Age: " + field.get(person));

        field.set(person, 20);
        System.out.println("Updated Age: " + field.get(person));
    }
}