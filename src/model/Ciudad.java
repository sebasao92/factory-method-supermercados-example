package model;

import factory.SupermercadoFactory;

public class Ciudad {

    private Supermercado supermercado;

    public Ciudad(SupermercadoFactory supermercadoFactory){
        this.supermercado = supermercadoFactory.crearSupermercado();
    }
}
