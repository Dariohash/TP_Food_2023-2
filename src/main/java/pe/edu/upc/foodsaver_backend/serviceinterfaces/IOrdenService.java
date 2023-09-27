package pe.edu.upc.foodsaver_backend.serviceinterfaces;

import pe.edu.upc.foodsaver_backend.entities.Cliente;
import pe.edu.upc.foodsaver_backend.entities.Orden;

import java.util.List;

public interface IOrdenService {
    public void insert (Orden orden);   //insertar cliente
    public List<Orden> list();            //Listar cliente
    public void delete (int idOrden);     //Eliminar cliente por id
    public Orden listId(int idOrden);  //Listar cliente por id
}
