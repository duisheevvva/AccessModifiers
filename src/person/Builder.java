package person;

public class Builder extends Person {
    public Builder(String name, int age) {
        super(name, age);
    }
    @Override
    public void working() {
        System.out.println("place of work: BUILDER");
    }

    @Override
    public String toString() {
        return "name: " + getName() + "\n" +
                "age: " + getAge();
    }
}
