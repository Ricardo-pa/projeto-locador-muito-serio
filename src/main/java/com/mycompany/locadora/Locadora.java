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
         
         String[] option = {"registrar veiculos" , "ver veiculos", "editar veiculos" ,"alugar veiculos","devolver veiculos" ,"sair" };
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
             case 1: verListaVeiculos(veiculos); break;
             case 2: VeiculoService.EditarVeiculos(veiculos); break;
             case 3: VeiculoService.AlugarVeiculo(veiculos); break;
         }
             
                 
         }
    }
    private static void RegistrarVeiculo(){
        VeiculoService.RegistrarVeiculo(veiculos);
    }
    private static void verListaVeiculos(List<Veiculo> veiculos){
        VeiculoService.VerVeiculos(veiculos);
    }
    
}

    


