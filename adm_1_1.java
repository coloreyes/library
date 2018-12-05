package administrate;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.JTableHeader;

import dao.BookDAO;
import model.Books;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class adm_1_1 extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel label_1;
	private JLabel label_2;
	private JTextField textField_2;
	private JButton button_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adm_1_1 frame = new adm_1_1();
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
	public adm_1_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(10, 54, 414, 176);
		contentPane.add(panel);
		panel.setLayout(null);
		
		label_1 = new JLabel("此书已存在");
		label_1.setBounds(165, 10, 87, 29);
		panel.add(label_1);
		
		label_2 = new JLabel("确定增加数量：");
		label_2.setBounds(47, 49, 87, 21);
		panel.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(144, 49, 108, 21);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		button_1 = new JButton("确认");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField_2.getText();
				int number = Integer.parseInt(num);
				BookDAO b_dao = new BookDAO();
				Books b = new Books();
				try {
					b_dao.updateBookSum(b, number);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					b_dao.updateBookUpdate_date(b);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					b_dao.printBook(b);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			
				}
			
		});
		button_1.setBounds(275, 48, 72, 23);
		panel.add(button_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 226, 414, 25);
		contentPane.add(panel_1);
	
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
