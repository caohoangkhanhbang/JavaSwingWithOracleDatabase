/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlfile.FORM;

import Class.JDBCConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.PreparedStatement;

/**
 *
 * @author Kiêt
 */
public class CRUD_FolderForm extends javax.swing.JFrame {
    private JDBCConnection databaseConnection = new JDBCConnection();
    private Connection connection;
    private String username;
    private String password;
    public CRUD_FolderForm() {
        
        initComponents();
    }
    
     public void setUsernameAndPassword(String username, String password) {
        this.username = username;
        this.password = password;
        connection = databaseConnection.getConnection(username, password);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblFolder = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtCha = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        btnLoad1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblFolder.setModel(new javax.swing.table.DefaultTableModel(
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
        tblFolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFolderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFolder);

        jLabel1.setText("Tên Folder");

        jLabel2.setText("Folder cha");

        jLabel3.setText("Mô tả");

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane2.setViewportView(txtMoTa);

        jLabel4.setText("Folder ID");

        txtID.setEditable(false);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnLoad1.setBackground(new java.awt.Color(255, 51, 51));
        btnLoad1.setText("Quay lại");
        btnLoad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoad1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCha, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLoad)
                        .addGap(40, 40, 40)
                        .addComponent(btnLoad1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLoad1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void Load(){
        try {
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT FD_ID,FD_NAME,FD_FATHER,FD_DESCRIBE FROM PROJECT.FOLDERS");
         
            var data = new ArrayList<>();
            while (resultSet.next()) {
                String[] row = new String[4];
                row[0] = resultSet.getString("FD_ID");
                row[1] = resultSet.getString("FD_NAME");
                row[2] = resultSet.getString("FD_FATHER");
                row[3] = resultSet.getString("FD_DESCRIBE");
                data.add(row);
            }
            TableModel model = new DefaultTableModel(
                    data.toArray(new String[][] {}), // Convert to array of arrays
                    new String[] {"F_ID", "F_NAME","F_FATHER","F_DESCRIBE"} // Set column names
            );
                tblFolder.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "User "+username+" Không có quyền truy cập bảng FOLDERS");
        } 
    }
    
    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        Load();
    }//GEN-LAST:event_btnLoadActionPerformed

    private void tblFolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFolderMouseClicked
        int i = tblFolder.getSelectedRow();
        TableModel model = tblFolder.getModel();
        txtID.setText(model.getValueAt(i,0).toString());
        txtTen.setText(model.getValueAt(i,1).toString());
        
        txtMoTa.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_tblFolderMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            String id = txtID.getText();
            String ten = txtTen.getText();
            String cha=txtCha.getText();
            String mota=txtMoTa.getText();
            String sql = "INSERT INTO PROJECT.FOLDERS (FD_NAME,FD_FATHER,FD_DESCRIBE)\n" +
                        "VALUES ('"+ten+"','"+cha+"','"+mota+"')";
            Statement st = connection.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Thêm thành công");
            
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "User "+username+" Không có quyền thêm dữ liệu trong bảng FOLDERS");
        }
        Load();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            String id = txtID.getText();
            String sql = "DELETE FROM PROJECT.FOLDERS WHERE FD_ID=?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);

            int rowsDeleted = preparedStatement.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Xóa thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Không tìm thấy thư mục để xóa");
            }

            preparedStatement.close(); // Đóng preparedStatement

        } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "User "+username+" Không có quyền xóa dữ liệu trong bảng FOLDERS");
        }
        Load();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {
            String id = txtID.getText();
            String ten = txtTen.getText();
            String mota = txtMoTa.getText();

            String sql = "UPDATE PROJECT.FOLDERS SET FD_NAME=?, FD_DESCRIBE=? WHERE FD_ID=?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ten);
            preparedStatement.setString(2, mota);
            preparedStatement.setString(3, id);

            int rowsUpdated = preparedStatement.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Sửa thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Không tìm thấy thư mục để sửa");
            }

            preparedStatement.close(); // Đóng preparedStatement
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "User "+username+" Không có quyền sửa dữ liệu trong bảng FOLDERS");
        }
        Load();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLoad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoad1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnLoad1ActionPerformed

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
            java.util.logging.Logger.getLogger(CRUD_FolderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD_FolderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD_FolderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD_FolderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD_FolderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnLoad1;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblFolder;
    private javax.swing.JTextField txtCha;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
