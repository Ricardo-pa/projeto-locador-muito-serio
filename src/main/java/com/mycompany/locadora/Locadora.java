/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.locadora;
import veiculos.Veiculo;
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
             case 0: RegistrarVeiculo(); break;
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
    private static void RegistrarVeiculo(){
        VeiculoService.RegistrarVeiculo(veiculos);
    }
    
}

    


