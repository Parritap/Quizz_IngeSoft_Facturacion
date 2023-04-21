package model_v2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Factura {
    private int id;
    private Pedido pedido;
    private ListadoDetallesProducto listadoDetallesProducto;
    private TipoCompra tipoCompra;
}
