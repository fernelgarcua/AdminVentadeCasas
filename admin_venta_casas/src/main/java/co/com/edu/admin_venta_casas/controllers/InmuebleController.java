package co.com.edu.admin_venta_casas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping
    public Iterable<InmuebleEntiti> getInmuebles()
    {
        return inmuebleService.findAll();
    }

    @GetMapping("/{id}")
    public InmuebleEntiti findById(@PathVariable Long id)
    {
        return inmuebleService.findByid(id);
    }

    @PostMapping("/{idOficina}")
    public InmuebleEntiti save(@PathVariable Long idOficina, @RequestBody InmuebleEntiti inmueble)
    {
        return inmuebleService.save(inmueble, idOficina);
    }

    @PutMapping("/{id}/{idOficina}")
    public InmuebleEntiti update(@RequestBody InmuebleEntiti inmueble, @PathVariable Long id, @PathVariable Long idOficina)
    {
        return inmuebleService.update(inmueble, id, idOficina);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id)
    {
        inmuebleService.delete(id);
    }
    
}