package org.example.finalworkapi.Domain.InterfaceService;

import org.example.finalworkapi.Domain.Entities.Maintenance;

import java.util.List;

public interface IMaintenanceAdministratorService {
    List<Object[]> getAllMaintenanceDetails();

    Maintenance addMaintenance(Maintenance maintenance);
}