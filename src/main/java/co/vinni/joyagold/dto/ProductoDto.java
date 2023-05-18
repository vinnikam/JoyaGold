package co.vinni.joyagold.dto;

import co.vinni.joyagold.entities.Material;
import co.vinni.joyagold.entities.TipoProducto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductoDto implements Serializable {
    private Long codigo;
    private String nombre;
    private Material material;
    private TipoProducto tipo;
    private long precio;
    private boolean aplicaDescuento;
    private double descuento;
}
