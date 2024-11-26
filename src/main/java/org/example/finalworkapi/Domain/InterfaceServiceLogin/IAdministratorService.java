package org.example.finalworkapi.Domain.InterfaceServiceLogin;

import org.example.finalworkapi.Domain.Entities.Administrator;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
public interface IAdministratorService {
    Optional<Administrator> login(String email, String password);
    List<Administrator> getAllAdminstrator();
    Administrator addAdministrator(Administrator administrator);
}