package org.example.finalworkapi.Domain.InterfaceServiceLogin;

import org.example.finalworkapi.Domain.Entities.Administrator;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication(scanBasePackages = "org.example.finalworkapi")
public interface IAdministratorService {
    Optional<Administrator> login(String email, String password);
}