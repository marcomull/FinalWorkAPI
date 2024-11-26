package org.example.finalworkapi.Domain.DomainServices;

import org.example.finalworkapi.Domain.Entities.SparePart;
import org.example.finalworkapi.Domain.InterfaceService.ISparePartService;
import org.example.finalworkapi.Infrastructure.InterfaceRepository.ISparePartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SparePartService implements ISparePartService {

    private final ISparePartRepository sparePartRepository;

    @Autowired
    public SparePartService(ISparePartRepository sparePartRepository) {
        this.sparePartRepository = sparePartRepository;
    }

    //List repuestos
    @Override
    public List<SparePart> getAllSparePart() {
        return sparePartRepository.findAll();
    }

    //Agregar Repuestos
    @Override
    public SparePart addSparePart(SparePart sparePart) {
        return sparePartRepository.save(sparePart);
    }

    //Modificar repuestos
    @Override
    public Optional<SparePart> updateSparePart(int id, SparePart sparePartDetails) {
        return sparePartRepository.findById(id).map(existingSparePart -> {
            existingSparePart.setSparePart(sparePartDetails.getSparePart());
            existingSparePart.setStock(sparePartDetails.getStock());
            existingSparePart.setPrice(sparePartDetails.getPrice());
            return sparePartRepository.save(existingSparePart);
        });
    }

    //Jala datos de repuestos
    @Override
    public Optional<SparePart> getSparePartById(int id) {
        return sparePartRepository.findById(id);
    }

    //Eliminar repuestos
    @Override
    public boolean deleteSparePartById(int id) {
        Optional<SparePart> sparePart = sparePartRepository.findById(id);
        if (sparePart.isPresent()) {
            sparePartRepository.delete(sparePart.get());
            return true;
        }
        return false;
    }
}
