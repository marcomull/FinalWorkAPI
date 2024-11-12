package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Application.DTOs.LoginDTO.LoginDTO;
import org.example.finalworkapi.Application.Mappers.LogicMappers.LogisticsMapper;
import org.example.finalworkapi.Domain.Entities.Logistics;
import org.example.finalworkapi.Domain.InterfaceServiceLogin.ILogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
