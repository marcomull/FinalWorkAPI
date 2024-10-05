package org.example.finalworkapi.Domain.RepositoryInterfaces;

import org.example.finalworkapi.Domain.Entities.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

@Repository
public interface IMaintenanceRepository extends JpaRepository<Maintenance, Integer> {

    @Query("SELECT m.idMaintenance, v.mileage, v.plate, v.brand, v.model, v.yearManufacture, " +
            "v.maintenancePlan, tm.nameType, rf.descriptionReport, m.dateMaintenance, " +
            "m.descriptions " +
            "FROM Maintenance m " +
            "INNER JOIN m.vehicle v " +
            "INNER JOIN m.typeMaintenance tm " +
            "INNER JOIN m.failureReport rf " +
            "INNER JOIN m.administrator a")
    List<Object[]> findAllMaintenanceDetails();

}
