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

import co.com.edu.admin_venta_casas.repositories.entities.VisitaEntity;
import co.com.edu.admin_venta_casas.services.impl.VisitaServiceImpl;

@RestController
@RequestMapping("/visita")
public class VisitaController {

    @Autowired 
    private VisitaServiceImpl visitaService;

    @GetMapping
    public Iterable<VisitaEntity> getVisitals()
    {
        return visitaService.findAll();
    }

    @GetMapping("/{id}")
    public VisitaEntity findById(@PathVariable Long id)
    {
        return visitaService.findById(id);
    }

    @PostMapping("/{idOficina}")
    public VisitaEntity save(@PathVariable Long idOficina, @RequestBody VisitaEntity visita)
    {
        return visitaService.save(visita, idOficina);
    }

    @PutMapping("/{id}/{idOficina}")
    public VisitaEntity update(@RequestBody VisitaEntity visita, @PathVariable Long id, @PathVariable Long idOficina)
    {
        return visitaService.update(visita, id, idOficina);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id)
    {
        visitaService.delete(id);
    }
}