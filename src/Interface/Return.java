/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Linus
 */
public class Return extends javax.swing.JInternalFrame {

    /**
     * Creates new form Return
     */
    
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public Return() {
        initComponents();
        conn=DBConnect.connect();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtbid = new javax.swing.JTextField();
        txtmid = new javax.swing.JTextField();
        txtlateday = new javax.swing.JTextField();
        txtfine = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(850, 500));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel5.setText("Book ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel6.setText("Member ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel7.setText("Late days");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel8.setText("Fine");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        txtbid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbidKeyReleased(evt);
            }
        });
        jPanel1.add(txtbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, -1));

        txtmid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txtmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, -1));

        txtlateday.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txtlateday, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 170, -1));

        txtfine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txtfine, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 170, -1));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 320, 300));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 790, 40));

        txtbill.setColumns(20);
        txtbill.setRows(5);
        jScrollPane1.setViewportView(txtbill);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 210, 280));

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 230, 300));

        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 320, 60));

        jButton2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 230, 60));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 810, 440));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 460));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String bid=txtbid.getText();
        String mid=txtmid.getText();
        String ldate=txtlateday.getText();
        String fine=txtfine.getText();
        
         try {
            
                String sql="INSERT INTO `bookreturn`( `bid`, `mid`, `late_days`, `fine`) VALUES ('"+bid+"','"+mid+"','"+ldate+"','"+fine+"')";
            PreparedStatement pst=(PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
            update();
            bill();
            retunMark();
                 JOptionPane.showMessageDialog(rootPane, "Successfully insert");
                
        } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
        }
        
        
        
        
    }

    private void bill()
    {
    txtbill.setText("==================="+"\n"
            +"Library Name"+"\n"
            +"No of Date\t"+txtlateday.getText()+"\n"
            +"Amount\t"+txtfine.getText()+"\n"
            +"======================"
    );
    
    
    }
    
    
     private void update()
      {
          
       try {
            String  sql = "UPDATE `addbook` SET `mark`='0' WHERE bid='"+txtbid.getText()+"'";
         pst=(PreparedStatement) conn.prepareStatement(sql);
         pst.execute();
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
      
     
      }
    
      private void retunMark()
      {
          
       try {
            String  sql = "UPDATE `booklend` SET `mark`='1' WHERE bid='"+txtbid.getText()+"'";
         pst=(PreparedStatement) conn.prepareStatement(sql);
         pst.execute();
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
      
     
      }
     
    
    private void txtbidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbidKeyReleased
      
         try {
             String sql="SELECT `mid`, `r_date` FROM `booklend` WHERE bid='"+txtbid.getText()+"' and mark='0'";
         
            pst=(PreparedStatement) conn.prepareStatement(sql);
            rs=pst.executeQuery();
           if(rs.next())
           {
                txtmid.setText(rs.getString("mid"));
                String r_date=rs.getString("r_date");
                LocalDate today=LocalDate.now();
                LocalDate rday=LocalDate.parse(r_date);
                
                Long day_gap=ChronoUnit.DAYS.between(rday, today);
                if(day_gap>0)
                {
                txtlateday.setText(day_gap.toString());
                
                long fine=10*day_gap;
                txtfine.setText(String.valueOf(fine));
                }
                else
                {
                txtlateday.setText("0");
                txtfine.setText("0");
                }
            
           }
        
        
    }
                catch(Exception e)
                {


                }
}
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            txtbill.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Return.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField txtbid;
    private javax.swing.JTextArea txtbill;
    private javax.swing.JTextField txtfine;
    private javax.swing.JTextField txtlateday;
    private javax.swing.JTextField txtmid;
    // End of variables declaration//GEN-END:variables
}