package model_v2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
    private String nombre;
    private String telefono;
    private Registro registro;
}
