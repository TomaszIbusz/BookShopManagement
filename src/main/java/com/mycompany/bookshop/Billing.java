/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bookshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author tomaszibusz
 */
public class Billing extends javax.swing.JFrame {
    public Billing() {
        initComponents();
        
    }
    public Billing(String UN)
    {
        initComponents();
        UNameLbl.setText(UN);
        DisplayBooks();
            BookNameTb.setEditable(false);
            PriceTb.setEditable(false);
            CountRow();
            BillNumberTb.setEditable(false);
    }
Connection Con = null;
Statement St = null, St1 = null;
ResultSet Rs = null, Rs1 = null;
private void DisplayBooks()
{
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL","User1","1234");
        St = Con.createStatement();
        Rs = St.executeQuery("selectv * from User1.BookTbl");
        BooksTable.setModel (DbUtils.resultSetToTableModel(Rs));
    } catch (Exception e) {
        
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ExitBtn = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ClientNameTb = new javax.swing.JTextField();
        PriceTb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BookNameTb = new javax.swing.JTextField();
        UNameLbl = new javax.swing.JLabel();
        BillNumberTb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ResetBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        PrintBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        AddToBillBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        BooksTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillTxt = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        GrdTotalLbl = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JLabel();
        QtyTb1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Damascus", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("Bücher Basar Management System");

        ExitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/bookshop/icons8-x-koordinate-30.png"))); // NOI18N
        ExitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(197, 197, 197)
                .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(ExitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Damascus", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 0));
        jLabel11.setText("Bill Number");

        ClientNameTb.setForeground(new java.awt.Color(0, 204, 0));
        ClientNameTb.setText("jTextField1");

        PriceTb.setForeground(new java.awt.Color(0, 204, 0));
        PriceTb.setText("jTextField1");
        PriceTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTbActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/bookshop/icons8-benutzer-30.png"))); // NOI18N

        BookNameTb.setForeground(new java.awt.Color(0, 204, 0));
        BookNameTb.setText("jTextField1");
        BookNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookNameTbActionPerformed(evt);
            }
        });

        UNameLbl.setFont(new java.awt.Font("Damascus", 0, 20)); // NOI18N
        UNameLbl.setForeground(new java.awt.Color(0, 204, 0));
        UNameLbl.setText("Users");

        BillNumberTb.setForeground(new java.awt.Color(0, 204, 0));
        BillNumberTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillNumberTbActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Damascus", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 0));
        jLabel8.setText("Book Name");

        ResetBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(0, 204, 0));
        ResetBtn.setText("Reset");
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnMouseClicked(evt);
            }
        });
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Damascus", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 0));
        jLabel7.setText("Client Name");

        PrintBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(0, 204, 0));
        PrintBtn.setText("Print");
        PrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBtnMouseClicked(evt);
            }
        });
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Damascus", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 0));
        jLabel9.setText("Price");

        AddToBillBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        AddToBillBtn.setForeground(new java.awt.Color(0, 204, 0));
        AddToBillBtn.setText("Add to Bill");
        AddToBillBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToBillBtnMouseClicked(evt);
            }
        });
        AddToBillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToBillBtnActionPerformed(evt);
            }
        });

        BooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Title", "Author", "Categories", "Quantity", "Price"
            }
        ));
        BooksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BooksTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(BooksTable);

        BillTxt.setColumns(20);
        BillTxt.setRows(5);
        jScrollPane1.setViewportView(BillTxt);

        jLabel13.setFont(new java.awt.Font("Damascus", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 0));
        jLabel13.setText("Bill");

        GrdTotalLbl.setFont(new java.awt.Font("Damascus", 1, 20)); // NOI18N
        GrdTotalLbl.setForeground(new java.awt.Color(0, 204, 0));
        GrdTotalLbl.setText("Total");
        GrdTotalLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GrdTotalLblMouseClicked(evt);
            }
        });

        LogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/bookshop/icons8-abmelden-abgerundet-links-30.png"))); // NOI18N
        LogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseClicked(evt);
            }
        });

        QtyTb1.setForeground(new java.awt.Color(0, 204, 0));
        QtyTb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyTb1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Damascus", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 204, 0));
        jLabel14.setText("Quantity");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(UNameLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ClientNameTb)
                                    .addComponent(BookNameTb, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(AddToBillBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(QtyTb1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(PriceTb, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                            .addComponent(jLabel9)
                                            .addComponent(ResetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel14))
                                        .addGap(21, 21, 21)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(BillNumberTb, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(155, 155, 155))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(GrdTotalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(173, 173, 173))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(200, 200, 200))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LogoutBtn)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BookNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QtyTb1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BillNumberTb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(ClientNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AddToBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(209, 209, 209)))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addComponent(GrdTotalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BookNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookNameTbActionPerformed

    private void BillNumberTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillNumberTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BillNumberTbActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintBtnActionPerformed

    private void AddToBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToBillBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToBillBtnActionPerformed

    private void PriceTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTbActionPerformed
int Stock = 0;
    private void BooksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooksTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)BooksTable.getModel();
        int MyIndex = BooksTable.getSelectedRow();
        BId = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        BookNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        Stock = Integer.valueOf(model.getValueAt(MyIndex, 4).toString());
        PriceTb.setText(model.getValueAt(MyIndex, 5).toString());
    }//GEN-LAST:event_BooksTableMouseClicked
private void SaveBill()
{
    if(BillNumberTb.getText().isEmpty() || ClientNameTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Missing Information");
        }else{
                try{
                    Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL","User1","1234");
                    PreparedStatement add = Con.prepareStatement("insert into BillTbl values(?,?,?,?)");
                    add.setInt(1, Integer.valueOf(BillNumberTb.getText()));
                    add.setString(2, UNameLbl.getText());
                    add.setString(3, ClientNameTb.getText());
                    add.setInt(4, Integer.valueOf(Total));
                    int row = add.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Bill Saved");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
}
    private void Reset()
{
    BookNameTb.setText("");
    PriceTb.setText("");
    BillNumberTb.setText("");
    ClientNameTb.setText("");
    BillTxt.setText("");
    i = 0;
    GrdTotalLbl.setText("Total");
}
int BId;
private void UpdateBook() {
    int newQty = Stock - Integer.valueOf(BillNumberTb.getText());
    try{
                    Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL","User1","1234");
                    
                    String Query = "Update User1.BookTbl set Quantity="+newQty+" where BID="+BId;
                    Statement Delete = Con.createStatement();
                    Delete.executeUpdate(Query);
                    JOptionPane.showMessageDialog(this,"Book Updated");
                    DisplayBooks();
                    //Reset();
                } catch (Exception e) {
                    e.printStackTrace();
                }
}
    int i = 0,Total=0, GrdTotal=0;
    private void AddToBillBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToBillBtnMouseClicked
        if(BillNumberTb.getText().isEmpty() || BookNameTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Missing Information");
        }else if(Integer.valueOf(BillNumberTb.getText())> Stock)
        {
            JOptionPane.showMessageDialog(this,"No Enough Books In Stock");
        }else{
            i++;
            Total = Integer.valueOf(PriceTb.getText())*Integer.valueOf(BillNumberTb.getText());
            if(i == 1)
            {
                BillTxt.setText(BillTxt.getText())+"      ==========BOOK SHOP==========/n"      +" NUM     PRODUCT     PRICE       QUANTITY        TOTAL/n"+i+"       "+BookNameTb.getText()+"      "+PriceTb.getText()+"       "+BillNumberTb.getText()"      "+Total+"/n");
            } else {
                BillTxt.setText(BillTxt.getText()+i+"       "+BookNameTb.getText()+"        "+PriceTb.getText()+"       "+BillNumberTb.getText()+"     "+Total+"/n");
            }
            GrdTotal = GrdTotal + Total;
            GrdTotalLbl.setText("Euro "+ GrdTotal);
            UpdateBook();
        }
    }//GEN-LAST:event_AddToBillBtnMouseClicked

    private void GrdTotalLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GrdTotalLblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_GrdTotalLblMouseClicked
private void CountRow()
{
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL","User1","1234");
        St1 = Con.createStatement();
        Rs1 = St1.executeQuery("select * from User1.BillTbl order by BNUM DESC FETCH FIRST ROW ONLY");
        Rs1.next();
        int Id = Rs1.getInt(1)+1;
        BillNumberTb.setText(Id+"");
    } catch (Exception e) {
        e.printStackTrace();
    }
           
}
    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
        try {
            BillTxt.print();
        } catch (Exception e) {
            
        }
        UpdateBook();
        Reset();
    }//GEN-LAST:event_PrintBtnMouseClicked

    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
        Reset();
    }//GEN-LAST:event_ResetBtnMouseClicked

    private void QtyTb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyTb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtyTb1ActionPerformed

    private void ExitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitBtnMouseClicked

    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToBillBtn;
    private javax.swing.JTextField BillNumberTb;
    private javax.swing.JTextArea BillTxt;
    private javax.swing.JTextField BookNameTb;
    private javax.swing.JTable BooksTable;
    private javax.swing.JTextField ClientNameTb;
    private javax.swing.JLabel ExitBtn;
    private javax.swing.JLabel GrdTotalLbl;
    private javax.swing.JLabel LogoutBtn;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTextField QtyTb1;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel UNameLbl;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
