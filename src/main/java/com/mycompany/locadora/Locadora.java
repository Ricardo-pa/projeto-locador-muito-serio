/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.locadora;
import veiculos.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ricardo.parreira
 */
public class Locadora {

    public static void main(String[] args) {
         List<veiculo> veiculos = new ArrayList<>();
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
             case 0: 
             
         }
                 
         }
    }
}
