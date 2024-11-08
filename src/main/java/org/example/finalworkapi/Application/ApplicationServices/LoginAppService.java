package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Application.DTOs.LoginDTO.LoginDTO;
import org.example.finalworkapi.Application.Mappers.LoginMappers.LoginMappers;
import org.example.finalworkapi.Domain.InterfaceServiceLogin.IAdministratorService;
import org.example.finalworkapi.Domain.InterfaceServiceLogin.ILogisticsService;
import org.example.finalworkapi.Domain.InterfaceServiceLogin.IMechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginAppService {

    private final IAdministratorService administratorService;
    private final ILogisticsService logisticsService;
    private final IMechanicService mechanicService;
    private final LoginMappers userMappers;

    @Autowired
    public LoginAppService(IAdministratorService administratorService,
                           ILogisticsService logisticsService,
                           IMechanicService mechanicService,
                           LoginMappers userMappers) {
        this.administratorService = administratorService;
        this.logisticsService = logisticsService;
        this.mechanicService = mechanicService;
        this.userMappers = userMappers;
    }

    // Login para Administrator
    public Optional<LoginDTO> loginAsAdministrator(String email, String password) {
        var administratorOpt = administratorService.login(email, password);
        return administratorOpt.map(userMappers::toDTO);
    }

    // Login para Logistics
    public Optional<LoginDTO> loginAsLogistics(String email, String password) {
        var logisticsOpt = logisticsService.login(email, password);
        return logisticsOpt.map(userMappers::toDTO);
    }

    // Login para Mechanic
    public Optional<LoginDTO> loginAsMechanic(String email, String password) {
        var mechanicOpt = mechanicService.login(email, password);
        return mechanicOpt.map(userMappers::toDTO);
    }
}



