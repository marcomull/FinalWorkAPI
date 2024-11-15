package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Application.DTOs.SparePartDTO.ListSparePartDTO;
import org.example.finalworkapi.Application.Mappers.LogicMappers.SparePartMapper;
import org.example.finalworkapi.Domain.Entities.SparePart;
import org.example.finalworkapi.Domain.InterfaceService.ISparePartRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SparePartAppServiceJob {

    private final ISparePartRequestService sparePartRequestService;
    private final SparePartMapper sparePartMapper;

    @Autowired
    public SparePartAppServiceJob(ISparePartRequestService sparePartRequestService, SparePartMapper sparePartMapper) {
        this.sparePartRequestService = sparePartRequestService;
        this.sparePartMapper = sparePartMapper;
    }

    //List spare part
    public List<ListSparePartDTO> getAllSpareParts() {
        List<SparePart> spareParts = sparePartRequestService.getAllSparePart();
        return spareParts.stream()
                .map(sparePartMapper::toDTO)
                .collect(Collectors.toList());
    }
}
