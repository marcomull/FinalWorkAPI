package org.example.finalworkapi.Domain.DomainServices;

import org.example.finalworkapi.Domain.Entities.Request;
import org.example.finalworkapi.Domain.Entities.SparePart;
import org.example.finalworkapi.Domain.InterfaceService.IRequestService;
import org.example.finalworkapi.Infrastructure.InterfaceRepository.IRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SparePartRequestService implements IRequestService {

    private final IRequestRepository spareRepository;

    @Autowired
    public SparePartRequestService(IRequestRepository spareRepository) {
        this.spareRepository = spareRepository;
    }

    //List request spare part
    @Override
    public List<Request> getAllRequest() {
        return spareRepository.findAll();
    }

    //Add request spare part
    @Override
    public Request addRequest(Request request) {
        return spareRepository.save(request);
    }
}
