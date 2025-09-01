/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package jframes;

/**
 *
 * @author Farmácia
 */
public class TelaRegistrarMoto extends javax.swing.JFrame {
private String Nome, Marca,Modelo,Ano,Placa,Cilindrada,Combustivel,Guidon,Partida,Freio;
    
    public TelaRegistrarMoto() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public String getNome() {
    return Nome;
}

public String getMarca() {
    return Marca;
}

public String getModelo() {
    return Modelo;
}

public String getAno() {
    return Ano;
}

public String getPlaca() {
    return Placa;
}

public String getCilindrada() {
    return Cilindrada;
}

public String getCombustivel() {
    return Combustivel;
}

public String getGuidon() {
    return Guidon;
}

public String getPartida() {
    return Partida;
}

public String getFreio() {
    return Freio;
}
public void setNomeMoto(String texto) {
    NomeMoto.setText(texto);
}

public void setMarcaMoto(String texto) {
    MarcaMoto.setText(texto);
}

public void setModeloMoto(String texto) {
    ModeloMoto.setText(texto);
}

public void setAnoMoto(int ano) {
    AnoMoto.setText(String.valueOf(ano));
}

public void setPlacaMoto(String texto) {
    PlacaMoto.setText(texto);
}

public void setCilindradaMoto(int cilindrada) {
    CilindradaMoto.setText(String.valueOf(cilindrada));
}

public void setCombuMoto(String texto) {
    CombuMoto.setText(texto);
}

public void setGuidonMoto(String texto) {
    GuidonMoto.setText(texto);
}

// Setters para JComboBox com conversões adequadas
public void setPartidaMoto(String tipoPartida) {
    PartidaMoto.setSelectedItem(tipoPartida);
}

public void setFreioMoto(String tipoFreio) {
    FreioMoto.setSelectedItem(tipoFreio);
}

// Método para preencher todos os campos de uma vez
public void preencherTodosCamposMoto(String nome, String marca, String modelo, int ano, 
                                    String placa, int cilindrada, String combustivel, 
                                    String guidon, String partida, String freio) {
    setNomeMoto(nome);
    setMarcaMoto(marca);
    setModeloMoto(modelo);
    setAnoMoto(ano);
    setPlacaMoto(placa);
    setCilindradaMoto(cilindrada);
    setCombuMoto(combustivel);
    setGuidonMoto(guidon);
    setPartidaMoto(partida);
    setFreioMoto(freio);
}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlacaMoto = new javax.swing.JTextField();
        PartidaMoto = new javax.swing.JComboBox<>();
        cilindradas = new javax.swing.JLabel();
        OkMoto = new javax.swing.JButton();
        CombuMoto = new javax.swing.JTextField();
        lbCancelMoto = new javax.swing.JButton();
        combustivels = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        asdasd = new javax.swing.JLabel();
        FreioMoto = new javax.swing.JComboBox<>();
        GuidonMoto = new javax.swing.JTextField();
        nomes = new javax.swing.JLabel();
        NomeMoto = new javax.swing.JTextField();
        marcas = new javax.swing.JLabel();
        MarcaMoto = new javax.swing.JTextField();
        modelos = new javax.swing.JLabel();
        ModeloMoto = new javax.swing.JTextField();
        anos = new javax.swing.JLabel();
        AnoMoto = new javax.swing.JTextField();
        guidãos = new javax.swing.JLabel();
        placas = new javax.swing.JLabel();
        partidas = new javax.swing.JLabel();
        CilindradaMoto = new javax.swing.JTextField();

        setResizable(false);
        setSize(new java.awt.Dimension(600, 300));

        PlacaMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlacaMotoActionPerformed(evt);
            }
        });

        PartidaMoto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eletrica", "Pedal", "Mista" }));

        cilindradas.setText("Cilindradas:");

        OkMoto.setText("OK");
        OkMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkMotoActionPerformed(evt);
            }
        });

        CombuMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombuMotoActionPerformed(evt);
            }
        });

        lbCancelMoto.setText("Cancelar");
        lbCancelMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbCancelMotoActionPerformed(evt);
            }
        });

        combustivels.setText("Combustivel:");

        jDesktopPane1.setBackground(new java.awt.Color(242, 242, 242));

        asdasd.setText("Tipo do Freio:");

        FreioMoto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disco", "Tambor", "Hidraulico", "mecanico" }));

        jDesktopPane1.setLayer(asdasd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(FreioMoto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(asdasd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FreioMoto, 0, 180, Short.MAX_VALUE)
                .addGap(167, 167, 167))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asdasd)
                    .addComponent(FreioMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        GuidonMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuidonMotoActionPerformed(evt);
            }
        });

        nomes.setText("Nome:");

        NomeMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeMotoActionPerformed(evt);
            }
        });

        marcas.setText("Marca:");

        MarcaMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcaMotoActionPerformed(evt);
            }
        });

        modelos.setText("Modelo:");

        ModeloMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModeloMotoActionPerformed(evt);
            }
        });

        anos.setText("Ano:");

        AnoMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnoMotoActionPerformed(evt);
            }
        });

        guidãos.setText("guidão:");

        placas.setText("Placa:");

        partidas.setText("Partida:");

        CilindradaMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CilindradaMotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anos)
                            .addComponent(combustivels)
                            .addComponent(nomes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AnoMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(placas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PlacaMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(NomeMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(marcas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MarcaMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CombuMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guidãos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GuidonMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(modelos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ModeloMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cilindradas)
                                    .addComponent(partidas))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PartidaMoto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(CilindradaMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(OkMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCancelMoto))
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomes)
                    .addComponent(NomeMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marcas)
                    .addComponent(MarcaMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelos)
                    .addComponent(ModeloMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anos)
                    .addComponent(AnoMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placas)
                    .addComponent(PlacaMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cilindradas)
                    .addComponent(CilindradaMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combustivels)
                    .addComponent(CombuMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guidãos)
                    .addComponent(GuidonMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(partidas)
                    .addComponent(PartidaMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCancelMoto)
                    .addComponent(OkMoto))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PlacaMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlacaMotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlacaMotoActionPerformed

    private void OkMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkMotoActionPerformed
        Nome = (String) NomeMoto.getText();
        Marca = (String) MarcaMoto.getText();
        Modelo = (String) ModeloMoto.getText();
        Ano = (String) AnoMoto.getText();
        Placa = (String) PlacaMoto.getText();
        Cilindrada = (String) CilindradaMoto.getText();
        Combustivel = (String) CombuMoto.getText();
        Guidon = (String) GuidonMoto.getText();
        Partida = (String) PartidaMoto.getSelectedItem();
        Freio = (String) FreioMoto.getSelectedItem();
        this.dispose();
    }//GEN-LAST:event_OkMotoActionPerformed

    private void CombuMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombuMotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CombuMotoActionPerformed

    private void lbCancelMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbCancelMotoActionPerformed
        Nome = null;
        Marca = null;
        Modelo = null;
        Ano = null;
        Placa = null;
        Cilindrada = null;
        Combustivel = null;
        Guidon = null;
        Partida = null;
        Freio = null;
        this.dispose();

    }//GEN-LAST:event_lbCancelMotoActionPerformed

    private void GuidonMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuidonMotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuidonMotoActionPerformed

    private void NomeMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeMotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeMotoActionPerformed

    private void MarcaMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcaMotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MarcaMotoActionPerformed

    private void ModeloMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModeloMotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModeloMotoActionPerformed

    private void AnoMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnoMotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnoMotoActionPerformed

    private void CilindradaMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CilindradaMotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CilindradaMotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnoMoto;
    private javax.swing.JTextField CilindradaMoto;
    private javax.swing.JTextField CombuMoto;
    private javax.swing.JComboBox<String> FreioMoto;
    private javax.swing.JTextField GuidonMoto;
    private javax.swing.JTextField MarcaMoto;
    private javax.swing.JTextField ModeloMoto;
    private javax.swing.JTextField NomeMoto;
    private javax.swing.JButton OkMoto;
    private javax.swing.JComboBox<String> PartidaMoto;
    private javax.swing.JTextField PlacaMoto;
    private javax.swing.JLabel anos;
    private javax.swing.JLabel asdasd;
    private javax.swing.JLabel cilindradas;
    private javax.swing.JLabel combustivels;
    private javax.swing.JLabel guidãos;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JButton lbCancelMoto;
    private javax.swing.JLabel marcas;
    private javax.swing.JLabel modelos;
    private javax.swing.JLabel nomes;
    private javax.swing.JLabel partidas;
    private javax.swing.JLabel placas;
    // End of variables declaration//GEN-END:variables
}
