/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Mohammad
 */
public class Start extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    public Start() {
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

        bg_panel = new javax.swing.JPanel();
        userNameTextField = new javax.swing.JTextField();
        satelliteImage = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        footerLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        backGraound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(300, 100));
        setUndecorated(true);
        setResizable(false);

        bg_panel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bg_panelMouseDragged(evt);
            }
        });
        bg_panel.setLayout(null);
        bg_panel.add(userNameTextField);
        userNameTextField.setBounds(20, 230, 280, 28);

        satelliteImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/b.png"))); // NOI18N
        satelliteImage.setText("jLabel3");
        bg_panel.add(satelliteImage);
        satelliteImage.setBounds(90, 10, 130, 128);

        titleLabel.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 51));
        titleLabel.setText("سامانه هوشمند دریافت مشاهدات پایش آسمان");
        bg_panel.add(titleLabel);
        titleLabel.setBounds(30, 130, 280, 24);

        userNameLabel.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(102, 255, 255));
        userNameLabel.setText("نام کاربری");
        bg_panel.add(userNameLabel);
        userNameLabel.setBounds(240, 210, 60, 19);
        bg_panel.add(passwordField);
        passwordField.setBounds(20, 300, 280, 28);

        passwordLabel.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(51, 255, 255));
        passwordLabel.setText("کلمه عبور");
        bg_panel.add(passwordLabel);
        passwordLabel.setBounds(240, 280, 60, 23);

        loginButton.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 0, 102));
        loginButton.setText("ورود");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        bg_panel.add(loginButton);
        loginButton.setBounds(160, 340, 100, 50);

        registerButton.setFont(new java.awt.Font("sansserif", 1, 17)); // NOI18N
        registerButton.setForeground(new java.awt.Color(0, 0, 102));
        registerButton.setText("ثبت نام");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        bg_panel.add(registerButton);
        registerButton.setBounds(50, 340, 100, 50);
        bg_panel.add(jSeparator1);
        jSeparator1.setBounds(0, 430, 320, 10);

        footerLabel.setForeground(new java.awt.Color(255, 255, 0));
        footerLabel.setText("سازمان جغرافیایی نیروهای مسلح جمهوری اسلامی ایران");
        bg_panel.add(footerLabel);
        footerLabel.setBounds(41, 440, 260, 16);

        exitButton.setBackground(new java.awt.Color(0, 0, 0));
        exitButton.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 0, 51));
        exitButton.setText("X");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        bg_panel.add(exitButton);
        exitButton.setBounds(280, 0, 40, 30);

        backGraound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bg2.png"))); // NOI18N
        backGraound.setText("jLabel1");
        bg_panel.add(backGraound);
        backGraound.setBounds(0, 0, 320, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bg_panelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bg_panelMouseDragged
                 int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x, y);
    }//GEN-LAST:event_bg_panelMouseDragged

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGraound;
    private javax.swing.JPanel bg_panel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel footerLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel satelliteImage;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
