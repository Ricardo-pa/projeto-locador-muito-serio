/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculos;

import java.util.*;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import jframes.TelaListaVeiculos;
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
    public static void VerListaMoto(List<Veiculo> veiculos){
        while(true){
            List<Moto> motos = veiculos.stream()
        .filter(v -> v instanceof Moto)
        .map(v -> (Moto) v)
        .collect(Collectors.toList());

    if (motos.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nenhuma moto registrada!");
        return;
    }
    TelaListaVeiculos ListarMoto = new TelaListaVeiculos();
    ListarMoto.setListmoto(motos);
    ListarMoto.preencherListaMoto();
    ListarMoto.setVisible(true);
    while (ListarMoto.isVisible()) {
            try {
                Thread.sleep(100); // Pequena pausa para evitar consumo excessivo de CPU
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    String CarroSelecionado;
    CarroSelecionado = ListarMoto.getEscolhaStringCar();
    if (CarroSelecionado == null) {
            JOptionPane.showMessageDialog(null, "Visualização cancelada.");
            return;
                  }
            if (CarroSelecionado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, escolha uma moto");
            continue;
                   }
            try{
                  int MotoSelectInt = Integer.parseInt(CarroSelecionado);
                    
                    mostrarDetalhesMoto(motos.get(MotoSelectInt-1));
                    return;
                   }
            catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao converter valores. Verifique os campos numéricos.");
        } 
        }
        
        
    }
    public static void EditarMoto(List<Veiculo> veiculos){
        while(true){
            List<Moto> motos = veiculos.stream()
                    .filter(v -> v instanceof Moto)
                    .map (v -> (Moto) v)
                    .collect(Collectors.toList());
            if (motos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhuma moto registrada!");
        return;
            }
            TelaListaVeiculos ListarMoto = new TelaListaVeiculos();
            ListarMoto.setListmoto(motos);
            ListarMoto.preencherListaMoto();
            ListarMoto.setVisible(true);
            while (ListarMoto.isVisible()) {
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            String MotoSelect;
            MotoSelect = ListarMoto.getEscolhaStringCar();
            if (MotoSelect == null) {
                JOptionPane.showMessageDialog(null, "Visualização cancelada.");
            return;
            }
            if (MotoSelect.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, escolha uma moto.");
            continue;
                   }
            try{
                  int MotoSelectInt = Integer.parseInt(MotoSelect);
                    
                    MostrarTelaDeEdiçãoMoto(motos.get(MotoSelectInt-1));
                    return;
                   }
            catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao converter valores. Verifique os campos numéricos.");
        } 
        }
    }
    public static void MostrarTelaDeEdiçãoMoto(Moto numMoto){
        TelaRegistrarMoto TelaMoto = new TelaRegistrarMoto();
        TelaMoto.preencherTodosCamposMoto(numMoto.getNome(), numMoto.getMarca(), numMoto.getModelo(),
                numMoto.getAno(), numMoto.getPlaca(), numMoto.getCilindradas(),
                numMoto.getCombustivel(), numMoto.getGuidon(), numMoto.getTipoPartida(), numMoto.getTipoFreio());
         while(true){
        
        TelaMoto.setVisible(true);
        while (TelaMoto.isVisible()) {
            try {
                Thread.sleep(100); // Pequena pausa para evitar consumo excessivo de CPU
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
                   String Nome, Marca,Modelo, Ano, Placa, cilindrada,combustivel,Guidon,Partida, Freio;
                  Nome = TelaMoto.getNome();
                  Marca = TelaMoto.getMarca();
                  Modelo = TelaMoto.getModelo();
                  Ano = TelaMoto.getAno();
                  Placa = TelaMoto.getPlaca();
                  cilindrada = TelaMoto.getCilindrada();
                  combustivel = TelaMoto.getCombustivel();
                  Guidon = TelaMoto.getGuidon();
                  Partida = TelaMoto.getPartida();
                  Freio = TelaMoto.getFreio();
                  if (Nome == null) {
            JOptionPane.showMessageDialog(null, "Registro cancelado.");
            return;
                  }
                  
                   if (Nome.isEmpty() || Marca.isEmpty() || Modelo.isEmpty() || Ano.isEmpty() || 
            Placa.isEmpty() || cilindrada.isEmpty() || combustivel.isEmpty() || Guidon.isEmpty() || 
            Partida.isEmpty() || Freio == null) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
            continue;
                   }
                   try{
                   int anoInt = Integer.parseInt(Ano);
                    int CilinInt = Integer.parseInt(cilindrada);
                    numMoto.setAll(Nome, Marca, Modelo, anoInt, Placa, CilinInt, Partida, combustivel, Freio, Guidon);
                    
                    JOptionPane.showMessageDialog(null, "Moto editada com sucesso!");
                    return;
                   }
                   catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao converter valores. Verifique os campos numéricos.");
        }
            }
    }
    public static void mostrarDetalhesMoto(Moto moto) {
    String detalhes = "=== DETALHES DA MOTO ===\n" +
                     "Nome: " + moto.getNome() + "\n" +
                     "Marca: " + moto.getMarca() + "\n" +
                     "Modelo: " + moto.getModelo() + "\n" +
                     "Ano: " + moto.getAno() + "\n" +
                     "Placa: " + moto.getPlaca() + "\n" +
                     "Cilindradas: " + moto.getCilindradas() + "cc\n" +
                     "Tipo de Partida: " + moto.getTipoPartida() + "\n" +
                     "Combustível: " + moto.getCombustivel() + "\n" +
                     "Tipo de Freio: " + moto.getTipoFreio() + "\n" +
                     "Guidão: " + moto.getGuidon() + "\n" +
                     "Alugado: " + (moto.isAlugado() ? "Sim" : "Não");

    JOptionPane.showMessageDialog(null, detalhes, "Detalhes da Moto", JOptionPane.INFORMATION_MESSAGE);
}
    public static void AlugarMoto(List<Veiculo> veiculos){
        while(true) {
        List<Moto> motos = veiculos.stream()
            .filter(v -> v instanceof Moto)
            .map(v -> (Moto) v)
            .filter(moto -> !moto.isAlugado()) // Filtra apenas motos não alugadas
            .collect(Collectors.toList());

    if (motos.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nenhuma moto registrada!");
        return;
    }
    TelaListaVeiculos ListarMoto = new TelaListaVeiculos();
    ListarMoto.setListmoto(motos);
    ListarMoto.preencherListaMoto();
    ListarMoto.setVisible(true);
    while (ListarMoto.isVisible()) {
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    String CarroSelecionado;
    CarroSelecionado = ListarMoto.getEscolhaStringCar();
    if (CarroSelecionado == null) {
            JOptionPane.showMessageDialog(null, "Visualização cancelada.");
            return;
                  }
            if (CarroSelecionado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, escolha uma moto");
            continue;
                   }
            try{
                  int MotoSelectInt = Integer.parseInt(CarroSelecionado);
                    
                    mostrarDetalhesMoto(motos.get(MotoSelectInt-1));
                    Moto Motoedit = motos.get(MotoSelectInt-1);
                    int option = JOptionPane.showConfirmDialog(null, "Alugar moto?", "Confirmação",JOptionPane.OK_CANCEL_OPTION);
                    if (option == JOptionPane.OK_OPTION) {
                        Motoedit.setAlugado(true);
                        JOptionPane.showMessageDialog(null, "Moto alugada com sucesso");
                    
                } else{
                        JOptionPane.showMessageDialog(null, "operação cancelada");
                    }
                    return;
                   }
            catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao converter valores. Verifique os campos numéricos.");
        } 
        }
        
        
    }
    public static void DevolverMoto(List<Veiculo> veiculos){
        while(true) {
        List<Moto> motos = veiculos.stream()
            .filter(v -> v instanceof Moto)
            .map(v -> (Moto) v)
            .filter(moto -> moto.isAlugado()) // Filtra apenas motos não alugadas
            .collect(Collectors.toList());

    if (motos.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nenhuma moto registrada!");
        return;
    }
    TelaListaVeiculos ListarMoto = new TelaListaVeiculos();
    ListarMoto.setListmoto(motos);
    ListarMoto.preencherListaMoto();
    ListarMoto.setVisible(true);
    while (ListarMoto.isVisible()) {
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    String CarroSelecionado;
    CarroSelecionado = ListarMoto.getEscolhaStringCar();
    if (CarroSelecionado == null) {
            JOptionPane.showMessageDialog(null, "Visualização cancelada.");
            return;
                  }
            if (CarroSelecionado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, escolha uma moto");
            continue;
                   }
            try{
                  int MotoSelectInt = Integer.parseInt(CarroSelecionado);
                    
                    mostrarDetalhesMoto(motos.get(MotoSelectInt-1));
                    Moto Motoedit = motos.get(MotoSelectInt-1);
                    int option = JOptionPane.showConfirmDialog(null, "Devolver moto?", "Confirmação",JOptionPane.OK_CANCEL_OPTION);
                    if (option == JOptionPane.OK_OPTION) {
                        Motoedit.setAlugado(false);
                        JOptionPane.showMessageDialog(null, "Moto devolvida com sucesso");
                    
                } else{
                        JOptionPane.showMessageDialog(null, "operação cancelada");
                    }
                    return;
                   }
            catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao converter valores. Verifique os campos numéricos.");
        } 
        }
        
        
    }
    }

    
                
                

                
            
                
                
            
        
    

