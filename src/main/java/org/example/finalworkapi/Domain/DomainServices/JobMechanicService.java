package org.example.finalworkapi.Domain.DomainServices;

import org.example.finalworkapi.Domain.Entities.Job;
import org.example.finalworkapi.Domain.InterfaceService.IJobMechanicService;
import org.example.finalworkapi.Infrastructure.InterfaceRepository.IJobMechanicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobMechanicService implements IJobMechanicService {

    private final IJobMechanicRepository jobRepository;

    @Autowired
    public JobMechanicService(IJobMechanicRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

}
