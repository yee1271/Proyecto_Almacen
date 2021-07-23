package com.prueba.prototipo.Modelos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;


@Entity
@Data
@Table(name ="empleado")
public class Empleado implements Serializable{
    
    private final static Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected Long dniEmpleado;
    
    @NotEmpty
    protected String nombreEmpleado;
    
    @NotEmpty
    protected String apellidoEmpleado;
    
    @NotEmpty
    protected int telefonoEmpleado;
    
    @NotEmpty
    protected char sexoEmpleado;
    
    protected int fechaNacimiento;
    
    @NotEmpty
    protected String direccion;
    
    @ManyToOne
    @JoinColumn(name = "cod_almacen")
    protected Almacen codAlmacen;
    

}
