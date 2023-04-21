package model_v2;

import java.util.ArrayList;

/**
 * Un Cliente tiene un Registro al por mayor
 * Un Cliente tiene un Registro al detal
 * Un Pedido tiene un Listado de Detalles Producto
 * Una Factura está asociada a un Pedido
 * Un Pedido está asociado a una o más Facturas
 * Una Factura está asociada al Listado de Detalles Producto de la Factura
 * Un Cliente tiene asociado uno o más Pedidos
 * Un Cliente tiene asociado una o más Facturas
 * Un Listado de Detalles Producto tiene uno o más DetalleProducto
 * Un DetalleProducto está asociado a un Producto.
 */


public class Domain {

   private ArrayList<Cliente> clientes;
   private ArrayList<Pedido> pedidos;
   private ArrayList<Factura> facturas;
   private ArrayList<Producto> productos;


}
