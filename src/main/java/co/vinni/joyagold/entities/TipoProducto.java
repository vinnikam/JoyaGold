package co.vinni.joyagold.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "TipoProducto")
@Table(name = "TIPO_PRODUCTOS")
public class TipoProducto implements Serializable {
    @Serial
    private static final long serialVersionUID = -1359540121612959495L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TIPO_PRODUCTO_id_gen")
    @SequenceGenerator(name = "TIPO_PRODUCTO_id_gen", sequenceName = "SEQ_ID", initialValue = 4517223, allocationSize = 1)
    @Column(name = "TPR_CODIGO", nullable = false)
    private Long codigo;

    @Column(name = "TPR_NOMBRE", nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "codigo")
    private List<Producto> productosList;
}
