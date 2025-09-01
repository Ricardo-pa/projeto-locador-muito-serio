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
        this.alugado = false;
        
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
public void setPortas(int portas) {
        this.portas = portas;
    }
    
    public void setCapacidadePortaMalas(int capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }
    
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    
    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }
    
    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }
    
    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    

    public void setAll(String nome, String marca, String modelo, int ano, String placa,
                      int portas, int capacidadePortaMalas, String tipoCombustivel,
                      boolean arCondicionado, boolean cambioAutomatico) {
       
        setNome(nome);
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setPlaca(placa);
        
        
        setPortas(portas);
        setCapacidadePortaMalas(capacidadePortaMalas);
        setTipoCombustivel(tipoCombustivel);
        setArCondicionado(arCondicionado);
        setCambioAutomatico(cambioAutomatico);
    }
}
