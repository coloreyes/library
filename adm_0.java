package administrate;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.TextField;
import java.awt.Panel;
import java.awt.Canvas;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class adm_0 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adm_0 frame = new adm_0();
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
	public adm_0() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton button = new JButton("购入新书");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adm_1 frame1 = new adm_1();
				frame1.setVisible(true);
			}
		});
		
		button.setBounds(176, 99, 93, 23);
		contentPane.setLayout(null);
		contentPane.add(button);
		
		JButton button_1 = new JButton("信息查询");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adm_2 frame2 = new adm_2();
				frame2.setVisible(true);
			}
		});
		button_1.setBounds(176, 132, 93, 23);
		contentPane.add(button_1);
		
		
		JButton button_2 = new JButton("图书注销");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adm_3 frame3 = new adm_3();
				frame3.setVisible(true);
			}
		});
		button_2.setBounds(176, 165, 93, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("退出登陆");
		button_3.setBounds(308, 228, 93, 23);
		contentPane.add(button_3);
		
		JLabel label = new JLabel("选择您要进行的操作：");
		label.setBounds(45, 53, 127, 23);
		contentPane.add(label);
	}
}