package pe.edu.upc.foodsaver_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.foodsaver_backend.dtos.ClienteDTO;
import pe.edu.upc.foodsaver_backend.entities.Cliente;
import pe.edu.upc.foodsaver_backend.serviceinterfaces.IClienteService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private IClienteService cS;

    @PostMapping
    public void resgistar(@RequestBody ClienteDTO clientedto){
        ModelMapper m = new ModelMapper();
        Cliente c = m.map(clientedto,Cliente.class);
        cS.insert(c);
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('USUARIO','ADMINISTRADOR')")
    public List<ClienteDTO> listar(){
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return  m.map(x, ClienteDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar (@PathVariable("id") Integer id){
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public ClienteDTO listaId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        ClienteDTO dto = m.map(cS.listId(id),ClienteDTO.class);
        return dto;
    }
}
