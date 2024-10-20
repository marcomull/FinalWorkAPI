package org.example.finalworkapi.Domain.DomainServices;

import org.example.finalworkapi.Domain.InterfaceService.IJobLogisticsService;
import org.example.finalworkapi.Infrastructure.DatabaseConfiguration.ContextJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobLogisticsService implements IJobLogisticsService {
    private final ContextJob databaseContext;

    @Autowired
    public JobLogisticsService(ContextJob databaseContext) {
        this.databaseContext = databaseContext;
    }

    @Override
    public List<Object[]> getAllJobsLogistics() {
        return databaseContext.findAllLogisticsJob();
    }
}
