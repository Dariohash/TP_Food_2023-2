package pe.edu.upc.foodsaver_backend.serviceinterfaces;

import pe.edu.upc.foodsaver_backend.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role role);
    List<Role> list();
}
