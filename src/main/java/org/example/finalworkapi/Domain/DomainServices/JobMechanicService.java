package org.example.finalworkapi.Domain.DomainServices;

import org.example.finalworkapi.Domain.Entities.Job;
import org.example.finalworkapi.Domain.InterfaceService.IJobMechanicService;
import org.example.finalworkapi.Domain.RepositoryInterfaces.IJobRepository;
import org.example.finalworkapi.Infrastructure.DatabaseConfiguration.ContextJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobMechanicService implements IJobMechanicService {

    private final IJobRepository jobRepository;

    @Autowired
    public JobMechanicService(IJobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

}
