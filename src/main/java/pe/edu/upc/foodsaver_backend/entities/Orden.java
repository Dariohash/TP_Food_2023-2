package pe.edu.upc.foodsaver_backend.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "orden")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;
    @Column(name = "precio", nullable = false)
    private double precio;
    @ManyToOne
    @JoinColumn(name ="idrestaurante")
    private Restaurante restaurante;
    @ManyToOne
    @JoinColumn(name ="idcliente")
    private Cliente cliente;


    public Orden() {
    }

    public Orden(int id, LocalDate fecha, double precio, Restaurante restaurante, Cliente cliente) {
        this.id = id;
        this.fecha = fecha;
        this.precio = precio;
        this.restaurante = restaurante;
        this.cliente = cliente;
    }

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
