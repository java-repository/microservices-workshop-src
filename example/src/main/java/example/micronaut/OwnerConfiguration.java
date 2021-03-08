package example.micronaut;

import io.micronaut.context.annotation.EachProperty;

@EachProperty("owners")
public class OwnerConfiguration {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Owner create() {
        return new Owner(name, age);
    }
}