package org.example.finalworkapi.Domain.DomainServices;

import org.example.finalworkapi.Domain.Entities.SparePart;
import org.example.finalworkapi.Domain.InterfaceService.ISparePartService;
import org.example.finalworkapi.Infrastructure.InterfaceRepository.ISparePartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SparePartService implements ISparePartService {

    private final ISparePartRepository sparePartRepository;

    @Autowired
    public SparePartService(ISparePartRepository sparePartRepository) {
        this.sparePartRepository = sparePartRepository;
    }

    @Override
    public List<SparePart> getAllSparePart() {
        return sparePartRepository.findAll();
    }

    @Override
    public SparePart addSparePart(SparePart sparePart) {
        return sparePartRepository.save(sparePart);
    }
}
