package org.example.finalworkapi.Domain.RepositoryInterfaces;

import org.example.finalworkapi.Domain.Entities.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMechanicalRepository extends JpaRepository<Maintenance, Integer>{
}
