package org.example.finalworkapi.Domain.DomainServices;

import org.example.finalworkapi.Domain.Entities.TypeMaintenance;
import org.example.finalworkapi.Domain.InterfaceService.ITypeMaintenanceService;
import org.example.finalworkapi.Infrastructure.InterfaceRepository.ITypeMaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TypeMaintenanceService implements ITypeMaintenanceService {

    private final ITypeMaintenanceRepository typeMaintenanceRepository;

    @Autowired
    public TypeMaintenanceService(ITypeMaintenanceRepository typeMaintenanceRepository) {
        this.typeMaintenanceRepository = typeMaintenanceRepository;
    }

    @Override
    public List<TypeMaintenance> getAllTypeMaintenance() {
        return typeMaintenanceRepository.findAll();
    }
}
