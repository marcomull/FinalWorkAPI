package org.example.finalworkapi.Domain.RepositoryInterfaces;

import org.example.finalworkapi.Domain.Entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehicleRepository extends JpaRepository<Vehicle, Integer> {
}
