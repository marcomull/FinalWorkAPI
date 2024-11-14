package org.example.finalworkapi.Domain.DomainServices;

import org.example.finalworkapi.Domain.Entities.Maintenance;
import org.example.finalworkapi.Domain.InterfaceService.IMaintenanceMechanicService;
import org.example.finalworkapi.Infrastructure.InterfaceRepository.IMechanicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MaintenanceMechanicService implements IMaintenanceMechanicService {

    private final IMechanicalRepository maintenanceRepository;

    @Autowired
    public MaintenanceMechanicService(IMechanicalRepository maintenanceRepository) {
        this.maintenanceRepository = maintenanceRepository;
    }

    //List mechanic
    @Override
    public List<Maintenance> getAllMaintenanceMechanic() {
        return maintenanceRepository.findByDescriptions("Activo");
    }

    // Update description to "inactivo"
    @Override
    public Maintenance finalizeMaintenance(int idMaintenance) {
        Maintenance maintenance = maintenanceRepository.findByIdMaintenance(idMaintenance);
        if (maintenance != null) {
            maintenance.setDescriptions("Inactivo");
            maintenanceRepository.save(maintenance);
        }
        return maintenance;
    }
}
