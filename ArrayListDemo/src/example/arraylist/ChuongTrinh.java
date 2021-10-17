package example.arraylist;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ChuongTrinh {

	ArrayList<String> ListName ;

	private JFrame fArraylist;
	private JTextField textFieldFullname;
	private JLabel lblFullname;
	private JButton btnAdd;
	private JButton btnShowList;
	private JTextArea textAreaList;
	private JLabel lblStatus;
	private JLabel lblSearchList;
	private JTextArea textAreaSearchList;
	private JLabel lblSearch;
	private JTextField textFieldSearch;
	private JButton btnSearch;

	protected Component frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChuongTrinh window = new ChuongTrinh();
					window.fArraylist.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChuongTrinh() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		fArraylist = new JFrame();
		fArraylist.setTitle("Demo ArrayList");
		fArraylist.setBounds(330, 100, 585, 400);
		fArraylist.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fArraylist.getContentPane().setLayout(null);
		
		lblFullname = new JLabel("Enter name:");
		lblFullname.setHorizontalAlignment(SwingConstants.LEFT);
		lblFullname.setBounds(30, 24, 72, 27);
		fArraylist.getContentPane().add(lblFullname);
		
		textFieldFullname = new JTextField();
		
		textFieldFullname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				lblStatus.setText("I'm waiting for you...");
			}
		});
		textFieldFullname.setBounds(150, 24, 248, 27);
		fArraylist.getContentPane().add(textFieldFullname);
		textFieldFullname.setColumns(10);
		
		btnAdd = new JButton("Add");
		
		ListName = new ArrayList<String>();
		
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addList(ListName); 
				hienDanhSach(ListName, textAreaSearchList);
			}
		});
		btnAdd.setBounds(422, 25, 118, 27);
		fArraylist.getContentPane().add(btnAdd);
		
		btnShowList = new JButton("Show");
		btnShowList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hienDanhSach(ListName, textAreaList);
			}
		});
		btnShowList.setBounds(420, 130, 125, 27);
		fArraylist.getContentPane().add(btnShowList);
		
		textAreaList = new JTextArea(5,20);
		textAreaList.setBounds(305, 166, 240, 170);
		fArraylist.getContentPane().add(textAreaList);
		
		lblStatus = new JLabel("Show status add...");
		lblStatus.setForeground(Color.BLUE);
		lblStatus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStatus.setBounds(240, 52, 161, 20);
		fArraylist.getContentPane().add(lblStatus);
		
		lblSearchList = new JLabel("Entered name");
		lblSearchList.setBounds(180, 131, 105, 23);
		fArraylist.getContentPane().add(lblSearchList);
		
		textAreaSearchList = new JTextArea();
		textAreaSearchList.setBounds(32, 166, 240, 169);
		fArraylist.getContentPane().add(textAreaSearchList);
		
		lblSearch = new JLabel("Search for name:");
		lblSearch.setHorizontalAlignment(SwingConstants.LEFT);
		lblSearch.setBounds(30, 83, 161, 27);
		fArraylist.getContentPane().add(lblSearch);
		
		textFieldSearch = new JTextField();
		textFieldSearch.setColumns(10);
		textFieldSearch.setBounds(150, 82, 248, 27);
		fArraylist.getContentPane().add(textFieldSearch);
		
		btnSearch = new JButton("Search");

		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean result = false;
					for(int index = 0; index < ListName.size(); index++) {
						String sTen = ListName.get(index);
						if (sTen.equals(textFieldSearch.getText())){
							result = true;
							break;
						}
						else {
							result = false;
						}
					}
					if(result == true) {
						JOptionPane.showMessageDialog(fArraylist, "Already exist!", "Notice", JOptionPane.INFORMATION_MESSAGE);
					} 
					else {
						JOptionPane.showMessageDialog(fArraylist, "Not on the list yet!", "Notice", JOptionPane.INFORMATION_MESSAGE);
					}
				textFieldSearch.setText("");
			}
		});
		btnSearch.setBounds(420, 82, 118, 28);
		fArraylist.getContentPane().add(btnSearch);
	}

	public void addList(ArrayList<String> ds) {

		String fullname = textFieldFullname.getText();

		ds.add(fullname);

		textFieldFullname.setText("");

		lblStatus.setText("Add successful!");	
	}
	
	public void hienDanhSach(ArrayList<String> ds, JTextArea textAreaList) {			
		textAreaList.setText("");
		for(int index = 0; index < ds.size(); index++) {
			String sTen = ds.get(index);
			textAreaList.append(sTen + "\n");
		}
	}
}
