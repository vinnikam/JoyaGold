package co.vinni.joyagold.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Material")
@Table(name = "MATERIALES")

public class Material implements Serializable {
    @Serial
    private static final long serialVersionUID = -1359540121612959495L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MATERIALES")
    @SequenceGenerator(name = "SEQ_MATERIALES", sequenceName = "SEQ_MATERIALES", initialValue = 4517223, allocationSize = 1)
    @Column(name = "MAT_CODIGO", nullable = false)
    private Long codigo;

    @Column(name = "MAT_NOMBRE", nullable = false)
    private String nombre;


}
