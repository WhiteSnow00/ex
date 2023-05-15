package ex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;


public class QLHangGiaDungFrm extends javax.swing.JFrame {
    private javax.swing.JTextField txtMaHang;
    private javax.swing.JTextField txtTenHang;
    private javax.swing.JTextField txtNhaSX;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JComboBox<String> comNhaSX;

    /**
     * Creates new form QLQuanAoFrm
     */
    public QLHangGiaDungFrm() {
        comHangSX = new JComboBox();
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        txtMaHang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenHang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        comNhaSX = new javax.swing.JComboBox<>();
        txtNhaSX = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLayDL = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHangGiaDung = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý TiVi");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin TiVi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N

        jLabel1.setText("Mã TiVi:");

        jLabel2.setText("Tên TiVi:");

        jLabel3.setText("Hãng SX:");

        jLabel4.setText("Số Lượng:");

        jLabel5.setText("Đơn Giá:");

        comHangSX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SamSung", "Apple", "LG", "Sony" }));

        btnThem.setText("Thêm");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLayDL.setText("Lấy DL");
        btnLayDL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLayDLMouseClicked(evt);
            }
        });

        jLabel6.setText("Tìm Kiếm:");

        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(comNhaSX, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSoLuong)
                                        .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaHang)
                                    .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(29, 29, 29)
                            .addComponent(txtTimKiem))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLayDL)))
                    .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btnTimKiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comHangSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnLayDL))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTimKiem)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tblHangGiaDung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Hàng", "Tên hàng", "Nhà Sản Xuất", "Số Lượng", "Đơn Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHangGiaDung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHangGiaDungMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHangGiaDung);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
            int row = tblHangGiaDung.getSelectedRow();
            if (row == -1) {
                return;
            }
            String sql = "delete from hang_gia_dung where mahang = '" + txtMaHang.getText() + "';";
            Connection kn = DatabaseUtils.getConnection();
            Statement stmt = kn.createStatement();
            stmt.executeUpdate(sql);
            loadData();
            txtMaHang.setText("");
            txtTenHang.setText("");
            txtNhaSX.setText("");
            txtSoLuong.setText("");
            txtDonGia.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(QLHangGiaDungFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   
    
    private void loadData() {
        DefaultTableModel model = (DefaultTableModel) tblHangGiaDung.getModel();
        model.setRowCount(0); // xoá tất cả các hàng
        tblHangGiaDung.setAutoCreateRowSorter(true);
        try {
            Connection kn = DatabaseUtils.getConnection();
            Statement stm = kn.createStatement();
            ResultSet rs = stm.executeQuery("select * from `hang_gia_dung`;");
            while (rs.next()) {
                Object[] rowData = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
                model.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLHangGiaDungFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            String sql = "insert into `hang_gia_dung`"
                    + "values('" + txtMaHang.getText() + "', '" + txtTenHang.getText()
                    + "', '" + comNhaSX.getSelectedItem()
                    + "', " + txtSoLuong.getText() + ", " + txtDonGia.getText() + ");";
            Connection kn = DatabaseUtils.getConnection();
            Statement stmt = kn.createStatement();
            stmt.executeUpdate(sql);
            loadData();
        } catch ( SQLException ex) {
            Logger.getLogger(QLHangGiaDungFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void btnLayDLMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        loadData();
    }
    
    private void tblHangGiaDungMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        int row = tblHangGiaDung.getSelectedRow();
        if (row >= 0) {
            DefaultTableModel model = (DefaultTableModel) tblHangGiaDung.getModel();
            txtMaHang.setText(model.getValueAt(row, 0).toString());
            txtTenHang.setText(model.getValueAt(row, 1).toString());
            comNhaSX.setSelectedItem(model.getValueAt(row, 2).toString());
            txtSoLuong.setText(model.getValueAt(row, 3).toString());
            txtDonGia.setText(model.getValueAt(row, 4).toString());
        }
    }
    
    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try {
            int row = tblHangGiaDung.getSelectedRow();
            if (row == -1) {
                return;
            }
            String sql = "update `hang_gia_dung` set "
                    + "ten = '" + txtTenHang.getText() + "', "
                    + "nhasx = '" + comNhaSX.getSelectedItem() + "', "
                    + "soluong = " + txtSoLuong.getText() + ", "
                    + "dongia = " + txtDonGia.getText() + " "
                    + "where mahang = '" + txtMaHang.getText() + "';";
            Statement stmt;
            Connection kn = DatabaseUtils.getConnection();
            stmt = kn.createStatement();
            stmt.executeUpdate(sql);
            loadData();
        } catch (SQLException ex) {
            Logger.getLogger(QLHangGiaDungFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnTimKiemMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblHangGiaDung.getModel();
        model.setRowCount(0); // xoá tất cả các hàng
        tblHangGiaDung.setAutoCreateRowSorter(true);
        try {
            // TODO add your handling code here:
            Connection kn = DatabaseUtils.getConnection();
            Statement stm = kn.createStatement();
            ResultSet rs = stm.executeQuery("select * from hang_gia_dung where mahang like '%" + txtTimKiem.getText() + "%'");
            while (rs.next()) {
                Object[] rowData = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
                model.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLHangGiaDungFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTimKiemMouseClicked

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
            java.util.logging.Logger.getLogger(QLHangGiaDungFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLHangGiaDungFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLHangGiaDungFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLHangGiaDungFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLHangGiaDungFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLayDL;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> comHangSX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHangGiaDung;
    private javax.swing.JTextField dongia;
    private javax.swing.JTextField mahang;
    private javax.swing.JTextField soluong;
    private javax.swing.JTextField ten;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
