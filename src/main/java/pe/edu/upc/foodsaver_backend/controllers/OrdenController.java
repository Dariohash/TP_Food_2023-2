package pe.edu.upc.foodsaver_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.foodsaver_backend.dtos.OrdenDTO;
import pe.edu.upc.foodsaver_backend.entities.Orden;
import pe.edu.upc.foodsaver_backend.serviceinterfaces.IOrdenService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/orden")
public class OrdenController {
    @Autowired
    private IOrdenService oS;

    @PostMapping
    public void resgistar(@RequestBody OrdenDTO ordendto){
        ModelMapper m = new ModelMapper();
        Orden o = m.map(ordendto,Orden.class);
        oS.insert(o);
    }

    @GetMapping
    public List<OrdenDTO> listar(){
        return oS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return  m.map(x, OrdenDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar (@PathVariable("id") Integer id){
        oS.delete(id);
    }

    @GetMapping("/{id}")
    public OrdenDTO listaId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        OrdenDTO dto = m.map(oS.listId(id),OrdenDTO.class);
        return dto;
    }
}
