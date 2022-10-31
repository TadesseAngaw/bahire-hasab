/*
 * Copyright (C) 2016 Tadesse Angaw
 *
 * This program is written by Tadesse Angaw.
 * You can use and redistribute it without modification.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * You can contact me at tadesseangaw@gmail.com
 */
package com.tadesse.bahirehasab.intro;


import java.awt.Desktop;
import java.net.URI;
import java.util.prefs.Preferences;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Tadesse Angaw
 */
public class Three extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;

    Two two;
    JDialog f;

    /**
     * Creates new form Three
     *
     * @param i
     */
    public Three(Intro i) {
        initComponents();
        f = i;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changeName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        facebook = new org.jdesktop.swingx.JXHyperlink();
        mail = new org.jdesktop.swingx.JXHyperlink();
        exit = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        changeName.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        changeName.setForeground(java.awt.Color.red);
        changeName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changeName.setText("  ");
        changeName.setToolTipText("");
        add(changeName);
        changeName.setBounds(220, 150, 180, 17);

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("መልካም ቆይታ");
        add(jLabel2);
        jLabel2.setBounds(10, 40, 550, 50);

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ከሶፍትዌሩ ጋር መልካም ጊዜ እንዲኖርዎ እንመኛለን");
        add(jLabel3);
        jLabel3.setBounds(0, 110, 570, 40);

        jLabel4.setFont(new java.awt.Font("Ebrima", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ለተጨማሪ መረጃ");
        add(jLabel4);
        jLabel4.setBounds(10, 180, 550, 20);

        facebook.setText("ፌስ ቡክ");
        facebook.setToolTipText("");
        facebook.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        facebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facebookActionPerformed(evt);
            }
        });
        add(facebook);
        facebook.setBounds(190, 220, 50, 15);

        mail.setText("ኢሜል");
        mail.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });
        add(mail);
        mail.setBounds(340, 220, 40, 14);

        exit.setFont(new java.awt.Font("Ebrima", 0, 13)); // NOI18N
        exit.setText("ቀጥል");
        exit.setMaximumSize(new java.awt.Dimension(69, 23));
        exit.setMinimumSize(new java.awt.Dimension(69, 23));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        add(exit);
        exit.setBounds(499, 260, 60, 30);

        previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tadesse/bahirehasab/resource/left.png"))); // NOI18N
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });
        add(previous);
        previous.setBounds(10, 260, 40, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tadesse/bahirehasab/resource/background.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 570, 300);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        Preferences root = Preferences.userRoot().node("bahire-hasab");
        f.setVisible(false);
    }//GEN-LAST:event_exitActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        two = new Two((Intro) f);
        f.setContentPane(two);
        f.setSize(f.getWidth() - 1, f.getHeight() - 1);
        f.setSize(f.getWidth() + 1, f.getHeight() + 1);
    }//GEN-LAST:event_previousActionPerformed

    private void facebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facebookActionPerformed
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop d = Desktop.getDesktop();
                d.browse(new URI("https://www.facebook.com/TadesseAngaw"));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Oops!\n"
                        + "It Seems We Can't Connect To Internet!\n\n"
                        + "                   Try Another Time!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_facebookActionPerformed

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop d = Desktop.getDesktop();
                d.browse(new URI("mailto:tadesseangaw@gmail.com"));
            } catch (Exception ex) {
            }
        }
    }//GEN-LAST:event_mailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel changeName;
    private javax.swing.JButton exit;
    private org.jdesktop.swingx.JXHyperlink facebook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private org.jdesktop.swingx.JXHyperlink mail;
    private javax.swing.JButton previous;
    // End of variables declaration//GEN-END:variables
}