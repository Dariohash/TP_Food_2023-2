package pe.edu.upc.foodsaver_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.foodsaver_backend.dtos.ClienteDTO;
import pe.edu.upc.foodsaver_backend.dtos.PlatoDTO;
import pe.edu.upc.foodsaver_backend.dtos.RestauranteDTO;
import pe.edu.upc.foodsaver_backend.entities.Plato;
import pe.edu.upc.foodsaver_backend.entities.Restaurante;
import pe.edu.upc.foodsaver_backend.serviceinterfaces.IRestauranteService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {
    @Autowired
    private IRestauranteService rS;

    @PostMapping
    public void resgistar(@RequestBody RestauranteDTO restaurantedto){
        ModelMapper m = new ModelMapper();
        Restaurante p = m.map(restaurantedto, Restaurante.class);
        rS.insert(p);
    }
    @GetMapping
    public List<RestauranteDTO> listar(){
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return  m.map(x, RestauranteDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        rS.delete(id);
    }

    @GetMapping("/{id}")
    public RestauranteDTO listaId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        RestauranteDTO dto = m.map(rS.listId(id),RestauranteDTO.class);
        return dto;
    }
    
}
