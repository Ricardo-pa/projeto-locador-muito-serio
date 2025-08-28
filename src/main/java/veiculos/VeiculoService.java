/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculos;

import java.util.*;
import javax.swing.JOptionPane;
import jframes.TelaEscolha;

/**
 *
 * @author Ricardo
 */
public class VeiculoService {
    public static void RegistrarVeiculo(List<Veiculo> veiculos){
        TelaEscolha tela = new TelaEscolha();
             String NewVeiculo = tela.getVeiculoSelecionado();
             
             while(NewVeiculo == null){
             tela.setVisible(true);
             while(tela.isVisible()){
                 Thread.onSpinWait();
                }
             NewVeiculo = tela.getVeiculoSelecionado();
             
             if(NewVeiculo == null) {
                 JOptionPane.showMessageDialog(null, "Escolha uma opção");
                }
            }
             if("Carro".equals(NewVeiculo) ){
                 CarService.RegistrarCarro(veiculos);
             } else if("Moto".equals(NewVeiculo) ){
                 MotoService.RegistrarMoto(veiculos);
             }
    }
    public static void VerVeiculos(List<Veiculo> veiculos){
        TelaEscolha tela = new TelaEscolha();
             String NewVeiculo = tela.getVeiculoSelecionado();
             
             while(NewVeiculo == null){
             tela.setVisible(true);
             while(tela.isVisible()){
                 Thread.onSpinWait();
                }
             NewVeiculo = tela.getVeiculoSelecionado();
             
             if(NewVeiculo == null) {
                 JOptionPane.showMessageDialog(null, "Escolha uma opção");
                }
            }
             if("Carro".equals(NewVeiculo) ){
                 CarService.VerListaCarro(veiculos);
             } else if("Moto".equals(NewVeiculo) ){
                 MotoService.VerListaMoto(veiculos);
             }
    }
    public static void EditarVeiculos(List<Veiculo> veiculos){
        TelaEscolha tela = new TelaEscolha();
             String NewVeiculo = tela.getVeiculoSelecionado();
             
             while(NewVeiculo == null){
             tela.setVisible(true);
             while(tela.isVisible()){
                 Thread.onSpinWait();
                }
             NewVeiculo = tela.getVeiculoSelecionado();
             
             if(NewVeiculo == null) {
                 JOptionPane.showMessageDialog(null, "Escolha uma opção");
                }
            }
             if("Carro".equals(NewVeiculo) ){
                 CarService.VerListaCarro(veiculos);
             } else if("Moto".equals(NewVeiculo) ){
                 MotoService.VerListaMoto(veiculos);
             }
    }
    
    
    
}
