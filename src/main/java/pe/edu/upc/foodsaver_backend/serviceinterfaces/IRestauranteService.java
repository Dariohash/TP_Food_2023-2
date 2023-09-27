package pe.edu.upc.foodsaver_backend.serviceinterfaces;

import pe.edu.upc.foodsaver_backend.entities.Restaurante;

import java.util.List;

public interface IRestauranteService {
    public void insert(Restaurante restaurante);
    public List<Restaurante> list();
    public void delete (int idRestaurante);
    public Restaurante listId(int idRestaurante);
}
