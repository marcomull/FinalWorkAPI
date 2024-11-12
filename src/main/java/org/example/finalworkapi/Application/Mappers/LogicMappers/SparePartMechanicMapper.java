package org.example.finalworkapi.Application.Mappers.LogicMappers;

import org.example.finalworkapi.Application.DTOs.MechanicDTO.JobMechanicDTO;
import org.example.finalworkapi.Domain.Entities.*;
import org.springframework.stereotype.Component;

@Component
public class SparePartMechanicMapper {

    //List job
    public JobMechanicDTO toDTO(Job job) {
        JobMechanicDTO dto = new JobMechanicDTO();
        dto.setIdJob(job.getIdJob());
        dto.setStartMaintenance(job.getStartMaintenance());
        dto.setSparePart(job.getIdSparePart().getSparePart());
        dto.setEndMaintenance(job.getEndMaintenance());
        return dto;
    }

    //Add job
    /*public Job toEntity(JobMechanicDTO dto) {
        Job job = new Job();
        job.setIdMaintenance(new Maintenance(dto.getIdMaintenance()));
        job.setIdMechanic(new Mechanic(dto.getIdMechanic()));
        job.setIdSparePart(new SparePart(dto.getSparePart()));
        job.setStartMaintenance(dto.getStartMaintenance());
        return job;
    }*/

}
