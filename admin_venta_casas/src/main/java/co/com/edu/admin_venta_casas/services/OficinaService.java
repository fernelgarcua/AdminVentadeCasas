package co.com.edu.admin_venta_casas.services;

import co.com.edu.admin_venta_casas.repositories.entities.OficinaEntity;

public interface OficinaService {

    OficinaEntity findById(Long id);
    
}
