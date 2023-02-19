package com.tienda.tienda.repository;

import com.tienda.tienda.entity.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kevin
 */
@Repository
public interface PaisRepository extends CrudRepository<Pais, Long>{
    
}
