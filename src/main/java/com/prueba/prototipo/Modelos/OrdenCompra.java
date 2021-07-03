package com.prueba.prototipo.Modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Aron
 */
@Entity
@Data
//@Table(name ="almacen")
public class OrdenCompra {
    
    private final static Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected Long codCompra;
    
    
}
