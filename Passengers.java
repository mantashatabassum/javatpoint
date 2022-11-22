package jframe;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author BALA JI
 */
public class Passengers extends javax.swing.JFrame {

    /**
     * Creates new form passengers
     */
    public Passengers() {
        initComponents();
        DisplayPassengers();
        
    }

    
    @SuppressWarnings("unchecked")
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null,Rsl = null;
    Statement St = null,Stl = null; 
    private void DisplayPassengers()
            
    {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from passengers_tbl");
            PassengersTable.setModel(DbUtils.resultSetToTableModel(Rs));
            
        } catch (Exception e) {
        }
        
    }
    int PassId = 0;
    private void CountPassengers()
    {
        try {
            Stl = Con.createStatement();
            Rsl = Stl.executeQuery("select Max(p_id) from passengers_tbl");
            Rsl.next();
            PassId = Rsl.getInt(1)+1;
        } catch (Exception e) {
        }
    }

    

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        PNameTb = new javax.swing.JTextField();
        PAddressTb = new javax.swing.JTextField();
        NatCb = new javax.swing.JComboBox<>();
        GenCb = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PassengersTable = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        PassNumTb = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        PPhoneTb = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1540, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, -1));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Passengers list");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Passengers Name");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Address");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Nationality");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, 34));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("Gender");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 103, -1));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 27)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("AIR LINE BILLING SYSTEM");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        PNameTb.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        PNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PNameTbActionPerformed(evt);
            }
        });
        jPanel3.add(PNameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 146, -1));

        PAddressTb.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        PAddressTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAddressTbActionPerformed(evt);
            }
        });
        jPanel3.add(PAddressTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 190, 145, -1));

        NatCb.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        NatCb.setForeground(new java.awt.Color(255, 0, 0));
        NatCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "India", "USA", "China", "Ingland", "Pakistan" }));
        NatCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NatCbActionPerformed(evt);
            }
        });
        jPanel3.add(NatCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 129, 32));

        GenCb.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        GenCb.setForeground(new java.awt.Color(255, 0, 0));
        GenCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        GenCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenCbActionPerformed(evt);
            }
        });
        jPanel3.add(GenCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, -1, 35));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Passengers Fligths");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, -1));

        BackBtn.setBackground(new java.awt.Color(242, 242, 242));
        BackBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 0, 0));
        BackBtn.setText("Back");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });
        jPanel3.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, 122, -1));

        SaveBtn.setBackground(new java.awt.Color(242, 242, 242));
        SaveBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(255, 0, 0));
        SaveBtn.setText("Save");
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtnMouseClicked(evt);
            }
        });
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        jPanel3.add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        EditBtn.setBackground(new java.awt.Color(242, 242, 242));
        EditBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 0, 0));
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        jPanel3.add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 93, -1));

        DeleteBtn.setBackground(new java.awt.Color(242, 242, 242));
        DeleteBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 0, 0));
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        jPanel3.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 122, -1));

        PassengersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        PassengersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassengersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PassengersTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 354, 1480, 331));

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("Passport Number");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, -1, -1));

        PassNumTb.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        PassNumTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassNumTbActionPerformed(evt);
            }
        });
        jPanel3.add(PassNumTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, 180, -1));

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("Phone");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 150, 121, -1));

        PPhoneTb.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        PPhoneTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPhoneTbActionPerformed(evt);
            }
        });
        jPanel3.add(PPhoneTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 190, 145, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 770));

        setSize(new java.awt.Dimension(1556, 776));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PAddressTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PAddressTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PAddressTbActionPerformed

    private void GenCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenCbActionPerformed

    private void PassNumTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassNumTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassNumTbActionPerformed

    private void NatCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NatCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NatCbActionPerformed

    private void PPhoneTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPhoneTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PPhoneTbActionPerformed
    private void Clear()
    {
        PNameTb.setText("");
        PassNumTb.setText("");
        PAddressTb.setText("");
        PPhoneTb.setText("");
    }

    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
        if(PNameTb.getText().isEmpty() || PassNumTb.getText().isEmpty() || PAddressTb.getText().isEmpty() || PPhoneTb.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(this, "Missing Information");  
        }else{
            try{
                CountPassengers();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","");
                String sql = "insert into passengers_tbl(p_id,p_name,p_net,p_gen,p_pass,p_add,p_phone) values(?,?,?,?,?,?,?)";
                PreparedStatement Add = Con.prepareStatement(sql);
                Add.setInt(1, PassId);
                Add.setString(2, PNameTb.getText());
                Add.setString(3, NatCb.getSelectedItem().toString());
                Add.setString(4, GenCb.getSelectedItem().toString());
                Add.setString(5, PassNumTb.getText());
                Add.setString(6, PAddressTb.getText());
                Add.setString(7, PPhoneTb.getText());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Passenger Added");
               Con.close();
                DisplayPassengers();
                Clear();
            }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
            }
        }
    }//GEN-LAST:event_SaveBtnMouseClicked
    int Key = 0;
    private void PassengersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassengersTableMouseClicked
      DefaultTableModel model = (DefaultTableModel)PassengersTable.getModel();
      int MyIndex = PassengersTable.getSelectedRow();
      Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
      PNameTb.setText(model.getValueAt(MyIndex, 1).toString());
      NatCb.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
      GenCb.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
      PassNumTb.setText(model.getValueAt(MyIndex, 4).toString());
      PAddressTb.setText(model.getValueAt(MyIndex, 5).toString());
      PPhoneTb.setText(model.getValueAt(MyIndex, 6).toString());
    }//GEN-LAST:event_PassengersTableMouseClicked

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void PNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PNameTbActionPerformed

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if (Key == 0) {
            JOptionPane.showMessageDialog(this, "select a Passenger");
        }else{
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","");
                String Query = "Delete from passengers_tbl where p_id="+Key;
                Statement Del = Con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Passenger Deleted");
                DisplayPassengers();
               } catch (Exception e) {
                   JOptionPane.showMessageDialog(this, e);
            }
            
        }
       
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
   new MainForm().setVisible(true);
   this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
      if(Key == 0)
        {
          JOptionPane.showMessageDialog(this, "select A Passenger");  
        }else{
            try{
                //CountPassengers();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","");
                String Query = "update passengers_tbl set p_name = ?, p_net = ?, p_gen = ?, p_pass = ?, p_add = ?, p_phone = ? where p_id = ?";
                PreparedStatement Add = Con.prepareStatement(Query);
                Add.setInt(7, Key);
                Add.setString(1, PNameTb.getText());
                Add.setString(2, NatCb.getSelectedItem().toString());
                Add.setString(3, GenCb.getSelectedItem().toString());
                Add.setString(4, PassNumTb.getText());
                Add.setString(5, PAddressTb.getText());
                Add.setString(6, PPhoneTb.getText());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Passenger Updated");
               Con.close();
                DisplayPassengers();
                Clear();
            }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
            }
        }
                
    }//GEN-LAST:event_EditBtnMouseClicked

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Passengers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Passengers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Passengers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Passengers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Passengers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JComboBox<String> GenCb;
    private javax.swing.JComboBox<String> NatCb;
    private javax.swing.JTextField PAddressTb;
    private javax.swing.JTextField PNameTb;
    private javax.swing.JTextField PPhoneTb;
    private javax.swing.JTextField PassNumTb;
    private javax.swing.JTable PassengersTable;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private static class preparedstatement {

        public preparedstatement() {
        }
    }
}
