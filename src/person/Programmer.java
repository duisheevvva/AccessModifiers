package person;

public class Programmer extends  Person
{
    public Programmer(String name, int age) {
        super(name, age);
    }

    @Override
    public void working() {
        System.out.println("place of work: IT");
    }

    @Override
    public String toString() {
        return "name: " + getName() + "\n" +
                "age: " + getAge();
    }
}
