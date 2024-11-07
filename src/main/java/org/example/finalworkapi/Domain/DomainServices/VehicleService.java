package org.example.finalworkapi.Domain.DomainServices;

import org.example.finalworkapi.Domain.Entities.Vehicle;
import org.example.finalworkapi.Domain.InterfaceService.IVehicleService;
import org.example.finalworkapi.Infrastructure.InterfaceRepository.IVehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VehicleService implements IVehicleService {

    private final IVehicleRepository vehicleRepository;

    @Autowired
    public VehicleService(IVehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public List<Vehicle> getAllVehicle() {
        return vehicleRepository.findAll();
    }
}
