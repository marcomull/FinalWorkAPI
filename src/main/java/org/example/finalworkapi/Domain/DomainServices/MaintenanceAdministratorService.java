package org.example.finalworkapi.Domain.DomainServices;

import org.example.finalworkapi.Infrastructure.DatabaseConfiguration.ContextMaintenance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MaintenanceAdministratorService {

    private final ContextMaintenance databaseContext;

    @Autowired
    public MaintenanceAdministratorService(ContextMaintenance databaseContext) {
        this.databaseContext = databaseContext;
    }

    public List<Object[]> getAllMaintenanceDetails() {
        return databaseContext.findAllMaintenanceDetails();
    }

}
