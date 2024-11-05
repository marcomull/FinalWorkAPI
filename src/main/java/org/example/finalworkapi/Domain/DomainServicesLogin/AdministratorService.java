package org.example.finalworkapi.Domain.DomainServicesLogin;

import org.example.finalworkapi.Domain.Entities.Administrator;
import org.example.finalworkapi.Domain.InterfaceServiceLogin.IAdministratorService;
import org.example.finalworkapi.Infrastructure.InterfaceRepositoryLogin.IAdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AdministratorService implements IAdministratorService {

    @Autowired
    private IAdministratorRepository administratorRepository;

    @Override
    public Optional<Administrator> login(String email, String password) {
        Optional<Administrator> adminOpt = administratorRepository.findByEmail(email);
        if (adminOpt.isPresent() && adminOpt.get().getPassword().equals(password)) {
            return adminOpt;
        }
        return Optional.empty();
    }
}