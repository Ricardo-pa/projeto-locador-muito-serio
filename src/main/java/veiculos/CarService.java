/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculos;

import static com.mycompany.locadora.Locadora.veiculos;
import java.util.*;
import javax.swing.JOptionPane;
import jframes.TelaRegistrarCarro;

/**
 *
 * @author Ricardo
 */
public class CarService {
    public static void RegistrarCarro(List<Veiculo> veiculos){
        while(true){
        TelaRegistrarCarro TelaCar = new TelaRegistrarCarro();
        TelaCar.setVisible(true);
        while (TelaCar.isVisible()) {
            try {
                Thread.sleep(100); // Pequena pausa para evitar consumo excessivo de CPU
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
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
                  if (Nome == null) {
            JOptionPane.showMessageDialog(null, "Registro cancelado.");
            return;
                  }
                  
                   if (Nome.isEmpty() || Marca.isEmpty() || Modelo.isEmpty() || Ano.isEmpty() || 
            Placa.isEmpty() || Portas == null || Combus.isEmpty() || Ar.isEmpty() || 
            Cambio == null || CapPoMa.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
            continue;
                   }
                   try{
                  int anoInt = Integer.parseInt(Ano);
                  int portasInt = Integer.parseInt(Portas.replace(" Portas", "").trim());
                  int capacidadePortaMalasInt = Integer.parseInt(CapPoMa);
                  boolean arCondicionado = "Sim".equalsIgnoreCase(Ar) || "true".equalsIgnoreCase(Ar);
                  boolean cambioAutomatico = "Automatico".equalsIgnoreCase(Cambio);
                  
                 Car NewCarStance = new Car(Nome, Marca, Modelo, anoInt, Placa, portasInt, capacidadePortaMalasInt, Combus, arCondicionado, cambioAutomatico);
                  veiculos.add(NewCarStance);
                    
                    JOptionPane.showMessageDialog(null, "Carro registrado com sucesso!");
                    return;
                   }
                   catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao converter valores. Verifique os campos numéricos.");
        } 
                    
                    
                  
                    
                         
                    
                    
                  
            
            }
        }
        
    }
    
    

