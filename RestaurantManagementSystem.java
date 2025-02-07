interface Worker {
    public void performDuties();
}

class Person {
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
}

class Chef extends Person implements Worker {
    public Chef(String name, String id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.printf("%s id cooking food\n", getName());
    }
}

class Waiter extends Person implements Worker {
    public Waiter(String name, String id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.printf("%s is serving food\n", getName());
    }

}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Worker chef = new Chef("John", "C001");
        chef.performDuties();

        Worker waiter = new Waiter("Alicia", "W04");
        waiter.performDuties();
    }
}
