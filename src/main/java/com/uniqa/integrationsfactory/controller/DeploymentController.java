package com.uniqa.integrationfactory.controller;

import com.uniqa.integrationfactory.model.Deployment;
import com.uniqa.integrationfactory.service.DeploymentService;
import jakarta.validation.constraints.NotBlank;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deployments")
public class DeploymentController {

    private final DeploymentService service;

    public DeploymentController(DeploymentService service) {
        this.service = service;
    }

    /**
     * Beispielaufruf:
     * POST http://localhost:8080/deployments?packageName=PolicyCore&version=1.2.3&environment=DEV
     */
    @PostMapping
    public Deployment trigger(
            @RequestParam @NotBlank String packageName,
            @RequestParam @NotBlank String version,
            @RequestParam(defaultValue = "DEV") String environment
    ) {
        return service.deploy(packageName, version, environment);
    }

    @GetMapping
    public List<Deployment> list() {
        return service.getAll();
    }
}
