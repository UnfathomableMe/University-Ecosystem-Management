/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.TeacherAdministration;

import BusinessModel.Teacher.Teacher;
import BusinessModel.Student.Student;
import BusinessModel.UserAccount.User;
import Business_Model.Ecosystem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author nehashende
 */
public class TeacherAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form TeacherAdminWorkArea
     */
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    User userAccount;
    
    public TeacherAdminWorkArea(JPanel userProcessContainer, User account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        this.userAccount = account;
        populateNetworkTable();
        populatePatientTable();
    }
    
    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) DoctorTable.getModel();

        model.setRowCount(0);

        for (Teacher t : ecoSystem.getTeacherDirectory().getTeachers()) {

            Object[] row = new Object[9];
            row[0] = t.gettFirstName();
            row[1] = t.gettLastName();
            row[2] = t.gettWorkID();
            row[3] = t.gettExperience();
            row[4] = t.gettAge();
            row[5] = t.gettGender();
            row[6] = t.gettEmail();
            row[7] = t;
            model.addRow(row);

        }
    }

    private void populatePatientTable() {
        DefaultTableModel model = (DefaultTableModel) PatientTable.getModel();

        model.setRowCount(0);

        for (Student stud : ecoSystem.getStudentDirectory().getStudentList()) {

            Object[] row = new Object[8];
            row[0] = stud.getsFirstName();
            row[1] = stud.getsLastName();
            row[2] = stud.getsStudentType();
            row[3] = stud.getsBloodType();
            row[4] = stud.getsAge();
            row[5] = stud.getsGender();
            row[6] = stud.getsEmailAddress();
            row[7] = stud;
            model.addRow(row);

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

        lblManageTeacher = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DoctorTable = new javax.swing.JTable();
        btnCreateDoctor = new javax.swing.JButton();
        upBtn = new javax.swing.JButton();
        dBtn4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PatientTable = new javax.swing.JTable();
        btnAssignDoctor1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManageTeacher.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        lblManageTeacher.setForeground(new java.awt.Color(255, 255, 255));
        lblManageTeacher.setText("Assign Students to Teacher");
        add(lblManageTeacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        DoctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "TeacherID", "Experience", "Age", "Gender", "Email", "obj"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DoctorTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 460, 820, 180));

        btnCreateDoctor.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        btnCreateDoctor.setText("Create Teacher");
        btnCreateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDoctorActionPerformed(evt);
            }
        });
        add(btnCreateDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 650, -1, 40));

        upBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        upBtn.setText("Update Teacher");
        upBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upBtnActionPerformed(evt);
            }
        });
        add(upBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 650, -1, 40));

        dBtn4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        dBtn4.setText("Delete Teacher");
        dBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBtn4ActionPerformed(evt);
            }
        });
        add(dBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 650, 160, 40));

        PatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Book Category", "Blood Type", "Age", "Gender", "Email", "obj"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(PatientTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 820, 170));

        btnAssignDoctor1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        btnAssignDoctor1.setText("Assign Teacher");
        btnAssignDoctor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDoctor1ActionPerformed(evt);
            }
        });
        add(btnAssignDoctor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, -1, 40));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 34)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Students");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, -1, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Teachers");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDoctorActionPerformed
        // TODO add your handling code here:
        CreateTeacherJPanel createDoctor = new CreateTeacherJPanel(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("Add Doctor", createDoctor);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateDoctorActionPerformed

    private void upBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = DoctorTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Teacher d = (Teacher) DoctorTable.getValueAt(selectedRow, 7);
            UpdateTeacherJPanel updateDoc = new UpdateTeacherJPanel(userProcessContainer, userAccount, ecoSystem, d);
            userProcessContainer.add("Update Doctor", updateDoc);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_upBtnActionPerformed

    private void dBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBtn4ActionPerformed
        // TODO add your handling code here:
       int selectedRow = DoctorTable.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Delete Teacher: " + DoctorTable.getValueAt(selectedRow, 7) + " ??", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {

                Teacher p = (Teacher) DoctorTable.getValueAt(selectedRow, 7);

                ecoSystem.getTeacherDirectory().deleteTeacher(p);
                populateNetworkTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Student");
        }
    }//GEN-LAST:event_dBtn4ActionPerformed

    private void btnAssignDoctor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDoctor1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = PatientTable.getSelectedRow();
        if (selectedRowIndex < 0) 
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } 
        else 
        {
            Student patient = (Student) PatientTable.getValueAt(selectedRowIndex, 7);
            DisplayStudentInfoJPanel displayPatientInfoJPanel = new DisplayStudentInfoJPanel(userProcessContainer, userAccount, ecoSystem, patient);
            userProcessContainer.add("Display Patient", displayPatientInfoJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnAssignDoctor1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DoctorTable;
    private javax.swing.JTable PatientTable;
    private javax.swing.JButton btnAssignDoctor1;
    private javax.swing.JButton btnCreateDoctor;
    private javax.swing.JButton dBtn4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblManageTeacher;
    private javax.swing.JButton upBtn;
    // End of variables declaration//GEN-END:variables
}
