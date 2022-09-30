/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package duanmau.GiaoDien;
import javax.swing.ImageIcon;
/**
 *
 * @author NguyenMinhHau_PS24488
 */
public class Quanlinguoihoc extends javax.swing.JFrame {

    /**
     * Creates new form Quanlichuyende
     */
    public Quanlinguoihoc() {
        initComponents();
        setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btggioitinh = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tab = new javax.swing.JTabbedPane();
        danhsach = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblnguoihoc = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txttimkiem = new javax.swing.JTextField();
        btntimkiem = new javax.swing.JButton();
        capnhat = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtghichu = new javax.swing.JTextArea();
        txtmanh = new javax.swing.JTextField();
        txthovaten = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        btnthem = new javax.swing.JButton();
        btnleftend = new javax.swing.JButton();
        btnleft = new javax.swing.JButton();
        btnrightend = new javax.swing.JButton();
        btnright = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnmoi = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtsdt = new javax.swing.JTextField();
        txtngaysinh = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quản lí người học");
        setIconImage(new ImageIcon(getClass().getResource("/duanmau/image/icon/logo.jpg")).getImage());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Quản lí người học");

        tblnguoihoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã người học", "Họ và tên", "Giới tính", "Ngày sinh", "Số điện thoại", "Email", "Tạo bởi", "Ngày tạo"
            }
        ));
        jScrollPane2.setViewportView(tblnguoihoc);
        if (tblnguoihoc.getColumnModel().getColumnCount() > 0) {
            tblnguoihoc.getColumnModel().getColumn(0).setMinWidth(150);
            tblnguoihoc.getColumnModel().getColumn(0).setPreferredWidth(150);
            tblnguoihoc.getColumnModel().getColumn(0).setMaxWidth(200);
            tblnguoihoc.getColumnModel().getColumn(1).setMinWidth(100);
            tblnguoihoc.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblnguoihoc.getColumnModel().getColumn(1).setMaxWidth(200);
            tblnguoihoc.getColumnModel().getColumn(2).setMinWidth(150);
            tblnguoihoc.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblnguoihoc.getColumnModel().getColumn(2).setMaxWidth(200);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "  Tìm kiếm  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(153, 153, 255))); // NOI18N

        txttimkiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txttimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimkiemActionPerformed(evt);
            }
        });

        btntimkiem.setText("Tìm kiếm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btntimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btntimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout danhsachLayout = new javax.swing.GroupLayout(danhsach);
        danhsach.setLayout(danhsachLayout);
        danhsachLayout.setHorizontalGroup(
            danhsachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(danhsachLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(danhsachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        danhsachLayout.setVerticalGroup(
            danhsachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, danhsachLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        tab.addTab("Danh sách", danhsach);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Ghi chú");

        txtghichu.setColumns(20);
        txtghichu.setRows(5);
        jScrollPane1.setViewportView(txtghichu);

        btnthem.setText("Thêm");

        btnleftend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duanmau/image/icon/leftend.png"))); // NOI18N
        btnleftend.setEnabled(false);
        btnleftend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnleftendActionPerformed(evt);
            }
        });

        btnleft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duanmau/image/icon/left.png"))); // NOI18N
        btnleft.setEnabled(false);
        btnleft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnleftActionPerformed(evt);
            }
        });

        btnrightend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duanmau/image/icon/rightend.png"))); // NOI18N
        btnrightend.setEnabled(false);

        btnright.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duanmau/image/icon/right.png"))); // NOI18N
        btnright.setEnabled(false);
        btnright.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrightActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");
        btnsua.setEnabled(false);
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnmoi.setText("Mới");

        btnxoa.setText("Xóa");
        btnxoa.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Mã người học");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Email");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Học và tên");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Giới tính");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Số điện thoại");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("Ngày sinh");

        btggioitinh.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setText("Nam");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        btggioitinh.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setText("Nữ");

        javax.swing.GroupLayout capnhatLayout = new javax.swing.GroupLayout(capnhat);
        capnhat.setLayout(capnhatLayout);
        capnhatLayout.setHorizontalGroup(
            capnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capnhatLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(capnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(capnhatLayout.createSequentialGroup()
                        .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169)
                        .addComponent(btnleftend)
                        .addGap(28, 28, 28)
                        .addComponent(btnleft)
                        .addGap(28, 28, 28)
                        .addComponent(btnright)
                        .addGap(18, 18, 18)
                        .addComponent(btnrightend))
                    .addGroup(capnhatLayout.createSequentialGroup()
                        .addGroup(capnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(capnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtmanh, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(txthovaten)
                            .addComponent(txtemail))
                        .addGap(40, 40, 40)
                        .addGroup(capnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(capnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(capnhatLayout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtngaysinh)
                            .addComponent(txtsdt)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        capnhatLayout.setVerticalGroup(
            capnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(capnhatLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(capnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(capnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2))
                    .addGroup(capnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtmanh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(capnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(capnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txthovaten, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addGap(40, 40, 40)
                .addGroup(capnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(capnhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrightend)
                    .addComponent(btnright)
                    .addComponent(btnleft)
                    .addComponent(btnleftend)
                    .addComponent(btnmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        btnthem.getAccessibleContext().setAccessibleDescription("25");
        btnsua.getAccessibleContext().setAccessibleDescription("25");
        btnmoi.getAccessibleContext().setAccessibleDescription("25");
        btnxoa.getAccessibleContext().setAccessibleDescription("25");

        tab.addTab("Cập nhật", capnhat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnleftendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnleftendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnleftendActionPerformed

    private void btnleftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnleftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnleftActionPerformed

    private void btnrightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnrightActionPerformed

    private void txttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimkiemActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Quanlinguoihoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quanlinguoihoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quanlinguoihoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quanlinguoihoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quanlinguoihoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btggioitinh;
    private javax.swing.JButton btnleft;
    private javax.swing.JButton btnleftend;
    private javax.swing.JButton btnmoi;
    private javax.swing.JButton btnright;
    private javax.swing.JButton btnrightend;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JPanel capnhat;
    private javax.swing.JPanel danhsach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTable tblnguoihoc;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextArea txtghichu;
    private javax.swing.JTextField txthovaten;
    private javax.swing.JTextField txtmanh;
    private javax.swing.JTextField txtngaysinh;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables

}
