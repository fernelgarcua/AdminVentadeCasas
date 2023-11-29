package co.com.edu.admin_venta_casas.services;

import co.com.edu.admin_venta_casas.repositories.entities.VisitaEntity;

public interface VisitaService {
    
        VisitaEntity findById(Long id);
        
}
