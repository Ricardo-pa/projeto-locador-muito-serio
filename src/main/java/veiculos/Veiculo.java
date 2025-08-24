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
    private String Marca; 
    private String Modelo; private int ano; 
    private String placa; 
    public Veiculo(String nome,String Marca,String Modelo,int ano, String placa){ 
        this.nome = nome; 
        this.Marca = Marca; 
        this.Modelo = Modelo; 
        this.ano = ano; 
        this.placa = placa; 
    } 
    public String getNome() {
        return nome;
    }
    
    public String getMarca() {
        return Marca;
    }
    
    public String getModelo() {
        return Modelo;
    }
    
    public int getAno() {
        return ano;
    }
    
    public String getPlaca() {
        return placa;
    }
}
