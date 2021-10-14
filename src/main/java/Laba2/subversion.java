package Laba2; //����� Java �������

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //���������� ��� ������� ���������
import javax.swing.*; // ���������� ��� GUI (��������� �� ������ awt)

public class subversion {

	public static String info17;
	protected static JPanel main_panel;
	protected static Image image;
	protected static  JComboBox changeBox;
	
	public subversion() {
	JFrame main_GUI = new JFrame("subversion");	// �������� ������������ ����
	main_GUI.setTitle ("������� �17");
	main_GUI.setBounds(500,400,400,450);
	main_GUI.setResizable(false); // ������������� ������ ����
	
	main_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JLabel laba_info = new JLabel("������������ ������ �4"); // ����������� ������ ��� �����������
	laba_info.setBounds(120,120,190,15);
	main_panel.add(laba_info);
	
	JButton button_pro = new JButton("��������"); // ��������� ������ 
	button_pro.setBounds(15,320,150,35);
	ActionListener actionListener1 = new ActionListener1(); //������� ���������
	button_pro.addActionListener(actionListener1); // ��������� ��������� � ������
	main_panel.add(button_pro);
	
	JButton button_info = new JButton("����������"); // ��������� ������
	button_info.setBounds(248,320,150,35);
	ActionListener info = new ActionListener2(); //������� ���������
	button_info.addActionListener(info); // ��������� ��������� � ������
	main_panel.add(button_info);
	
	JButton file = new JButton("�������� �����"); // ��������� ������ 
	file.setBounds(15,280,150,35);
	ActionListener ActionListener = new ListenerFile(); //������� ���������
	file.addActionListener(new ListenerFile()); // ��������� ��������� � ������
	main_panel.add(file);
	
	JButton button_exit = new JButton("�����"); // ��������� ������
	button_exit.setBounds(275,280,100,35);
	ActionListener actionListener = new ListenerButton(); //������� ���������
	button_exit.addActionListener(actionListener); // ��������� ��������� � ������
	main_panel.add(button_exit);
	
	JMenu menu = new JMenu("�������"); // ���������� �������� ����������� ���� "�������"
	JMenuBar menuBar = new JMenuBar();
	JMenuItem menu1 = new JMenuItem("���������� ������� �����");
	JMenuItem menu2 = new JMenuItem("�����");
	
	JLabel a = new JLabel("������� �:"); // ����������� ������ ��� �����������
	a.setBounds(20,180,70,40);
	main_panel.add(a);
	
	JLabel b = new JLabel("������� b:"); // ����������� ������ ��� �����������
	b.setBounds(150,180,70,40);
	main_panel.add(b);
	
	JLabel p = new JLabel("��������:"); // ����������� ������ ��� �����������
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
	
	JButton Button = new JButton("����������");  
	Button.setBounds(30,230,120,40);
	Button.addActionListener(new ActionListener() {// ��������� ��������� � ������
	
            public void actionPerformed(ActionEvent e) {
			
			    	double l, w, peri;

			        l=Double.parseDouble(textField.getText());
			        w=Double.parseDouble(text1Field.getText());

			        peri=2*(l+w);
			        
			        text2Field.setText("" + peri);
			    
			    }
	});

	
	JMenuItem menu3 = new JMenuItem("��������� ���� � ������17");
	menu.add(menu3);
	main_GUI.setJMenuBar(menuBar);
	
	String[] transfer = {"�����������...","����������� ������� ����� � ������� ������ ����", "����������� ������� ����� � ��������", "����������� ������� ����� � ����� ������� ����", "������� ������", "������������� ������ � �������17"};
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
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ���� JFrame � �������� Java
	}
	
	public static void main(String[] args) { // ���������� �������: http://www.mstu.edu.ru/study/materials/java/
		subversion student= new subversion();
		
	}

}
