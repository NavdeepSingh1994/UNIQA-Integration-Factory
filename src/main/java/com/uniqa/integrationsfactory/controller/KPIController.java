package com.uniqa.integrationfactory.controller;

import com.uniqa.integrationfactory.service.DeploymentService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/kpis")
public class KPIController {

    private final DeploymentService service;

    public KPIController(DeploymentService service) {
        this.service = service;
    }

    /**
     * Beispielaufruf:
     * GET http://localhost:8080/kpis
     */
    @GetMapping
    public Map<String, Object> kpis() {
        return Map.of(
                "successRate", service.getSuccessRate(),
                "avgDurationMs", service.getAvgDurationMs(),
                "failedCount", service.getFailedCount(),
                "totalDeployments", service.getTotalCount()
        );
    }
}
