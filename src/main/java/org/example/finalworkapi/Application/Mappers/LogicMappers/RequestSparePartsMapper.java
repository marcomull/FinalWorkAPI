package org.example.finalworkapi.Application.Mappers.LogicMappers;

import org.example.finalworkapi.Application.DTOs.RequestSparePartsDTO.RequestSparePartsDTO;
import org.example.finalworkapi.Domain.Entities.*;
import org.example.finalworkapi.Infrastructure.InterfaceRepository.IRequestRepository;
import org.example.finalworkapi.Infrastructure.InterfaceRepository.ISparePartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RequestSparePartsMapper {

    @Autowired
    private IRequestRepository requestRepository;

    @Autowired
    private ISparePartRepository sparePartRepository;

    //Add RequestSpareParts
    public RequestSpareParts toEntity(RequestSparePartsDTO dto) {
        //RequestSpareParts requestSpareParts = new RequestSpareParts();
        RequestSpareParts requestSpareParts = new RequestSpareParts();
        RequestSparePartsPK pk = new RequestSparePartsPK();
        // Configurar la clave primaria compuesta
        pk.setIdRequest(dto.getIdRequest());
        pk.setIdSparePart(dto.getIdSparePart());
        requestSpareParts.setId(pk);
        // Buscar las entidades relacionadas
        Request request = requestRepository.findById(dto.getIdRequest())
                .orElseThrow(() -> new IllegalArgumentException("Request no encontrada con id: " + dto.getIdRequest()));
        SparePart sparePart = sparePartRepository.findById(dto.getIdSparePart())
                .orElseThrow(() -> new IllegalArgumentException("SparePart no encontrada con id: " + dto.getIdSparePart()));
        // Asignar las entidades relacionadas
        requestSpareParts.setRequest(request);
        requestSpareParts.setSparePart(sparePart);

        // Asignar la cantidad
        requestSpareParts.setQuantity(dto.getQuantity());

        return requestSpareParts;
    }

}
