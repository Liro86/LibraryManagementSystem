/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Linus
 */
public class AddMember extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddMember
     */
    
   Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public AddMember() {
        initComponents();
        conn=DBConnect.connect();
        autoId();
        tablelord();
       
        
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtmid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtnic = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtadress = new javax.swing.JTextArea();
        txtcontac = new javax.swing.JTextField();
        cmbmemtype = new javax.swing.JComboBox();
        cmbgender = new javax.swing.JComboBox();
        datebath = new com.toedter.calendar.JDateChooser();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbldetails = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(990, 530));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel15.setText("Members");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 360, 40));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 960, 60));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel5.setText("Member Id");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel6.setText("Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel7.setText("Last Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel8.setText("Birthday");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel9.setText("Gender");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel10.setText("Adress");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        jLabel11.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel11.setText("Email");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel12.setText("Phone No.");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        jLabel13.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel13.setText("Member type");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        txtmid.setEditable(false);
        jPanel1.add(txtmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 170, 30));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 170, 30));
        jPanel1.add(txtnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 170, 30));
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 210, 30));

        txtadress.setColumns(20);
        txtadress.setRows(5);
        jScrollPane1.setViewportView(txtadress);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 210, 70));
        jPanel1.add(txtcontac, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 210, 30));

        cmbmemtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Type", "Student", "Standard" }));
        cmbmemtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbmemtypeActionPerformed(evt);
            }
        });
        jPanel1.add(cmbmemtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 210, 30));

        cmbgender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female" }));
        jPanel1.add(cmbgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 170, 30));
        jPanel1.add(datebath, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 170, 30));

        btnadd.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 170, 40));

        btnupdate.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 170, 40));

        btndelete.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 170, 40));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 210, 190));

        tbldetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbldetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldetailsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbldetails);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 320, 940, 170));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 940, 230));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 960, 430));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
     
       String mid=txtmid.getText();
       String name=txtname.getText();
       String lastname=txtnic.getText();
       String date=((JTextField)datebath.getDateEditor().getUiComponent()).getText();
       String gender=cmbgender.getSelectedItem().toString();
       String adress=txtadress.getText();
       String email=txtemail.getText();
       String phone=txtcontac.getText();
       String type=cmbmemtype.getSelectedItem().toString();
       
       
            try {
            
                String sql="INSERT INTO `addmember`(`mid`, `name`, `lastname`, `birthday`, `gender`, `address`, `email`, `phone`, `type`) VALUES ('"+mid+"','"+name+"','"+lastname+"','"+date+"','"+gender+"','"+adress+"','"+email+"','"+phone+"','"+type+"')";
            PreparedStatement pst=(PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
                 JOptionPane.showMessageDialog(rootPane, "Successfully insert");
                
        } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
        }
            clearFild();
       autoId();
       tablelord();
        
        
    }//GEN-LAST:event_btnaddActionPerformed

    private void tbldetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldetailsMouseClicked
      
        
        DefaultTableModel tmodel=(DefaultTableModel)tbldetails.getModel();
        int selectrowindex=tbldetails.getSelectedRow();
        
        txtmid.setText(tmodel.getValueAt(selectrowindex, 0).toString());
        txtname.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        txtnic.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        ((JTextField)datebath.getDateEditor().getUiComponent()).setText(tmodel.getValueAt(selectrowindex, 3).toString());
        cmbgender.setSelectedItem(tmodel.getValueAt(selectrowindex, 4).toString());
        txtadress.setText(tmodel.getValueAt(selectrowindex, 5).toString());
        txtcontac.setText(tmodel.getValueAt(selectrowindex, 7).toString());
        txtemail.setText(tmodel.getValueAt(selectrowindex, 6).toString());
        
        
        cmbmemtype.setSelectedItem(tmodel.getValueAt(selectrowindex, 8).toString());
        
        
    }//GEN-LAST:event_tbldetailsMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
      
        String mid=txtmid.getText();
       String name=txtname.getText();
       String lastname=txtnic.getText();
       String date=((JTextField)datebath.getDateEditor().getUiComponent()).getText();
       String gender=cmbgender.getSelectedItem().toString();
       String adress=txtadress.getText();
       String email=txtemail.getText();
       String phone=txtcontac.getText();
       String type=cmbmemtype.getSelectedItem().toString();
        
        try {
            String  sql = "UPDATE `addmember` SET `name`='"+name+"',`lastname`='"+lastname+"',`birthday`='"+date+"',`gender`='"+gender+"',`address`='"+adress+"',`email`='"+email+"',`phone`='"+phone+"',`type`='"+type+"' WHERE mid='"+mid+"'";
         pst=(PreparedStatement) conn.prepareStatement(sql);
         pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Update success");
            tablelord();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
      
        try {
            String sql="DELETE FROM `addmember` WHERE mid='"+txtmid.getText()+"'";
	pst=(PreparedStatement) conn.prepareStatement(sql);
	 pst.execute();
         JOptionPane.showMessageDialog(rootPane, "Delete success");
         tablelord();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
        
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void cmbmemtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmemtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbmemtypeActionPerformed

    
     private void tablelord()
    {
        try {
            String sql="SELECT `mid`, `name`, `lastname`, `birthday`, `gender`, `address`, `email`, `phone`, `type` FROM `addmember`";
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tbldetails.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
      
    }
    
    
    
    private void autoId()
    {
        try {
             String sql="SELECT `mid` FROM `addmember` ORDER BY mid DESC LIMIT 1";
         
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
           if(rs.next())
           {
                String rnno=rs.getString("mid");
                int co=rnno.length();
               String txt= rnno.substring(0, 2);
               String num=rnno.substring(2, co);
               int n=Integer.parseInt(num);
               n++;
               String snum=Integer.toString(n);
               String ftxt=txt+snum;
               txtmid.setText(ftxt);
            
           }
           else
           {
               txtmid.setText("MI1000");
           }
           
                            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
       
    }
    
    private void clearFild()
    {
    
        txtmid.setText("");
      txtname.setText("");
       txtnic.setText("");
       ((JTextField)datebath.getDateEditor().getUiComponent()).setText("");
       cmbgender.setSelectedIndex(0);
       txtadress.setText("");
      txtemail.setText("");
       txtcontac.setText("");
       cmbmemtype.setSelectedIndex(0);
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox cmbgender;
    private javax.swing.JComboBox cmbmemtype;
    private com.toedter.calendar.JDateChooser datebath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbldetails;
    private javax.swing.JTextArea txtadress;
    private javax.swing.JTextField txtcontac;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnic;
    // End of variables declaration//GEN-END:variables
}
