package org.example.finalworkapi.Infrastructure.InterfaceRepository;

import org.example.finalworkapi.Domain.Entities.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IMechanicalRepository extends JpaRepository<Maintenance, Integer>{
    List<Maintenance> findByDescriptions(String descriptions);
    Maintenance findByIdMaintenance(int idMaintenance);
}
