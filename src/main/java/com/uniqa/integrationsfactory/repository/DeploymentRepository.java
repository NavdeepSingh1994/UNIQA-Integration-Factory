package com.uniqa.integrationfactory.repository;

import com.uniqa.integrationfactory.model.Deployment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeploymentRepository extends JpaRepository<Deployment, Long> {
}
