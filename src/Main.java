import person.Builder;
import person.Driver;
import person.Person;
import person.Programmer;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("ELDAN",18);
        System.out.println(programmer);
        programmer.working();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~");

        Driver driver = new Driver("SANJAR",19);
        System.out.println(driver);
        driver.working();

        System.out.println("~~~~~~~~~~~~~~~~~~");

        Builder builder = new Builder("ERNAZAR",20);
        System.out.println(builder);
        builder.working();
    }
}