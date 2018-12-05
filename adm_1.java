package administrate;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.BookDAO;
import model.Books;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class adm_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adm_1 frame = new adm_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
//	 */
	public adm_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("������");
		label.setBounds(109, 77, 36, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("���ߣ�");
		label_1.setBounds(109, 134, 36, 15);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(155, 74, 120, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(155, 131, 120, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("ȷ��");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String book = textField.getText();
				String author = textField_1.getText();
				BookDAO bDao = new BookDAO();
				Books b = new Books();
					try {
						b = bDao.listBook(book,author);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						
				try {
					bDao.printBook(b);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if(b.exist_or_not == 1) {
					adm_1_1 frame1 = new adm_1_1();
					frame1.setVisible(true);
				}
				else {
					adm_1_2 frame2 = new adm_1_2();
					frame2.setVisible(true);
				}
			}
		});
		button.setBounds(318, 102, 65, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("����");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adm_0 Frame2 = new adm_0();
				Frame2.setVisible(true);
			}
		});
		button_1.setBounds(28, 22, 65, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("���˵�");
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

/*
String book = textField.getText();
				String author = textField_1.getText();
				BookDAO bDao=new BookDAO();
				Books b=new Books();
					try {
						b=bDao.listBook(book,author);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						
				try {
					bDao.printBook(b);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				String[] fields= {"����","����"};
				Object[][] data= {{
					b.getBook_id(),b.getBook_name()	
				}};
				JTable table = new JTable(data,fields);
				setVisible(true);
				JTableHeader jheader=table.getTableHeader();
				
				panel.add(jheader,BorderLayout.NORTH);
				panel.add(table,BorderLayout.CENTER);
				DefaultTableColumnModel dcm = 
						(DefaultTableColumnModel)table.getColumnModel(); 
						//���ñ����ʾ����ÿ�ȣ�����ʱ�����ʾ�Ŀ�ȡ�
						dcm.getColumn(0).setPreferredWidth(100); 
						//���ñ��ͨ���϶��п��Ե���С��ȡ�
						dcm.getColumn(0).setMinWidth(45);
						//���ñ��ͨ���϶��п��Ե�����ȡ�
						dcm.getColumn(0).setMaxWidth(85);

						//����������и�
						table.setRowHeight(25);
				panel.setVisible(true);
						
				//JOptionPane.showMessageDialog(null, "���ĳɹ�","��ʾ",JOptionPane.INFORMATION_MESSAGE);
				//JOptionPane.showMessageDialog(null, "�Բ������Ľ��������Ѵ�����","��ʾ",JOptionPane.INFORMATION_MESSAGE);
				}

//				
//				String res ="YES";
//				
//				if(res.equals("YES")) {
//					adm_1_1 frame1 = new adm_1_1();
//					frame1.setVisible(true);
//				}
*/