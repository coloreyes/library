package administrate;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adm_2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adm_2 frame = new adm_2();
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
	public adm_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("选择查询方式");
		label.setBounds(59, 39, 110, 15);
		contentPane.add(label);
		
		JButton button = new JButton("按图书查询");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				adm_2_1 frame1 = new adm_2_1();
				frame1.setVisible(true);
			}
		});
		button.setBounds(69, 66, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("按读者查询");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//adm_2_2 frame2 = new adm_2_2();
				//frame2.setVisible(true);
			}
		});
		button_1.setBounds(232, 66, 93, 23);
		contentPane.add(button_1);
	}

}
