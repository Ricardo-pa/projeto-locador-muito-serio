/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculos;

import java.util.*;
import javax.swing.JOptionPane;
import jframes.TelaRegistrarMoto;

public class MotoService {
    public static void RegistrarMoto(List<Veiculo> veiculos){
        while(true){
            TelaRegistrarMoto TelaMoto = new TelaRegistrarMoto();
            TelaMoto.setVisible(true);
            while (TelaMoto.isVisible()) {
                try {
                    Thread.sleep(100);
                }  catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            String Nome, Marca,Modelo,Ano,Placa,Cilindrada,Combustivel,Guidon,Partida,Freio;
                Nome = TelaMoto.getNome();
                Modelo = TelaMoto.getModelo();
                Marca = TelaMoto.getMarca();    
                Ano = TelaMoto.getAno();
                Placa = TelaMoto.getPlaca();
                Cilindrada = TelaMoto.getCilindrada();
                Combustivel = TelaMoto.getCombustivel();
                Guidon = TelaMoto.getGuidon();
                Partida = TelaMoto.getPartida();
                Freio = TelaMoto.getFreio();
                if (Nome == null) {
            JOptionPane.showMessageDialog(null, "Registro cancelado.");
            return;
                  }
                if (Nome.isEmpty() || Marca.isEmpty() || Modelo.isEmpty() || Ano.isEmpty() || 
            Placa.isEmpty()|| Cilindrada.isEmpty()|| Combustivel.isEmpty()|| Guidon.isEmpty()|| Partida == null|| Freio == null){
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
            continue;
                   }
                try {
                    int anoInt = Integer.parseInt(Ano);
                    int CilinInt = Integer.parseInt(Cilindrada);
                    Moto NewMotoStance = new Moto(Nome, Marca, Modelo, anoInt, Placa, CilinInt, Partida, Combustivel, Freio, Guidon);
                    veiculos.add(NewMotoStance);
                    JOptionPane.showMessageDialog(null, "Moto Registrada com sucesso!");
                    return;
                    
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro ao converter valores. Verifique os campos numéricos.");
            }
                }
        }
    }

    
                
                

                
            
                
                
            
        
    

