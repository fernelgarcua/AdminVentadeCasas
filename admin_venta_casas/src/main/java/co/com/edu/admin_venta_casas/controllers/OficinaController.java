package co.com.edu.admin_venta_casas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.edu.admin_venta_casas.repositories.entities.InmuebleEntiti;
import co.com.edu.admin_venta_casas.repositories.entities.OficinaEntity;
import co.com.edu.admin_venta_casas.services.InmuebleService;
import co.com.edu.admin_venta_casas.services.OficinaService;

@RestController
@RequestMapping("/oficina")
public class OficinaController {

    @Autowired
    private OficinaService oficinaService;

    @Autowired 
    private InmuebleService inmuebleService;

    @GetMapping("/{id}")
    public OficinaEntity findById(@PathVariable Long id)
    {
        return oficinaService.findById(id);
    }

    @PostMapping("/{idOficina}/{idInmueble}")
    public InmuebleEntiti save(@PathVariable Long idOficina, @PathVariable Long idVisita, @RequestBody InmuebleEntiti inmueble)
    {
        return inmuebleService.save(inmueble, idOficina, idVisita);
    }
    
}
