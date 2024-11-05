package org.example.finalworkapi.Infrastructure.InterfaceRepositoryLogin;

import org.example.finalworkapi.Domain.Entities.Mechanic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface IMechanicRepository extends JpaRepository<Mechanic, Integer> {
    Optional<Mechanic> findByEmail(String email);
}
