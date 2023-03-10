/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package suppermarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Lenovo
 */
public class Category extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Category() {
        initComponents();
        SelectSeler();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
     Statement St=null;
   ResultSet Rs=null;
   Connection conn=null;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcat = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        editbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cattable = new javax.swing.JTable();
        txtdesc = new javax.swing.JTextField();
        btnproducts = new javax.swing.JLabel();
        btnseller = new javax.swing.JLabel();
        btnlogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Manage Category");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("Description");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("CategoryId");

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
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
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

        cattable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cattable.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        cattable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CategoryId", "CategoryName", "CategoryDesc"
            }
        ));
        cattable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cattableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cattable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(271, 271, 271))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(addbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(83, 83, 83)
                        .addComponent(editbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(deletebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(71, 71, 71))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtname)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(clearbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtcat))
                        .addGap(18, 18, 18)
                        .addComponent(txtdesc)
                        .addGap(256, 256, 256)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtcat)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtname)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtdesc))
                .addGap(132, 132, 132)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnproducts.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnproducts.setForeground(new java.awt.Color(255, 255, 255));
        btnproducts.setText("Products");
        btnproducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnproductsMouseClicked(evt);
            }
        });

        btnseller.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnseller.setForeground(new java.awt.Color(255, 255, 255));
        btnseller.setText("Seller");
        btnseller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsellerMouseClicked(evt);
            }
        });

        btnlogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("Login");
        btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnloginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnproducts, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnseller, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(124, 124, 124))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(btnproducts)
                .addGap(18, 18, 18)
                .addComponent(btnseller)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnlogin)
                .addGap(239, 239, 239))
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
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void SelectSeler(){
      try{
         conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbname", "postgres", "");
         St=conn.createStatement();
         Rs=St.executeQuery("Select* From category");
         cattable.setModel(DbUtils.resultSetToTableModel(Rs));
      }catch(Exception e){
          e.printStackTrace();
          
          
      }
      
      
  }
    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked
        // TODO add your handling code here:
          String seler=txtcat.getText();
        String name=txtname.getText();
        String pass=txtdesc.getText();
       
        if(seler.isEmpty()||name.isEmpty()||pass.isEmpty()){
          JOptionPane.showMessageDialog(this, "Missing information");  
        }else{
        
        
        try{
             Class.forName("org.postgresql.Driver");
       java.sql.Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Tkproject", "postgres", "");
                System.out.println("Database Connected...");
        java.sql.Statement stmt=conn.createStatement();
          String query="INSERT INTO category(catid,catname,descr) VALUES('"+seler+"','"+name+"','"+pass+"')";
         
         
                int rs=stmt.executeUpdate(query);
                
                    
                
                JOptionPane.showMessageDialog(this, "Record Added Succesfully");
                 
                
                conn.close();
              // SelectSeler();
                SelectSeler();
                
               }catch(Exception e){
                    e.printStackTrace();
            
        }
        }
    }//GEN-LAST:event_addbtnMouseClicked

    private void clearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnMouseClicked
        // TODO add your handling code here:
        txtcat.setText("");
        txtname.setText("");
        txtdesc.setText("");
    }//GEN-LAST:event_clearbtnMouseClicked

    private void cattableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cattableMouseClicked
         DefaultTableModel model=(DefaultTableModel)cattable.getModel();
        int Myindex=cattable.getSelectedRow();
        txtcat.setText(model.getValueAt(Myindex, 0).toString());
        txtname.setText(model.getValueAt(Myindex, 1).toString());
        txtdesc.setText(model.getValueAt(Myindex, 2).toString());
        
        
    }//GEN-LAST:event_cattableMouseClicked

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
          if(txtcat.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "select Category To Be Delete");
                 
        }else{
            try{
      conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Tkproject", "postgres", "");
        String cetid=txtcat.getText();
        String Query="Delete from category where catid="+cetid;
        Statement Add =conn.createStatement();
         Add.executeUpdate(Query);
         SelectSeler();
                JOptionPane.showMessageDialog(this, "Cetegory Deleted Successfully");
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
            
            
            
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void editbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbtnMouseClicked
        // TODO add your handling code here:
         if(txtcat.getText().isEmpty()||txtname.getText().isEmpty()||txtdesc.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Records are Missing ");
        }else{
            try{
                  conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "postgres", "");
                  String Query ="Update category  set catname='"+txtname.getText()+"'"+",descr='"+txtdesc.getText()+"'"+"where catid='"+txtcat.getText()+"'";
                Statement Add=conn.createStatement();
                Add.executeUpdate(Query);
                 conn.close();
               SelectSeler();
                
                JOptionPane.showMessageDialog(this, "Category Updated Succefully");
                
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_editbtnMouseClicked

    private void btnproductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnproductsMouseClicked
        new Products().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnproductsMouseClicked

    private void btnsellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsellerMouseClicked
      new Seller().setVisible(true);
      this.dispose();
     
    }//GEN-LAST:event_btnsellerMouseClicked

    private void btnloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseClicked
       new Login().setVisible(true);
        this.dispose();
      
    }//GEN-LAST:event_btnloginMouseClicked

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JLabel btnlogin;
    private javax.swing.JLabel btnproducts;
    private javax.swing.JLabel btnseller;
    private javax.swing.JTable cattable;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcat;
    private javax.swing.JTextField txtdesc;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
