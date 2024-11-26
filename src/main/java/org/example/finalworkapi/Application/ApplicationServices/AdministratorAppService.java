package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Application.DTOs.AdministratorDTO.ListAdministratorDTO;
import org.example.finalworkapi.Application.DTOs.LoginDTO.LoginDTO;
import org.example.finalworkapi.Application.Mappers.LogicMappers.AdministratorMapper;
import org.example.finalworkapi.Domain.Entities.Administrator;
import org.example.finalworkapi.Domain.InterfaceServiceLogin.IAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdministratorAppService {

    private final IAdministratorService administratorService;
    private final AdministratorMapper administratorMapper;

    @Autowired
    public AdministratorAppService(IAdministratorService administratorService, AdministratorMapper administratorMapper) {
        this.administratorService = administratorService;
        this.administratorMapper = administratorMapper;
    }

    //List administrator
    public List<ListAdministratorDTO> getAllAdministrator() {
        List<Administrator> administrator = administratorService.getAllAdminstrator();
        try {
            return administrator.stream()
                    .map(administratorMapper::toDTO)
                    .collect(Collectors.toList());
        } catch (ClassCastException e) {
            return Collections.emptyList();
        }
    }

    //Add administrator
    public Administrator addAdministrator(LoginDTO dto) {
        Administrator administrator = administratorMapper.toEntity(dto);
        return administratorService.addAdministrator(administrator);
    }
}
