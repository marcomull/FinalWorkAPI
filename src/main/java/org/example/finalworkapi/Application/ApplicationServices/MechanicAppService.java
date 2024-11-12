package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Application.DTOs.LoginDTO.LoginDTO;
import org.example.finalworkapi.Application.Mappers.LogicMappers.MechanicMapper;
import org.example.finalworkapi.Domain.Entities.Mechanic;
import org.example.finalworkapi.Domain.InterfaceServiceLogin.IMechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MechanicAppService {

    private final IMechanicService mechanicService;
    private final MechanicMapper mechanicMapper;

    @Autowired
    public MechanicAppService(IMechanicService mechanicService, MechanicMapper mechanicMapper) {
        this.mechanicService = mechanicService;
        this.mechanicMapper = mechanicMapper;
    }

    //Add mechanic
    public Mechanic addMechanic(LoginDTO dto) {
        Mechanic mechanic = mechanicMapper.toEntity(dto);
        return mechanicService.addMechanic(mechanic);
    }
}
