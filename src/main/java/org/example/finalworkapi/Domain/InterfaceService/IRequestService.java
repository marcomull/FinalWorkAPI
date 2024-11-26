package org.example.finalworkapi.Domain.InterfaceService;

import org.example.finalworkapi.Domain.Entities.Request;
import java.util.List;

public interface IRequestService {
    List<Request> getAllRequest();
    Request addRequest(Request request);
    Request SelectRequest(int idRequest);
    Request stateComplete(int requestId);
}
