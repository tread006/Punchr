package punchr;
import java.sql.Connection;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marisa Treadway with template code from 1BestCsharp
 */

import java.awt.event.ItemEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.BatchUpdateException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static punchr.CodeGenerator.getCode;

public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
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
        jLabelClose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelBday = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTextField_UN = new javax.swing.JTextField();
        jPasswordField_PASS = new javax.swing.JPasswordField();
        jButton_Register_ = new javax.swing.JButton();
        jButton_CANCEL = new javax.swing.JButton();
        jLabelRegister = new javax.swing.JLabel();
        jLabelFN = new javax.swing.JLabel();
        jTextField_FN = new javax.swing.JTextField();
        jLabelLN = new javax.swing.JLabel();
        jTextField_LN = new javax.swing.JTextField();
        jLabelPasswordRe = new javax.swing.JLabel();
        jPasswordField_REPASS = new javax.swing.JPasswordField();
        jLabelBDate = new javax.swing.JLabel();
        jDateChooser_BDATE = new com.toedter.calendar.JDateChooser();
        jLabelStaff = new javax.swing.JLabel();
        jCheckBoxStaff = new javax.swing.JCheckBox();
        jTextField_StaffCode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Register for Punchr");

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(365, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(112, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabelClose))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabelBday.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelBday.setForeground(new java.awt.Color(236, 240, 241));
        jLabelBday.setText("Username:");

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(236, 240, 241));
        jLabelPassword.setText("Password:");

        jTextField_UN.setBackground(new java.awt.Color(108, 122, 137));
        jTextField_UN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_UN.setForeground(new java.awt.Color(228, 241, 254));

        jPasswordField_PASS.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordField_PASS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_PASS.setForeground(new java.awt.Color(228, 241, 254));

        jButton_Register_.setBackground(new java.awt.Color(34, 167, 240));
        jButton_Register_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Register_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Register_.setText("Register");
        jButton_Register_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Register_ActionPerformed(evt);
            }
        });

        jButton_CANCEL.setBackground(new java.awt.Color(242, 38, 19));
        jButton_CANCEL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_CANCEL.setForeground(new java.awt.Color(255, 255, 255));
        jButton_CANCEL.setText("Cancel");
        jButton_CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CANCELActionPerformed(evt);
            }
        });

        jLabelRegister.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelRegister.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegister.setText("click here to login");
        jLabelRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterMouseClicked(evt);
            }
        });

        jLabelFN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFN.setForeground(new java.awt.Color(236, 240, 241));
        jLabelFN.setText("First Name:");

        jTextField_FN.setBackground(new java.awt.Color(108, 122, 137));
        jTextField_FN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_FN.setForeground(new java.awt.Color(228, 241, 254));

        jLabelLN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelLN.setForeground(new java.awt.Color(236, 240, 241));
        jLabelLN.setText("Last Name:");

        jTextField_LN.setBackground(new java.awt.Color(108, 122, 137));
        jTextField_LN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_LN.setForeground(new java.awt.Color(228, 241, 254));

        jLabelPasswordRe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPasswordRe.setForeground(new java.awt.Color(236, 240, 241));
        jLabelPasswordRe.setText("Retype Pass:");

        jPasswordField_REPASS.setBackground(new java.awt.Color(108, 122, 137));
        jPasswordField_REPASS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_REPASS.setForeground(new java.awt.Color(228, 241, 254));

        jLabelBDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelBDate.setForeground(new java.awt.Color(236, 240, 241));
        jLabelBDate.setText("BirthDate:");

        jLabelStaff.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelStaff.setForeground(new java.awt.Color(236, 240, 241));
        jLabelStaff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStaff.setText("<html>Are you a staff member? Check here<br>Please enter the staff code:</html>");

        jCheckBoxStaff.setToolTipText("");
        jCheckBoxStaff.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxStaffItemStateChanged(evt);
            }
        });

        jTextField_StaffCode.setBackground(new java.awt.Color(108, 122, 137));
        jTextField_StaffCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_StaffCode.setForeground(new java.awt.Color(228, 241, 254));
        jTextField_StaffCode.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButton_CANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton_Register_, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelLN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_LN, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelFN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_FN, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabelBday)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_UN, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabelPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField_PASS, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabelRegister))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelPasswordRe)
                                    .addComponent(jLabelBDate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordField_REPASS, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser_BDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextField_StaffCode, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFN)
                    .addComponent(jTextField_FN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLN)
                    .addComponent(jTextField_LN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBday)
                    .addComponent(jTextField_UN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_PASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassword))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPasswordRe)
                    .addComponent(jPasswordField_REPASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelBDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser_BDATE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStaff)
                    .addComponent(jCheckBoxStaff))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_StaffCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_CANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Register_, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelRegister)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);

    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterMouseClicked
        LoginForm lgf = new LoginForm();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelRegisterMouseClicked

    private void jButton_Register_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Register_ActionPerformed

        String fname = jTextField_FN.getText();
        String lname = jTextField_LN.getText();
        String username = jTextField_UN.getText();
        String password = String.valueOf(jPasswordField_PASS.getPassword());
        String re_pass = String.valueOf(jPasswordField_REPASS.getPassword());
        String bdate = null;
        String staffCode = "00110011";
        boolean restart = false;
        boolean staff = false;
        
        if(jCheckBoxStaff.isSelected())
        {
            if (jTextField_StaffCode.getText().equals(staffCode))
                staff = true;
            else{ 
                JOptionPane.showMessageDialog(null, "Incorrect code for staff- cannot create account");
                restart=true;
            }
        }

        
        if(username.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Username is required");
        }
        
        else if(password.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Password is required");
        }
        else if(!password.equals(re_pass))
        {
            JOptionPane.showMessageDialog(null, "Password must match retyped password");
        }
        
        else if(checkUsername(username, staff))
        {
            JOptionPane.showMessageDialog(null, "Error: This account already exists");
        }
        
        else{
        
            if(jDateChooser_BDATE.getDate() != null)
            {
                SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
                bdate = dateformat.format(jDateChooser_BDATE.getDate());
            }
            
            PreparedStatement ps;
            String queryNewCust = "INSERT INTO `accounts`(`punchcode`, `firstname`, `lastname`, `username`, `password`, `birthdate`, `punchcount`) VALUES (?,?,?,?,?,?,?)";
            String queryNewStaff = "INSERT INTO `staff`(`firstname`, `lastname`, `username`, `password`, `birthdate`) VALUES (?,?,?,?,?)";
            
            if (staff)
            {
                try {
                    
                    ps = MyConnection.getConnection().prepareStatement(queryNewStaff);
                    ps.setString(1, fname);
                    ps.setString(2, lname);
                    ps.setString(3, username);
                    ps.setString(4, password);

                    if(bdate != null)
                    {
                        ps.setString(5, bdate);
                    }else{
                        ps.setNull(5, 0);
                    }
                      
                    if(ps.executeUpdate() > 0)
                    {

                        JOptionPane.showMessageDialog(null, "New Staff User Added");
                        LoginForm lf = new LoginForm();
                        lf.setVisible(true);
                        lf.pack();
                        lf.setLocationRelativeTo(null);
                        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
                    }

            } catch (SQLException ex) {
                Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
            }}
            else if(!restart){
                try{ 
                    ps = MyConnection.getConnection().prepareStatement(queryNewCust);
                    String punchCode = getCode("punchCode");
                    ps.setString(1, punchCode);
                    ps.setString(2, fname);
                    ps.setString(3, lname);
                    ps.setString(4, username);
                    ps.setString(5, password);

                    if(bdate != null)
                    {
                     ps.setString(6, bdate);
                    }else{
                        ps.setNull(6, 0);
                    }
                    ps.setInt(7, 0);

                    if(ps.executeUpdate() > 0)
                    {
                        //Need to change this to dispose of window and open a new login
                        JOptionPane.showMessageDialog(null, "New User Added");
                        LoginForm lf = new LoginForm();
                        lf.setVisible(true);
                        lf.pack();
                        lf.setLocationRelativeTo(null);
                        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        batchUpdate(punchCode);
                        this.dispose();
                    }

            } catch (SQLException ex) {
                Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton_Register_ActionPerformed


    //function to initialize (10) rewards into each new customer account via Rewards db
    public void batchUpdate(String punchCode) throws SQLException {
        PreparedStatement ps;
        String rewardCode1 = getCode("rewardCode");
        String rewardCode2 = getCode("rewardCode");
        String rewardCode3 = getCode("rewardCode");
        String rewardCode4 = getCode("rewardCode");
        String rewardCode5 = getCode("rewardCode");
        String rewardCode6 = getCode("rewardCode");
        String rewardCode7 = getCode("rewardCode");
        String rewardCode8 = getCode("rewardCode");
        String rewardCode9 = getCode("rewardCode");
        String rewardCode10 = getCode("rewardCode");
        String queryreward1 = "INSERT INTO rewards VALUES('"+punchCode+"','"+rewardCode1+"', 'Welcome reward 25% off total bill', 1, 1, 0, 0, 0)";
        String queryreward2 = "INSERT INTO rewards VALUES('"+punchCode+"','"+rewardCode2+"', 'Birthday reward 25% off total bill', 0, 0, 0, 0, 0)";
        String queryreward3 = "INSERT INTO rewards VALUES('"+punchCode+"','"+rewardCode3+"', 'Coffee - deduct (1) from total bill', 0, 0, 0, 5, 1)";
        String queryreward4 = "INSERT INTO rewards VALUES('"+punchCode+"','"+rewardCode4+"', '$5 reward #1', 0, 0, 0, 10, 0)";
        String queryreward5 = "INSERT INTO rewards VALUES('"+punchCode+"','"+rewardCode5+"', '$5 reward #2', 0, 0, 0, 15, 0)";
        String queryreward6 = "INSERT INTO rewards VALUES('"+punchCode+"','"+rewardCode6+"', '$5 reward #3', 0, 0, 0, 20, 0)";
        String queryreward7 = "INSERT INTO rewards VALUES('"+punchCode+"','"+rewardCode7+"', '$10 reward #1', 0, 0, 0, 25, 0)";
        String queryreward8 = "INSERT INTO rewards VALUES('"+punchCode+"','"+rewardCode8+"', '$10 reward #2', 0, 0, 0, 30, 0)";
        String queryreward9 = "INSERT INTO rewards VALUES('"+punchCode+"','"+rewardCode9+"', '(1) Free bumper sticker or magnet', 0, 0, 0, 35, 0)";
        String queryreward10 = "INSERT INTO rewards VALUES('"+punchCode+"','"+rewardCode10+"', '(1) Free hat or shirt', 0, 0, 0, 40, 0)";
        Connection con = MyConnection.getConnection();
        con.setAutoCommit(false);
        try (Statement stmt = con.createStatement()) {

          stmt.addBatch(queryreward1);
          stmt.addBatch(queryreward2);
          stmt.addBatch(queryreward3);
          stmt.addBatch(queryreward4);
          stmt.addBatch(queryreward5);
          stmt.addBatch(queryreward6);
          stmt.addBatch(queryreward7);
          stmt.addBatch(queryreward8);
          stmt.addBatch(queryreward9);
          stmt.addBatch(queryreward10);

          int[] updateCounts = stmt.executeBatch();
          con.commit();
        } catch (BatchUpdateException b) {
          JDBCTutorialUtilities.printBatchUpdateException(b);
        } catch (SQLException ex) {
          JDBCTutorialUtilities.printSQLException(ex);
        } finally {
          con.setAutoCommit(true);
        }

       
    }
    // function to check if the username already exist
    public boolean checkUsername(String username, boolean staff)
    {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String queryCustomer = "SELECT * FROM `accounts` WHERE `username` =?";
        String queryStaff = "SELECT * FROM `staff` WHERE `username` =?";
        
        
        if (staff)
            try {
           
                ps = MyConnection.getConnection().prepareStatement(queryStaff);
                ps.setString(1, username);

                rs = ps.executeQuery();

                if(rs.next())
                {
                    checkUser = true;
                }  

        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        else if(!staff)
            try {
                ps = MyConnection.getConnection().prepareStatement(queryCustomer);
                ps.setString(1, username);

                rs = ps.executeQuery();

                if(rs.next())
                {
                    checkUser = true;
                }
            } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
         return checkUser;
    }
    
    
    private void jButton_CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CANCELActionPerformed
            
        LoginForm lf = new LoginForm();
        lf.setVisible(true);
        lf.pack();
        lf.setLocationRelativeTo(null);
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton_CANCELActionPerformed

    private void jCheckBoxStaffItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxStaffItemStateChanged
        
        if (evt.getStateChange() == ItemEvent.SELECTED)
        {
            jTextField_StaffCode.setEnabled(evt.getStateChange() == ItemEvent.SELECTED);
        }
        else {
            jTextField_StaffCode.setEnabled(false);
            jTextField_StaffCode.setText("");
        }

    }//GEN-LAST:event_jCheckBoxStaffItemStateChanged

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_CANCEL;
    private javax.swing.JButton jButton_Register_;
    private javax.swing.JCheckBox jCheckBoxStaff;
    private com.toedter.calendar.JDateChooser jDateChooser_BDATE;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBDate;
    private javax.swing.JLabel jLabelBday;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelFN;
    private javax.swing.JLabel jLabelLN;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPasswordRe;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JLabel jLabelStaff;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_PASS;
    private javax.swing.JPasswordField jPasswordField_REPASS;
    private javax.swing.JTextField jTextField_FN;
    private javax.swing.JTextField jTextField_LN;
    private javax.swing.JTextField jTextField_StaffCode;
    private javax.swing.JTextField jTextField_UN;
    // End of variables declaration//GEN-END:variables
}
