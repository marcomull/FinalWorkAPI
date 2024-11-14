package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Application.DTOs.JobDTO.AddJobDTO;
import org.example.finalworkapi.Domain.Entities.Job;
import org.example.finalworkapi.Domain.InterfaceService.IJobMechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.finalworkapi.Application.DTOs.JobDTO.ListJobDTO;
import org.example.finalworkapi.Application.Mappers.LogicMappers.SparePartMechanicMapper;

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

    //List Job
    public List<ListJobDTO> getAllJobs() {
        List<Job> maintenanceList = jobService.getAllJobs();
        return maintenanceList.stream()
                .map(jobMapper::toDTO)
                .collect(Collectors.toList());

    }

    //Add Job
    public Job addJob(AddJobDTO jobMechanicDTO) {
        Job job = jobMapper.toEntity(jobMechanicDTO);
        return jobService.AddJob(job);
    }

}
