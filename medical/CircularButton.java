/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.medicallab;

/**
 *
 * @author Farah
 */
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class CircularButton extends Button {

    public CircularButton(String label) {
        super(label);
        setPreferredSize(new Dimension(40, 40));
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        // Enable anti-aliasing for smoother edges
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set the background color (you can customize this)
        g2d.setColor(getBackground());
        g2d.fillOval(0, 0, getWidth() - 1, getHeight() - 1);

        // Draw the label
        super.paint(g2d);

        g2d.dispose();
    }}

   

