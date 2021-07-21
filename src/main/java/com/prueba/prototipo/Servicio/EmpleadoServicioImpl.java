package com.prueba.prototipo.Servicio;

import com.prueba.prototipo.Modelos.Empleado;
import com.prueba.prototipo.ODA.EmpleadoODA;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Aron
 */

//Si no se pone service aparece un mensaje de error
//Parameter 0 of constructor required a bean of type
@Service
public class EmpleadoServicioImpl implements EmpleadoServicio{
    
    @Autowired
    protected EmpleadoODA empleadoODA;

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> listaEmpleados() {
        return (List<Empleado>)empleadoODA.findAll();
    }
    
    @Override
    @Transactional
    public Empleado agregarEmpleado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarEmpleado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public Empleado actualizarEmpleado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
