/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculos;

/**
 *
 * @author ricardo.parreira
 */
public class Veiculo { 
    private String nome; 
    private String marca; 
    private String modelo; private int ano; 
    private String placa; 
    public Veiculo(String nome,String Marca,String Modelo,int ano, String placa){ 
        this.nome = nome; 
        this.marca = Marca; 
        this.modelo = Modelo; 
        this.ano = ano; 
        this.placa = placa; 
    } 
    public String getNome() {
        return nome;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public int getAno() {
        return ano;
    }
    
    public String getPlaca() {
        return placa;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
