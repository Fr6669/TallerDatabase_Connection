/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica;

import com.connection.Conexion;
import com.ecodeup.model.Cliente;
import com.ecodeup.model.Opinion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Frank Rojas
 */
public class RegistrosPQRS extends javax.swing.JFrame {

    /**
     * Creates new form RegistrosPQRS
     */
    Connection co = null;
    Statement stm = null;
    ResultSet rs = null;
    String aux="";
    public RegistrosPQRS() {
        initComponents(); 
        this.setLocation(450, 100);
        buscarPeticiones();
        buscarQuejas();
        buscarReclamos();
        buscarSugerencias();   
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
        jScrollPane1 = new javax.swing.JScrollPane();
        peticiones = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        quejas = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        reclamos = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        sugerencias = new javax.swing.JTextPane();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel1.setText("Peticiones");

        jLabel2.setFont(jLabel1.getFont());
        jLabel2.setText("Sugerencias");

        jLabel3.setFont(jLabel1.getFont());
        jLabel3.setText("Quejas");

        jScrollPane1.setViewportView(peticiones);

        jScrollPane2.setViewportView(quejas);

        jLabel4.setFont(jLabel1.getFont());
        jLabel4.setText("Reclamos");

        jScrollPane3.setViewportView(reclamos);

        jScrollPane4.setViewportView(sugerencias);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1044, Short.MAX_VALUE)
                        .addComponent(btnVolver)
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnVolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
       this.setVisible(false);
       new Menu().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane peticiones;
    private javax.swing.JTextPane quejas;
    private javax.swing.JTextPane reclamos;
    private javax.swing.JTextPane sugerencias;
    // End of variables declaration//GEN-END:variables

    private void buscarPeticiones() {
        String sql = "SELECT * FROM peticion";
        List<Opinion> listaCliente = new ArrayList<Opinion>();

        try {
            co = Conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Opinion c = new Opinion();
                c.setOp(rs.getString(1));
                c.setCedula(rs.getString(2));
                listaCliente.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (Opinion opinion : listaCliente) {
            System.out.println(opinion);
            aux+= opinion.getOp()+", por: "+opinion.getCedula()+"\n";
        }
        peticiones.setText(aux);
        peticiones.setEditable(false);
        aux="";
    }

    private void buscarQuejas() {
        String sql = "SELECT * FROM queja";
        List<Opinion> listaCliente = new ArrayList<Opinion>();

        try {
            co = Conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Opinion c = new Opinion();
                c.setOp(rs.getString(1));
                c.setCedula(rs.getString(2));
                listaCliente.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (Opinion opinion : listaCliente) {
            System.out.println(opinion);
            aux+= opinion.getOp()+", por: "+opinion.getCedula()+"\n";
        }
        quejas.setText(aux);
        quejas.setEditable(false);
        aux="";
    }

    private void buscarReclamos() {
        String sql = "SELECT * FROM reclamo";
        List<Opinion> listaCliente = new ArrayList<Opinion>();

        try {
            co = Conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Opinion c = new Opinion();
                c.setOp(rs.getString(1));
                c.setCedula(rs.getString(2));
                listaCliente.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (Opinion opinion : listaCliente) {
            System.out.println(opinion);
            aux+= opinion.getOp()+", por: "+opinion.getCedula()+"\n";
        }
        reclamos.setText(aux);
        reclamos.setEditable(false);
        aux="";
    }

    private void buscarSugerencias() {
        String sql = "SELECT * FROM sugerencia";
        List<Opinion> listaCliente = new ArrayList<Opinion>();

        try {
            co = Conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Opinion c = new Opinion();
                c.setOp(rs.getString(1));
                c.setCedula(rs.getString(2));
                listaCliente.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (Opinion opinion : listaCliente) {
            System.out.println(opinion);
            aux+= opinion.getOp()+", por: "+opinion.getCedula()+"\n";
        }
        sugerencias.setText(aux);
        sugerencias.setEditable(false);
        aux="";
    }
}
