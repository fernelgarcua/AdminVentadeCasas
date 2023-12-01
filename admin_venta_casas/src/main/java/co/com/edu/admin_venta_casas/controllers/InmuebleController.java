package co.com.edu.admin_venta_casas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.edu.admin_venta_casas.repositories.entities.InmuebleEntiti;
import co.com.edu.admin_venta_casas.services.InmuebleService;

@RestController
@RequestMapping("/inmueble")
public class InmuebleController {

    @Autowired 
    private InmuebleService inmuebleService;

    @GetMapping("/{id}")
    public InmuebleEntiti findById(@PathVariable Long id)
    {
        return inmuebleService.findByid(id);
    }

    @PostMapping("/{idOficina}/{idVisita}")
    public InmuebleEntiti save(@PathVariable Long idOficina, @RequestBody InmuebleEntiti inmueble)
    {
        return inmuebleService.save(inmueble, idOficina);
    }
    
}