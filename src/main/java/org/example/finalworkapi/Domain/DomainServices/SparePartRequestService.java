package org.example.finalworkapi.Domain.DomainServices;

import org.example.finalworkapi.Domain.Entities.SparePart;
import org.example.finalworkapi.Domain.InterfaceService.ISparePartRequestService;
import org.example.finalworkapi.Infrastructure.InterfaceRepository.ISpareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SparePartRequestService implements ISparePartRequestService {

    private final ISpareRepository spareRepository;

    @Autowired
    public SparePartRequestService(ISpareRepository spareRepository) {
        this.spareRepository = spareRepository;
    }

    //List request spare part
    @Override
    public List<SparePart> getAllSparePart() {
        return spareRepository.findAll();
    }

    //Add request spare part
    @Override
    public SparePart addSparePart(SparePart sparePart) {
        return spareRepository.save(sparePart);
    }
}
