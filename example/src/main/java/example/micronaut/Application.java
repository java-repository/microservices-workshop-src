package example.micronaut;

import io.micronaut.runtime.Micronaut;
import io.micronaut.core.annotation.TypeHint;

@TypeHint(Pet.PetHealth.class)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
