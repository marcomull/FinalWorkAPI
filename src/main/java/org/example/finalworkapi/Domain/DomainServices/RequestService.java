package org.example.finalworkapi.Domain.DomainServices;

import org.example.finalworkapi.Domain.Entities.Logistics;
import org.example.finalworkapi.Domain.Entities.Request;
import org.example.finalworkapi.Domain.InterfaceService.IRequestService;
import org.example.finalworkapi.Infrastructure.InterfaceRepository.IRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService implements IRequestService {

    private final IRequestRepository spareRepository;

    @Autowired
    public RequestService(IRequestRepository spareRepository) {
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

    //Seleccionar solicitud segun logistica
    @Override
    public Request SelectRequest(int idRequest) {
        Request request = spareRepository.findById(idRequest).orElse(null);
        if (request == null) {
            request.setIdLogistics(new Logistics());
            spareRepository.save(request);
        }
        return request;
    }

    //Update state complete
    @Override
    public Request stateComplete(int requestId) {
        Request request = spareRepository.findByIdRequest(requestId);
        if (request != null) {
            request.setState("Completo");
            spareRepository.save(request);
        }
        return request;
    }

}
