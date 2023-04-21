package model_v2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pedido {
       private ListadoDetallesProducto listadoDetallesProducto;
       TipoCompra tipoCompra;
}
