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
         this.alugado = false;
        
        
        
    }
    public int getCilindradas() {
        return cilindradas;
    }

    public String getTipoPartida() {
        return tipoPartida;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public String getGuidon() {
        return guidon;
    }

    public boolean isAlugado() {
        return alugado;
    }
    public void setCilindradas(int cilindradas) {
    this.cilindradas = cilindradas;
}

public void setTipoPartida(String tipoPartida) {
    this.tipoPartida = tipoPartida;
}

public void setCombustivel(String combustivel) {
    this.combustivel = combustivel;
}

public void setTipoFreio(String tipoFreio) {
    this.tipoFreio = tipoFreio;
}

public void setGuidon(String guidon) {
    this.guidon = guidon;
}

public void setAlugado(boolean alugado) {
    this.alugado = alugado;
}

// Método setAll que utiliza todos os setters na ordem do construtor
public void setAll(String nome, String marca, String modelo, int ano, String placa,
                  int cilindradas, String tipoPartida, String combustivel, 
                  String tipoFreio, String guidon) {
    // Usando os setters da classe pai (Veiculo)
    setNome(nome);
    setMarca(marca);
    setModelo(modelo);
    setAno(ano);
    setPlaca(placa);
    
    // Usando os setters da classe Moto
    setCilindradas(cilindradas);
    setTipoPartida(tipoPartida);
    setCombustivel(combustivel);
    setTipoFreio(tipoFreio);
    setGuidon(guidon);
}
    
}

