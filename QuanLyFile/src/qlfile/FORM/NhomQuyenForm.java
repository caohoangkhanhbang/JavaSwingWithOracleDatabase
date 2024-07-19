/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlfile.FORM;

import Class.JDBCConnection;
import Class.SYSConnection;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.CallableStatement;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author QiQi
 */
public class NhomQuyenForm extends javax.swing.JFrame {
    private JDBCConnection databaseConnection = new JDBCConnection();
    private SYSConnection sysConnection=new SYSConnection();
    private String username;
    private String rolename;
    private Connection connection;
    private Connection connection2;
    public NhomQuyenForm() {
        connection2=sysConnection.getConnection();
        
       
        initComponents();   
         
        
    }

//    NhomQuyenForm(String username) {
//    
//    }
//     public void setUsername(String username) {
//        this.username = username;
//             jLabel6.setText(username);
//    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nameNewRole = new javax.swing.JTextField();
        btn_phanquyen = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_deleteRole = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txt_nameRoleDelete = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_DeleteRole = new javax.swing.JButton();
        btn_canleDelete = new javax.swing.JButton();
        btn_createRole = new javax.swing.JButton();
        btn_loadDeleteRole1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JTextField();
        btn_createuser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_loadDeleteRole = new javax.swing.JButton();
        txt_test = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("UserName");

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("XÓA ROLE");

        jLabel4.setText("Vui lòng nhập tên Role muốn tạo");

        btn_phanquyen.setBackground(new java.awt.Color(255, 102, 102));
        btn_phanquyen.setForeground(new java.awt.Color(255, 255, 255));
        btn_phanquyen.setText("Phân Quyền");
        btn_phanquyen.setBorder(new javax.swing.border.MatteBorder(null));
        btn_phanquyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_phanquyenActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("TẠO ROLE MỚI");

        table_deleteRole.setModel(new javax.swing.table.DefaultTableModel(
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
        table_deleteRole.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_deleteRoleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_deleteRole);

        jLabel7.setText("Tên Role muốn xóa");

        jLabel8.setForeground(new java.awt.Color(255, 51, 0));
        jLabel8.setText("Xem các RoleName đang có trong oracle");

        btn_DeleteRole.setText("DELETE");
        btn_DeleteRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteRoleActionPerformed(evt);
            }
        });

        btn_canleDelete.setText("CANCLE");

        btn_createRole.setText("Tạo");
        btn_createRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createRoleActionPerformed(evt);
            }
        });

        btn_loadDeleteRole1.setText("LOAD");
        btn_loadDeleteRole1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadDeleteRole1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nameNewRole, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(btn_createRole, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(474, 474, 474)
                                        .addComponent(btn_phanquyen, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nameRoleDelete)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn_canleDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_DeleteRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(96, 96, 96)
                                .addComponent(btn_loadDeleteRole1))))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel5)
                    .addContainerGap(566, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_nameNewRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_phanquyen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_createRole, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(56, 56, 56)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_loadDeleteRole1)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_nameRoleDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_DeleteRole)
                        .addGap(18, 18, 18)
                        .addComponent(btn_canleDelete)
                        .addGap(0, 210, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel5)
                    .addContainerGap(448, Short.MAX_VALUE)))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("QUẢN LÝ ROLE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel10.setText("Password");

        btn_createuser.setText("create");
        btn_createuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createuserActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btn_loadDeleteRole.setText("LOAD");
        btn_loadDeleteRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadDeleteRoleActionPerformed(evt);
            }
        });

        jButton1.setText("Grant");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("load cbb");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(67, 67, 67)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_test, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_loadDeleteRole)))
                            .addGap(15, 15, 15))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_createuser))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_createuser)
                                .addGap(2, 2, 2)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_loadDeleteRole)
                            .addComponent(txt_test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_createRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createRoleActionPerformed
        try {
            Statement statement = connection2.createStatement();
            CallableStatement cs = connection2.prepareCall("{call create_role(?)}");
            cs.setString(1,txt_nameNewRole.getText());
            cs.execute();
            JOptionPane.showMessageDialog(this, "Create Role successfully.");
//         
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Role đã tồn tại");
            e.printStackTrace();
        }
       
    }//GEN-LAST:event_btn_createRoleActionPerformed

    private void table_deleteRoleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_deleteRoleMouseClicked
        int i = table_deleteRole.getSelectedRow();
        TableModel model = table_deleteRole.getModel();
        txt_nameRoleDelete.setText(model.getValueAt(i,1).toString());
    }//GEN-LAST:event_table_deleteRoleMouseClicked

    private void btn_loadDeleteRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loadDeleteRoleActionPerformed
       try {
            CallableStatement callableStatement=connection2.prepareCall("{call GET_THONGTIN_ROLE(?)}");
//            callableStatement.setString(1,rolename);
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
            callableStatement.execute();
            
            ResultSet resultSet=(ResultSet)callableStatement.getObject(1);
            var data = new ArrayList<>();
            while (resultSet.next()) {
                int index = data.size() + 1;
                String[] row = new String[5];
                row[0] = String.valueOf(index++);
                row[1] = resultSet.getString("ROLE");
               

                data.add(row);
            }
            TableModel model = new DefaultTableModel(
                data.toArray(new String[][] {}), // Convert to array of arrays
                new String[] {"STT","ROLE"} // Set column names
            );
            jTable1.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_loadDeleteRoleActionPerformed
    public void loadCBB() throws SQLException
    {
        Statement st = connection2.createStatement();
        CallableStatement cs = connection2.prepareCall(("{call GET_USERNAME_DBA_USERS(?)}"));
        cs.registerOutParameter(1, OracleTypes.CURSOR);
        cs.execute();
        ResultSet rs=(ResultSet)cs.getObject(1);
        while(rs.next())
        {
            jComboBox1.addItem(rs.getString("USERNAME"));
        }
    }
    private void btn_DeleteRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteRoleActionPerformed
         try {
            Statement statement = connection2.createStatement();
            CallableStatement cs = connection2.prepareCall("{call drop_role(?)}");
            cs.setString(1,txt_nameRoleDelete.getText());
            cs.execute();
            JOptionPane.showMessageDialog(this, "Drop Role successfully.");
//            statement.executeUpdate("DROP ROLE "+txt_nameRoleDelete.getText()+"");
//            //statement.executeUpdate("GRANT"+txt_nameNewRole.getText()+" to "+jLabel6.getText()+"");
//            JOptionPane.showMessageDialog(null, "Xóa Role thành công !");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to Drop Role");
        }
        
        DeleteUserMethod();
    }//GEN-LAST:event_btn_DeleteRoleActionPerformed

    private void btn_phanquyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_phanquyenActionPerformed
       
        PhanQuyenForm phanquyenfrom = new PhanQuyenForm();
        phanquyenfrom.setVisible(true);
        phanquyenfrom.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_phanquyenActionPerformed

    private void btn_createuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createuserActionPerformed
        try {
            CallableStatement cs = connection2.prepareCall("{call create_user(?,?)}");
            cs.setString(1,txt_username.getText());
            cs.setString(2, txt_pass.getText());
            cs.execute();
            JOptionPane.showMessageDialog(this, "Create User successfully.");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, "false.");
             e.printStackTrace();
        }
    }//GEN-LAST:event_btn_createuserActionPerformed

    private void btn_loadDeleteRole1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loadDeleteRole1ActionPerformed
         try {
            CallableStatement callableStatement=connection2.prepareCall("{call GET_ROLE_SYS(?)}");
//            callableStatement.setString(1,rolename);
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
            callableStatement.execute();
            
            ResultSet resultSet=(ResultSet)callableStatement.getObject(1);
            var data = new ArrayList<>();
            while (resultSet.next()) {
                int index = data.size() + 1;
                String[] row = new String[5];
                row[0] = String.valueOf(index++);
                row[1] = resultSet.getString("ROLE");
               

                data.add(row);
            }
            TableModel model = new DefaultTableModel(
                data.toArray(new String[][] {}), // Convert to array of arrays
                new String[] {"STT","ROLE"} // Set column names
            );
            table_deleteRole.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_loadDeleteRole1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        txt_test.setText(model.getValueAt(i,1).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            loadCBB();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
            CallableStatement cs = connection2.prepareCall("{call grant_role_to_user(?,?)}");
            cs.setString(1,jComboBox1.getSelectedItem().toString());
            cs.setString(2, txt_test.getText());
            cs.execute();
            JOptionPane.showMessageDialog(this, "Grant successfully.");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, "false.");
             e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
        

     private void DeleteUserMethod(){
         try {
            CallableStatement callableStatement=connection2.prepareCall("{call GET_THONGTIN_ROLE(?)}");
//            callableStatement.setString(1,rolename);
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
            callableStatement.execute();
            
            ResultSet resultSet=(ResultSet)callableStatement.getObject(1);
            var data = new ArrayList<>();
            while (resultSet.next()) {
                int index = data.size() + 1;
                String[] row = new String[5];
                row[0] = String.valueOf(index++);
                row[1] = resultSet.getString("ROLE");
                row[2] = resultSet.getString("PRIVILEGE");
                row[3] = resultSet.getString("ADMIN_OPTION");
                row[4] = resultSet.getString("COMMON");

                data.add(row);
            }
            TableModel model = new DefaultTableModel(
                data.toArray(new String[][] {}), // Convert to array of arrays
                new String[] {"STT","ROLE", "PRIVILEGE","ADMIN_OPTION","COMMON"} // Set column names
            );
            table_deleteRole.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
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
            java.util.logging.Logger.getLogger(NhomQuyenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhomQuyenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhomQuyenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhomQuyenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhomQuyenForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DeleteRole;
    private javax.swing.JButton btn_canleDelete;
    private javax.swing.JButton btn_createRole;
    private javax.swing.JButton btn_createuser;
    private javax.swing.JButton btn_loadDeleteRole;
    private javax.swing.JButton btn_loadDeleteRole1;
    private javax.swing.JButton btn_phanquyen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable table_deleteRole;
    private javax.swing.JTextField txt_nameNewRole;
    private javax.swing.JTextField txt_nameRoleDelete;
    private javax.swing.JTextField txt_pass;
    private javax.swing.JTextField txt_test;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
