package example.micronaut;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Owner {
    private final String name;
    private final int age;

    public Owner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}