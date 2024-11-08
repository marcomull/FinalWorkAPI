package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.AdministratorAppService;
import org.example.finalworkapi.Application.DTOs.AdministratorDTO.ListAdministratorDTO;
import org.example.finalworkapi.Application.DTOs.FailureReportDTO.ListFailureReportDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    private final AdministratorAppService administratorAppService;

    @Autowired
    public AdministratorController(AdministratorAppService administratorAppService) {
        this.administratorAppService = administratorAppService;
    }

    @GetMapping("/listAdministrator")
    public List<ListAdministratorDTO> getAdministrator() {
        return administratorAppService.getAllAdministrator();
    }
}
