package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Application.DTOs.RequestDTO.AddRequestDTO;
import org.example.finalworkapi.Application.DTOs.RequestDTO.ListRequestDTO;
import org.example.finalworkapi.Application.Mappers.LogicMappers.RequestMapper;
import org.example.finalworkapi.Domain.Entities.Request;
import org.example.finalworkapi.Domain.InterfaceService.IRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RequestAppServiceJob {

    private final IRequestService requestService;
    private final RequestMapper requestMapper;

    @Autowired
    public RequestAppServiceJob(IRequestService requestService, RequestMapper requestMapper) {
        this.requestService = requestService;
        this.requestMapper = requestMapper;
    }

    //List spare part
    public List<ListRequestDTO> getAllRequest() {
        List<Request> requests = requestService.getAllRequest();
        return requests.stream()
                .map(requestMapper::toDTO)
                .collect(Collectors.toList());
    }

    //Add request spare part
    public Request addRequest(AddRequestDTO addRequestDTO) {
        Request request = requestMapper.toEntity(addRequestDTO);
        return requestService.addRequest(request);
    }
}
