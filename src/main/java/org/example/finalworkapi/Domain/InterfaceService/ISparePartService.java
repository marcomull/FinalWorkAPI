package org.example.finalworkapi.Domain.InterfaceService;

import org.example.finalworkapi.Domain.Entities.SparePart;
import java.util.List;

public interface ISparePartService {
    List<SparePart> getAllSparePart();
    SparePart addSparePart(SparePart sparePart);
}
