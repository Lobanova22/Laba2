package Laba2;

import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ActionListener1 implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			
		if (ListenerFile.filePath == null) {
		JOptionPane.showMessageDialog(null, subversion.info17, "Информация", JOptionPane.PLAIN_MESSAGE);
		} else {
		try {
		BufferedReader reader = new BufferedReader(new FileReader(ListenerFile.filePath));
		String line;
		subversion.info17 = "";
		while ((line = reader.readLine()) != null) {
		subversion.info17 += line;
		}
		reader.close();
		JOptionPane.showMessageDialog(null, subversion.info17, "Информация", JOptionPane.PLAIN_MESSAGE);
		} catch (IOException e) {
		JOptionPane.showMessageDialog(null, "Файл не найден!" , "Ответ", JOptionPane.PLAIN_MESSAGE);

		} catch (NullPointerException e ) {

		}}}}
	