package org.example.finalworkapi.Domain.DomainServices;

import org.example.finalworkapi.Domain.Entities.Job;
import org.example.finalworkapi.Domain.InterfaceService.IJobLogisticsService;
import org.example.finalworkapi.Domain.RepositoryInterfaces.IJobLogisticaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobLogisticsService implements IJobLogisticsService {

    private final IJobLogisticaRepository iJobLogisticaRepository;

    @Autowired
    public JobLogisticsService(IJobLogisticaRepository iJobLogisticaRepository) {
        this.iJobLogisticaRepository = iJobLogisticaRepository;
    }

    @Override
    public List<Job> getAllJobsLogistics() {
        return iJobLogisticaRepository.findAll();
    }
}
