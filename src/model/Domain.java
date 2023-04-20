package model;

import java.util.ArrayList;

public class Domain {

    private ArrayList<Factura> listaFacturas = new ArrayList<>();
    private ArrayList<Cliente> listaClientes = new ArrayList<>();


    /**
     * <h1> FUNCIONALIDAD</h1>
     *
     * <p> Esta funcionalidad tiene la capacidad de filtrar todas las
     * facturas segun el NIT de un cliente dado</p>
     * @param nit Nit del cliente
     * @return Lista de facturas del cliente especificado.
     */
    public ArrayList<Factura> filtrarFacturasPorNIT (String nit){
        System.out.println(listaClientes);

        ArrayList<Factura> auxListaFacturas = new ArrayList<>();

        for (Factura f : this.listaFacturas){
            if (f.getCliente().getNit().equals(nit)) auxListaFacturas.add(f);
        }
        return auxListaFacturas;
    }

    /* Populamos los datos del Domain*/





    public ArrayList<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(ArrayList<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
}
