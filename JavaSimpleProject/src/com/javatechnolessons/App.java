package com.javatechnolessons;

import com.javatechnolessons.model.Persona;
import com.javatechnolessons.services.IPersonaService;
import com.javatechnolessons.services.PersonaServiceImpl;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Persona pers1 = new Persona(1, "Pepe");
        IPersonaService personaService = new PersonaServiceImpl();
        personaService.registrar(pers1);
    }
}
