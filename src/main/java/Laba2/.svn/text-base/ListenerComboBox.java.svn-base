package Laba2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ListenerComboBox implements ActionListener {
	int [] numbers;
	static boolean isArray = false;

	public void actionPerformed(ActionEvent arg0) {
	
	int i = subversion.changeBox.getSelectedIndex();
	switch(i){
	case 1:{
		subversion.image.setBounds(270,15, 100, 150);	
	break; }
	
	case 2:{
		subversion.image.setBounds(150, 50, 100, 150);	
	break; }
	
	case 3:{
		subversion.image.setBounds(10, 15, 100, 150);	
	break; }
	}
	switch(i){
	case 4:{
	ArrayMaker arrayMaker = new ArrayMaker();
	numbers = arrayMaker.getArray();
	String messageNumbers = " ";
	for (int n: numbers) {
		messageNumbers += Integer.toString(n) + "\n";
	}
		JOptionPane.showMessageDialog(null, messageNumbers, "Массив", JOptionPane.PLAIN_MESSAGE);
		isArray = true;
		break;
	}
	case 5:{
		ArraySort sortArray = new ArraySort();
		numbers = sortArray.Sort(numbers);
		String messageNumbers = " ";
		for (int n: numbers) {
			messageNumbers += Integer.toString(n) + "\n";
		}
			JOptionPane.showMessageDialog(null, messageNumbers, "Отсортированный массив", JOptionPane.PLAIN_MESSAGE);
	}
			break;		
	}
	}
	
}
	

