package org.example.finalworkapi.Infrastructure.InterfaceRepository;

import org.example.finalworkapi.Domain.Entities.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface IMaintenanceRepository extends JpaRepository<Maintenance, Integer> {

    List<Maintenance> findByIdMaintenance(Integer maintenanceId);
    List<Maintenance> findByFailureReportIdFailureReport(Integer failureReportId);
    List<Maintenance> findByVehicleIdVehicle(Integer vehicleId);
    List<Maintenance> findByAdministratorIdAdministrator(Integer administratorId);
    List<Maintenance> findByTypeMaintenanceIdTypeMaintenance(Integer typeMaintenanceId);

    Optional<Maintenance> findById(int id);
}

