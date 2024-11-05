package org.example.finalworkapi.Infrastructure.InterfaceRepositoryLogin;

import org.example.finalworkapi.Domain.Entities.Logistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ILogisticsRepository extends JpaRepository<Logistics, Integer> {
    Optional<Logistics> findByEmail(String email);
}
