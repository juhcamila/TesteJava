/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import data.FuncionarioData;
import javax.swing.JOptionPane;
import modell.Funcionario;
import modell.Pessoa;

/**
 *
 * @author juh_c
 */
public class JFFuncionario extends javax.swing.JInternalFrame {

    private FuncionarioData dao;
   
    private Funcionario obj;
    
    public JFFuncionario() {
        initComponents();
        dao= new FuncionarioData();
        setSize(600, 800);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        rg = new javax.swing.JTextField();
        jtendereco = new javax.swing.JTextField();
        nasc = new javax.swing.JFormattedTextField();
        jtdescri = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        funcao = new javax.swing.JTextField();

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF");

        jLabel3.setText("RG");

        jLabel4.setText("Endereço");

        jLabel5.setText("Data de nascimento");

        jLabel6.setText("Observação");

        jtendereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtenderecoActionPerformed(evt);
            }
        });

        nasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nascActionPerformed(evt);
            }
        });

        jtdescri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtdescriActionPerformed(evt);
            }
        });

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        sair.setText("Sair");

        jLabel7.setText("Função");

        funcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtendereco))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtdescri, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(rg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                        .addComponent(cpf, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(funcao, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nasc, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(funcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jtdescri, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar)
                    .addComponent(sair))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nascActionPerformed

    private void jtenderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtenderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtenderecoActionPerformed

    private void jtdescriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtdescriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtdescriActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
       try {
            if (validarCampos()) {
                if (preencherObjetoo()) {
                    if (dao.incluir(obj)) {
                        JOptionPane.showMessageDialog(this, "Salvo com sucesso");
                      
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Não foi possivel inserir o registo");
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Erro: " + erro.getMessage());
        }
        
        
       
    }//GEN-LAST:event_CadastrarActionPerformed

    private void funcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField funcao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtdescri;
    private javax.swing.JTextField jtendereco;
    private javax.swing.JFormattedTextField nasc;
    private javax.swing.JTextField rg;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables

    public void limparCampos(){
        jtNome.setText("");
        cpf.setText("");
        rg.setText("");
        jtendereco.setText("");
        nasc.setText("");
        jtdescri.setText("");
        funcao.setText("");
    }
    public boolean validarCampos(){
        if(jtNome.getText().equals("")|| jtNome.getText().length()<3){
            JOptionPane.showMessageDialog(this, "Preencha o campo Nome");
            jtNome.requestFocus();
            return false;   
        }
        if(funcao.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha o campo Função");
            funcao.requestFocus();
            return false;
        }
        if(cpf.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha o campo CPF");
            cpf.requestFocus();
            return false;  
        }
        
         if(rg.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha o campo RG");
            rg.requestFocus();
            return false;  
        }
         
          if(jtendereco.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha o campo Endereço");
            jtendereco.requestFocus();
            return false;  
        }
           if(nasc.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha o campo data de nascimento");
            nasc.requestFocus();
            return false;  
        }
        return true;
    }
public boolean preencherObjetoo(){
    obj = new Funcionario();
            
    obj.setNome(jtNome.getText());
    obj.setCpf(cpf.getText());
    obj.setRg(rg.getText());
    obj.setEndereco(jtendereco.getText());
    obj.setNasc(nasc.getText());
    obj.setFuncao(funcao.getText());
    obj.setObservacao(jtdescri.getText());
    return true;
}


}
