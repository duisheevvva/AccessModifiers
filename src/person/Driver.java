package person;

public class Driver extends Person {
    public Driver(String name, int age) {
        super(name, age);
    }
    @Override
    public void working() {
        System.out.println("place of work: DRIVER");
    }

    @Override
    public String toString() {
        return "name: " + getName() + "\n" +
                "age: " + getAge();
    }
}
