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
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import MainUserInterface.Transport.DisplayTransportStudentJPanel;
/**
 *
 * @author nehashende
 */
public class DisplayStudentInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayStudentInfoJPanel
     */
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    private final Student stud;
    User userAccount;

    public DisplayStudentInfoJPanel(JPanel userProcessContainer, User account, Ecosystem system, Student stud) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        this.userAccount = account;
        this.stud = stud;
        populateNetworkTable();
        populatePatientInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDisplayPatient = new javax.swing.JLabel();
        lblPatientFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblPatientLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblPatientAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblPatientGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblPatientAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPatientPhone = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        txtDateOfBirth = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPhoneNumber5 = new javax.swing.JLabel();
        txtDateOfAdmit = new javax.swing.JTextField();
        lblPhoneNumber4 = new javax.swing.JLabel();
        txtInjuryType = new javax.swing.JTextField();
        lblAddress4 = new javax.swing.JLabel();
        txtBloodGroup = new javax.swing.JTextField();
        lblPatientStatus = new javax.swing.JLabel();
        txtPatientStatus = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAssignDoctor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DoctorTable = new javax.swing.JTable();
        lblPhotoImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDisplayPatient.setBackground(new java.awt.Color(255, 255, 255));
        lblDisplayPatient.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        lblDisplayPatient.setForeground(new java.awt.Color(255, 255, 255));
        lblDisplayPatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisplayPatient.setText("Student Details");
        add(lblDisplayPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 900, 82));

        lblPatientFirstName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setText("First Name");
        add(lblPatientFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txtFirstName.setEditable(false);
        txtFirstName.setBackground(new java.awt.Color(255, 255, 255));
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 160, 30));

        lblPatientLastName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setText("Last Name");
        add(lblPatientLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        txtLastName.setEditable(false);
        txtLastName.setBackground(new java.awt.Color(255, 255, 255));
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 170, 30));

        lblPatientAge.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAge.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientAge.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAge.setText("Age");
        add(lblPatientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        txtAge.setEditable(false);
        txtAge.setBackground(new java.awt.Color(255, 255, 255));
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 130, 30));

        lblPatientGender.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientGender.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setText("Gender");
        add(lblPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        txtGender.setEditable(false);
        txtGender.setBackground(new java.awt.Color(255, 255, 255));
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 140, 30));

        lblPatientAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatientAddress.setText("Address");
        add(lblPatientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        txtAddress.setEditable(false);
        txtAddress.setBackground(new java.awt.Color(255, 255, 255));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 160, 70));

        lblPatientPhone.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setText("Phone Number");
        add(lblPatientPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        txtPhoneNumber.setEditable(false);
        txtPhoneNumber.setBackground(new java.awt.Color(255, 255, 255));
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 150, 30));

        lblDOB.setBackground(new java.awt.Color(255, 255, 255));
        lblDOB.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(255, 255, 255));
        lblDOB.setText("Date of Birth");
        add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        txtDateOfBirth.setEditable(false);
        txtDateOfBirth.setBackground(new java.awt.Color(255, 255, 255));
        txtDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfBirthActionPerformed(evt);
            }
        });
        add(txtDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 140, 30));

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, 20));

        txtEmail.setEditable(false);
        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 150, 30));

        lblPhoneNumber5.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPhoneNumber5.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber5.setText("Date of Enroll ");
        add(lblPhoneNumber5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, 20));

        txtDateOfAdmit.setEditable(false);
        txtDateOfAdmit.setBackground(new java.awt.Color(255, 255, 255));
        txtDateOfAdmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfAdmitActionPerformed(evt);
            }
        });
        add(txtDateOfAdmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 160, 30));

        lblPhoneNumber4.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPhoneNumber4.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber4.setText("Student Type");
        add(lblPhoneNumber4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, 20));

        txtInjuryType.setEditable(false);
        txtInjuryType.setBackground(new java.awt.Color(255, 255, 255));
        txtInjuryType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInjuryTypeActionPerformed(evt);
            }
        });
        add(txtInjuryType, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 150, 30));

        lblAddress4.setBackground(new java.awt.Color(255, 255, 255));
        lblAddress4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblAddress4.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress4.setText("Blood Group");
        add(lblAddress4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, -1, 20));

        txtBloodGroup.setEditable(false);
        txtBloodGroup.setBackground(new java.awt.Color(255, 255, 255));
        txtBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodGroupActionPerformed(evt);
            }
        });
        add(txtBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 130, 150, 30));

        lblPatientStatus.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientStatus.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientStatus.setText("Patient Status");
        add(lblPatientStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, -1, 20));

        txtPatientStatus.setEditable(false);
        txtPatientStatus.setBackground(new java.awt.Color(255, 255, 255));
        txtPatientStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientStatusActionPerformed(evt);
            }
        });
        add(txtPatientStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 220, 150, 30));

        btnBack.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 900, 120, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Available Teachers");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 360, -1));

        btnAssignDoctor.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnAssignDoctor.setText("Assign");
        btnAssignDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDoctorActionPerformed(evt);
            }
        });
        add(btnAssignDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 800, -1, 48));

        DoctorTable.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        DoctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "ID", "Experience", "Age", "Gender", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DoctorTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 1140, 170));
        add(lblPhotoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 160, 200, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfBirthActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtDateOfAdmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfAdmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfAdmitActionPerformed

    private void txtInjuryTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInjuryTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInjuryTypeActionPerformed

    private void txtBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodGroupActionPerformed

    private void txtPatientStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientStatusActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        TeacherAdminWorkArea doctorAdminWorkArea = new TeacherAdminWorkArea(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("Admin Work Panel", doctorAdminWorkArea);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDoctorActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = DoctorTable.getSelectedRow();
        if (selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {

            Teacher teacher = (Teacher) DoctorTable.getValueAt(selectedRowIndex, 0);
            System.out.println("teacher details ---"+teacher);
            System.out.println("stud details ---"+this.stud);
            ecoSystem.getTeacherDirectory().AddStudent(teacher, this.stud);
                    

            JOptionPane.showMessageDialog(null, "Teacher Assigned", "Information", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnAssignDoctorActionPerformed
private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) DoctorTable.getModel();

        model.setRowCount(0);

        for (Teacher Teacher : ecoSystem.getTeacherDirectory().getTeachers()) {

            Object[] row = new Object[9];
            row[0] = Teacher;
            row[1] = Teacher.gettLastName();
            row[2] = Teacher.gettWorkID();
            row[3] = Teacher.gettAddress();
            row[4] = Teacher.gettAge();
            row[5] = Teacher.gettGender();
            row[6] = Teacher.gettEmail();

            model.addRow(row);

        }
    }

     private void populatePatientInfo() {
        
        txtFirstName.setText(stud.getsFirstName());
        txtLastName.setText(stud.getsLastName());
        txtAge.setText(Integer.toString(stud.getsAge()));
        txtGender.setText(stud.getsGender());
        txtAddress.setText(stud.getsAddress());
        txtPhoneNumber.setText(stud.getsPhoneNo());
        txtEmail.setText(stud.getsEmailAddress());
        if(stud.getsdob()!= null)
        {
            txtDateOfBirth.setText(new SimpleDateFormat("MM-dd-yyyy").format(stud.getsdob()));
        }
        if(stud.getsDateOfAdmit()!= null)
        {
            txtDateOfAdmit.setText(new SimpleDateFormat("MM-dd-yyyy").format(stud.getsdob()));
        }
        
        txtInjuryType.setText(stud.getsStudentType());
        txtBloodGroup.setText(stud.getsBloodType());
        txtPatientStatus.setText(stud.getsStatus());
        
        ImageIcon ii = new ImageIcon(stud.getsImageUrl());
        Image image = ii.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        lblPhotoImage.setIcon(new ImageIcon(image));


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DoctorTable;
    private javax.swing.JButton btnAssignDoctor;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress4;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDisplayPatient;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPatientAddress;
    private javax.swing.JLabel lblPatientAge;
    private javax.swing.JLabel lblPatientFirstName;
    private javax.swing.JLabel lblPatientGender;
    private javax.swing.JLabel lblPatientLastName;
    private javax.swing.JLabel lblPatientPhone;
    private javax.swing.JLabel lblPatientStatus;
    private javax.swing.JLabel lblPhoneNumber4;
    private javax.swing.JLabel lblPhoneNumber5;
    private javax.swing.JLabel lblPhotoImage;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBloodGroup;
    private javax.swing.JTextField txtDateOfAdmit;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtInjuryType;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPatientStatus;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
