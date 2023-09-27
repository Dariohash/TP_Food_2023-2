package pe.edu.upc.foodsaver_backend.serviceinterfaces;

import pe.edu.upc.foodsaver_backend.entities.Cliente;

import java.util.List;

public interface IClienteService {
    public void insert (Cliente cliente);   //insertar cliente
    public List<Cliente> list();            //Listar cliente
    public void delete (int idCliente);     //Eliminar cliente por id
    public Cliente listId(int idCliente);  //Listar cliente por id
}
