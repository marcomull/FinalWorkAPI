package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Application.DTOs.RequestSparePartsDTO.RequestSparePartsDTO;
import org.example.finalworkapi.Application.Mappers.LogicMappers.RequestSparePartsMapper;
import org.example.finalworkapi.Domain.Entities.RequestSpareParts;
import org.example.finalworkapi.Domain.InterfaceService.IRequestSparePartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestSparePartsAppService {

    private final IRequestSparePartsService requestSparePartsService;
    private final RequestSparePartsMapper requestSparePartsMapper;

    @Autowired
    public RequestSparePartsAppService(IRequestSparePartsService requestSparePartsService, RequestSparePartsMapper requestSparePartsMapper) {
        this.requestSparePartsService = requestSparePartsService;
        this.requestSparePartsMapper = requestSparePartsMapper;
    }

    //Add maintenance
    public RequestSpareParts addRequestSpareParts(RequestSparePartsDTO dto) {
        RequestSpareParts requestSpareParts = requestSparePartsMapper.toEntity(dto);
        return requestSparePartsService.addRequestSpareParts(requestSpareParts);
    }

}
