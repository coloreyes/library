package administrate;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.JTableHeader;

import dao.BookDAO;
import dao.Borrow_Record_DAO;
import model.Books;
import model.Borrow_Records;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class adm_2_1 extends JFrame {
	/**
	 * 
	 */
	protected static final Object BorderLayout = null;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adm_2_1 frame = new adm_2_1();
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
	public adm_2_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("������ͼ����");
		label.setBounds(42, 43, 84, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(137, 40, 161, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 84, 414, 167);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setVisible(false);
		JButton button = new JButton("ȷ��");
	
		button.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				String[] fields= {"����","����","����"};
				Object[][] data= {{"ss","dd","11"},		
				};
				JTable table = new JTable(data,fields);
				setVisible(true);
				JTableHeader jheader=table.getTableHeader();
				panel.add(jheader,BorderLayout);
				panel.add(table,BorderLayout);
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
			});
		button.setBounds(328, 39, 67, 23);
		contentPane.add(button);
		
		
		
		
		
	
			}
		}
	
