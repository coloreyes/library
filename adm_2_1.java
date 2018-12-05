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
		
		JLabel label = new JLabel("请输入图书编号");
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
		JButton button = new JButton("确认");
	
		button.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				String[] fields= {"书名","作者","类型"};
				Object[][] data= {{"ss","dd","11"},		
				};
				JTable table = new JTable(data,fields);
				setVisible(true);
				JTableHeader jheader=table.getTableHeader();
				panel.add(jheader,BorderLayout);
				panel.add(table,BorderLayout);
				DefaultTableColumnModel dcm = 
						(DefaultTableColumnModel)table.getColumnModel(); 
						//设置表格显示的最好宽度，即此时表格显示的宽度。
						dcm.getColumn(0).setPreferredWidth(100); 
						//设置表格通过拖动列可以的最小宽度。
						dcm.getColumn(0).setMinWidth(45);
						//设置表格通过拖动列可以的最大宽度。
						dcm.getColumn(0).setMaxWidth(85);

						//给表格设置行高
						table.setRowHeight(25);
					panel.setVisible(true);	
				//JOptionPane.showMessageDialog(null, "借阅成功","提示",JOptionPane.INFORMATION_MESSAGE);
				//JOptionPane.showMessageDialog(null, "对不起，您的借阅数量已达上限","提示",JOptionPane.INFORMATION_MESSAGE);

			}
			});
		button.setBounds(328, 39, 67, 23);
		contentPane.add(button);
		
		
		
		
		
	
			}
		}
	
