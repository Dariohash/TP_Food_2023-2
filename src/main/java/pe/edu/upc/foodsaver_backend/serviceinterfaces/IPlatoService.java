package pe.edu.upc.foodsaver_backend.serviceinterfaces;

import pe.edu.upc.foodsaver_backend.entities.Plato;

import java.util.List;

public interface IPlatoService {
    public void insert(Plato plato);
    public List<Plato> list();
    public void delete(int idPlato);
    void update(Plato plato);
}
