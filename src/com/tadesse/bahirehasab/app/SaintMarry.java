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
package com.tadesse.bahirehasab.app;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import com.tadesse.bahirehasab.tools.EthiopianCalendar;
import java.awt.Color;

/**
 *
 * @author Tadesse Angaw
 */
public class SaintMarry extends javax.swing.JDialog {

    private static final long serialVersionUID = 1L;

    EthiopianCalendar ec;
    int Year;

    String description[] = {Description._1, Description._2, Description._3, Description._4, Description._5, Description._6,
        Description._7, Description._8, Description._9, Description._10, Description._11, Description._12,
        Description._13, Description._14, Description._15, Description._16, Description._17, Description._18,
        Description._19, Description._20, Description._21, Description._22, Description._23, Description._24,
        Description._25, Description._26, Description._27, Description._28, Description._29, Description._30,
        Description._31, Description._32, Description._33};

    Focus f = new Focus();

    class Focus implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            describe(e.getComponent().getName());
        }

        @Override
        public void focusLost(FocusEvent e) {
        }

    }

    Listener l = new Listener();

    class Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            describe(e.getActionCommand());
        }

    }

    /**
     * Creates new form SaintMarry
     *
     * @param parent
     * @param modal
     * @param year
     */
    public SaintMarry(java.awt.Frame parent, boolean modal, int year) {
        super(parent, modal);
        initComponents();
        this.Year = year;
        thisBuilder(year);
        addEvent();
        int parentWidth = parent.getWidth();
        int parentX = parent.getX();
        int parentHeight = parent.getHeight();
        int parentY = parent.getY();

        setLocation((parentWidth / 2) - (getWidth() / 2) + parentX, (parentHeight / 2) - (getHeight() / 2) + parentY);
    }

    public void thisBuilder(int year) {
        yearText.setText("" + year);
        dateSetter(year);
    }

    public void dateSetter(int year) {
        ec = new EthiopianCalendar();
        _1.setText(ec.getMonthFormat(10, year));
        _2.setText(ec.getMonthFormat(21, year));
        _3.setText(ec.getMonthFormat(51, year));
        _4.setText(ec.getMonthFormat(66, year));
        _5.setText(ec.getMonthFormat(81, year));
        _6.setText(ec.getMonthFormat(93, year));
        _7.setText(ec.getMonthFormat(111, year));
        _8.setText(ec.getMonthFormat(112, year));
        _9.setText(ec.getMonthFormat(118, year));
        _10.setText(ec.getMonthFormat(119, year));
        _11.setText(ec.getMonthFormat(141, year));
        _12.setText(ec.getMonthFormat(166, year));
        _13.setText(ec.getMonthFormat(171, year));
        _14.setText(ec.getMonthFormat(201, year));
        _15.setText(ec.getMonthFormat(209, year));
        _16.setText(ec.getMonthFormat(231, year));
        _17.setText(ec.getMonthFormat(241, year));
        _18.setText(ec.getMonthFormat(261, year));
        _19.setText(ec.getMonthFormat(262, year));
        _20.setText(ec.getMonthFormat(263, year));
        _21.setText(ec.getMonthFormat(264, year));
        _22.setText(ec.getMonthFormat(265, year));
        _23.setText(ec.getMonthFormat(278, year));
        _24.setText(ec.getMonthFormat(290, year));
        _25.setText(ec.getMonthFormat(291, year));
        _26.setText(ec.getMonthFormat(321, year));
        _27.setText(ec.getMonthFormat(337, year));
        _28.setText(ec.getMonthFormat(346, year));
        _29.setText(ec.getMonthFormat(347, year));
        _30.setText(ec.getMonthFormat(348, year));
        _31.setText(ec.getMonthFormat(349, year));
        _32.setText(ec.getMonthFormat(350, year));
        _33.setText(ec.getMonthFormat(351, year));
    }

    public void describe(String actionCommand) {
        int current = Integer.parseInt(actionCommand);
        if (current <= 10) {
            one.setIcon(null);
            one.setText(description[current]);
        } else if (current <= 21) {
            two.setIcon(null);
            two.setText(description[current]);
        } else {
            three.setIcon(null);
            three.setText(description[current]);
        }
    }

    public void clear() {
        one.setText("");
        one.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/St. Marry 24.png")));
        two.setText("");
        two.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/St. Marry 24.png")));
        three.setText("");
        three.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/St. Marry 24.png")));
    }

    public void addEvent() {
        _1.addActionListener(l);
        _1.addFocusListener(f);
        _2.addActionListener(l);
        _2.addFocusListener(f);
        _3.addActionListener(l);
        _3.addFocusListener(f);
        _4.addActionListener(l);
        _4.addFocusListener(f);
        _5.addActionListener(l);
        _5.addFocusListener(f);
        _6.addActionListener(l);
        _6.addFocusListener(f);
        _7.addActionListener(l);
        _7.addFocusListener(f);
        _8.addActionListener(l);
        _8.addFocusListener(f);
        _9.addActionListener(l);
        _9.addFocusListener(f);
        _10.addActionListener(l);
        _10.addFocusListener(f);
        _11.addActionListener(l);
        _11.addFocusListener(f);
        _12.addActionListener(l);
        _12.addFocusListener(f);
        _13.addActionListener(l);
        _13.addFocusListener(f);
        _14.addActionListener(l);
        _14.addFocusListener(f);
        _15.addActionListener(l);
        _15.addFocusListener(f);
        _16.addActionListener(l);
        _16.addFocusListener(f);
        _17.addActionListener(l);
        _17.addFocusListener(f);
        _18.addActionListener(l);
        _18.addFocusListener(f);
        _19.addActionListener(l);
        _19.addFocusListener(f);
        _20.addActionListener(l);
        _20.addFocusListener(f);
        _21.addActionListener(l);
        _21.addFocusListener(f);
        _22.addActionListener(l);
        _22.addFocusListener(f);
        _23.addActionListener(l);
        _23.addFocusListener(f);
        _24.addActionListener(l);
        _24.addFocusListener(f);
        _25.addActionListener(l);
        _25.addFocusListener(f);
        _26.addActionListener(l);
        _26.addFocusListener(f);
        _27.addActionListener(l);
        _27.addFocusListener(f);
        _28.addActionListener(l);
        _28.addFocusListener(f);
        _29.addActionListener(l);
        _29.addFocusListener(f);
        _30.addActionListener(l);
        _30.addFocusListener(f);
        _31.addActionListener(l);
        _31.addFocusListener(f);
        _32.addActionListener(l);
        _32.addFocusListener(f);
        _33.addActionListener(l);
        _33.addFocusListener(f);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stMarryPanel = new javax.swing.JPanel();
        yearText = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        _1 = new org.jdesktop.swingx.JXHyperlink();
        _2 = new org.jdesktop.swingx.JXHyperlink();
        _3 = new org.jdesktop.swingx.JXHyperlink();
        _4 = new org.jdesktop.swingx.JXHyperlink();
        _5 = new org.jdesktop.swingx.JXHyperlink();
        _6 = new org.jdesktop.swingx.JXHyperlink();
        _7 = new org.jdesktop.swingx.JXHyperlink();
        _8 = new org.jdesktop.swingx.JXHyperlink();
        _9 = new org.jdesktop.swingx.JXHyperlink();
        _10 = new org.jdesktop.swingx.JXHyperlink();
        _11 = new org.jdesktop.swingx.JXHyperlink();
        one = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        _12 = new org.jdesktop.swingx.JXHyperlink();
        _13 = new org.jdesktop.swingx.JXHyperlink();
        _14 = new org.jdesktop.swingx.JXHyperlink();
        _15 = new org.jdesktop.swingx.JXHyperlink();
        _16 = new org.jdesktop.swingx.JXHyperlink();
        _17 = new org.jdesktop.swingx.JXHyperlink();
        _18 = new org.jdesktop.swingx.JXHyperlink();
        _19 = new org.jdesktop.swingx.JXHyperlink();
        _20 = new org.jdesktop.swingx.JXHyperlink();
        _21 = new org.jdesktop.swingx.JXHyperlink();
        _22 = new org.jdesktop.swingx.JXHyperlink();
        two = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        _23 = new org.jdesktop.swingx.JXHyperlink();
        _24 = new org.jdesktop.swingx.JXHyperlink();
        _26 = new org.jdesktop.swingx.JXHyperlink();
        _25 = new org.jdesktop.swingx.JXHyperlink();
        _27 = new org.jdesktop.swingx.JXHyperlink();
        _28 = new org.jdesktop.swingx.JXHyperlink();
        _29 = new org.jdesktop.swingx.JXHyperlink();
        _30 = new org.jdesktop.swingx.JXHyperlink();
        _31 = new org.jdesktop.swingx.JXHyperlink();
        _32 = new org.jdesktop.swingx.JXHyperlink();
        _33 = new org.jdesktop.swingx.JXHyperlink();
        three = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("፴፫ቱ  የእመቤታችን በዓላት");
        setResizable(false);

        stMarryPanel.setName("stMarryPanel"); // NOI18N
        stMarryPanel.setOpaque(false);

        yearText.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        yearText.setForeground(new java.awt.Color(0, 0, 1));
        yearText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yearText.setText("0000");

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tadesse/bahirehasab/resource/right.png"))); // NOI18N
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tadesse/bahirehasab/resource/left.png"))); // NOI18N
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new Color(0, 0, 0, 0)
        );
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N

        jPanel2.setOpaque(false);

        _1.setForeground(new java.awt.Color(0, 0, 1));
        _1.setText("0000");
        _1.setActionCommand("0");
        _1.setClickedColor(new java.awt.Color(0, 0, 1));
        _1.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _1.setName("0"); // NOI18N
        _1.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _2.setForeground(new java.awt.Color(0, 0, 1));
        _2.setText("0000");
        _2.setActionCommand("1");
        _2.setClickedColor(new java.awt.Color(0, 0, 1));
        _2.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _2.setName("1"); // NOI18N
        _2.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _3.setForeground(new java.awt.Color(0, 0, 1));
        _3.setText("0000");
        _3.setActionCommand("2");
        _3.setClickedColor(new java.awt.Color(0, 0, 1));
        _3.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _3.setName("2"); // NOI18N
        _3.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _4.setForeground(new java.awt.Color(0, 0, 1));
        _4.setText("0000");
        _4.setActionCommand("3");
        _4.setClickedColor(new java.awt.Color(0, 0, 1));
        _4.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _4.setName("3"); // NOI18N
        _4.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _5.setForeground(new java.awt.Color(0, 0, 1));
        _5.setText("0000");
        _5.setActionCommand("4");
        _5.setClickedColor(new java.awt.Color(0, 0, 1));
        _5.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _5.setName("4"); // NOI18N
        _5.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _6.setForeground(new java.awt.Color(0, 0, 1));
        _6.setText("0000");
        _6.setActionCommand("5");
        _6.setClickedColor(new java.awt.Color(0, 0, 1));
        _6.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _6.setName("5"); // NOI18N
        _6.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _7.setForeground(new java.awt.Color(0, 0, 1));
        _7.setText("0000");
        _7.setActionCommand("6");
        _7.setClickedColor(new java.awt.Color(0, 0, 1));
        _7.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _7.setName("6"); // NOI18N
        _7.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _8.setForeground(new java.awt.Color(0, 0, 1));
        _8.setText("0000");
        _8.setActionCommand("7");
        _8.setClickedColor(new java.awt.Color(0, 0, 1));
        _8.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _8.setName("7"); // NOI18N
        _8.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _9.setForeground(new java.awt.Color(0, 0, 1));
        _9.setText("0000");
        _9.setActionCommand("8");
        _9.setClickedColor(new java.awt.Color(0, 0, 1));
        _9.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _9.setName("8"); // NOI18N
        _9.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _10.setForeground(new java.awt.Color(0, 0, 1));
        _10.setText("0000");
        _10.setActionCommand("9");
        _10.setClickedColor(new java.awt.Color(0, 0, 1));
        _10.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _10.setName("9"); // NOI18N
        _10.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _11.setForeground(new java.awt.Color(0, 0, 1));
        _11.setText("0000");
        _11.setActionCommand("10");
        _11.setClickedColor(new java.awt.Color(0, 0, 1));
        _11.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _11.setName("10"); // NOI18N
        _11.setUnclickedColor(new java.awt.Color(0, 0, 1));

        one.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        one.setForeground(new java.awt.Color(0, 0, 1));
        one.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        one.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tadesse/bahirehasab/resource/St. Marry 24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("  መስከረም - ጥር  ", jPanel2);

        jPanel3.setBackground(new Color(0, 0, 0, 0));
        jPanel3.setOpaque(false);

        _12.setForeground(new java.awt.Color(0, 0, 1));
        _12.setText("0000");
        _12.setActionCommand("11");
        _12.setClickedColor(new java.awt.Color(0, 0, 1));
        _12.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _12.setName("11"); // NOI18N
        _12.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _13.setForeground(new java.awt.Color(0, 0, 1));
        _13.setText("0000");
        _13.setActionCommand("12");
        _13.setClickedColor(new java.awt.Color(0, 0, 1));
        _13.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _13.setName("12"); // NOI18N
        _13.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _14.setForeground(new java.awt.Color(0, 0, 1));
        _14.setText("0000");
        _14.setActionCommand("13");
        _14.setClickedColor(new java.awt.Color(0, 0, 1));
        _14.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _14.setName("13"); // NOI18N
        _14.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _15.setForeground(new java.awt.Color(0, 0, 1));
        _15.setText("0000");
        _15.setActionCommand("14");
        _15.setClickedColor(new java.awt.Color(0, 0, 1));
        _15.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _15.setName("14"); // NOI18N
        _15.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _16.setForeground(new java.awt.Color(0, 0, 1));
        _16.setText("0000");
        _16.setActionCommand("15");
        _16.setClickedColor(new java.awt.Color(0, 0, 1));
        _16.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _16.setName("15"); // NOI18N
        _16.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _17.setForeground(new java.awt.Color(0, 0, 1));
        _17.setText("0000");
        _17.setActionCommand("16");
        _17.setClickedColor(new java.awt.Color(0, 0, 1));
        _17.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _17.setName("16"); // NOI18N
        _17.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _18.setForeground(new java.awt.Color(0, 0, 1));
        _18.setText("0000");
        _18.setActionCommand("17");
        _18.setClickedColor(new java.awt.Color(0, 0, 1));
        _18.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _18.setName("17"); // NOI18N
        _18.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _19.setForeground(new java.awt.Color(0, 0, 1));
        _19.setText("0000");
        _19.setActionCommand("18");
        _19.setClickedColor(new java.awt.Color(0, 0, 1));
        _19.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _19.setName("18"); // NOI18N
        _19.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _20.setForeground(new java.awt.Color(0, 0, 1));
        _20.setText("0000");
        _20.setActionCommand("19");
        _20.setClickedColor(new java.awt.Color(0, 0, 1));
        _20.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _20.setName("19"); // NOI18N
        _20.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _21.setForeground(new java.awt.Color(0, 0, 1));
        _21.setText("0000");
        _21.setActionCommand("20");
        _21.setClickedColor(new java.awt.Color(0, 0, 1));
        _21.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _21.setName("20"); // NOI18N
        _21.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _22.setForeground(new java.awt.Color(0, 0, 1));
        _22.setText("0000");
        _22.setActionCommand("21");
        _22.setClickedColor(new java.awt.Color(0, 0, 1));
        _22.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _22.setName("21"); // NOI18N
        _22.setUnclickedColor(new java.awt.Color(0, 0, 1));

        two.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        two.setForeground(new java.awt.Color(0, 0, 1));
        two.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        two.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tadesse/bahirehasab/resource/St. Marry 24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("  የካቲት - ግንቦት  ", jPanel3);

        jPanel4.setOpaque(false);

        _23.setForeground(new java.awt.Color(0, 0, 1));
        _23.setText("0000");
        _23.setActionCommand("22");
        _23.setClickedColor(new java.awt.Color(0, 0, 1));
        _23.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _23.setName("22"); // NOI18N
        _23.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _24.setForeground(new java.awt.Color(0, 0, 1));
        _24.setText("0000");
        _24.setActionCommand("23");
        _24.setClickedColor(new java.awt.Color(0, 0, 1));
        _24.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _24.setName("23"); // NOI18N
        _24.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _26.setForeground(new java.awt.Color(0, 0, 1));
        _26.setText("0000");
        _26.setActionCommand("25");
        _26.setClickedColor(new java.awt.Color(0, 0, 1));
        _26.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _26.setName("25"); // NOI18N
        _26.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _25.setForeground(new java.awt.Color(0, 0, 1));
        _25.setText("0000");
        _25.setActionCommand("24");
        _25.setClickedColor(new java.awt.Color(0, 0, 1));
        _25.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _25.setName("24"); // NOI18N
        _25.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _27.setForeground(new java.awt.Color(0, 0, 1));
        _27.setText("0000");
        _27.setActionCommand("26");
        _27.setClickedColor(new java.awt.Color(0, 0, 1));
        _27.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _27.setName("26"); // NOI18N
        _27.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _28.setForeground(new java.awt.Color(0, 0, 1));
        _28.setText("0000");
        _28.setActionCommand("27");
        _28.setClickedColor(new java.awt.Color(0, 0, 1));
        _28.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _28.setName("27"); // NOI18N
        _28.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _29.setForeground(new java.awt.Color(0, 0, 1));
        _29.setText("0000");
        _29.setActionCommand("28");
        _29.setClickedColor(new java.awt.Color(0, 0, 1));
        _29.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _29.setName("28"); // NOI18N
        _29.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _30.setForeground(new java.awt.Color(0, 0, 1));
        _30.setText("0000");
        _30.setActionCommand("29");
        _30.setClickedColor(new java.awt.Color(0, 0, 1));
        _30.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _30.setName("29"); // NOI18N
        _30.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _31.setForeground(new java.awt.Color(0, 0, 1));
        _31.setText("0000");
        _31.setActionCommand("30");
        _31.setClickedColor(new java.awt.Color(0, 0, 1));
        _31.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _31.setName("30"); // NOI18N
        _31.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _32.setForeground(new java.awt.Color(0, 0, 1));
        _32.setText("0000");
        _32.setActionCommand("31");
        _32.setClickedColor(new java.awt.Color(0, 0, 1));
        _32.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _32.setName("31"); // NOI18N
        _32.setUnclickedColor(new java.awt.Color(0, 0, 1));

        _33.setForeground(new java.awt.Color(0, 0, 1));
        _33.setText("0000");
        _33.setActionCommand("32");
        _33.setClickedColor(new java.awt.Color(0, 0, 1));
        _33.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        _33.setName("32"); // NOI18N
        _33.setUnclickedColor(new java.awt.Color(0, 0, 1));

        three.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        three.setForeground(new java.awt.Color(0, 0, 1));
        three.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        three.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tadesse/bahirehasab/resource/St. Marry 24.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(_23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("  ሰኔ - ነሐሴ  ", jPanel4);

        javax.swing.GroupLayout stMarryPanelLayout = new javax.swing.GroupLayout(stMarryPanel);
        stMarryPanel.setLayout(stMarryPanelLayout);
        stMarryPanelLayout.setHorizontalGroup(
            stMarryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stMarryPanelLayout.createSequentialGroup()
                .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        stMarryPanelLayout.setVerticalGroup(
            stMarryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stMarryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(stMarryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(next)
                    .addComponent(previous))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(stMarryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(stMarryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        if (Year != 0) {
            Year = Year - 1;
            thisBuilder(this.Year);
        } else {
            EndOne end1 = new EndOne((Frame) this.getParent(), true);
            end1.setVisible(true);
        }

    }//GEN-LAST:event_previousActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        if (Year != 9999) {
            Year = Year + 1;
            thisBuilder(this.Year);
        } else {
            EndTwo end2 = new EndTwo((Frame) this.getParent(), true);
            end2.setVisible(true);
        }
    }//GEN-LAST:event_nextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXHyperlink _1;
    private org.jdesktop.swingx.JXHyperlink _10;
    private org.jdesktop.swingx.JXHyperlink _11;
    private org.jdesktop.swingx.JXHyperlink _12;
    private org.jdesktop.swingx.JXHyperlink _13;
    private org.jdesktop.swingx.JXHyperlink _14;
    private org.jdesktop.swingx.JXHyperlink _15;
    private org.jdesktop.swingx.JXHyperlink _16;
    private org.jdesktop.swingx.JXHyperlink _17;
    private org.jdesktop.swingx.JXHyperlink _18;
    private org.jdesktop.swingx.JXHyperlink _19;
    private org.jdesktop.swingx.JXHyperlink _2;
    private org.jdesktop.swingx.JXHyperlink _20;
    private org.jdesktop.swingx.JXHyperlink _21;
    private org.jdesktop.swingx.JXHyperlink _22;
    private org.jdesktop.swingx.JXHyperlink _23;
    private org.jdesktop.swingx.JXHyperlink _24;
    private org.jdesktop.swingx.JXHyperlink _25;
    private org.jdesktop.swingx.JXHyperlink _26;
    private org.jdesktop.swingx.JXHyperlink _27;
    private org.jdesktop.swingx.JXHyperlink _28;
    private org.jdesktop.swingx.JXHyperlink _29;
    private org.jdesktop.swingx.JXHyperlink _3;
    private org.jdesktop.swingx.JXHyperlink _30;
    private org.jdesktop.swingx.JXHyperlink _31;
    private org.jdesktop.swingx.JXHyperlink _32;
    private org.jdesktop.swingx.JXHyperlink _33;
    private org.jdesktop.swingx.JXHyperlink _4;
    private org.jdesktop.swingx.JXHyperlink _5;
    private org.jdesktop.swingx.JXHyperlink _6;
    private org.jdesktop.swingx.JXHyperlink _7;
    private org.jdesktop.swingx.JXHyperlink _8;
    private org.jdesktop.swingx.JXHyperlink _9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton next;
    private javax.swing.JLabel one;
    private javax.swing.JButton previous;
    public javax.swing.JPanel stMarryPanel;
    private javax.swing.JLabel three;
    private javax.swing.JLabel two;
    private javax.swing.JLabel yearText;
    // End of variables declaration//GEN-END:variables
}
