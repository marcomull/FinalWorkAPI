package org.example.finalworkapi.Domain.DomainServices;

import org.example.finalworkapi.Domain.RepositoryInterfaces.IMaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MaintenanceService {

    private final IMaintenanceRepository maintenanceRepository;

    @Autowired
    public MaintenanceService(IMaintenanceRepository maintenanceRepository) {
        this.maintenanceRepository = maintenanceRepository;
    }

    public List<Object[]> getAllMaintenanceDetails() {
        return maintenanceRepository.findAllMaintenanceDetails();
    }

}
