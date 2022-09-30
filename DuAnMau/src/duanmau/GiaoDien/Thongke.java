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
public class Thongke extends javax.swing.JFrame {

    /**
     * Creates new form Thongke
     */
    public Thongke() {
        initComponents();
        init();
    }

    private void init() {
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

        jLabel1 = new javax.swing.JLabel();
        tab = new javax.swing.JTabbedPane();
        tabbangdiem = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbkhoahoc = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblkhoahoc = new javax.swing.JTable();
        tabnguoihoc = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblnguoihoc = new javax.swing.JTable();
        tabdiemchuyende = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblchuyende = new javax.swing.JTable();
        tabdoanhthu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cbnam = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbldoanhthu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tổng hợp và thống kê");
        setIconImage(new ImageIcon(getClass().getResource("/duanmau/image/icon/icon.png")).getImage());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Tổng hợp thống kê");

        tab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Khóa học :");

        cbkhoahoc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tblkhoahoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblkhoahoc.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 14));
        tblkhoahoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NH", "Họ và tên", "Điểm", "Xếp loại"
            }
        ));
        jScrollPane1.setViewportView(tblkhoahoc);
        if (tblkhoahoc.getColumnModel().getColumnCount() > 0) {
            tblkhoahoc.getColumnModel().getColumn(0).setMinWidth(100);
            tblkhoahoc.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblkhoahoc.getColumnModel().getColumn(0).setMaxWidth(150);
            tblkhoahoc.getColumnModel().getColumn(2).setMinWidth(100);
            tblkhoahoc.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblkhoahoc.getColumnModel().getColumn(2).setMaxWidth(150);
            tblkhoahoc.getColumnModel().getColumn(3).setMinWidth(100);
            tblkhoahoc.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblkhoahoc.getColumnModel().getColumn(3).setMaxWidth(200);
        }

        javax.swing.GroupLayout tabbangdiemLayout = new javax.swing.GroupLayout(tabbangdiem);
        tabbangdiem.setLayout(tabbangdiemLayout);
        tabbangdiemLayout.setHorizontalGroup(
            tabbangdiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabbangdiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabbangdiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                    .addGroup(tabbangdiemLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbkhoahoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tabbangdiemLayout.setVerticalGroup(
            tabbangdiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabbangdiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabbangdiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbkhoahoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab.addTab("Bảng điểm", tabbangdiem);

        tblnguoihoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblnguoihoc.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 14));
        tblnguoihoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Năm", "Số người học", "Đăng kí sớm nhất", "Đăng kí muộn nhất"
            }
        ));
        jScrollPane2.setViewportView(tblnguoihoc);
        if (tblnguoihoc.getColumnModel().getColumnCount() > 0) {
            tblnguoihoc.getColumnModel().getColumn(0).setMinWidth(100);
            tblnguoihoc.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblnguoihoc.getColumnModel().getColumn(0).setMaxWidth(150);
            tblnguoihoc.getColumnModel().getColumn(1).setMinWidth(150);
            tblnguoihoc.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblnguoihoc.getColumnModel().getColumn(1).setMaxWidth(150);
            tblnguoihoc.getColumnModel().getColumn(2).setMinWidth(280);
            tblnguoihoc.getColumnModel().getColumn(2).setPreferredWidth(280);
            tblnguoihoc.getColumnModel().getColumn(2).setMaxWidth(600);
            tblnguoihoc.getColumnModel().getColumn(3).setMinWidth(280);
            tblnguoihoc.getColumnModel().getColumn(3).setPreferredWidth(280);
            tblnguoihoc.getColumnModel().getColumn(3).setMaxWidth(600);
        }

        javax.swing.GroupLayout tabnguoihocLayout = new javax.swing.GroupLayout(tabnguoihoc);
        tabnguoihoc.setLayout(tabnguoihocLayout);
        tabnguoihocLayout.setHorizontalGroup(
            tabnguoihocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabnguoihocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabnguoihocLayout.setVerticalGroup(
            tabnguoihocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabnguoihocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab.addTab("Người học", tabnguoihoc);

        tblchuyende.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblchuyende.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 14));
        tblchuyende.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chuyên đề", "Số lượng học viên", "Điểm MIN", "Điểm MAX", "Điểm AVG"
            }
        ));
        jScrollPane3.setViewportView(tblchuyende);
        if (tblchuyende.getColumnModel().getColumnCount() > 0) {
            tblchuyende.getColumnModel().getColumn(1).setMinWidth(200);
            tblchuyende.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblchuyende.getColumnModel().getColumn(1).setMaxWidth(300);
            tblchuyende.getColumnModel().getColumn(2).setMinWidth(100);
            tblchuyende.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblchuyende.getColumnModel().getColumn(2).setMaxWidth(150);
            tblchuyende.getColumnModel().getColumn(3).setMinWidth(100);
            tblchuyende.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblchuyende.getColumnModel().getColumn(3).setMaxWidth(150);
            tblchuyende.getColumnModel().getColumn(4).setMinWidth(100);
            tblchuyende.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblchuyende.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        javax.swing.GroupLayout tabdiemchuyendeLayout = new javax.swing.GroupLayout(tabdiemchuyende);
        tabdiemchuyende.setLayout(tabdiemchuyendeLayout);
        tabdiemchuyendeLayout.setHorizontalGroup(
            tabdiemchuyendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabdiemchuyendeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabdiemchuyendeLayout.setVerticalGroup(
            tabdiemchuyendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabdiemchuyendeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab.addTab("Điểm chuyên đề", tabdiemchuyende);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("  Năm :");

        cbnam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tbldoanhthu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbldoanhthu.getTableHeader().setFont(new java.awt.Font("Tahoma", 0, 14));
        tbldoanhthu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chuyên đề", "Số khóa học", "Số học viên", "Doanh thu", "Học phí thấp nhất", "Học phí cao nhất", "Học phí trung bình"
            }
        ));
        jScrollPane4.setViewportView(tbldoanhthu);
        if (tbldoanhthu.getColumnModel().getColumnCount() > 0) {
            tbldoanhthu.getColumnModel().getColumn(0).setMinWidth(200);
            tbldoanhthu.getColumnModel().getColumn(0).setMaxWidth(600);
            tbldoanhthu.getColumnModel().getColumn(1).setMinWidth(80);
            tbldoanhthu.getColumnModel().getColumn(1).setPreferredWidth(80);
            tbldoanhthu.getColumnModel().getColumn(1).setMaxWidth(300);
            tbldoanhthu.getColumnModel().getColumn(2).setMinWidth(80);
            tbldoanhthu.getColumnModel().getColumn(2).setPreferredWidth(80);
            tbldoanhthu.getColumnModel().getColumn(2).setMaxWidth(300);
            tbldoanhthu.getColumnModel().getColumn(3).setMinWidth(80);
            tbldoanhthu.getColumnModel().getColumn(3).setPreferredWidth(80);
            tbldoanhthu.getColumnModel().getColumn(3).setMaxWidth(300);
            tbldoanhthu.getColumnModel().getColumn(4).setMinWidth(100);
            tbldoanhthu.getColumnModel().getColumn(4).setPreferredWidth(100);
            tbldoanhthu.getColumnModel().getColumn(4).setMaxWidth(300);
            tbldoanhthu.getColumnModel().getColumn(5).setMinWidth(100);
            tbldoanhthu.getColumnModel().getColumn(5).setPreferredWidth(100);
            tbldoanhthu.getColumnModel().getColumn(5).setMaxWidth(300);
            tbldoanhthu.getColumnModel().getColumn(6).setMinWidth(100);
            tbldoanhthu.getColumnModel().getColumn(6).setPreferredWidth(100);
            tbldoanhthu.getColumnModel().getColumn(6).setMaxWidth(300);
        }

        javax.swing.GroupLayout tabdoanhthuLayout = new javax.swing.GroupLayout(tabdoanhthu);
        tabdoanhthu.setLayout(tabdoanhthuLayout);
        tabdoanhthuLayout.setHorizontalGroup(
            tabdoanhthuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabdoanhthuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabdoanhthuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                    .addGroup(tabdoanhthuLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbnam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tabdoanhthuLayout.setVerticalGroup(
            tabdoanhthuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabdoanhthuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabdoanhthuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbnam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab.addTab("Doanh thu", tabdoanhthu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tab)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(tab)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Thongke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Thongke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Thongke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Thongke.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Thongke().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbkhoahoc;
    private javax.swing.JComboBox<String> cbnam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JPanel tabbangdiem;
    private javax.swing.JPanel tabdiemchuyende;
    private javax.swing.JPanel tabdoanhthu;
    private javax.swing.JPanel tabnguoihoc;
    private javax.swing.JTable tblchuyende;
    private javax.swing.JTable tbldoanhthu;
    private javax.swing.JTable tblkhoahoc;
    private javax.swing.JTable tblnguoihoc;
    // End of variables declaration//GEN-END:variables
}
