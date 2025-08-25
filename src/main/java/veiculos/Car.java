/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculos;

public class Car extends Veiculo{
    
    int portas;
    int capacidadePortaMalas;
    String tipoCombustivel;
    boolean arCondicionado;
    boolean cambioAutomatico;
    boolean alugado;
    
    public Car(String nome, String Marca, String modelo, int ano, String placa, int portas, int capacidadePortaMalas, String tipoCombustivel, boolean arCondicionado, boolean cambioAutomatico){
        super(nome, Marca, modelo, ano, placa);
        this.portas = portas;
        this.capacidadePortaMalas = capacidadePortaMalas;
        this.tipoCombustivel = tipoCombustivel;
        this.arCondicionado = arCondicionado;
        this.cambioAutomatico = cambioAutomatico;
        
}
}
