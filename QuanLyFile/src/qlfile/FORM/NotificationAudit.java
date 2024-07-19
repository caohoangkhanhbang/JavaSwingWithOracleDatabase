
package qlfile.FORM;

import Class.JDBCConnection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleTypes;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleType;


public class NotificationAudit extends javax.swing.JFrame {
    public JDBCConnection classCon = new JDBCConnection();
    public Connection con;
    public String userNameIO, passWordIO;

    private NotificationAudit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setUserNameIO(String userNameIO) {
        this.userNameIO = userNameIO;
    }

    public void setPassWordIO(String passWordIO) {
        this.passWordIO = passWordIO;
    }
    /**
     * Creates new form NotificationAudit
     */
    public NotificationAudit(String userNameIO, String passWordIO){
        
        initComponents();
        this.userNameIO = userNameIO;
        this.passWordIO = passWordIO;
        con = classCon.getConnection(userNameIO, passWordIO);
        loadCountries();
    }
    
    public void loadCountries() 
    {
        ResultSet rs = null;
        String sql = "{call getCountries(?)}";
        CallableStatement cas;
        try {
            cas = con.prepareCall(sql);
            cas.registerOutParameter(1, OracleTypes.CURSOR);
            cas.executeQuery();
            rs = (ResultSet)cas.getObject(1);
        } catch (SQLException ex) {
            Logger.getLogger(NotificationAudit.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(null, "Bạn không có quyền thao tác ", "Cảnh báo", JOptionPane.CANCEL_OPTION);
//            System.exit(0);
        }
        DefaultTableModel model = (DefaultTableModel) tbl_countries.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(new Object[]{"COUNTRY_ID","COUNTRY_NAME","REGION_ID"});
        try {
            while(rs.next())
            {
                Object obj[] = {rs.getString(1), rs.getString(2), rs.getString(3)};
                model.addRow(obj);
            }
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, "Bạn không có quyền thao tác ", "Cảnh báo", JOptionPane.CANCEL_OPTION);
//            System.exit(0);
            Logger.getLogger(NotificationAudit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void kiemTraAudit() {
        ResultSet rs = null;
        String kt = "";
        String audit = "{call canhBaoAudit('HR','DELETE',?)}";
        CallableStatement call2;
        try {
            call2 = con.prepareCall(audit);
            call2.registerOutParameter(3, OracleTypes.CURSOR);
            rs = call2.executeQuery();
            kt = rs.getString("SOLANXOA");
            if(kt.isEmpty())
            {
            }
            else
            {
                int kq = Integer.parseInt(kt);
                if(kq > 10)
                {
                    JOptionPane.showConfirmDialog(null, "Bạn đã xóa quá nhiều lần", "Cảnh báo", JOptionPane.OK_OPTION);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(NotificationAudit.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(null, "Bạn không có quyền thao tác ", "Cảnh báo", JOptionPane.CANCEL_OPTION);
            System.exit(0);
            JOptionPane.showConfirmDialog(null, "Bạn đã xóa quá nhiều lần", "Cảnh báo", JOptionPane.OK_OPTION);
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

        panelRound1 = new swing.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_countries = new javax.swing.JTable();
        btn_xoa = new swing.ButtonGradient();
        btn_quayLai = new swing.ButtonGradient();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cảnh báo tự động khi có thao tác quá mức");

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        tbl_countries.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_countries);

        btn_xoa.setText("Xóa");
        btn_xoa.setColor1(new java.awt.Color(255, 0, 255));
        btn_xoa.setColor2(new java.awt.Color(255, 0, 0));
        btn_xoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_quayLai.setText("Quay lại");
        btn_quayLai.setColor1(new java.awt.Color(204, 0, 204));
        btn_quayLai.setColor2(new java.awt.Color(51, 255, 255));
        btn_quayLai.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_quayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quayLaiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Country information");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btn_quayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_quayLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        try {
            int vt = tbl_countries.getSelectedRow();
            String id = (String)tbl_countries.getValueAt(vt, 0);
           
            int soLuong = 0;
            String sql = "{call xoaCountries('"+id+"')}";
           
            CallableStatement call = con.prepareCall(sql);
            call.executeQuery();
            JOptionPane.showConfirmDialog(null, "Xóa thành công", "Thông báo",JOptionPane.OK_OPTION);
            loadCountries() ;
            kiemTraAudit();
        } catch (SQLException ex) {
            Logger.getLogger(NotificationAudit.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(null, "Xóa thất bại", "Thông báo",JOptionPane.OK_OPTION);
            JOptionPane.showConfirmDialog(null, "Bạn không có quyền thao tác ", "Cảnh báo", JOptionPane.CANCEL_OPTION);
            System.exit(0);
        }
        
                    
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_quayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quayLaiActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_quayLaiActionPerformed

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
            java.util.logging.Logger.getLogger(NotificationAudit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotificationAudit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotificationAudit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotificationAudit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotificationAudit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ButtonGradient btn_quayLai;
    private swing.ButtonGradient btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.PanelRound panelRound1;
    private javax.swing.JTable tbl_countries;
    // End of variables declaration//GEN-END:variables
}
