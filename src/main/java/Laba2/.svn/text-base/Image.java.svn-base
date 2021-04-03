package Laba2;

import javax.imageio.*;
import javax.swing.*;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;

public class Image extends JComponent {

BufferedImage picture;
{
try {
	
	picture = ImageIO.read(new URL("http://xn--e1afhkfagivn.xn--p1ai/media/foto/logo.jpg"));
	
} catch (IOException e) {
e.printStackTrace();
 }}

  public void paintComponent(Graphics g) {
	
	if(picture==null) return;
	g.drawImage(picture, 0, 0, 100, 50, null);
	
}}