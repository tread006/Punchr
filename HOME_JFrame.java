package punchr;

import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marisa
 */
public class HOME_JFrame extends javax.swing.JFrame {

    /**
     * Creates new form HOME_JFrame
     */
    public HOME_JFrame() {
        initComponents();
        myInitComponents();
    }
    private void myInitComponents() {
        int HEADER_ROW_HEIGHT = 40;
        int HEADER_WIDTH = 700;
        JTableHeader header = jTableRewards.getTableHeader();
        header.setSize(new Dimension(HEADER_WIDTH, HEADER_ROW_HEIGHT));
        header.setPreferredSize(new Dimension(HEADER_WIDTH, HEADER_ROW_HEIGHT));
        //JScrollPane pane = new JScrollPane(jTableRewards);
        //pane.setColumnHeader(new JViewport() { 
          //  @Override public Dimension getPreferredSize() 
          //  { Dimension d = super.getPreferredSize(); 
          //  d.height = HEADER_ROW_HEIGHT; return d; } });
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_upper = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabel_Welcome = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabel_Dashboard = new javax.swing.JLabel();
        jButton_ShowCode = new javax.swing.JPanel();
        jButton_Logout = new javax.swing.JButton();
        jButton_Refresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRewards = new javax.swing.JTable();
        PunchCount = new javax.swing.JLabel();
        PunchCountLabel = new javax.swing.JLabel();
        jButton_Refresh1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(766, 383));
        setSize(new java.awt.Dimension(766, 383));

        jPanel_upper.setBackground(new java.awt.Color(248, 148, 6));
        jPanel_upper.setToolTipText("");
        jPanel_upper.setMaximumSize(new java.awt.Dimension(250, 95));

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabel_Welcome.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel_Welcome.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Welcome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Welcome.setText("Punch Code Display ");

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabelHidden.setForeground(new java.awt.Color(248, 148, 6));
        jLabelHidden.setText("Hidden");

        jLabel_Dashboard.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Dashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Dashboard.setText("Punchr Rewards Dashboard");

        javax.swing.GroupLayout jPanel_upperLayout = new javax.swing.GroupLayout(jPanel_upper);
        jPanel_upper.setLayout(jPanel_upperLayout);
        jPanel_upperLayout.setHorizontalGroup(
            jPanel_upperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_upperLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelHidden)
                .addGap(61, 61, 61)
                .addComponent(jLabelMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel_upperLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel_Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel_upperLayout.setVerticalGroup(
            jPanel_upperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_upperLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_upperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_upperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelHidden)
                        .addComponent(jLabel_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_upperLayout.createSequentialGroup()
                        .addComponent(jLabelClose)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        jLabelHidden.getAccessibleContext().setAccessibleName("PunchCode");

        jButton_ShowCode.setBackground(new java.awt.Color(44, 62, 80));

        jButton_Logout.setBackground(new java.awt.Color(255, 0, 51));
        jButton_Logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Logout.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Logout.setText("Logout");
        jButton_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LogoutActionPerformed(evt);
            }
        });

        jButton_Refresh.setBackground(new java.awt.Color(34, 167, 240));
        jButton_Refresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Refresh.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Refresh.setText("<html>Refresh<br>Rewards</html>");
        jButton_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RefreshActionPerformed(evt);
            }
        });

        jTableRewards.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableRewards.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reward Description", "<html>Punches<br>Needed", "Reward Code"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableRewards.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableRewards.setRowHeight(40);
        jScrollPane1.setViewportView(jTableRewards);
        if (jTableRewards.getColumnModel().getColumnCount() > 0) {
            jTableRewards.getColumnModel().getColumn(0).setMinWidth(250);
            jTableRewards.getColumnModel().getColumn(0).setPreferredWidth(250);
            jTableRewards.getColumnModel().getColumn(1).setMinWidth(80);
            jTableRewards.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTableRewards.getColumnModel().getColumn(1).setMaxWidth(80);
            jTableRewards.getColumnModel().getColumn(2).setMinWidth(190);
            jTableRewards.getColumnModel().getColumn(2).setPreferredWidth(190);
            jTableRewards.getColumnModel().getColumn(2).setMaxWidth(190);
        }

        PunchCount.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        PunchCount.setForeground(new java.awt.Color(255, 255, 255));
        PunchCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PunchCount.setText("#");

        PunchCountLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        PunchCountLabel.setForeground(new java.awt.Color(255, 255, 255));
        PunchCountLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PunchCountLabel.setText("Number of Punches:");

        jButton_Refresh1.setBackground(new java.awt.Color(255, 153, 51));
        jButton_Refresh1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Refresh1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Refresh1.setText("<html>Show<br>Code</html>");
        jButton_Refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ShowCodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jButton_ShowCodeLayout = new javax.swing.GroupLayout(jButton_ShowCode);
        jButton_ShowCode.setLayout(jButton_ShowCodeLayout);
        jButton_ShowCodeLayout.setHorizontalGroup(
            jButton_ShowCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jButton_ShowCodeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jButton_ShowCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jButton_ShowCodeLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(PunchCount, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jButton_ShowCodeLayout.createSequentialGroup()
                        .addGroup(jButton_ShowCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Refresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))))
            .addGroup(jButton_ShowCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jButton_ShowCodeLayout.createSequentialGroup()
                    .addContainerGap(564, Short.MAX_VALUE)
                    .addComponent(PunchCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(13, 13, 13)))
        );
        jButton_ShowCodeLayout.setVerticalGroup(
            jButton_ShowCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButton_ShowCodeLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(PunchCount, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Refresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jButton_ShowCodeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jButton_ShowCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jButton_ShowCodeLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(PunchCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(321, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_upper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ShowCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_upper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton_ShowCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jButton_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LogoutActionPerformed
        LoginForm lgf = new LoginForm();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton_LogoutActionPerformed

    private void jButton_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RefreshActionPerformed
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT * FROM `rewards` WHERE `punchcode` =?";
        String punchcode = jLabelHidden.getText();
        DefaultTableModel tblModel = (DefaultTableModel)jTableRewards.getModel();
        tblModel.setRowCount(0);

        try 
        {
            ps = MyConnection.getConnection().prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ps.setString(1, punchcode);
            rs = ps.executeQuery();
            
            while(rs.next()) 
            {
                String description = rs.getString("description");
                String punchesneeded = String.valueOf(rs.getString("punchesrequired"));
                String rewardcode;
                if (rs.getInt("used")==1)
                    rewardcode = "Already used";
                else if (rs.getInt("available")==0)
                    rewardcode = "Almost there!";
                else if (rs.getInt("available")==1 && rs.getInt("show_code")==0)
                    rewardcode = "<html>Reward Available!<br>Press \"Show Code\" button";
                else
                    rewardcode = rs.getString("rewardcode");
                
                String tbData[] = {description, punchesneeded, rewardcode};
                
                tblModel.addRow(tbData); 
            }
            updatePunchCount(punchcode);
       
        } catch (SQLException ex) 
            {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton_RefreshActionPerformed

    private void jButton_ShowCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ShowCodeActionPerformed
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT * FROM `rewards` WHERE `punchcode` =?";
        String punchcode = jLabelHidden.getText();
        
        try 
        {
            ps = MyConnection.getConnection().prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ps.setString(1, punchcode);
            rs = ps.executeQuery();
            
            //find all user's rewards and update show_code to 1 if available ==1 and not used and show_code is 0
            while(rs.next()) 
            {
                int available = rs.getInt("available");
                int show_code = rs.getInt("show_code");
                int used = rs.getInt("used");
                
                if (available==1 && show_code == 0 && used == 0)
                    {
                        rs.updateInt("show_code", 1);
                        rs.updateRow();
                    }
                     
            }
            
            jButton_RefreshActionPerformed(evt);
       
        } catch (SQLException ex) 
            {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton_ShowCodeActionPerformed
public void updatePunchCount(String punchcode){
     PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT * FROM `accounts` WHERE `punchcode` =?";
        try 
        {
            ps = MyConnection.getConnection().prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ps.setString(1, punchcode);
            rs = ps.executeQuery();
            
            
            if(rs.next()) //if a record is found
            {
                
                PunchCount.setText(String.valueOf(rs.getInt("punchcount")));
            }
            else 
                { PunchCount.setText("error");}

            
        } catch (SQLException ex) 
            {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
}
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
            java.util.logging.Logger.getLogger(HOME_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HOME_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HOME_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HOME_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HOME_JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel PunchCount;
    public javax.swing.JLabel PunchCountLabel;
    private javax.swing.JButton jButton_Logout;
    private javax.swing.JButton jButton_Refresh;
    private javax.swing.JButton jButton_Refresh1;
    private javax.swing.JPanel jButton_ShowCode;
    private javax.swing.JLabel jLabelClose;
    public final javax.swing.JLabel jLabelHidden = new javax.swing.JLabel();
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabel_Dashboard;
    public javax.swing.JLabel jLabel_Welcome;
    private javax.swing.JPanel jPanel_upper;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableRewards;
    // End of variables declaration//GEN-END:variables
}
