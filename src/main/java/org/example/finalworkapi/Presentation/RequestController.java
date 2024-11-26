package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.RequestAppService;
import org.example.finalworkapi.Application.DTOs.RequestDTO.AddRequestDTO;
import org.example.finalworkapi.Application.DTOs.RequestDTO.ListRequestDTO;
import org.example.finalworkapi.Domain.Entities.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/request")
public class RequestController {

    private final RequestAppService requestAppServiceJob;

    @Autowired
    public RequestController(RequestAppService requestAppServiceJob) {
        this.requestAppServiceJob = requestAppServiceJob;
    }

    //List request
    @GetMapping("/listRequest")
    public ResponseEntity<List<ListRequestDTO>> getMaintenanceDetails() {
        try {
            List<ListRequestDTO> details = requestAppServiceJob.getAllRequest();
            return ResponseEntity.ok(details);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }

    //Add request spare part
    @PostMapping("/addRequest")
    public ResponseEntity<String> addRequest(@RequestBody AddRequestDTO addRequestDTO) {
        try {
            Request savedRequest = requestAppServiceJob.addRequest(addRequestDTO);
            return ResponseEntity.ok("Registro solicitud repuesto agregado exitosamente" + savedRequest.getIdRequest());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al agregar el registro solicitud repuesto: " + e.getMessage());
        }
    }

    //Seleccionar solicitudes
    @PutMapping("/Select/{id}")
    public ResponseEntity<ListRequestDTO> finalizeJob(@PathVariable int id) {
        ListRequestDTO requestSend = requestAppServiceJob.SelectRequest(id);
        if (requestSend != null) {
            return ResponseEntity.ok(requestSend);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/stateComplete/{id}")
    public ResponseEntity<ListRequestDTO> finalizeMaintenance(@PathVariable int id) {
        ListRequestDTO stateComplete = requestAppServiceJob.finalizeRequest(id);
        if (stateComplete != null) {
            return ResponseEntity.ok(stateComplete);
        }
        return ResponseEntity.notFound().build();
    }
}
