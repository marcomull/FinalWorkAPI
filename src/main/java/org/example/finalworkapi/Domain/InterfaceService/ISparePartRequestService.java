package org.example.finalworkapi.Domain.InterfaceService;

import org.example.finalworkapi.Domain.Entities.Maintenance;
import org.example.finalworkapi.Domain.Entities.SparePart;
import java.util.List;

public interface ISparePartRequestService {
    List<SparePart> getAllSparePart();
    SparePart addSparePart(SparePart sparePart);
}
