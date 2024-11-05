package org.example.finalworkapi.Domain.InterfaceServiceLogin;

import org.example.finalworkapi.Domain.Entities.Logistics;
import java.util.Optional;

public interface ILogisticsService {
    Optional<Logistics> login(String email, String password);
}