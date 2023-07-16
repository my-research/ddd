package com.github.dhslrl321.create;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
@RequiredArgsConstructor
public class CreateUserController {

    private final CreateUserService service;

    @PostMapping("/users")
    public ResponseEntity<Map<String, Object>> create(@RequestBody Map<String, Object> body) {

        service.create(
                (String) body.get("username"),
                (String) body.get("email")
        );

        return ResponseEntity.ok(Map.of("result", "success"));
    }
}
