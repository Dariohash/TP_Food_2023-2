package pe.edu.upc.foodsaver_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.foodsaver_backend.dtos.ClienteDTO;
import pe.edu.upc.foodsaver_backend.dtos.PlatoDTO;
import pe.edu.upc.foodsaver_backend.entities.Cliente;
import pe.edu.upc.foodsaver_backend.entities.Plato;
import pe.edu.upc.foodsaver_backend.serviceinterfaces.IPlatoService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/plato")
public class PlatoController {
    @Autowired
    private IPlatoService pS;
    @PostMapping
    public void resgistar(@RequestBody PlatoDTO platodto){
        ModelMapper m = new ModelMapper();
        Plato p = m.map(platodto,Plato.class);
        pS.insert(p);
    }

    @GetMapping
    public List<PlatoDTO> listar(){
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return  m.map(x, PlatoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar (@PathVariable("id") Integer id){
        pS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody PlatoDTO platodto){
        ModelMapper m = new ModelMapper();
        Plato p = m.map(platodto, Plato.class);
        pS.insert(p);
    }
}
