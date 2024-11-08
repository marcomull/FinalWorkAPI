package org.example.finalworkapi.Domain.InterfaceService;

import org.example.finalworkapi.Domain.Entities.Maintenance;

import java.util.List;
import java.util.Optional;

public interface IMaintenanceAdministratorService {
    List<Maintenance> getAllMaintenanceDetails();
    Maintenance addMaintenance(Maintenance maintenance);
    Optional<Maintenance> updateMaintenance(int id, Maintenance maintenanceDetails);
    boolean deleteMaintenanceById(int id);
    List<Maintenance> searchBySingleParameter(String searchType, String searchValue);
    Optional<Maintenance> getMaintenanceById(int id);
}