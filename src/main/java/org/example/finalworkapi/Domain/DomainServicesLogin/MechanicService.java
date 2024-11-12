package org.example.finalworkapi.Domain.DomainServicesLogin;

import org.example.finalworkapi.Domain.Entities.Mechanic;
import org.example.finalworkapi.Domain.InterfaceServiceLogin.IMechanicService;
import org.example.finalworkapi.Infrastructure.InterfaceRepositoryLogin.IMechanicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class MechanicService implements IMechanicService {

    @Autowired
    private IMechanicRepository mechanicRepository;

    @Override
    public Optional<Mechanic> login(String email, String password) {
        Optional<Mechanic> mechanicOpt = mechanicRepository.findByEmail(email);
        if (mechanicOpt.isPresent() && mechanicOpt.get().getPassword().equals(password)) {
            return mechanicOpt;
        }
        return Optional.empty();
    }

    @Override
    public Mechanic addMechanic(Mechanic mechanic) {
        return mechanicRepository.save(mechanic);
    }
}