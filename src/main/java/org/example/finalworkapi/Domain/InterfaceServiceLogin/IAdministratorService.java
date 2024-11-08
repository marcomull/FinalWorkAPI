package org.example.finalworkapi.Domain.InterfaceServiceLogin;

import org.example.finalworkapi.Domain.Entities.Administrator;
import java.util.List;
import java.util.Optional;

public interface IAdministratorService {
    Optional<Administrator> login(String email, String password);
    List<Administrator> getAllAdminstrator();
}