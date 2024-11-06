package org.example.finalworkapi.Domain.DomainServices;

import org.example.finalworkapi.Domain.Entities.Maintenance;
import org.example.finalworkapi.Infrastructure.InterfaceRepository.IMaintenanceRepository;
import org.example.finalworkapi.Domain.InterfaceService.IMaintenanceAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class MaintenanceAdministratorService implements IMaintenanceAdministratorService {

    private final IMaintenanceRepository maintenanceRepository;

    @Autowired
    public MaintenanceAdministratorService(IMaintenanceRepository maintenanceRepository) {
        this.maintenanceRepository = maintenanceRepository;
    }

    //List maintenance
    @Override
    public List<Maintenance> getAllMaintenanceDetails() {
        return maintenanceRepository.findAll();
    }

    //Add maintenance
    @Override
    public Maintenance addMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    //Update maintenance
    @Override
    public Optional<Maintenance> updateMaintenance(int id, Maintenance maintenanceDetails) {
        return maintenanceRepository.findById(id).map(existingMaintenance -> {
            existingMaintenance.setVehicle(maintenanceDetails.getVehicle());
            existingMaintenance.setAdministrator(maintenanceDetails.getAdministrator());
            existingMaintenance.setTypeMaintenance(maintenanceDetails.getTypeMaintenance());
            existingMaintenance.setFailureReport(maintenanceDetails.getFailureReport());
            existingMaintenance.setDateMaintenance(maintenanceDetails.getDateMaintenance());
            existingMaintenance.setDescriptions(maintenanceDetails.getDescriptions());

            return maintenanceRepository.save(existingMaintenance);
        });
    }

    //Delete maintenance
    @Override
    public boolean deleteMaintenanceById(int id) {
        Optional<Maintenance> maintenance = maintenanceRepository.findById(id);
        if (maintenance.isPresent()) {
            maintenanceRepository.delete(maintenance.get());
            return true;
        }
        return false;
    }

    //Buscar maintenance
    @Override
    public List<Maintenance> searchBySingleParameter(String searchType, String searchValue) {
        switch (searchType) {
            case "maintenanceId":
                return maintenanceRepository.findByIdMaintenance(Integer.parseInt(searchValue));
            case "failureReportId":
                return maintenanceRepository.findByFailureReportIdFailureReport(Integer.parseInt(searchValue));
            case "vehicleId":
                return maintenanceRepository.findByVehicleIdVehicle(Integer.parseInt(searchValue));
            case "administratorId":
                return maintenanceRepository.findByAdministratorIdAdministrator(Integer.parseInt(searchValue));
            case "typeMaintenanceId":
                return maintenanceRepository.findByTypeMaintenanceIdTypeMaintenance(Integer.parseInt(searchValue));
            default:
                return Collections.emptyList();
        }
    }
}
