/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculos;

/**
 *
 * @author ricardo.parreira
 */
public class Moto extends Veiculo {
   private int cilindradas;
    private String tipoPartida;
    private String combustivel;
    private String tipoFreio;
    private String guidon;
    private boolean alugado;
    
    public Moto(String nome, String Marca, String modelo, int ano, String placa, int cilindradas, String tipoPartida, String combustivel, String tipoFreio, String guidon){
        super(nome, Marca, modelo, ano, placa);
        this.cilindradas = cilindradas;
        this.tipoPartida = tipoPartida;
        this.combustivel = combustivel;
        this.tipoFreio = tipoFreio;
        this.guidon = guidon;
        
        
        
    }
    
}

