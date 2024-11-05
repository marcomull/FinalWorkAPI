package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Application.DTOs.LoginDTO.UserDTO;
import org.example.finalworkapi.Application.Mappers.LoginMappers.UserMappers;
import org.example.finalworkapi.Domain.InterfaceServiceLogin.IAdministratorService;
import org.example.finalworkapi.Domain.InterfaceServiceLogin.ILogisticsService;
import org.example.finalworkapi.Domain.InterfaceServiceLogin.IMechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserAppService {

    private final IAdministratorService administratorService;
    private final ILogisticsService logisticsService;
    private final IMechanicService mechanicService;

    @Autowired
    public UserAppService(IAdministratorService administratorService,
                          ILogisticsService logisticsService,
                          IMechanicService mechanicService) {
        this.administratorService = administratorService;
        this.logisticsService = logisticsService;
        this.mechanicService = mechanicService;
    }

    public Optional<UserDTO> loginAsAdministrator(String email, String password) {
        var administratorOpt = administratorService.login(email, password);
        return administratorOpt.map(UserMappers::toDTO);
    }

    public Optional<UserDTO> loginAsLogistics(String email, String password) {
        var logisticsOpt = logisticsService.login(email, password);
        return logisticsOpt.map(UserMappers::toDTO);
    }

    public Optional<UserDTO> loginAsMechanic(String email, String password) {
        var mechanicOpt = mechanicService.login(email, password);
        return mechanicOpt.map(UserMappers::toDTO);
    }
}

