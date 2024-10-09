package org.example.finalworkapi.Domain.DomainServices;


import org.example.finalworkapi.Infrastructure.DatabaseConfiguration.ContextJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobMechanicService {

    private final ContextJob databaseContext;

    @Autowired
    public JobMechanicService(ContextJob databaseContext) {
        this.databaseContext = databaseContext;
    }

    public List<Object[]> getAllJobs() {
        return databaseContext.findAllMechanicJob();
    }

}
