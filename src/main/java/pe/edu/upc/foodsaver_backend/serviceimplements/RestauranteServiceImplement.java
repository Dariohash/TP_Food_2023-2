package pe.edu.upc.foodsaver_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.foodsaver_backend.entities.Restaurante;
import pe.edu.upc.foodsaver_backend.repositories.IRestauranteRepository;
import pe.edu.upc.foodsaver_backend.serviceinterfaces.IRestauranteService;

import java.util.List;

@Service
public class RestauranteServiceImplement implements IRestauranteService {
    @Autowired
    private IRestauranteRepository rR;

    @Override
    public void insert(Restaurante restaurante) {
        rR.save(restaurante);
    }

    @Override
    public List<Restaurante> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int idRestaurante) {
        rR.deleteById(idRestaurante);
    }

    @Override
    public Restaurante listId(int idRestaurante) {
        return rR.findById(idRestaurante).orElse(new Restaurante());
    }

}
