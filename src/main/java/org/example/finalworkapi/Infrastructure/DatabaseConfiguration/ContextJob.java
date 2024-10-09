package org.example.finalworkapi.Infrastructure.DatabaseConfiguration;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ContextJob {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Object[]> findAllMechanicJob() {
        Query query = entityManager.createQuery(
                "SELECT j.idJob, j.startMaintenance, sp.sparePart, j.endMaintenance " +
                        "FROM Job j " +
                        "INNER JOIN j.idSparePart sp"
        );
        return query.getResultList();
    }

    public List<Object[]> findAllLogisticsJob() {
        Query query = entityManager.createQuery(
                "SELECT sp.idSparePart, j.startMaintenance, sp.sparePart, m.idMechanic " +
                        "FROM Job j " +
                        "INNER JOIN j.idSparePart sp " +
                        "INNER JOIN j.idMechanic m"
        );
        return query.getResultList();
    }

}
