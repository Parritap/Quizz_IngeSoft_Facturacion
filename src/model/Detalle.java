package model;

public class Detalle {
    private String codigoProducto = "";
    private String descripcion = "";
    private String valorUnitario ="";
    private int cantidad = 1;
    private float descuento;
    private float iva;
    private float valorTotal;

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Detalle(String codigoProducto, String descripcion, String valorUnitario, int cantidad, float descuento, float iva, float valorTotal) {
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.valorUnitario = valorUnitario;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.iva = iva;
        this.valorTotal = valorTotal;
    }
}
