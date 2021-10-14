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

JFrame main_GUI = new JFrame("subversion"); // создание второго графического окна
main_GUI.setTitle ("вариант 17");
main_GUI.setBounds(500,400,400,300);
main_GUI.setResizable(false); // фиксированный размер окна

JPanel main_panel = new JPanel(); // ѕанель - используетс€ дл€ организации компонентов в окне
main_panel.setLayout(null);
main_GUI.add(main_panel);

JLabel man_2 = new JLabel("Лобанова Диана Владимировна - 19130014"); // первый участник команда
man_2.setBounds(20,65,350,30);// размещение надписи
main_panel.add(man_2); // добавление надписи

JLabel man_4 = new JLabel("Имаев Булат Рустемович - 19130624 14.10.2021"); // третий участник команды
man_4.setBounds(20,125,400,30); // размещение надписи
main_panel.add(man_4); // добавление надписи

JButton button_back = new JButton("Назад"); // добавл€ем новую кнопку
button_back.setBounds(250,200,100,40); //размещение кнопки
//ActionListener actionPerformed = new window2();
//button_back.addActionListener(actionPerformed);
main_panel.add(button_back);
main_GUI.setVisible(true);

button_back.addActionListener(new ActionListener() { // слушатель дл€ второй кнопки
public void actionPerformed(ActionEvent e) {

main_GUI.dispose(); // закрытие окна, без выхода из приложени€

}
});
}

public static void main(String[] args) { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
ActionListener2 student = new ActionListener2();

}

}