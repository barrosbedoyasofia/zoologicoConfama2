package org.example;

import org.example.clases.Familia;

public class Main {
    public static void main(String[] args) {

        //En el main usamos las clases que nosotros programamos

        Integer notafinal = 5;

        //Para usar una clase debo crear UN OBJETO de LA CLASE
        //UN OBJETO en cualquier lenguaje ES UNA VARIABLE
        Animal objetoAnimal = new Animal();
        //Si ya tengo un objeto lo uso para acceder a los atributos y metodos de una clase
        objetoAnimal.nombre="caballo";
        objetoAnimal.edad=10;



        Familia familia = new Familia();

    }
}