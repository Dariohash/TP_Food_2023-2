package pe.edu.upc.foodsaver_backend.dtos;

import pe.edu.upc.foodsaver_backend.entities.Plato;

public class RestauranteDTO {
    private int id;
    private String nombre;
    private double precio;
    private String descripcion;
    private Plato plato;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

   public void setPrecio(double precio) {
      this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }
}

