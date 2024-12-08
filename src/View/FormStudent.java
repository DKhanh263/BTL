/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAOImpl.StudentDAOImpl;
import Model.ClassName;
import Model.Student;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author PRINCE D. TOAD
 */
public class FormStudent extends javax.swing.JFrame {

    Student student;
    private int chucnang;
    private StudentDAOImpl studentDAO = new StudentDAOImpl();
    private List<ClassName> listClass;

    /**
     * Creates new form EditStudent
     */
    public FormStudent(Student student, int chucnang) { // sửa sinh viên
        initComponents();
        loadClassName();
        this.student = student;
        this.chucnang = chucnang;

        if (chucnang == 1) {
            txtTitle.setText("Sửa thông tin sinh viên");
            txtName.setText(student.getFullname());
            txtMath.setText(String.valueOf(student.getPointMath()));
            txtPhysical.setText(String.valueOf(student.getPointPhysical()));
            txtChemistry.setText(String.valueOf(student.getPointChemistry()));
            txtBiological.setText(String.valueOf(student.getPointBiological()));
            txtPass.setVisible(false);
            jLabel9.setVisible(false);

        }
    }

    public FormStudent(int chucnang) { // thêm sinh viên
        initComponents();
        loadClassName();
        this.chucnang = chucnang;

        txtTitle.setText("Thêm sinh viên");
        txtMath.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        txtPhysical.setVisible(false);
        txtChemistry.setVisible(false);
        txtBiological.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtMath = new javax.swing.JTextField();
        txtPhysical = new javax.swing.JTextField();
        txtChemistry = new javax.swing.JTextField();
        txtBiological = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        Thoát = new javax.swing.JButton();
        cbClass = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTitle.setText("Tiêu đề");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tên sinh viên :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Lớp :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Điểm toán :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Điểm lý :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Điểm hóa :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Điểm sinh :");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtMath.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtPhysical.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtChemistry.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtBiological.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        Thoát.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Thoát.setText("Thoát");
        Thoát.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoátActionPerformed(evt);
            }
        });

        cbClass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Password :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(txtTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(46, 46, 46))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(29, 29, 29)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBiological, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(txtChemistry, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(txtPhysical, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(txtMath, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(cbClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel2))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(txtPass)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnSave)
                        .addGap(48, 48, 48)
                        .addComponent(Thoát)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitle)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPhysical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtChemistry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBiological, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(Thoát))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ThoátActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoátActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ThoátActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        student = new Student();
        System.out.println("" +txtName.getText());
        student.setFullname(txtName.getText());
        student.setNameClass(studentDAO.getClassName(cbClass.getSelectedItem().toString()));

        if (chucnang == 1) {
            student.setPointMath(Integer.parseInt(txtMath.getText()));
            student.setPointPhysical(Integer.parseInt(txtPhysical.getText()));
            student.setPointChemistry(Integer.parseInt(txtChemistry.getText()));
            student.setPointBiological(Integer.parseInt(txtBiological.getText()));

            studentDAO.editStudent(student);
        } else {
            student.setPassword(txtPass.getText());
            studentDAO.addStudent(student);
        }

        JOptionPane.showMessageDialog(this, "Lưu sinh viên thành công.");
        dispose();
    }//GEN-LAST:event_btnSaveActionPerformed

    public void loadClassName() {
        listClass = studentDAO.getAllListClassName();
        for (ClassName className : listClass) {
            cbClass.addItem(className.getName());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Thoát;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cbClass;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBiological;
    private javax.swing.JTextField txtChemistry;
    private javax.swing.JTextField txtMath;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPhysical;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
