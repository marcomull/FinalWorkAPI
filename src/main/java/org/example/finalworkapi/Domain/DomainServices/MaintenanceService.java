package org.example.finalworkapi.Domain.DomainServices;

import org.example.finalworkapi.Infrastructure.DatabaseConfiguration.ContextMaintenance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MaintenanceService {

    /*private final IMaintenanceRepository maintenanceRepository;

    @Autowired
    public MaintenanceService(IMaintenanceRepository maintenanceRepository) {
        this.maintenanceRepository = maintenanceRepository;
    }

    public List<Maintenance> getAllMaintenance() {
        return maintenanceRepository.findAll(); // Obtiene todas las entidades Maintenance
    }*/

    private final ContextMaintenance databaseContext;

    @Autowired
    public MaintenanceService(ContextMaintenance databaseContext) {
        this.databaseContext = databaseContext;
    }

    public List<Object[]> getAllMaintenanceDetails() {
        return databaseContext.findAllMaintenanceDetails(); // Obtiene los detalles desde DatabaseContext
    }

}
