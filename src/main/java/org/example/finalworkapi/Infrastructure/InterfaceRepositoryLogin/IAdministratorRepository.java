package org.example.finalworkapi.Infrastructure.InterfaceRepositoryLogin;

import org.example.finalworkapi.Domain.Entities.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface IAdministratorRepository extends JpaRepository<Administrator, Integer> {
    Optional<Administrator> findByEmail(String email);
}
