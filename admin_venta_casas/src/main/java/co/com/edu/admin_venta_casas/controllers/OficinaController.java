package co.com.edu.admin_venta_casas.controllers;

import co.com.edu.admin_venta_casas.services.impl.OficinaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import co.com.edu.admin_venta_casas.repositories.entities.InmuebleEntiti;
import co.com.edu.admin_venta_casas.repositories.entities.OficinaEntity;
import co.com.edu.admin_venta_casas.services.InmuebleService;
import co.com.edu.admin_venta_casas.services.OficinaService;

import java.util.List;

@RestController
@RequestMapping("/oficina")
public class OficinaController {

    @Autowired
    private OficinaServiceImpl oficinaService;

    @GetMapping
    public Iterable<OficinaEntity> getOficinas() {
        return oficinaService.findAll();
    }

    @GetMapping("/{id}")
    public OficinaEntity findById(@PathVariable Long id)
    {
        return oficinaService.findById(id);
    }

    @PostMapping
    public OficinaEntity createOficina(@RequestBody OficinaEntity oficina) {
        return oficinaService.save(oficina);
    }

    @PutMapping("/{id}")
    public OficinaEntity updateOficina(@PathVariable Long id, @RequestBody OficinaEntity oficina) {
        return oficinaService.update(oficina, id);
    }

    @DeleteMapping("/{id}")
    public void deleteOficina(@PathVariable Long id) {
        oficinaService.delete(id);
    }
}
