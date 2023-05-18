package co.vinni.joyagold.repositories;

import co.vinni.joyagold.entities.Material;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MaterialRepository extends JpaRepository<Material, Long>,  JpaSpecificationExecutor<Material> {
}
