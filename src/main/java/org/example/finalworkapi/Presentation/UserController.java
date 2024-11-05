package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.UserAppService;
import org.example.finalworkapi.Application.DTOs.LoginDTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/login")
public class UserController {

    private final UserAppService userAppService;

    @Autowired
    public UserController(UserAppService userAppService) {
        this.userAppService = userAppService;
    }

    @PostMapping("/administrator")
    public ResponseEntity<UserDTO> loginAsAdministrator(@RequestParam String email,
                                                        @RequestParam String password) {
        Optional<UserDTO> userOpt = userAppService.loginAsAdministrator(email, password);
        return userOpt.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(401).build()); // 401 Unauthorized
    }

    @PostMapping("/logistics")
    public ResponseEntity<UserDTO> loginAsLogistics(@RequestParam String email,
                                                    @RequestParam String password) {
        Optional<UserDTO> userOpt = userAppService.loginAsLogistics(email, password);
        return userOpt.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(401).build()); // 401 Unauthorized
    }

    @PostMapping("/mechanic")
    public ResponseEntity<UserDTO> loginAsMechanic(@RequestParam String email,
                                                   @RequestParam String password) {
        Optional<UserDTO> userOpt = userAppService.loginAsMechanic(email, password);
        return userOpt.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(401).build()); // 401 Unauthorized
    }
}
