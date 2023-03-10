/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package suppermarket;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.Driver;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Lenovo
 */
public class Seller extends javax.swing.JFrame {

    /**
     * Creates new form Seller
     */
    public Seller() {
        initComponents();
        SelectSeler();
       
    }
    Statement St=null;
   ResultSet Rs=null;
   Connection conn=null;
  public void SelectSeler(){
      try{
         conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Tkproject", "postgres", "");
         St=conn.createStatement();
         Rs=St.executeQuery("Select* From selertb ");
         selertable.setModel(DbUtils.resultSetToTableModel(Rs));
      }catch(Exception e){
          e.printStackTrace();
          
          
      }
      
      
  }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtseler = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        editbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        selertable = new javax.swing.JTable();
        txtgender = new javax.swing.JComboBox<>();
        btnback = new javax.swing.JLabel();
        homebtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Manage Seller");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("SellerId");

        editbtn.setBackground(new java.awt.Color(204, 0, 204));
        editbtn.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        editbtn.setForeground(new java.awt.Color(255, 255, 255));
        editbtn.setText("Edit");
        editbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editbtnMouseClicked(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(204, 0, 204));
        deletebtn.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("Delete");
        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtnMouseClicked(evt);
            }
        });

        clearbtn.setBackground(new java.awt.Color(204, 0, 204));
        clearbtn.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearbtn.setText("Clear");
        clearbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearbtnMouseClicked(evt);
            }
        });

        addbtn.setBackground(new java.awt.Color(204, 0, 204));
        addbtn.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("Add");
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setText("Seller List");

        selertable.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        selertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "SellerId", "SellerNmae", "SellerPass", "SellerGender"
            }
        ));
        selertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selertableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(selertable);

        txtgender.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "TranceGender" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(addbtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtseler, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(editbtn)
                        .addGap(5, 5, 5)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(86, 86, 86)
                        .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(deletebtn)
                                    .addComponent(jLabel1))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearbtn)
                            .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(570, 570, 570))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1)))
                .addGap(533, 533, 533))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtpass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtseler, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearbtn)
                    .addComponent(deletebtn)
                    .addComponent(editbtn)
                    .addComponent(addbtn))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnback.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("Products");
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackMouseClicked(evt);
            }
        });

        homebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        homebtn.setForeground(new java.awt.Color(255, 255, 255));
        homebtn.setText("Logout");
        homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnback)
                    .addComponent(homebtn))
                .addGap(79, 79, 79)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 807, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(128, 128, 128))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homebtn)
                .addGap(226, 226, 226))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked
        // TODO add your handling code here:
        String seler=txtseler.getText();
        String name=txtname.getText();
        String pass=txtpass.getText();
        String gender=txtgender.getSelectedItem().toString();
        if(seler.isEmpty()||name.isEmpty()||pass.isEmpty()||gender.isEmpty()){
          JOptionPane.showMessageDialog(this, "Missing information");  
        }else{
        
        
        try{
             Class.forName("org.postgresql.Driver");
       java.sql.Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Tkproject", "postgres", "");
                System.out.println("Database Connected...");
        java.sql.Statement stmt=conn.createStatement();
          String query="INSERT INTO selertb(selerid,selername,selerpass,selergender) VALUES('"+seler+"','"+name+"','"+pass+"','"+gender+"')";
         
         
                int rs=stmt.executeUpdate(query);
                
                    
                
                JOptionPane.showMessageDialog(this, "Seller Added Succesfully");
                 
                
                conn.close();
               SelectSeler();
                
                
               }catch(Exception e){
                    e.printStackTrace();
            
        }
        }
    }//GEN-LAST:event_addbtnMouseClicked

    private void selertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selertableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)selertable.getModel();
        int Myindex=selertable.getSelectedRow();
        txtseler.setText(model.getValueAt(Myindex, 0).toString());
        txtpass.setText(model.getValueAt(Myindex, 2).toString());
        txtname.setText(model.getValueAt(Myindex, 1).toString());
        txtgender.setSelectedItem(model.getValueAt(Myindex, 3).toString());
        
    }//GEN-LAST:event_selertableMouseClicked

    private void clearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnMouseClicked
        // TODO add your handling code here:
        txtseler.setText("");
        txtpass.setText("");
        txtname.setText("");
    }//GEN-LAST:event_clearbtnMouseClicked

    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseClicked
         if(txtseler.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "select Sellerid To Be Delete");
                 
        }else{
            try{
      conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Tkproject", "postgres", "");
        String cetid=txtseler.getText();
        String Query="Delete from selertb where selerid="+cetid;
        Statement Add =conn.createStatement();
         Add.executeUpdate(Query);
         SelectSeler();
                JOptionPane.showMessageDialog(this, "seller Deleted Successfully");
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
            
            
            
        }
      
    }//GEN-LAST:event_deletebtnMouseClicked

    private void editbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbtnMouseClicked
        // TODO add your handling code here:
        if(txtseler.getText().isEmpty()||txtpass.getText().isEmpty()||txtname.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Vallues");
        }else{
            try{
                  conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Tkproject", "postgres", "");
                  String Query ="Update selertb set selername='"+txtname.getText()+"'"+",selerpass='"+txtpass.getText()+"'"+",selergender='"+txtgender.getSelectedItem().toString()+"'"+"where selerid="+txtseler.getText()+"";
                Statement Add=conn.createStatement();
                Add.executeUpdate(Query);
                 conn.close();
               SelectSeler();
                
                JOptionPane.showMessageDialog(this, "Record Updated Succefully");
                
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_editbtnMouseClicked

    private void btnbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseClicked
       new Products().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnbackMouseClicked

    private void homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homebtnMouseClicked

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
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JLabel btnback;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JLabel homebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable selertable;
    private javax.swing.JComboBox<String> txtgender;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtseler;
    // End of variables declaration//GEN-END:variables
}
