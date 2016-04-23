/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import javax.swing.JOptionPane;

/**
 *
 * @author Helio
 */
public class JogoVelha extends javax.swing.JFrame {

      boolean jogador1Ativo = true;
      boolean jogador2Ativo = false;
    
    public JogoVelha() {
        initComponents();
    }
    
    public void JogadorAtivo(){
    
        if(jogador1Ativo == true){
            jogador1Ativo = false;
            jogador2Ativo = true;
                   
        }else{
            if(jogador2Ativo == true){
            jogador2Ativo = false;
            jogador1Ativo = true;
            }
             
            }
        JogadorVencedor("X");
        JogadorVencedor("O");
        
    }
    
    public void JogadorVencedor(String Jogador){
        
        if ((B1.getText().equals(Jogador)) && B2.getText().equals(Jogador)&& 
                B3.getText().equals(Jogador)){
            if(B1.getText().equals("X")){
                
                Vencedor("jogador 1");
            }else {
                 
                Vencedor("jogador 2");
                    }
        
              }
         if ((B4.getText().equals(Jogador)) && B5.getText().equals(Jogador)&& 
                B6.getText().equals(Jogador)){
            if(B4.getText().equals("X")){
                
                Vencedor("jogador 1");
            } else {
                 
                Vencedor("jogador 2");
                    }
        
              }
         if ((B7.getText().equals(Jogador)) && B8.getText().equals(Jogador)&& 
                B9.getText().equals(Jogador)){
            if(B7.getText().equals("X")){
                
                Vencedor("jogador 1");
            } else {
                 
                Vencedor("jogador 2");
                    }
        
              }
         if ((B1.getText().equals(Jogador)) && B5.getText().equals(Jogador)&& 
                B9.getText().equals(Jogador)){
            if(B1.getText().equals("X")){
                
                Vencedor("jogador 1");
            } else {
                 
                Vencedor("jogador 2");
                    }
        
              }
         if ((B3.getText().equals(Jogador)) && B5.getText().equals(Jogador)&& 
                B7.getText().equals(Jogador)){
            if(B3.getText().equals("X")){
                
                Vencedor("jogador 1");
            } else {
                 
                Vencedor("jogador 2");
                    }
        
              }
         if ((B2.getText().equals(Jogador)) && B5.getText().equals(Jogador)&& 
                B8.getText().equals(Jogador)){
            if(B2.getText().equals("X")){
                
                Vencedor("jogador 1");
            }else {
                 
                Vencedor("jogador 2");
                    }
        
              }
         if ((B1.getText().equals(Jogador)) && B4.getText().equals(Jogador)&& 
                B7.getText().equals(Jogador)){
            if(B1.getText().equals("X")){
                
                Vencedor("jogador 1");
            }else {
                 
                Vencedor("jogador 2");
                    }
        
              }
         if ((B3.getText().equals(Jogador)) && B6.getText().equals(Jogador)&& 
                B9.getText().equals(Jogador)){
            if(B3.getText().equals("X")){
                
                Vencedor("jogador 1");
            }else {
                 
                Vencedor("jogador 2");
                    }
        
              }
         
    }
    
    public void Vencedor(String JogadorVencedor){
        
        if(JogadorVencedor.equals("jogador 1")){
            JOptionPane.showMessageDialog(null,"+parabens,  jogador 1");   
        }  
        
   else {
          JOptionPane.showMessageDialog(null,"+parabens,  jogador 2"); 
      }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBJogador_X = new javax.swing.JButton();
        jBJogador_O = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setForeground(new java.awt.Color(255, 0, 0));
        setResizable(false);

        jBJogador_X.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jBJogador_X.setText("Jogador  X");
        jBJogador_X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJogador_XActionPerformed(evt);
            }
        });

        jBJogador_O.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jBJogador_O.setText("Jogador O");
        jBJogador_O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJogador_OActionPerformed(evt);
            }
        });

        B1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        B1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        B4.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)))));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        B7.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        B5.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        B8.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        B2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        B3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        B9.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        B6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        B6.setAutoscrolls(true);
        B6.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B7, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(B4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(B3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(B9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBJogador_X)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBJogador_O)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {B1, B2, B3, B4, B5, B6, B7, B8, B9});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBJogador_X, jButton1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B6, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B9, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBJogador_O)
                    .addComponent(jBJogador_X)
                    .addComponent(jButton1))
                .addGap(39, 39, 39))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {B1, B2, B3, B4, B5, B6, B7, B8, B9});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBJogador_O, jBJogador_X, jButton1});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed

        if(jogador1Ativo == true){
         if(B1.getText().equals(" ")){
          B1.setText("X");
          JogadorAtivo();
         }
        }else{
             if(B1.getText().equals("")){
               B1.setText("O");
               JogadorAtivo();
             }
         }
     
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
       
        if(jogador1Ativo == true){
         if(B2.getText().equals("")){
          B2.setText("X");
          JogadorAtivo();
         }
        }else{
             if(B2.getText().equals("")){
               B2.setText("O");
               JogadorAtivo();
             }
           }
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
       
        if(jogador1Ativo == true){
         if(B3.getText().equals("")){
          B3.setText("X");
          JogadorAtivo();
         }
        }else{
             if(B3.getText().equals("")){
               B3.setText("O");
               JogadorAtivo();
             }
           }
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
       
        if(jogador1Ativo == true){
         if(B4.getText().equals("")){
          B4.setText("X");
          JogadorAtivo();
         }
        }else{
             if(B4.getText().equals("")){
               B4.setText("O");
               JogadorAtivo();
             }
           }
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
       
        if(jogador1Ativo == true){
         if(B5.getText().equals("")){
          B5.setText("X");
          JogadorAtivo();
         }
        }else{
             if(B5.getText().equals("")){
               B5.setText("O");
               JogadorAtivo();
             }
           }
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        
        if(jogador1Ativo == true){
         if(B6.getText().equals("")){
          B6.setText("X");
          JogadorAtivo();
         }
        }else{
             if(B6.getText().equals("")){
               B6.setText("O");
               JogadorAtivo();
             }
           }
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
       if(jogador1Ativo == true){
         if(B7.getText().equals("")){
          B7.setText("X");
          JogadorAtivo();
         }
        }else{
             if(B7.getText().equals("")){
               B7.setText("O");
               JogadorAtivo();
             }
           }
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        
        if(jogador1Ativo == true){
         if(B8.getText().equals("")){
          B8.setText("X");
          JogadorAtivo();
         }
        }else{
             if(B8.getText().equals("")){
               B8.setText("O");
               JogadorAtivo();
             }
           }
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        
        if(jogador1Ativo == true){
         if(B9.getText().equals("")){
          B9.setText("X");
          JogadorAtivo();
         }
        }else{
             if(B9.getText().equals("")){
               B9.setText("O");
               JogadorAtivo();
             }
           }
    }//GEN-LAST:event_B9ActionPerformed

    private void jBJogador_XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJogador_XActionPerformed
       
    }//GEN-LAST:event_jBJogador_XActionPerformed

    private void jBJogador_OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJogador_OActionPerformed
       
    }//GEN-LAST:event_jBJogador_OActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
       B1.setText("");
       B2.setText("");
       B3.setText("");
       B4.setText("");
       B5.setText("");
       B6.setText("");
       B7.setText("");
       B8.setText("");
       //this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogoVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form *B1  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoVelha().setVisible(true);
            }
        });
                */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton jBJogador_O;
    private javax.swing.JButton jBJogador_X;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

   
}
                
