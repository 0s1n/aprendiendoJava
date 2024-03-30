package com.javatechnolessons.services;

import com.javatechnolessons.model.Persona;

public class PersonaServiceImpl implements IPersonaService {

    @Override
    public void registrar(Persona persona) {
        System.out.println(persona + " registrada");
    }
    
}
