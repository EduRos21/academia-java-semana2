package com.javatechie.spring.batch.config;

import com.javatechie.spring.batch.entity.Empleado;
import org.springframework.batch.item.ItemProcessor;

public class EmpleadoProcessor implements ItemProcessor<Empleado, Empleado> {

    @Override
    public Empleado process(Empleado empleado) throws Exception {
        if(empleado.getGender().equals("Non-binary")) {
            return empleado;
        }else{
            return null;
        }
    }
}
