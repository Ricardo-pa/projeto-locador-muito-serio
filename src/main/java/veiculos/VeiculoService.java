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
                 JOptionPane.showMessageDialog(null, "digite um valor valido");
                }
            }
             if("Carro".equals(NewVeiculo) ){
                 CarService.RegistrarCarro(veiculos);
             }
    }
    
    
    
}
