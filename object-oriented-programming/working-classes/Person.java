public class Person {
    
    private final String name;

    private int age;

    public Person(String name) {
        this(name, 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void incAge() {
        this.age += 1;
    }

}
