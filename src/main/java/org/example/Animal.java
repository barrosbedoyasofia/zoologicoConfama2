package org.example;

public class Animal {
    //ATRIBUTOS
    protected Integer edad;
    String nombre;
    private String especie;
    Double peso;
    Double estatura;
    String colorPredominnte;
    Boolean genero;
    Integer numeroPatas;
    String dieta;
    String clasificacion;// domestico o salvaje


    // METODOS ESPECIALES

    public Animal() {
    }

    public Animal(Integer edad, String nombre, String especie, Double peso, Double estatura, String colorPredominnte, Boolean genero, Integer numeroPatas, String dieta, String clasificacion) {
        this.edad = edad;
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.estatura = estatura;
        this.colorPredominnte = colorPredominnte;
        this.genero = genero;
        this.numeroPatas = numeroPatas;
        this.dieta = dieta;
        this.clasificacion = clasificacion;
    }
    // METODOS ORDINARIOS
}
