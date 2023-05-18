package co.vinni.joyagold.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TipoProductoDto implements Serializable
{
    private Long codigo;
    private String nombre;
}
