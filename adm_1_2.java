package administrate;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.BookDAO;
import model.Books;

import java.awt.CardLayout;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class adm_1_2 extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel label_4;
	private JLabel lblNewLabel;
	private JLabel label_6;
	private JLabel lblNewLabel_1;
	private JButton button_1;
	private JButton button_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JComboBox comboBox;
	private JTextField textField_6;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adm_1_2 frame = new adm_1_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public adm_1_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(10, 52, 414, 188);
		contentPane.add(panel);
		panel.setLayout(null);
		
		label_4 = new JLabel("图书类型选择");
		label_4.setBounds(72, 10, 75, 15);
		panel.add(label_4);
		
		lblNewLabel = new JLabel("单        价");
		lblNewLabel.setBounds(72, 45, 75, 15);
		panel.add(lblNewLabel);
		
		label_6 = new JLabel("数        量");
		label_6.setBounds(72, 80, 75, 15);
		panel.add(label_6);
		
		lblNewLabel_1 = new JLabel("购  入 日 期");
		lblNewLabel_1.setBounds(72, 115, 75, 15);
		panel.add(lblNewLabel_1);
		
		button_1 = new JButton("确认");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookDAO b_dao = new BookDAO();
				Books b = new Books();
				try {
					b_dao.addBook(b);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
			}
		});
		button_1.setBounds(72, 155, 75, 23);
		panel.add(button_1);
		
		button_2 = new JButton("取消");
		button_2.setBounds(248, 155, 75, 23);
		panel.add(button_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(168, 115, 91, 21);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(168, 80, 91, 21);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(168, 45, 91, 21);
		panel.add(textField_5);
		textField_5.setColumns(10);

		
		comboBox = new JComboBox<>();
		comboBox.addItem("fiction");
		comboBox.addItem("literature");
		comboBox.addItem("education");
		comboBox.addItem("humanitiy");
		comboBox.addItem("economic");
		comboBox.addItem("life");
		comboBox.addItem("success");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_6.setText((String)comboBox.getSelectedItem());
			}
		});
		
		comboBox.setBounds(286, 7, 91, 21);
		panel.add(comboBox);
		
		textField_6 = new JTextField();
		textField_6.setBounds(168, 10, 91, 21);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JButton button_1 = new JButton("返回");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adm_1 Frame2 = new adm_1();
				Frame2.setVisible(true);
			}
		});
		button_1.setBounds(28, 22, 65, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("主菜单");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adm_0 Frame1 = new adm_0();
				Frame1.setVisible(true);
			}
		});
		button_2.setBounds(335, 22, 69, 23);
		contentPane.add(button_2);
	}
}


