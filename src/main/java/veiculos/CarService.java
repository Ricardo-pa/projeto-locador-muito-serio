/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculos;

import static com.mycompany.locadora.Locadora.veiculos;
import veiculos.Car;
import java.util.*;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import jframes.TelaListaVeiculos;
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
    public static void VerListaCarro(List<Veiculo> veiculos){
        while(true){
            List<Car> carros = veiculos.stream()
        .filter(v -> v instanceof Car)
        .map(v -> (Car) v)
        .collect(Collectors.toList());

    if (carros.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nenhum carro registrado!");
        return;
    }
    TelaListaVeiculos ListarCar = new TelaListaVeiculos();
    ListarCar.setListCar(carros);
    ListarCar.preencherListaCar();
    ListarCar.setVisible(true);
    while (ListarCar.isVisible()) {
            try {
                Thread.sleep(100); // Pequena pausa para evitar consumo excessivo de CPU
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    String CarroSelecionado;
    CarroSelecionado = ListarCar.getEscolhaStringCar();
    if (CarroSelecionado == null) {
            JOptionPane.showMessageDialog(null, "Visualização cancelada.");
            return;
                  }
            if (CarroSelecionado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, escolha um carro.");
            continue;
                   }
            try{
                  int CarroSelectInt = Integer.parseInt(CarroSelecionado);
                    
                    mostrarDetalhesCarro(carros.get(CarroSelectInt-1));
                    return;
                   }
            catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao converter valores. Verifique os campos numéricos.");
        } 
        }
        
        
    }
    public static void EditarCarro(List<Veiculo> veiculos){
        while(true){
            List<Car> carros = veiculos.stream()
        .filter(v -> v instanceof Car)
        .map(v -> (Car) v)
        .collect(Collectors.toList());

    if (carros.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nenhum carro registrado!");
        return;
    }
    TelaListaVeiculos ListarCar = new TelaListaVeiculos();
    ListarCar.setListCar(carros);
    ListarCar.preencherListaCar();
    ListarCar.setVisible(true);
    while (ListarCar.isVisible()) {
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    String CarroSelecionado;
    CarroSelecionado = ListarCar.getEscolhaStringCar();
    if (CarroSelecionado == null) {
            JOptionPane.showMessageDialog(null, "Visualização cancelada.");
            return;
                  }
            if (CarroSelecionado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, escolha um carro.");
            continue;
                   }
            try{
                  int CarroSelectInt = Integer.parseInt(CarroSelecionado);
                    
                    MostrarTelaDeEdiçãoCar(carros.get(CarroSelectInt-1));
                    return;
                   }
            catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao converter valores. Verifique os campos numéricos.");
        } 
        }
        
        
    }

        
    
    
    public static void MostrarTelaDeEdiçãoCar(Car numCar){
        TelaRegistrarCarro TelaCar = new TelaRegistrarCarro();
        TelaCar.preencherTodosCampos(numCar.getNome(), numCar.getMarca(), numCar.getModelo(),
                numCar.getAno(), numCar.getPlaca(), numCar.getPortas(),
                numCar.getTipoCombustivel(), numCar.getArCondicionado(), numCar.getCambioAutomatico(), numCar.getCapacidadePortaMalas());
         while(true){
        
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
                  
                 numCar.setAll(Nome, Marca, Modelo, anoInt, Placa, portasInt, capacidadePortaMalasInt, Combus, arCondicionado, cambioAutomatico);
                  
                    
                    JOptionPane.showMessageDialog(null, "Carro editado com sucesso!");
                    return;
                   }
                   catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao converter valores. Verifique os campos numéricos.");
        }
            }
    }
    public static void mostrarDetalhesCarro(Car carro) {
    String detalhes = "=== DETALHES DO CARRO ===\n" +
                     "Nome: " + carro.getNome() + "\n" +
                     "Marca: " + carro.getMarca() + "\n" +
                     "Modelo: " + carro.getModelo() + "\n" +
                     "Ano: " + carro.getAno() + "\n" +
                     "Placa: " + carro.getPlaca() + "\n" +
                     "Portas: " + carro.getPortas() + "\n" +
                     "Capacidade Porta-Malas: " + carro.getCapacidadePortaMalas() + "L\n" +
                     "Combustível: " + carro.getTipoCombustivel() + "\n" +
                     "Ar Condicionado: " + (carro.getArCondicionado() ? "Sim" : "Não") + "\n" +
                     "Câmbio: " + (carro.getCambioAutomatico() ? "Automático" : "Manual") + "\n" +
                     "Alugado: " + (carro.getAlugado() ? "Sim" : "Não");

    JOptionPane.showMessageDialog(null, detalhes, "Detalhes do Carro", JOptionPane.INFORMATION_MESSAGE);
}
    public static void AlugarCarro(List<Veiculo> veiculos){
        while(true) {
        List<Car> carros = veiculos.stream()
            .filter(v -> v instanceof Car)
            .map(v -> (Car) v)
            .filter(Car -> !Car.isAlugado()) 
            .collect(Collectors.toList());

    if (carros.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nenhuma moto registrada!");
        return;
    }
    TelaListaVeiculos ListarCarro = new TelaListaVeiculos();
    ListarCarro.setListCar(carros);
    ListarCarro.preencherListaCar();
    ListarCarro.setVisible(true);
    while (ListarCarro.isVisible()) {
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    String CarroSelecionado;
    CarroSelecionado = ListarCarro.getEscolhaStringCar();
    if (CarroSelecionado == null) {
            JOptionPane.showMessageDialog(null, "Visualização cancelada.");
            return;
                  }
            if (CarroSelecionado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, escolha um Carro");
            continue;
                   }
            try{
                  int CarroSelectInt = Integer.parseInt(CarroSelecionado);
                    
                    mostrarDetalhesCarro(carros.get(CarroSelectInt-1));
                    Car Carroedit = carros.get(CarroSelectInt-1);
                    int option2 = JOptionPane.showConfirmDialog(null, "Alugar Carro?", "Confirmação",JOptionPane.OK_CANCEL_OPTION);
                    if (option2 == JOptionPane.OK_OPTION) {
                        Carroedit.setAlugado(true);
                        JOptionPane.showMessageDialog(null, "Carro alugado com sucesso");
                    
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
    public static void DevolverCarro(List<Veiculo> veiculos){
        while(true) {
        List<Car> carros = veiculos.stream()
            .filter(v -> v instanceof Car)
            .map(v -> (Car) v)
            .filter(Car -> Car.isAlugado()) 
            .collect(Collectors.toList());

    if (carros.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nenhum carro registrado!");
        return;
    }
    TelaListaVeiculos ListarCarro = new TelaListaVeiculos();
    ListarCarro.setListCar(carros);
    ListarCarro.preencherListaCar();
    ListarCarro.setVisible(true);
    while (ListarCarro.isVisible()) {
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    String CarroSelecionado;
    CarroSelecionado = ListarCarro.getEscolhaStringCar();
    if (CarroSelecionado == null) {
            JOptionPane.showMessageDialog(null, "Visualização cancelada.");
            return;
                  }
            if (CarroSelecionado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, escolha um carro");
            continue;
                   }
            try{
                  int MotoSelectInt = Integer.parseInt(CarroSelecionado);
                    
                    mostrarDetalhesCarro(carros.get(MotoSelectInt-1));
                    Car Carroedit = carros.get(MotoSelectInt-1);
                    int option = JOptionPane.showConfirmDialog(null, "Devolver carro?", "Confirmação",JOptionPane.OK_CANCEL_OPTION);
                    if (option == JOptionPane.OK_OPTION) {
                        Carroedit.setAlugado(false);
                        JOptionPane.showMessageDialog(null, "Carro devolvido com sucesso");
                    
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
    
    

