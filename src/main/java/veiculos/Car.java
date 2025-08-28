/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculos;

public class Car extends Veiculo{
    
    private int portas;
    private int capacidadePortaMalas;
    private String tipoCombustivel;
    private boolean arCondicionado;
    private boolean cambioAutomatico;
    private boolean alugado;
    
    public Car(String nome, String Marca, String modelo, int ano, String placa, int portas, int capacidadePortaMalas, String tipoCombustivel, boolean arCondicionado, boolean cambioAutomatico){
        super(nome, Marca, modelo, ano, placa);
        this.portas = portas;
        this.capacidadePortaMalas = capacidadePortaMalas;
        this.tipoCombustivel = tipoCombustivel;
        this.arCondicionado = arCondicionado;
        this.cambioAutomatico = cambioAutomatico;
        
}
    public int getPortas() {
    return portas;
}

public int getCapacidadePortaMalas() {
    return capacidadePortaMalas;
}

public String getTipoCombustivel() {
    return tipoCombustivel;
}

public boolean getArCondicionado() {
    return arCondicionado;
}

public boolean getCambioAutomatico() {
    return cambioAutomatico;
}

public boolean getAlugado() {
    return alugado;
}
}
