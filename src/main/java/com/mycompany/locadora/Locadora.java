/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.locadora;
import veiculos.Car;
import veiculos.*;
import java.util.*;
import javax.swing.JOptionPane;
import jframes.TelaEscolha;
import jframes.TelaRegistrarCarro;

/**
 *
 * @author ricardo.parreira
 */
public class Locadora {
    public static List<Veiculo> veiculos = new ArrayList<>();

    public static void main(String[] args) {
         
         String[] option = {"registrar veiculo" , "ver veiculos", "alugar veiculo","devolver veiculo" ,"sair" };
         boolean rodando = true;
         
         
         JOptionPane.showMessageDialog(null, "bem vindo a locadora");
         while(rodando){
             
         
         int escolha = JOptionPane.showOptionDialog(null,
                 "Escolha uma opção",
                 "Menu Principal",
                 JOptionPane.DEFAULT_OPTION,
                 JOptionPane.PLAIN_MESSAGE,
                 null,
                 option,
                 option[0]);
         
         
         switch(escolha){
             case 0: RegistarVeiculo(); break;
             case 1: if(!veiculos.isEmpty()) {
            Veiculo primeiroCarro = veiculos.get(0);
            JOptionPane.showMessageDialog(null, 
                "Primeiro carro da lista:\n" +
                "Nome: " + primeiroCarro.getNome() + "\n" +
                "Marca: " + primeiroCarro.getMarca() + "\n" +
                "Modelo: " + primeiroCarro.getModelo());
        } else {
            JOptionPane.showMessageDialog(null, "Lista vazia!");
        }
        break;
         }
             
                 
         }
    }
    private static void RegistarVeiculo(){
        TelaEscolha tela = new TelaEscolha();
             String NewVeiculo = tela.getVeiculoSelecionado();
             
             while(NewVeiculo == null){
             tela.setVisible(true);
             while(tela.isVisible()){
                 Thread.onSpinWait();
             }
             NewVeiculo = tela.getVeiculoSelecionado();
             
             if(NewVeiculo == null) {
                 JOptionPane.showMessageDialog(null, "digite um valor valido");
             };
             }
             if("Carro".equals(NewVeiculo) ){
                 TelaRegistrarCarro TelaCar = new TelaRegistrarCarro();
                  String Nome, Marca,Modelo, Ano, Placa, Portas,Combus,Ar,Cambio,CapPoMa;
                  Nome = TelaCar.getnome();
                  Marca = TelaCar.getMarca();
                  Modelo = TelaCar.getModelo();
                  Ano = TelaCar.getAno();
                  Portas = TelaCar.getPortas();
                  Ar = TelaCar.getAr();
                  Cambio = TelaCar.getCambio();
                  Combus = TelaCar.getCombus();
                  CapPoMa = TelaCar.getCapPoMa();
                  Placa = TelaCar.getPlaca();
                  while(Nome == null||Marca == null|| Modelo == null|| Ano == null|| Portas == null|| Ar == null|| Cambio == null||CapPoMa == null  ){
                      TelaCar.setVisible(true);
                      while(TelaCar.isVisible()){
                          Thread.onSpinWait();
                      }
                      
                      Nome = TelaCar.getnome();
                  Marca = TelaCar.getMarca();
                  Modelo = TelaCar.getModelo();
                  Ano = TelaCar.getAno();
                  Portas = TelaCar.getPortas();
                  Ar = TelaCar.getAr();
                  Cambio = TelaCar.getCambio();
                  Combus = TelaCar.getCombus();
                  CapPoMa = TelaCar.getCapPoMa();
                   Placa = TelaCar.getPlaca();
                  if(Nome == null||Marca == null|| Modelo == null|| Ano == null|| Portas == null|| Ar == null|| Cambio == null||CapPoMa == null){
                      JOptionPane.showMessageDialog(null, "digite valores validos!");
                  }
                  int anoInt = Integer.parseInt(Ano);
                  int portasInt = Integer.parseInt(Portas.replace(" Portas", "").trim());
                  int capacidadePortaMalasInt = Integer.parseInt(CapPoMa);
                  boolean arCondicionado = "Sim".equalsIgnoreCase(Ar) || "true".equalsIgnoreCase(Ar);
                  boolean cambioAutomatico = "Automatico".equalsIgnoreCase(Cambio);
                 Car NewCarStance = new Car(Nome, Marca, Modelo, anoInt, Placa, portasInt, capacidadePortaMalasInt, Combus, arCondicionado, cambioAutomatico);
                  veiculos.add(NewCarStance);
                    
                    JOptionPane.showMessageDialog(null, "Carro registrado com sucesso!");
                    
                  
                    
                         
                    
                    
                  
            
            }
                  
        }
    }
    
}

    


