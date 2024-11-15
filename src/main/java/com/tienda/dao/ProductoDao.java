package com.tienda.dao;

/**
 *
 * @author juankaguillen
 */
import com.tienda.domain.Categoria;
import com.tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository <Producto,Long> {
    
}