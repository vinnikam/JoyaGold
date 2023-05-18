package co.vinni.joyagold.repositories;

import co.vinni.joyagold.entities.TipoProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TipoProductoRepository extends JpaRepository<co.vinni.joyagold.entities.TipoProducto, Long>, JpaSpecificationExecutor<TipoProducto> {
}
