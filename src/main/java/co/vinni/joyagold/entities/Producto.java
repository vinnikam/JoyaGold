package co.vinni.joyagold.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Producto")
@Table(name = "PRODUCTOS")
public class Producto implements Serializable {
    @Serial
    private static final long serialVersionUID = -1359540121612959495L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCTOS_id_gen")
    @SequenceGenerator(name = "TIPO_PRODUCTO_id_gen", sequenceName = "SEQ_ID", initialValue = 4517223, allocationSize = 1)
    @Column(name = "PRO_CODIGO", nullable = false)
    private Long codigo;


    @Column(name = "PRO_NOMBRE", nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "mat_codigo", referencedColumnName = "mat_codigo")
    private Material material;


    @ManyToOne
    @JoinColumn(name = "tpr_codigo", referencedColumnName = "tpr_codigo")
    private TipoProducto tipo;


    @Column(name = "PRO_PRECIO", nullable = false)
    private long precio;

    @Column(name = "PRO_APLICADESCUENTO")
    private boolean aplicaDescuento;

    @Column(name = "PRO_VALORDESCUENTO")
    private double descuento;


}
