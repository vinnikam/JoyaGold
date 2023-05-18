package co.vinni.joyagold.repositories;

import co.vinni.joyagold.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductoRepository extends JpaRepository<Producto, Long>,  JpaSpecificationExecutor<Producto> {
}
