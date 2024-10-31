package org.example.finalworkapi.Domain.DomainServices;

import org.example.finalworkapi.Domain.Entities.Maintenance;
import org.example.finalworkapi.Domain.RepositoryInterfaces.IMaintenanceRepository;
import org.example.finalworkapi.Infrastructure.DatabaseConfiguration.ContextMaintenance;
import org.example.finalworkapi.Domain.InterfaceService.IMaintenanceAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MaintenanceAdministratorService implements IMaintenanceAdministratorService{

    private final ContextMaintenance databaseContext;
    private final IMaintenanceRepository maintenanceRepository;

    @Autowired
    public MaintenanceAdministratorService(ContextMaintenance databaseContext, IMaintenanceRepository maintenanceRepository) {
        this.databaseContext = databaseContext;
        this.maintenanceRepository = maintenanceRepository;
    }

    @Override
    public List<Object[]> getAllMaintenanceDetails() {
        return databaseContext.findAllMaintenanceDetails();
    }

    @Override
    public Maintenance addMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }


}
