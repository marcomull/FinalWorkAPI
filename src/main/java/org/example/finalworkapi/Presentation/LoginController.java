package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.LoginAppService;
import org.example.finalworkapi.Application.DTOs.LoginDTO.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final LoginAppService userAppService;

    @Autowired
    public LoginController(LoginAppService userAppService) {
        this.userAppService = userAppService;
    }

    @PostMapping("/administrator")
    public ResponseEntity<LoginDTO> loginAsAdministrator(@RequestParam String email,
                                                         @RequestParam String password) {
        Optional<LoginDTO> userOpt = userAppService.loginAsAdministrator(email, password);
        return userOpt.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(401).build()); // 401 Unauthorized
    }

    @PostMapping("/logistics")
    public ResponseEntity<LoginDTO> loginAsLogistics(@RequestParam String email,
                                                     @RequestParam String password) {
        Optional<LoginDTO> userOpt = userAppService.loginAsLogistics(email, password);
        return userOpt.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(401).build()); // 401 Unauthorized
    }

    @PostMapping("/mechanic")
    public ResponseEntity<LoginDTO> loginAsMechanic(@RequestParam String email,
                                                    @RequestParam String password) {
        Optional<LoginDTO> userOpt = userAppService.loginAsMechanic(email, password);
        return userOpt.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(401).build()); // 401 Unauthorized
    }
}
