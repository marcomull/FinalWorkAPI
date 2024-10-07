package org.example.finalworkapi.Infrastructure.DatabaseConfiguration;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ContextMaintenance {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Object[]> findAllMaintenanceDetails() {
        Query query = entityManager.createQuery(
                "SELECT m.idMaintenance, v.mileage, v.plate, v.brand, v.model, v.yearManufacture, " +
                        "v.maintenancePlan, tm.nameType, rf.descriptionReport, m.dateMaintenance, " +
                        "m.descriptions " +
                        "FROM Maintenance m " +
                        "INNER JOIN m.vehicle v " +
                        "INNER JOIN m.typeMaintenance tm " +
                        "INNER JOIN m.failureReport rf " +
                        "INNER JOIN m.administrator a"
        );
        return query.getResultList();
    }

    public List<Object[]> findAllMaintenanceMechanic() {
        Query query = entityManager.createQuery(
                "SELECT m.idMaintenance, v.mileage, v.plate, v.brand, v.model, v.yearManufacture, " +
                        "v.maintenancePlan " +
                        "FROM Maintenance m " +
                        "INNER JOIN m.vehicle v " +
                        "INNER JOIN m.typeMaintenance tm " +
                        "INNER JOIN m.failureReport rf "
        );
        return query.getResultList();
    }
}
