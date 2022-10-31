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

import com.tadesse.bahirehasab.tools.EthiopianCalendar;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.*;

/**
 *
 * @author Tadesse Angaw
 */
public class MiniCalendar extends javax.swing.JDialog {

    private static final long serialVersionUID = 1L;

    String GEEZ[] = {"፩", "፪", "፫", "፬", "፭", "፮", "፯", "፰", "፱", "፲",
        "፲፩", "፲፪", "፲፫", "፲፬", "፲፭", "፲፮", "፲፯", "፲፰", "፲፱", "፳",
        "፳፩", "፳፪", "፳፫", "፳፬", "፳፭", "፳፮", "፳፯", "፳፰", "፳፱", "፴"};

    String MONTHLY[] = {"ልደታ ለማርያም፣ ቅዱስ ራጉኤል", "አባ ጉባ", "በዓታ ለማርያም", "ቅዱስ ዮሐንስ ወንጌላዊ", "አቡነ ገብረመንፈስቅዱስ", "ቁስቋም ማርያም፣ ቅድስት አርሴማ", "ቅድስት ሥላሴ", "አቡነ ኪሮስ፣ አርባዕቱ እንስሳ",
        "ቶማስ", "መስቀለ ኢየሱስ", "ቅድስት ሐና", "ቅዱስ ሚካኤል፣ ቅድስት ክርስቶስ ሰምራ", "ቅዱስ ሩፋኤል", "አቡነ  አረጋዊ፣ ገብረ ክርስቶስ", "ቅዱስ ቂርቆስ", "ኪዳነ ምህረት", "ቅዱስ እስጢፋኖስ", "ቅዱስ ፊሊጶስ", "ቅዱስ ገብርኤል",
        "ሕንፀተ ማርያም", "ቅድስት ማርያም", "ቅዱስ ዑራኤል", "ቅዱስ ጊዮርጊስ", "አቡነ ተክለሃይማኖት", "ቅዱስ መርቆሬዎስ", "ቅዱስ ዮሴፍ፣ አቡነ ሀብተ ማርያም", "መድኀኔዓለም፣ አቡነ መብዓ ጽዮን", "አማኑኤል", "በዓለ ወልድ ", "ቅዱስ ዮሐንስ መጥምቅ"};
    JButton[] days = new JButton[42];
    EthiopianCalendar ec;
    Holiday ho;
    int Date, Month, Year;
    int currentButton;
    Frame Parent;
    Listener listener = new Listener();

    /**
     * Creates new form Calendar
     *
     * @param parent
     * @param modal
     * @param year
     * @param month
     * @param date
     */
    public MiniCalendar(java.awt.Frame parent, boolean modal, int date, int month, int year) {
        super(parent, modal);
        initComponents();
        this.Date = date;
        this.Month = month;
        this.Year = year;
        panel.setLayout(new GridLayout(6, 7));
        for (int i = 0; i < days.length; i++) {
            days[i] = new JButton();
            days[i].setFont(new Font("Ebrima", Font.PLAIN, 13));
            days[i].setHorizontalAlignment(JButton.CENTER);
            panel.add(days[i]);
        }
        calendarBuilder(date, month, year);
        int x = parent.getX();
        int y = parent.getY();
        int width = parent.getWidth();
        int height = parent.getHeight();
        setLocation((width / 2) - (this.getWidth() / 2), (height / 2) - (this.getWidth() / 2));

    }

    public void calendarBuilder(int date, int month, int year) {
        ho = new Holiday();
        ec = new EthiopianCalendar();
        for (JButton day : days) {
            day.setText("");
            day.setActionCommand("");
            day.setName("");
            day.setToolTipText(null);
            day.setBackground(new Color(240, 240, 240));
            day.setForeground(Color.BLACK);
            day.removeMouseListener(listener);
        }
        int monthstart = ec.getMonthStart(month, year);
        this.month.setText(EthiopianCalendar.MONTHS[month] + "፣ " + year);

        int remain;
        if (month == 12) {
            remain = ec.getDaysLength(year) == 365 ? 42 - 5 : 42 - 6;
        } else {
            remain = 42 - 30;
        }

        monthstart = (monthstart + 1) % 7;

        for (int i = monthstart, day = 1; i < days.length - remain + monthstart; i++, day++) {
            String geez = GEEZ[day - 1];
            String arab = String.format("%d", day);
            days[i].setText("<html>" + geez + "<br/>&nbsp;&nbsp;&nbsp;&nbsp;" + arab + "</html>");
            days[i].setActionCommand(String.format("%d", day));
            days[i].setName(String.format("%d", day));
            Calendar c = ec.toGregorianDate(day, Month+1, Year);
            String gregorian = c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH) + " " + c.get(Calendar.DAY_OF_MONTH) + ", " + c.get(Calendar.YEAR);
            String tooltip = "<html><div style='font-family: Ebrima;'>" + gregorian + "</p><p style='font-family: Ebrima'>" + MONTHLY[day - 1] + "</p></html>";
            days[i].setToolTipText(tooltip);
            
            advancedEvent(i);
            if (ho.isHolyday(Integer.parseInt(days[i].getActionCommand()), month + 1, year)) {
                days[i].setBackground(new Color(94, 173, 124));
                printDescription(i);
            }

            if (ec.isToday(Integer.parseInt(days[i].getActionCommand()), month + 1, year)) {
                days[i].setBackground(Color.ORANGE);
            }
        }

        for (int i = 0; i < days.length; i++) {
            if (i % 7 == 0) {
                days[i].setForeground(Color.RED);
            }
        }
        days[date + monthstart - 1].grabFocus();
    }

    public void printDescription(int i) {
        days[i].addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                try {
                    holydayDescription.setText(ho.getHolydayDescription(Integer.parseInt(days[i].getActionCommand()), Month + 1, Year));
                } catch (Exception ex) {
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                holydayDescription.setText("");
            }

        });
    }

    public void advancedEvent(int i) {
        days[i].addMouseListener(listener);
    }

    public class Listener extends MouseAdapter {

        @Override
        public void mousePressed(java.awt.event.MouseEvent evt) {
            if (evt.isPopupTrigger()) {
                currentButton = Integer.parseInt(evt.getComponent().getName());
                pop1.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }

        @Override
        public void mouseReleased(java.awt.event.MouseEvent evt) {
            if (evt.isPopupTrigger()) {
                currentButton = Integer.parseInt(evt.getComponent().getName());
                pop1.show(evt.getComponent(), evt.getX(), evt.getY());
            }
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

        pop1 = new javax.swing.JPopupMenu();
        viewInfo = new javax.swing.JMenuItem();
        calendarPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        month = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        holydayDescription = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        previous = new javax.swing.JButton();

        viewInfo.setFont(new java.awt.Font("Ebrima", 0, 13)); // NOI18N
        viewInfo.setText("የዕለቱ መረጃ");
        viewInfo.setActionCommand("other");
        viewInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInfoActionPerformed(evt);
            }
        });
        pop1.add(viewInfo);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.0F);

        calendarPanel.setName("calendarPanel"); // NOI18N
        calendarPanel.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("እ");

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 1));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ሰ");

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 1));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ማ");

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 1));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ረ");

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 1));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ሐ");

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 1));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("አ");

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 1));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ቅ");

        month.setFont(new java.awt.Font("Ebrima", 1, 15)); // NOI18N
        month.setForeground(new java.awt.Color(0, 0, 1));
        month.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        month.setText("Month, Year");

        panel.setOpaque(false);
        panel.setLayout(new java.awt.GridLayout(1, 0));

        holydayDescription.setFont(new java.awt.Font("Ebrima", 1, 13)); // NOI18N
        holydayDescription.setForeground(new java.awt.Color(0, 0, 1));

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

        javax.swing.GroupLayout calendarPanelLayout = new javax.swing.GroupLayout(calendarPanel);
        calendarPanel.setLayout(calendarPanelLayout);
        calendarPanelLayout.setHorizontalGroup(
            calendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(calendarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(calendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(holydayDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calendarPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(calendarPanelLayout.createSequentialGroup()
                        .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(month, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        calendarPanelLayout.setVerticalGroup(
            calendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calendarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(calendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(month)
                    .addComponent(next)
                    .addComponent(previous))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(calendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(holydayDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calendarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(calendarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed

        if (this.Month > 0) {
            Month = Month - 1;
            calendarBuilder(this.Date, this.Month, this.Year);
        } else if (Year != 0) {
            Year = Year - 1;
            Month = 12;
            calendarBuilder(this.Date, this.Month, this.Year);
        } else {
            EndOne end1 = new EndOne((Frame) this.getParent(), true);
            end1.setVisible(true);
        }
    }//GEN-LAST:event_previousActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed

        if (this.Month < 12) {
            Month = Month + 1;
            calendarBuilder(this.Date, this.Month, this.Year);
        } else if (Year != 9999) {
            Year = Year + 1;
            Month = 0;
            calendarBuilder(this.Date, this.Month, this.Year);
        } else {
            EndTwo end2 = new EndTwo((Frame) this.getParent(), true);
            end2.setVisible(true);
        }
    }//GEN-LAST:event_nextActionPerformed

    private void viewInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInfoActionPerformed
        AdditionalInfo additionalInfo = new AdditionalInfo((Frame) this.getParent(), true, currentButton, Month, Year);
        additionalInfo.setVisible(true);
    }//GEN-LAST:event_viewInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel calendarPanel;
    private javax.swing.JLabel holydayDescription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel month;
    private javax.swing.JButton next;
    private javax.swing.JPanel panel;
    private javax.swing.JPopupMenu pop1;
    private javax.swing.JButton previous;
    private javax.swing.JMenuItem viewInfo;
    // End of variables declaration//GEN-END:variables
}
