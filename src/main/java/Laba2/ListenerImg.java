package Laba2;

import java.awt.event.*;

import javax.swing.JLabel;


public class ListenerImg implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
	
		subversion.image = new Image();
		subversion.main_panel.add(subversion.image);//���������� �� ������� ������
		subversion.image.setSize(500,250);// ��������� ��������
		subversion.image.setLocation(270,15);
		subversion.image.setVisible(true); // ��������� ���������
	
	}
	}
	

