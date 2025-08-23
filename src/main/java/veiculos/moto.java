/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculos;

/**
 *
 * @author ricardo.parreira
 */
public class moto extends veiculo {
   private int cilindradas;
    private String tipoPartida;
    private boolean temBau;
    private String tipoFreio;
    private boolean guidonEsportivo;
    
    public moto(String nome, String Marca, String modelo, int ano, String placa, int cilindradas, String tipoPartida, boolean temBau, String tipoFreio, boolean guidonEsportivo){
        super(nome, Marca, modelo, ano, placa);
        this.cilindradas = cilindradas;
        this.tipoPartida = tipoPartida;
        this.temBau = temBau;
        this.tipoFreio = tipoFreio;
        this.guidonEsportivo = guidonEsportivo;
        
        
        
    }
    
}

