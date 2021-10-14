package Laba2; //пакет Java классов

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //библиотека для события слушателя
import javax.swing.*; // Библиотека для GUI (построена на основе awt)

public class subversion {

	public static String info17;
	protected static JPanel main_panel;
	protected static Image image;
	protected static  JComboBox changeBox;
	
	public subversion() {
	JFrame main_GUI = new JFrame("subversion");	// создание графического окна
	main_GUI.setTitle ("Вариант №17");
	main_GUI.setBounds(500,400,400,450);
	main_GUI.setResizable(false); // фиксированный размер окна
	
	main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JLabel laba_info = new JLabel("Лабораторная работа №4"); // Отображение текста или изображения
	laba_info.setBounds(120,120,190,15);
	main_panel.add(laba_info);
	
	JButton button_pro = new JButton("Проверка"); // добавляем кнопку 
	button_pro.setBounds(15,320,150,35);
	ActionListener actionListener1 = new ActionListener1(); //создаем слушатель
	button_pro.addActionListener(actionListener1); // добавляем слушатель к кнопке
	main_panel.add(button_pro);
	
	JButton button_info = new JButton("Информация"); // добавляем кнопку
	button_info.setBounds(248,320,150,35);
	ActionListener info = new ActionListener2(); //создаем слушатель
	button_info.addActionListener(info); // добавляем слушатель к кнопке
	main_panel.add(button_info);
	
	JButton file = new JButton("Загрузка файла"); // добавляем кнопку 
	file.setBounds(15,280,150,35);
	ActionListener ActionListener = new ListenerFile(); //создаем слушатель
	file.addActionListener(new ListenerFile()); // добавляем слушатель к кнопке
	main_panel.add(file);
	
	JButton button_exit = new JButton("Выход"); // добавляем кнопку
	button_exit.setBounds(275,280,100,35);
	ActionListener actionListener = new ListenerButton(); //создаем слушатель
	button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
	main_panel.add(button_exit);
	
	JMenu menu = new JMenu("Главная"); // добавление верхнего выпадающего меню "Главная"
	JMenuBar menuBar = new JMenuBar();
	JMenuItem menu1 = new JMenuItem("Отобразить логотип УГАТУ");
	JMenuItem menu2 = new JMenuItem("Выход");
	
	JLabel a = new JLabel("Сторона а:"); // Отображение текста или изображения
	a.setBounds(20,180,70,40);
	main_panel.add(a);
	
	JLabel b = new JLabel("Сторона b:"); // Отображение текста или изображения
	b.setBounds(150,180,70,40);
	main_panel.add(b);
	
	JLabel p = new JLabel("Периметр:"); // Отображение текста или изображения
	p.setBounds(180,230,70,40);
	main_panel.add(p);
	
	JTextField textField = new JTextField(); 
	textField.setBounds(90,180,50,40);
	main_panel.add(textField);
	
	JTextField text1Field = new JTextField(); 
	text1Field.setBounds(220,180,50,40);
	main_panel.add(text1Field);
	
	JTextField text2Field = new JTextField(); 
	text2Field.setBounds(250,230,50,40);
	main_panel.add(text2Field);
	
	JButton Button = new JButton("Рассчитать");  
	Button.setBounds(30,230,120,40);
	Button.addActionListener(new ActionListener() {// добавляем слушатель к кнопке
	
            public void actionPerformed(ActionEvent e) {
			
			    	double l, w, peri;

			        l=Double.parseDouble(textField.getText());
			        w=Double.parseDouble(text1Field.getText());

			        peri=2*(l+w);
			        
			        text2Field.setText("" + peri);
			    
			    }
	});

	
	JMenuItem menu3 = new JMenuItem("Загрузить файл в проект17");
	menu.add(menu3);
	main_GUI.setJMenuBar(menuBar);
	
	String[] transfer = {"Перемещение...","Переместить логотип УГАТУ в верхний правый угол", "Переместить логотип УГАТУ в середину", "Переместить логотип УГАТУ в левый верхний угол", "Создать массив", "Отсортировать данные в проекте17"};
	changeBox = new JComboBox(transfer);
	changeBox.setBounds(15,140,360,30);
	changeBox.addActionListener(new ListenerComboBox());
	main_panel.add(changeBox);
	changeBox.setEnabled(true);
	
	 
	menu1.addActionListener (new ListenerImg());
	menu2.addActionListener(actionListener);
	menu.add(menu1);
	menu.add(menu2);
	menuBar.add(menu);
	main_panel.add(Button);
	
	
	 main_GUI.setVisible(true);
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
	}
	
	public static void main(String[] args) { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
		subversion student= new subversion();
		
	}

}
