/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlfile.FORM;

import Class.JDBCConnection;
import Class.SYSConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.CallableStatement;
import oracle.jdbc.OracleTypes;

public class GrantUserForm extends javax.swing.JFrame {

    private SYSConnection sysConnection = new SYSConnection();
    ArrayList<String> lstQuyen = new ArrayList<>();
    private Connection connection;
    private Connection connection2;

    public GrantUserForm() {
        connection2 = sysConnection.getConnection();
        initComponents();
        Loadcbb();
        //Loadcbb2();
    }

    private void LoadcbbQuyensohuu() {
        try {
            CallableStatement callableStatement = connection2.prepareCall("{call GET_USER_PRIVILEGES(?, ?)}");
            callableStatement.setString(1, txtTenuser.getText().toString());
            callableStatement.registerOutParameter(2, OracleTypes.CURSOR);
            callableStatement.execute();
            ResultSet resultSet = (ResultSet) callableStatement.getObject(2);
            while (resultSet.next()) {
                cbbQuyensohuu.addItem(resultSet.getString("PRIVILEGE"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GrantUserForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void LoadcbbQuyensohuu1() {
        try {
            CallableStatement callableStatement = connection2.prepareCall("{call GET_USER_PRIVILEGES(?, ?)}");
            callableStatement.setString(1, txtTenuser.getText().toString());
            callableStatement.registerOutParameter(2, OracleTypes.CURSOR);
            callableStatement.execute();
            ResultSet resultSet = (ResultSet) callableStatement.getObject(2);
            while (resultSet.next()) {
                cbbQuyensohuu.addItem(resultSet.getString("PRIVILEGE"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GrantUserForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void Loadcbb() {
        try {
            CallableStatement callableStatement = connection2.prepareCall("{call get_username(?)}");
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
            callableStatement.execute();
            ResultSet resultSet = (ResultSet) callableStatement.getObject(1);
            while (resultSet.next()) {
                cbbUser.addItem(resultSet.getString("USERNAME"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GrantUserForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void Loadcbb2() {
        try {
            CallableStatement callableStatement = connection2.prepareCall("{call get_tablename(?)}");
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
            callableStatement.execute();
            ResultSet resultSet = (ResultSet) callableStatement.getObject(1);
            while (resultSet.next()) {
                cbbTable.addItem(resultSet.getString("TABLE_NAME"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GrantUserForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void UserMethod() {
        try {
//            Statement statement = connection2.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT USERNAME, USER_ID, ACCOUNT_STATUS FROM DBA_USERS where DEFAULT_TABLESPACE='USERS'");
            CallableStatement callableStatement = connection2.prepareCall("{call GET_USER_DATA(?)}");
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
            callableStatement.execute();
            ResultSet resultSet = (ResultSet) callableStatement.getObject(1);

            var data = new ArrayList<>();
            while (resultSet.next()) {
                int index = data.size() + 1;
                String[] row = new String[5];
                row[0] = String.valueOf(index++);
                row[1] = resultSet.getString("USERNAME");
                row[2] = resultSet.getString("USER_ID");
                row[3] = resultSet.getString("ACCOUNT_STATUS");
                data.add(row);
            }
            TableModel model = new DefaultTableModel(
                    data.toArray(new String[][]{}),
                    new String[]{"STT", "USERNAME", "USER ID", "ACCOUNT STATUS"}
            );
            GrantTable.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnSystem = new javax.swing.JPanel();
        btnQuaylai = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbbQuyen = new javax.swing.JComboBox<>();
        txtTenuser = new javax.swing.JTextField();
        btnCapquyen = new javax.swing.JButton();
        btnThuquyen = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        GrantTable = new javax.swing.JTable();
        cbbQuyensohuu = new javax.swing.JComboBox<>();
        pnUser = new javax.swing.JPanel();
        pnUser1 = new javax.swing.JPanel();
        cbbUser = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbbDatabase = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnCapquyendoituong = new javax.swing.JButton();
        btnAll = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbbTable = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        btnThuHoiQuyen = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbbQuyensohuu1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnSystem.setBackground(new java.awt.Color(255, 255, 255));

        btnQuaylai.setText("Quay lại");
        btnQuaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuaylaiActionPerformed(evt);
            }
        });

        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        jLabel1.setText("Tên user");

        jLabel2.setText("Quyền muốn cấp");

        cbbQuyen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONNECT", "RESOURCE", "UNLIMITED TABLESPACE", "CREATE SESSION", "CREATE TABLE", "CREATE VIEW", "CREATE TRIGGER", "AUDIT_VIEWER", "DV_PUBLIC", "DV_OWNER" }));

        txtTenuser.setEditable(false);

        btnCapquyen.setText("Cấp quyền");
        btnCapquyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapquyenActionPerformed(evt);
            }
        });

        btnThuquyen.setText("Hủy quyền");
        btnThuquyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThuquyenActionPerformed(evt);
            }
        });

        jLabel3.setText("Quyền đang sở hữu");

        GrantTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "STT", "Session", "Process"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        GrantTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GrantTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(GrantTable);

        javax.swing.GroupLayout pnSystemLayout = new javax.swing.GroupLayout(pnSystem);
        pnSystem.setLayout(pnSystemLayout);
        pnSystemLayout.setHorizontalGroup(
            pnSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSystemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSystemLayout.createSequentialGroup()
                        .addGroup(pnSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnSystemLayout.createSequentialGroup()
                                .addGroup(pnSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(pnSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnSystemLayout.createSequentialGroup()
                                        .addComponent(txtTenuser, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(pnSystemLayout.createSequentialGroup()
                                        .addComponent(cbbQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbbQuyensohuu, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnSystemLayout.createSequentialGroup()
                                .addComponent(btnQuaylai)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnThuquyen)))
                        .addGap(12, 12, 12)
                        .addComponent(btnCapquyen)))
                .addContainerGap())
        );
        pnSystemLayout.setVerticalGroup(
            pnSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSystemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbbQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbbQuyensohuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnSystemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCapquyen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThuquyen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnQuaylai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Cấp quyền hệ thống", pnSystem);

        pnUser.setBackground(new java.awt.Color(255, 255, 255));

        pnUser1.setBackground(new java.awt.Color(255, 255, 255));

        cbbUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbUserActionPerformed(evt);
            }
        });

        jLabel4.setText("Tên user");

        cbbDatabase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "QuanLyFile", "Test" }));
        cbbDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbDatabaseActionPerformed(evt);
            }
        });

        jLabel5.setText("Chọn database");

        btnCapquyendoituong.setText("Cấp Quyền");
        btnCapquyendoituong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapquyendoituongActionPerformed(evt);
            }
        });

        btnAll.setText("Chọn tất cả");
        btnAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllActionPerformed(evt);
            }
        });

        jLabel6.setText("Chọn bảng");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cbbTable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FILES", "FOLDERS", "FILEPERMISSION", "RECYCLEBIN" }));
        cbbTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton1.setText("Quay lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jCheckBox1.setText("Select");

        jCheckBox2.setText("Insert");

        jCheckBox3.setText("Update");

        jCheckBox4.setText("Delete");

        jCheckBox5.setText("References");

        jCheckBox6.setText("Alter");

        jCheckBox7.setText("Index");

        jCheckBox8.setText("Excute");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnThuHoiQuyen.setText("Thu Hồi Quyền");
        btnThuHoiQuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThuHoiQuyenActionPerformed(evt);
            }
        });

        jLabel7.setText("Quyền đang sở hữu");

        javax.swing.GroupLayout pnUser1Layout = new javax.swing.GroupLayout(pnUser1);
        pnUser1.setLayout(pnUser1Layout);
        pnUser1Layout.setHorizontalGroup(
            pnUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnUser1Layout.createSequentialGroup()
                .addGroup(pnUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnUser1Layout.createSequentialGroup()
                        .addGroup(pnUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnUser1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(pnUser1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(pnUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnUser1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pnUser1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cbbDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnUser1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cbbTable, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pnUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnUser1Layout.createSequentialGroup()
                                .addComponent(btnAll)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCapquyendoituong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnUser1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(btnThuHoiQuyen))))
                    .addGroup(pnUser1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbQuyensohuu1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addContainerGap())
        );
        pnUser1Layout.setVerticalGroup(
            pnUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUser1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnUser1Layout.createSequentialGroup()
                        .addGroup(pnUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbbDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(pnUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbbQuyensohuu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(pnUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAll, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapquyendoituong, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThuHoiQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnUserLayout = new javax.swing.GroupLayout(pnUser);
        pnUser.setLayout(pnUserLayout);
        pnUserLayout.setHorizontalGroup(
            pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
            .addGroup(pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnUserLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );
        pnUserLayout.setVerticalGroup(
            pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
            .addGroup(pnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnUserLayout.createSequentialGroup()
                    .addContainerGap(9, Short.MAX_VALUE)
                    .addComponent(pnUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(10, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Cấp quyền User", pnUser);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuaylaiActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnQuaylaiActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        UserMethod();
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnCapquyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapquyenActionPerformed
        try {
            String Tenuser = txtTenuser.getText();
            String Quyencap = cbbQuyen.getSelectedItem().toString();

            String grantUser = "GRANT " + Quyencap + " TO " + Tenuser + " ";
            PreparedStatement statement = connection2.prepareStatement(grantUser);
            statement.executeUpdate();

            //            String sql = "{call  GrantPermission('" + Quyencap + "','"+Tenuser+"')}";
            //            CallableStatement call = connection2.prepareCall(sql);
            //            call.executeQuery();
            JOptionPane.showMessageDialog(null, "Cấp quyền thành công!");
        } catch (SQLException ex) {
            Logger.getLogger(GrantUserForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Cấp quyền thất bại!");
        }
    }//GEN-LAST:event_btnCapquyenActionPerformed

    private void btnThuquyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThuquyenActionPerformed
        try {
            String Tenuser = txtTenuser.getText();
            String Quyencap = cbbQuyensohuu.getSelectedItem().toString();

            String grantUser = "REVOKE " + Quyencap + " FROM " + Tenuser + " ";
            PreparedStatement statement = connection2.prepareStatement(grantUser);
            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Thu hồi quyền thành công!");
        } catch (SQLException ex) {
            Logger.getLogger(GrantUserForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Thu hồi quyền thất bại!");
        }
    }//GEN-LAST:event_btnThuquyenActionPerformed

    private void GrantTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GrantTableMouseClicked
        if (GrantTable.getSelectedRow() != -1) {
            int row = GrantTable.getSelectedRow();
            String username = (String) GrantTable.getValueAt(row, 1);
            txtTenuser.setText(username);
            // Tải quyền cho người dùng được chọn trong một luồng riêng biệt
            Runnable loadPrivilegesTask = new Runnable() {
                @Override
                public void run() {
                    try {
                        Statement statement = connection2.createStatement();
                        ResultSet resultSet = statement.executeQuery("SELECT grantee, privilege FROM DBA_SYS_PRIVS WHERE grantee LIKE '" + username + "'");
                        // Xóa các mục hiện có trước khi thêm mục mới
                        cbbQuyensohuu.removeAllItems();
                        while (resultSet.next()) {
                            cbbQuyensohuu.addItem(resultSet.getString("PRIVILEGE"));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(GrantUserForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            };
            // Chạy tác vụ trong một luồng riêng biệt để tránh chặn giao diện người dùng
            new Thread(loadPrivilegesTask).start();
        }
    }//GEN-LAST:event_GrantTableMouseClicked

    private void cbbDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbDatabaseActionPerformed
        Loadcbb2();
    }//GEN-LAST:event_cbbDatabaseActionPerformed

    private void btnCapquyendoituongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapquyendoituongActionPerformed
        if (jCheckBox1.isSelected()) {
            lstQuyen.add(jCheckBox1.getText());
        }
        if (jCheckBox2.isSelected()) {
            lstQuyen.add(jCheckBox2.getText());
        }
        if (jCheckBox3.isSelected()) {
            lstQuyen.add(jCheckBox3.getText());
        }
        if (jCheckBox4.isSelected()) {
            lstQuyen.add(jCheckBox4.getText());
        }
        if (jCheckBox5.isSelected()) {
            lstQuyen.add(jCheckBox5.getText());
        }
        if (jCheckBox6.isSelected()) {
            lstQuyen.add(jCheckBox6.getText());
        }
        if (jCheckBox7.isSelected()) {
            lstQuyen.add(jCheckBox7.getText());
        }
        if (jCheckBox8.isSelected()) {
            lstQuyen.add(jCheckBox8.getText());
        }

        for (String item : lstQuyen) {
            try {
                String Tenuser = cbbUser.getSelectedItem().toString();
                String Table = "PROJECT." + cbbTable.getSelectedItem().toString();

                String grantDoituong = "GRANT " + item + " ON " + Table + " TO " + Tenuser + " ";
                PreparedStatement statement = connection2.prepareStatement(grantDoituong);
                statement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cấp quyền thành công!");
            } catch (SQLException ex) {
                Logger.getLogger(GrantUserForm.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Cấp quyền thất bại!");
            }
        }

    }//GEN-LAST:event_btnCapquyendoituongActionPerformed

    private void btnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllActionPerformed
        jCheckBox1.setSelected(true);
        jCheckBox2.setSelected(true);
        jCheckBox3.setSelected(true);
        jCheckBox4.setSelected(true);
        jCheckBox5.setSelected(true);
        jCheckBox6.setSelected(true);
        jCheckBox7.setSelected(true);
        jCheckBox8.setSelected(true);
    }//GEN-LAST:event_btnAllActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnThuHoiQuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThuHoiQuyenActionPerformed
       
       try {
        try{
            try {
                String Tenuser = cbbUser.getSelectedItem().toString();
                String Quyenhuy = cbbQuyensohuu1.getSelectedItem().toString();
                String Tablename = "PROJECT." + cbbTable.getSelectedItem().toString();

                String grantUser = "REVOKE " + Quyenhuy + " ON " + Tablename + " FROM " + Tenuser;
                PreparedStatement statement = connection2.prepareStatement(grantUser);
                statement.executeUpdate();

                JOptionPane.showMessageDialog(null, "Thu hồi quyền thành công!");
            } catch (SQLException ex) {
                Logger.getLogger(GrantUserForm.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Thu hồi quyền thất bại!");
            }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Vui lòng chọn lại User!");
            cbbUser.requestFocus(); // Di chuyển focus đến combobox
        }
       } catch (NullPointerException e) {
          JOptionPane.showMessageDialog(null, "Bạn chưa chọn quyền sở hữu!");
          cbbQuyensohuu1.requestFocus(); // Di chuyển focus đến combobox
        }
        
    }//GEN-LAST:event_btnThuHoiQuyenActionPerformed

    private void cbbUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbUserActionPerformed
        String username = cbbUser.getSelectedItem().toString();
        String tablename = cbbTable.getSelectedItem().toString();
        Runnable loadTask = new Runnable() {
            @Override
            public void run() {
                try {
                    CallableStatement callableStatement = connection2.prepareCall("{call GET_USER_PRIVS(?, ?, ?)}");
                    callableStatement.setString(1, username);
                    callableStatement.setString(2, tablename);
                    callableStatement.registerOutParameter(3, OracleTypes.CURSOR);

                    callableStatement.execute();

                    ResultSet resultSet = (ResultSet) callableStatement.getObject(3);
                    cbbQuyensohuu1.removeAllItems();
                    while (resultSet.next()) {
                        String privilege = resultSet.getString("PRIVILEGE");
                        // Thêm privilege vào combobox hoặc xử lý theo yêu cầu
                        cbbQuyensohuu1.addItem(privilege);
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(GrantUserForm.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        };
        // Chạy tác vụ trong một luồng riêng biệt để tránh chặn giao diện người dùng
        new Thread(loadTask).start();

    }//GEN-LAST:event_cbbUserActionPerformed

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
            java.util.logging.Logger.getLogger(GrantUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GrantUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GrantUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GrantUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GrantUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable GrantTable;
    private javax.swing.JButton btnAll;
    private javax.swing.JButton btnCapquyen;
    private javax.swing.JButton btnCapquyendoituong;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnQuaylai;
    private javax.swing.JButton btnThuHoiQuyen;
    private javax.swing.JButton btnThuquyen;
    private javax.swing.JComboBox<String> cbbDatabase;
    private javax.swing.JComboBox<String> cbbQuyen;
    private javax.swing.JComboBox<String> cbbQuyensohuu;
    private javax.swing.JComboBox<String> cbbQuyensohuu1;
    private javax.swing.JComboBox<String> cbbTable;
    private javax.swing.JComboBox<String> cbbUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnSystem;
    private javax.swing.JPanel pnUser;
    private javax.swing.JPanel pnUser1;
    private javax.swing.JTextField txtTenuser;
    // End of variables declaration//GEN-END:variables
}
