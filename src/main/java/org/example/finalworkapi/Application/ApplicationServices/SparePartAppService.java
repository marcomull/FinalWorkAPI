package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Application.DTOs.SparePartDTO.SparePartDTO;
import org.example.finalworkapi.Application.Mappers.LogicMappers.SparePartMapper;
import org.example.finalworkapi.Domain.Entities.SparePart;
import org.example.finalworkapi.Domain.InterfaceService.ISparePartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SparePartAppService {

    private final ISparePartService sparePartService;
    private final SparePartMapper sparePartMapper;

    @Autowired
    public SparePartAppService(ISparePartService sparePartService, SparePartMapper sparePartMapper) {
        this.sparePartService = sparePartService;
        this.sparePartMapper = sparePartMapper;
    }

    //Listar repuesto
    public List<SparePartDTO> getAllSparePart() {
        List<SparePart> spareParts = sparePartService.getAllSparePart();
        return spareParts.stream()
                .map(sparePartMapper::toDTO)
                .collect(Collectors.toList());
    }

    //Add spare part
    public SparePart addSeparePart(SparePartDTO sparePartDTO) {
        SparePart sparePart = sparePartMapper.toEntity(sparePartDTO);
        return sparePartService.addSparePart(sparePart);
    }

    //Update repuesto
    public Optional<SparePart> updateSparePart(int id, SparePartDTO dto) {
        return sparePartService.updateSparePart(id, sparePartMapper.updateEntity(dto));
    }

    public Optional<SparePartDTO> getSparePartById(int id) {
        Optional<SparePart> sparePart = sparePartService.getSparePartById(id);
        return sparePart.map(sparePartMapper::toDTO);
    }

    //Delete SparePart
    public boolean deleteSparePart(SparePartDTO deleteDTO) {
        SparePart sparePart = sparePartMapper.toEntityForDeletion(deleteDTO);
        return sparePartService.deleteSparePartById(sparePart.getIdSparePart());
    }
}
