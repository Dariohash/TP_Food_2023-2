package pe.edu.upc.foodsaver_backend.entities;


import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre", length = 60, nullable = false)
    private String nombre;
    @Column(name = "correo", length = 60, nullable = false)
    private String correo;
    @Column(name = "contrasenia", length = 60, nullable = false)
    private String contrasenia;
    @Column(name = "telefono", length = 9, nullable = false)
    private String telefono;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String correo, String contrasenia, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.telefono = telefono;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
