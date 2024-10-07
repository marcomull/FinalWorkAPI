package org.example.finalworkapi.Domain.DomainServices;

import org.example.finalworkapi.Infrastructure.DatabaseConfiguration.ContextMaintenance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MaintenanceMechanicService {

    private final ContextMaintenance databaseContext;

    @Autowired
    public MaintenanceMechanicService(ContextMaintenance databaseContext) {
        this.databaseContext = databaseContext;
    }

    public List<Object[]> getAllMaintenanceMechanic() {
        return databaseContext.findAllMaintenanceMechanic(); // Obtiene los detalles desde DatabaseContext
    }


}
