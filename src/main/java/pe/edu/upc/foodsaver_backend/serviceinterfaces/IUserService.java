package pe.edu.upc.foodsaver_backend.serviceinterfaces;

import pe.edu.upc.foodsaver_backend.entities.Users;

import java.util.List;

public interface IUserService {
    public Integer insert(Users user);

    List<Users> list();
}
