package pe.edu.upc.foodsaver_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.foodsaver_backend.entities.Role;
import pe.edu.upc.foodsaver_backend.repositories.RoleRepository;
import pe.edu.upc.foodsaver_backend.serviceinterfaces.IRoleService;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private RoleRepository rR;

    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public List<Role> list() {
        //TODO Auto-generated method stub
        return rR.findAll();
    }
}
