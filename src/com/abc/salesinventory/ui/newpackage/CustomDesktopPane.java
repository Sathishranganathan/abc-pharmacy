/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abc.salesinventory.ui.newpackage;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

/**
 *
 * @author rdjayawe
 */
public class CustomDesktopPane extends JDesktopPane{
    private Image image;
    {
        try {
            image = ImageIO.read(new URL("https://abc-pharmacy.googlecode.com/svn/trunk/Logo/Eraj%20PharmaceuticalsLogo.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
}
