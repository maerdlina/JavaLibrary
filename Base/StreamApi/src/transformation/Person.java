package transformation;

public class Person {
    private String name;
    private int age;
    private String city;
    private String car;

    public Person(String name, int age, String city, String car) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.car = car;
    }

    public String getName() {
        return name;
    }
}
