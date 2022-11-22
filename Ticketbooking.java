package jframe;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.time.Year;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author BALA JI
 */
public class Ticketbooking extends javax.swing.JFrame {

    /**
     * Creates new form ticketbooking
     */
    public Ticketbooking() {
        initComponents();
        GetFlights();
        NationalityTb.setEditable(false);
        PassNameTb.setEditable(false);
        PassNumTb.setEditable(false);
        GenTb.setEditable(false);
        GetFlights();
        DisplayBooking();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
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
        PassNameTb = new javax.swing.JTextField();
        GenTb = new javax.swing.JTextField();
        FCodeCb = new javax.swing.JComboBox<>();
        PassIdCb = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        BookBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BookingTable = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        PassNumTb = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        NationalityTb = new javax.swing.JTextField();
        AmountTb = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        slip = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        TDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 2105, -1));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Bookings");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 395, 153, -1));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Passengers Name");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 146, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Amount");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(916, 154, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Flight Code");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 145, -1, 38));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("Gender");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 150, 103, -1));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 27)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("AIR LINE BILLING SYSTEM");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 34, -1, -1));

        PassNameTb.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        PassNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassNameTbActionPerformed(evt);
            }
        });
        jPanel3.add(PassNameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 202, 195, 32));

        GenTb.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        GenTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenTbActionPerformed(evt);
            }
        });
        jPanel3.add(GenTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 201, 142, -1));

        FCodeCb.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        FCodeCb.setForeground(new java.awt.Color(255, 0, 0));
        FCodeCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCodeCbActionPerformed(evt);
            }
        });
        jPanel3.add(FCodeCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 204, 129, 32));

        PassIdCb.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        PassIdCb.setForeground(new java.awt.Color(255, 0, 0));
        PassIdCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", " " }));
        PassIdCb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassIdCbMouseClicked(evt);
            }
        });
        PassIdCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassIdCbActionPerformed(evt);
            }
        });
        jPanel3.add(PassIdCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 203, 136, 35));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Tickets Booking");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 75, -1, -1));

        BookBtn.setBackground(new java.awt.Color(242, 242, 242));
        BookBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        BookBtn.setForeground(new java.awt.Color(255, 0, 0));
        BookBtn.setText("Book");
        BookBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookBtnMouseClicked(evt);
            }
        });
        BookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookBtnActionPerformed(evt);
            }
        });
        jPanel3.add(BookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 308, 93, -1));

        ResetBtn.setBackground(new java.awt.Color(242, 242, 242));
        ResetBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(255, 0, 0));
        ResetBtn.setText("Reset");
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnMouseClicked(evt);
            }
        });
        jPanel3.add(ResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 308, 93, -1));

        BackBtn.setBackground(new java.awt.Color(242, 242, 242));
        BackBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 0, 0));
        BackBtn.setText("Back");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });
        jPanel3.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 308, 121, -1));

        BookingTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(BookingTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 451, 956, 329));

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("Passport Number");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 150, -1, -1));

        PassNumTb.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        PassNumTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassNumTbActionPerformed(evt);
            }
        });
        jPanel3.add(PassNumTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 201, 189, -1));

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("Passenger Id");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 146, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("Nationality");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1064, 148, 121, 35));

        NationalityTb.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        NationalityTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NationalityTbActionPerformed(evt);
            }
        });
        jPanel3.add(NationalityTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1064, 201, 145, -1));

        AmountTb.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        AmountTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountTbActionPerformed(evt);
            }
        });
        jPanel3.add(AmountTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(907, 201, 145, -1));

        area.setColumns(20);
        area.setRows(5);
        area.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                areaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(area);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(989, 451, 356, 329));

        slip.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        slip.setForeground(new java.awt.Color(255, 0, 0));
        slip.setText("Print your slip");
        slip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slipActionPerformed(evt);
            }
        });
        jPanel3.add(slip, new org.netbeans.lib.awtextra.AbsoluteConstraints(1058, 395, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText(" Date");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1227, 151, 99, -1));

        TDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TDateMouseClicked(evt);
            }
        });
        jPanel3.add(TDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1227, 203, 159, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenTbActionPerformed

    private void FCodeCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCodeCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FCodeCbActionPerformed

    private void PassIdCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassIdCbActionPerformed
       GetPassengerData();
    }//GEN-LAST:event_PassIdCbActionPerformed

    private void PassNumTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassNumTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassNumTbActionPerformed

    private void NationalityTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NationalityTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NationalityTbActionPerformed

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
       new MainForm().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked
    Connection Con = null;
    java.sql.PreparedStatement pst = null;
    java.sql.ResultSet Rs = null,Rsl = null;
    Statement St = null,Stl = null; 
    private void GetFlights() 
    { 
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","");
            St = Con.createStatement();
            String Query = "select * from flight_tbl";
            Rs = St.executeQuery(Query);
            while(Rs.next())
            {
                String FCode = Rs.getString("fl_code");
                FCodeCb.addItem(FCode);
            }
        } catch (Exception e) {
        }
        
    }
    private void GetPassengerData()
    {
        String Query = "select * from passengers_tbl where p_id ="+PassIdCb.getSelectedItem().toString();
        Statement St;
        ResultSet Rs;
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","");
            St = Con.createStatement();
            Rs = St.executeQuery(Query);
            if(Rs.next())
            {
                PassNameTb.setText(Rs.getString("p_name"));
                GenTb.setText(Rs.getString("p_gen"));
                PassNumTb.setText(Rs.getString("p_pass"));
                NationalityTb.setText(Rs.getString("p_net"));
            }
        } catch (Exception e) {
        }
    }
       private void DisplayBooking()
            
    {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from booking_tbl");
            BookingTable.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(Rs));
            
        } catch (Exception e) {
        }
        
    }
    int TId = 0;
    private void CountFlights()
    {
        try {
            Stl = Con.createStatement();
            Rsl = Stl.executeQuery("select Max(ticket_id) from booking_tbl");
            Rsl.next();
            TId = Rsl.getInt(1)+1;
        } catch (Exception e) {
        }
    }
      
    private void BookBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookBtnMouseClicked
if(PassIdCb.getSelectedIndex()==-1 || FCodeCb.getSelectedIndex() ==-1 || AmountTb.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(this, "Missing Information");  
        }else{
            try{
                CountFlights();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","");
                String sql = "insert into booking_tbl(ticket_id,p_name,fl_code,p_gen,p_pass,amount,national,date) values(?,?,?,?,?,?,?,?)";
                java.sql.PreparedStatement Add = Con.prepareStatement(sql);
                Add.setInt(1, TId);
                Add.setString(2, PassNameTb.getText());
                Add.setString(3, FCodeCb.getSelectedItem().toString());
                Add.setString(4, GenTb.getText().toString());
                Add.setString(5, PassNumTb.getText());
                Add.setInt(6, Integer.valueOf(AmountTb.getText()));
                Add.setString(7, NationalityTb.getText());
                Add.setString(8, TDate.getDate().toString());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Ticket Booked");
               Con.close();
                DisplayBooking();
                Clear();
            }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
            }
        }    
    }//GEN-LAST:event_BookBtnMouseClicked

    private void PassIdCbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassIdCbMouseClicked
      
    }//GEN-LAST:event_PassIdCbMouseClicked

    private void AmountTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountTbActionPerformed

    private void PassNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassNameTbActionPerformed

    private void BookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookBtnActionPerformed
 private void Clear()
 {
      FCodeCb.setSelectedIndex(-1);
    //PassIdCb.setSelectedIndex(-1);
    PassNameTb.setText("");
    PassNumTb.setText("");
    GenTb.setText("");
    NationalityTb.setText("");
    AmountTb.setText("");
 }
    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
   Clear();
    }//GEN-LAST:event_ResetBtnMouseClicked

    private void slipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slipActionPerformed
        // TODO add your handling code here:
        area.setText("*********************************************************************\n");
        area.setText(area.getText()+ "_________________*YOUR FLIGHT BOOKING*_____________\n");
        area.setText(area.getText()+"**********************************************************************\n");
        
        //Date obj=new Date();
        //String date=obj.toString();
        //area.setText(area.getText()+"\n"+date+"\n\n");
        area.setText(area.getText()+"passenger Id : "+PassIdCb.getSelectedItem()+"\n");
        area.setText(area.getText()+"passenger name : "+PassNameTb.getText()+"\n");
        area.setText(area.getText()+"Flight Code : "+FCodeCb.getSelectedItem()+"\n");
        area.setText(area.getText()+"gender : "+GenTb.getText()+"\n");
        area.setText(area.getText()+"Passport Number : "+PassNumTb.getText()+"\n");
        area.setText(area.getText()+"Amount : "+AmountTb.getText()+"\n");
        area.setText(area.getText()+"nationality : "+NationalityTb.getText()+"\n");
        area.setText(area.getText()+"Date : "+TDate.getDate()+"\n");
        
        
       
    }//GEN-LAST:event_slipActionPerformed

    private void areaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_areaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_areaMouseClicked

    private void TDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TDateMouseClicked
       // TODO add your handling code here:
       
    }//GEN-LAST:event_TDateMouseClicked

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
            java.util.logging.Logger.getLogger(Ticketbooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticketbooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticketbooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticketbooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticketbooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountTb;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton BookBtn;
    private javax.swing.JTable BookingTable;
    private javax.swing.JComboBox<String> FCodeCb;
    private javax.swing.JTextField GenTb;
    private javax.swing.JTextField NationalityTb;
    private javax.swing.JComboBox<String> PassIdCb;
    private javax.swing.JTextField PassNameTb;
    private javax.swing.JTextField PassNumTb;
    private javax.swing.JButton ResetBtn;
    private com.toedter.calendar.JDateChooser TDate;
    private javax.swing.JTextArea area;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton slip;
    // End of variables declaration//GEN-END:variables
}
