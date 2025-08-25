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
