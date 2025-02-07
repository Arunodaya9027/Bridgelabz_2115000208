class Animal {
    private String name;
    private int age;

    public Animal() {
        this.name = "Animal";
        this.age = 0;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound!");
    }
}

class Dog extends Animal {
    public Dog() {
        super();
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " woofs ... woofs");
    }
}

class Cat extends Animal {
    public Cat() {
        super();
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meow ... meow");
    }
}

class Bird extends Animal {
    public Bird() {
        super();
    }

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " chirp ... chirp");
    }
}

public class AnimalHeirarchy {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        Cat cat = new Cat("Mishi", 6);
        Animal animal2 = new Bird();
        Bird bird = new Bird("Runi", 1);

        animal1.makeSound();
        dog1.makeSound();
        animal2.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}