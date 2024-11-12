package org.example.finalworkapi.Domain.InterfaceService;

import org.example.finalworkapi.Domain.Entities.Maintenance;
import java.util.List;

public interface IMaintenanceMechanicService {
    List<Maintenance> getAllMaintenanceMechanic();
    Maintenance finalizeMaintenance(int maintenanceId);
}