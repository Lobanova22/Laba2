package Laba2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionListener2 implements ActionListener {

@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub

JFrame main_GUI = new JFrame("subversion"); // �������� ������� ������������ ����
main_GUI.setTitle ("������� 17");
main_GUI.setBounds(500,400,400,300);
main_GUI.setResizable(false); // ������������� ������ ����

JPanel main_panel = new JPanel(); // ������ - ����������� �� ����������� ����������� � ����
main_panel.setLayout(null);
main_GUI.add(main_panel);

JLabel man_2 = new JLabel("�������� ����� ������������ - 19130014"); // ������ �������� �������
man_2.setBounds(20,65,350,30);// ���������� �������
main_panel.add(man_2); // ���������� �������

JLabel man_4 = new JLabel("����� ����� ���������� - 19130624 14.10.2021"); // ������ �������� �������
man_4.setBounds(20,125,400,30); // ���������� �������
main_panel.add(man_4); // ���������� �������

JButton button_back = new JButton("�����"); // �������� ����� ������
button_back.setBounds(250,200,100,40); //���������� ������
//ActionListener actionPerformed = new window2();
//button_back.addActionListener(actionPerformed);
main_panel.add(button_back);
main_GUI.setVisible(true);

button_back.addActionListener(new ActionListener() { // ��������� �� ������ ������
public void actionPerformed(ActionEvent e) {

main_GUI.dispose(); // �������� ����, ��� ������ �� ���������

}
});
}

public static void main(String[] args) { // ���������� �������: http://www.mstu.edu.ru/study/materials/java/
ActionListener2 student = new ActionListener2();

}

}