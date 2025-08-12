package com.uniqa.integrationfactory.service;

import com.uniqa.integrationfactory.model.Deployment;
import com.uniqa.integrationfactory.repository.DeploymentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Service
public class DeploymentService {

    private final DeploymentRepository repo;
    private final Random random = new Random();

    public DeploymentService(DeploymentRepository repo) {
        this.repo = repo;
    }

    public Deployment deploy(String packageName, String version, String environment) {
        Deployment d = new Deployment();
        d.setPackageName(packageName);
        d.setVersion(version);
        d.setEnvironment(environment);

        // Simulierte Ausführung
        boolean ok = random.nextBoolean();
        d.setStatus(ok ? "SUCCESS" : "FAILURE");
        d.setDurationMs(1000L + random.nextInt(5000)); // 1-6s
        d.setDeployedAt(LocalDateTime.now());

        return repo.save(d);
    }

    public List<Deployment> getAll() {
        return repo.findAll();
    }

    public double getSuccessRate() {
        long total = repo.count();
        if (total == 0) return 0.0;
        long success = repo.findAll().stream().filter(d -> "SUCCESS".equalsIgnoreCase(d.getStatus())).count();
        return (success * 100.0) / total;
    }

    public long getFailedCount() {
        return repo.findAll().stream().filter(d -> "FAILURE".equalsIgnoreCase(d.getStatus())).count();
    }

    public long getTotalCount() {
        return repo.count();
    }

    public long getAvgDurationMs() {
        return (long) repo.findAll()
                .stream()
                .mapToLong(d -> d.getDurationMs() == null ? 0L : d.getDurationMs())
                .filter(v -> v > 0)
                .average()
                .orElse(0.0);
    }
}
