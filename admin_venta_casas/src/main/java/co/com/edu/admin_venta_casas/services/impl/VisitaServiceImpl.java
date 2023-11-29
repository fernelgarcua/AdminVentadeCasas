package co.com.edu.admin_venta_casas.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.edu.admin_venta_casas.repositories.VisitaRepository;
import co.com.edu.admin_venta_casas.repositories.entities.VisitaEntity;
import co.com.edu.admin_venta_casas.services.VisitaService;

@Service
public class VisitaServiceImpl implements VisitaService{

    @Autowired
    private VisitaRepository visitaRepository;

    @Override
    @Transactional(readOnly = true)
    public VisitaEntity findById(Long id){
        return visitaRepository.findById(id).orElse(null);
    }
    
}
