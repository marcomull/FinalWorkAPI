package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Domain.Entities.Job;
import org.example.finalworkapi.Domain.InterfaceService.IJobMechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.finalworkapi.Application.DTOs.MechanicDTO.JobMechanicDTO;
import org.example.finalworkapi.Application.Mappers.SparePartMechanicMapper;
//import org.example.finalworkapi.mappers.MaintenanceAdministratorMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobAppServiceMechanic {

    private final IJobMechanicService jobService;
    private final SparePartMechanicMapper jobMapper;

    @Autowired
    public JobAppServiceMechanic(IJobMechanicService jobService,
                                 SparePartMechanicMapper jobMapper) {
        this.jobService = jobService;
        this.jobMapper = jobMapper;
    }

    public List<JobMechanicDTO> getAllJobs() {
        List<Job> maintenanceList = jobService.getAllJobs();
        return maintenanceList.stream()
                .map(jobMapper::toDTO)
                .collect(Collectors.toList());

    }
}
