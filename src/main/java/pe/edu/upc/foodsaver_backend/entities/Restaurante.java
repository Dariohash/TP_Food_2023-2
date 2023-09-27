package pe.edu.upc.foodsaver_backend.entities;


import javax.persistence.*;

@Entity
@Table(name="retaurante")
public class Restaurante {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre", length = 60, nullable = false)
    private String nombre;
    @Column(name = "precio",  nullable = false)
    private double precio;
    @Column(name = "descripcion", length = 60, nullable = false)

    private String descripcion;
    @ManyToOne                        //Para relacion de muchos a entidades que quieres relacionar
    @JoinColumn(name = "idplato")     //especificamos la tabla en la que queremos relacionarnos
    private Plato plato;

    public Restaurante() {
    }

    public Restaurante(int id, String nombre, double precio, String descripcion, Plato plato) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.plato = plato;
    }

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
