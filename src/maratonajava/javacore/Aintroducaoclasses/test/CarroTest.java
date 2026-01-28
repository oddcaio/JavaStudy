package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {

    // Crie uma classe carro com os seguintes atributos
    // Nome
    // Marca
    // Ano
    // Em seguida, crie dois objetis distintos e imprima seus valores
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Dolphin";
        carro1.marca = "BYD";
        carro1.ano = 2024;

        carro2.nome = "Hrv";
        carro2.marca = "Honda";
        carro2.ano = 2022;

        carro1=carro2;

        carro1.Imprimir();
        carro2.Imprimir();
    }
}
