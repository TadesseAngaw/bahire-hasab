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

import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.tadesse.bahirehasab.intro.Intro;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Taskbar;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author Tadesse Angaw
 */
public class Main {
    
    private void startApplication(){
        setTaskBar();
        Preferences root = Preferences.userRoot().node("bahire-hasab");
        boolean isOpened = root.getBoolean("is-opened", false);
        if (!isOpened) {
            root.putBoolean("is-opened", true);
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
                UIManager.getLookAndFeelDefaults().put("defaultFont", loadFont());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            Intro i = new Intro(new javax.swing.JFrame(), true);
            i.setVisible(true);
            Main m = new Main();

        } else {
            try {
                UIManager.put("ToolTip.font", new FontUIResource("Ebrima", Font.PLAIN, 12));
                Properties p = new Properties();
                p.put("windowTitleFont", "Ebrima BOLD 14");
                p.put("logoString", "");
                p.put("centerWindowTitle", "on");
                HiFiLookAndFeel.setCurrentTheme(p);
                UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
                UIManager.getLookAndFeelDefaults().put("defaultFont", loadFont());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
            new Home().setVisible(true);
        }

    }

    private void setTaskBar() {
        final Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
        final URL imageResource = getClass().getResource("icon.png");
        final Image image = defaultToolkit.getImage(imageResource);

        final Taskbar taskbar = Taskbar.getTaskbar();

        try {
            taskbar.setIconImage(image);
        } catch (final UnsupportedOperationException e) {
            System.out.println("The os does not support: 'taskbar.setIconImage'");
        } catch (final SecurityException e) {
            System.out.println("There was a security exception for: 'taskbar.setIconImage'");
        }
    }

    private Font loadFont() {
        try {
            InputStream mainFontInputStream = getClass().getResourceAsStream("/com/tadesse/bahirehasab/resource/ebrima.ttf");
            InputStream boldFontInputStream = getClass().getResourceAsStream("/com/tadesse/bahirehasab/resource/ebrima-bold.ttf");

            if (mainFontInputStream == null || mainFontInputStream == null) {
                throw new IOException("Cannot load font from resource");
            }

            Font font = Font.createFont(Font.TRUETYPE_FONT, mainFontInputStream);
            Font fontBold = Font.createFont(Font.TRUETYPE_FONT, boldFontInputStream);

            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            ge.registerFont(fontBold);

            return font.deriveFont(Font.PLAIN, 12);
        } catch (IOException | FontFormatException e) {
            System.out.println("Not found");
            return new Font("Ebrima", Font.PLAIN, 12);
        }
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.startApplication();
       
    }
}
