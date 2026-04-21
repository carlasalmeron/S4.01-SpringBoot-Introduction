package cat.itacademy.s04.t01.userapi.controllers;

import cat.itacademy.s04.t01.userapi.Status;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public Status checkHealth() {
        return new Status("OK");
    }

}
