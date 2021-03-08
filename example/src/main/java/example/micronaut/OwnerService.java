package example.micronaut;

import javax.inject.Singleton;
import java.util.List;
import java.util.Collection;
import java.util.stream.Collectors;

@Singleton
public class OwnerService {
    private final List<OwnerConfiguration> ownerConfigurations;

    public OwnerService(List<OwnerConfiguration> ownerConfigurations) {
        this.ownerConfigurations = ownerConfigurations;
    }

    public Collection<Owner> getInitialOwners() {
        return ownerConfigurations.stream()
                .map(OwnerConfiguration::create)
                .collect(Collectors.toList());
    }
}