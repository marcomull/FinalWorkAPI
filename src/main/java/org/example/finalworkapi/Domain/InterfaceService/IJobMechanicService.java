package org.example.finalworkapi.Domain.InterfaceService;

import org.example.finalworkapi.Domain.Entities.Job;
import java.util.List;

public interface IJobMechanicService {
    List<Job> getAllJobs();
    Job AddJob(Job job);
}