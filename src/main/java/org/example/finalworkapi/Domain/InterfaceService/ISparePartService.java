package org.example.finalworkapi.Domain.InterfaceService;

import org.example.finalworkapi.Domain.Entities.SparePart;
import java.util.List;
import java.util.Optional;

public interface ISparePartService {
    List<SparePart> getAllSparePart();
    SparePart addSparePart(SparePart sparePart);
    Optional<SparePart> updateSparePart(int id, SparePart sparePartDetails);
    Optional<SparePart> getSparePartById(int id);
    boolean deleteSparePartById(int id);
}
