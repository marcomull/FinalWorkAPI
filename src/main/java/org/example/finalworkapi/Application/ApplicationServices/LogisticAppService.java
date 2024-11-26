package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Application.DTOs.AdministratorDTO.ListAdministratorDTO;
import org.example.finalworkapi.Application.DTOs.LoginDTO.LoginDTO;
import org.example.finalworkapi.Application.Mappers.LogicMappers.LogisticsMapper;
import org.example.finalworkapi.Domain.Entities.Administrator;
import org.example.finalworkapi.Domain.Entities.Logistics;
import org.example.finalworkapi.Domain.InterfaceServiceLogin.ILogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LogisticAppService {

    private final ILogisticsService logistiService;
    private final LogisticsMapper logisticMapper;

    @Autowired
    public LogisticAppService(ILogisticsService logistiService, LogisticsMapper logisticMapper) {
        this.logistiService = logistiService;
        this.logisticMapper = logisticMapper;
    }

    //Add logistics
    public Logistics addLogistic(LoginDTO dto) {
        Logistics logistics = logisticMapper.toEntity(dto);
        return logistiService.addLogistic(logistics);
    }

    //List administrator
    public List<LoginDTO> getAllLogistics() {
        List<Logistics> logistics = logistiService.getAllLogistics();
        try {
            return logistics.stream()
                    .map(logisticMapper::toDTO)
                    .collect(Collectors.toList());
        } catch (ClassCastException e) {
            return Collections.emptyList();
        }
    }
}
