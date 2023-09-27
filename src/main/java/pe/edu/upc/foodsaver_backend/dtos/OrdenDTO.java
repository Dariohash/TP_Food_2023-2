package pe.edu.upc.foodsaver_backend.dtos;

import pe.edu.upc.foodsaver_backend.entities.Cliente;
import pe.edu.upc.foodsaver_backend.entities.Restaurante;

import java.time.LocalDate;

public class OrdenDTO {
    private int id;
    private LocalDate fecha;
    private double precio;
    private Restaurante restaurante;
    private Cliente cliente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
