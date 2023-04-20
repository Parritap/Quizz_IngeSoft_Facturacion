package controller;


import com.sun.javafx.image.IntPixelGetter;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Funcionalidad {

    Singleton singleton = Singleton.getInstance();
    Domain domain = singleton.getDomain();

    @FXML
    private Button btn_bucar;

    @FXML
    private TableColumn<Factura, String> col_nombreCliente;

    @FXML
    private TableColumn<Factura, Integer> col_numeroFactura;

    @FXML
    private TableView<Factura> table;

    @FXML
    private TextField txtLabel_nit;

    @FXML
    void buscarFacturas(ActionEvent event) {
        // Get the value of the nit TextField
        String nit = txtLabel_nit.getText();

        // Filter the list of Factura objects by the nit value
        List<Factura> filteredFacturas = this.domain.filtrarFacturasPorNIT(nit);
        System.out.println(filteredFacturas);

        // Clear the existing items in the table
        table.getItems().clear();

        // Add the filtered Factura objects to the table
        table.getItems().addAll(filteredFacturas);
        table.refresh();
    }


    private ObservableList<Factura> facturas;

    public void initialize() {
        facturas = FXCollections.observableArrayList(domain.getListaFacturas());
        col_nombreCliente.setCellValueFactory(new PropertyValueFactory<>("cliente"));
        col_numeroFactura.setCellValueFactory(new PropertyValueFactory<>("numero"));
        table.setItems(facturas);
    }


}
