package org.example.finalworkapi.Domain.DomainServices;

import org.example.finalworkapi.Infrastructure.DatabaseConfiguration.ContextJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobLogisticsService {
    private final ContextJob databaseContext;

    @Autowired
    public JobLogisticsService(ContextJob databaseContext) {
        this.databaseContext = databaseContext;
    }

    public List<Object[]> getAllJobsLogistics() {
        return databaseContext.findAllLogisticsJob();
    }
}
