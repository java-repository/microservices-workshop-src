package example.micronaut;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import javax.validation.Valid;
import java.util.Collection;
import edu.umd.cs.findbugs.annotations.Nullable;

@Controller("/owners")
public class OwnerController {
    private final OwnerOperations ownerOperations;

    public OwnerController(OwnerOperations ownerOperations) {
        this.ownerOperations = ownerOperations;
    }

    @Get("/")
    Collection<Owner> getOwners() {
        return ownerOperations.getInitialOwners();
    }

    @Post("/")
    Owner add(@Valid @Body Owner owner) {
        ownerOperations.addOwner(owner);
        return owner;
    }
    @Get("/{owner}/pets{?health}")
    Collection<Pet> getPets(String owner, @Nullable Pet.PetHealth health) {
        if (health != null) {
            return ownerOperations.getPetsWithHeath(owner, health);
        } else {
            return ownerOperations.getPets(owner);
        }
    }

    @Get("/{owner}/pets/{pet}")
    Pet getPet(String owner, String pet) {
        return ownerOperations.getPet(owner, pet);
    }
}