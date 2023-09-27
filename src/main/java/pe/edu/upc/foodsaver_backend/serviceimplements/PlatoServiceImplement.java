package pe.edu.upc.foodsaver_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.foodsaver_backend.entities.Plato;
import pe.edu.upc.foodsaver_backend.repositories.IPlatoRepository;
import pe.edu.upc.foodsaver_backend.serviceinterfaces.IPlatoService;

import java.util.List;

@Service
public class PlatoServiceImplement implements IPlatoService {
    @Autowired
    private IPlatoRepository pR;

    @Override
    public void insert(Plato plato) {
        pR.save(plato);
    }

    @Override
    public List<Plato> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPlato) {
        pR.deleteById(idPlato);
    }

    @Override
    public void update(Plato plato) {
        pR.save(plato);
    }
}
