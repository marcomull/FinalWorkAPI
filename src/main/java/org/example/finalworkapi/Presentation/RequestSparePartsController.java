package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.RequestSparePartsAppService;
import org.example.finalworkapi.Application.DTOs.RequestSparePartsDTO.RequestSparePartsDTO;
import org.example.finalworkapi.Domain.Entities.RequestSpareParts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/requestSparePart")
public class RequestSparePartsController {

    private final RequestSparePartsAppService requestSparePartsAppService;

    @Autowired
    public RequestSparePartsController(RequestSparePartsAppService requestSparePartsAppService) {
        this.requestSparePartsAppService = requestSparePartsAppService;
    }

    //Add request spare part
    @PostMapping("/addRequestSparePart")
    public ResponseEntity<String> addRequestSparePart(@RequestBody RequestSparePartsDTO requestSparePartsDTO) {
        try {
            System.out.println("Datos recibidos: " + requestSparePartsDTO);
            RequestSpareParts savedRequestSpareParts = requestSparePartsAppService.addRequestSpareParts(requestSparePartsDTO);
            return ResponseEntity.ok("Registro solicitud repuesto entregado exitosamente");
        } catch (Exception e) {
            e.printStackTrace(); // Para ver el error exacto en los logs
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al procesar la solicitud");
        }
    }


}
