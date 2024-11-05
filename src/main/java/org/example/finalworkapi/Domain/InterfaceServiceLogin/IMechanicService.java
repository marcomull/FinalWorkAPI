package org.example.finalworkapi.Domain.InterfaceServiceLogin;

import org.example.finalworkapi.Domain.Entities.Mechanic;
import java.util.Optional;

public interface IMechanicService {
    Optional<Mechanic> login(String email, String password);
}