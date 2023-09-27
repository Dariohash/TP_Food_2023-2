package pe.edu.upc.foodsaver_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.foodsaver_backend.entities.Cliente;
import pe.edu.upc.foodsaver_backend.entities.Orden;
import pe.edu.upc.foodsaver_backend.repositories.IOrdenRepository;
import pe.edu.upc.foodsaver_backend.serviceinterfaces.IOrdenService;

import java.util.List;

@Service
public class OrdenServiceImplement implements IOrdenService {
    @Autowired
    private IOrdenRepository oR;


    @Override
    public void insert(Orden orden) {
        oR.save(orden);
    }

    @Override
    public List<Orden> list() {
        return oR.findAll();
    }

    @Override
    public void delete(int idOrden) {
        oR.deleteById(idOrden);
    }

    @Override
    public Orden listId(int idOrden) {
        return oR.findById(idOrden).orElse(new Orden());
    }


}
