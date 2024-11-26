package org.example.finalworkapi.Domain.DomainServices;

import org.example.finalworkapi.Domain.Entities.RequestSpareParts;
import org.example.finalworkapi.Domain.InterfaceService.IRequestSparePartsService;
import org.example.finalworkapi.Infrastructure.InterfaceRepository.IRequestSparePartsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestSparePartsService implements IRequestSparePartsService {

    private final IRequestSparePartsRepository requestSparePartsRepository;

    @Autowired
    public RequestSparePartsService(IRequestSparePartsRepository requestSparePartsRepository) {
        this.requestSparePartsRepository = requestSparePartsRepository;
    }

    //Agregar respuesta a la solicitud
    @Override
    public RequestSpareParts addRequestSpareParts(RequestSpareParts requestSpareParts) {
        return requestSparePartsRepository.save(requestSpareParts);
    }
}
