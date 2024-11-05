package org.example.finalworkapi.Domain.DomainServicesLogin;

import org.example.finalworkapi.Domain.Entities.Logistics;
import org.example.finalworkapi.Domain.InterfaceServiceLogin.ILogisticsService;
import org.example.finalworkapi.Infrastructure.InterfaceRepositoryLogin.ILogisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class LogisticsService implements ILogisticsService {

    @Autowired
    private ILogisticsRepository logisticsRepository;

    @Override
    public Optional<Logistics> login(String email, String password) {
        Optional<Logistics> logisticsOpt = logisticsRepository.findByEmail(email);
        if (logisticsOpt.isPresent() && logisticsOpt.get().getPassword().equals(password)) {
            return logisticsOpt;
        }
        return Optional.empty();
    }
}