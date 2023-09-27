package pe.edu.upc.foodsaver_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.foodsaver_backend.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository <Role, Long>{

}
