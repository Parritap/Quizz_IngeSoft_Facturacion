package model;

public class Singleton {

    //Make a singleton with a unique instance of Domain
    private static Singleton instance = null;
    private final Domain domain;

    private Singleton(){
        domain = new Domain();
        populateData();
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public Domain getDomain(){
        return domain;
    }


    private void populateData (){

        Cliente c1= new Cliente("Juan Perez", "1111", "Calle 123", "555-1234", "Ciudad 1");
        Factura factura1 = new Factura();
        factura1.setNumero(1001);
        factura1.setCliente(c1);

        this.domain.getListaClientes().add(c1);
        this.domain.getListaFacturas().add(factura1);


        Cliente c2 = new Cliente("Maria Gomez", "2222", "Calle 456", "555-5678", "Ciudad 2");
        Factura factura2 = new Factura();
        factura2.setNumero(1002);
        factura2.setCliente(c2);

        this.domain.getListaClientes().add(c2);
        this.domain.getListaFacturas().add(factura2);

    }
}
