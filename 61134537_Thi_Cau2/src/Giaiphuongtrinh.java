import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Giaiphuongtrinh {

	private JFrame frame;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtketqua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Giaiphuongtrinh window = new Giaiphuongtrinh();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Giaiphuongtrinh() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 661, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLabel = new JLabel("Giải Phương Trình Bậc Nhất");
		lblLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblLabel.setBounds(150, 37, 422, 41);
		frame.getContentPane().add(lblLabel);
		
		JLabel lblA = new JLabel("Nhập a :");
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblA.setBounds(60, 125, 102, 41);
		frame.getContentPane().add(lblA);
		
		txtA = new JTextField();
		txtA.setBounds(172, 132, 355, 34);
		frame.getContentPane().add(txtA);
		txtA.setColumns(10);
		
		JLabel lblB = new JLabel("Nhập b :");
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblB.setBounds(60, 184, 84, 41);
		frame.getContentPane().add(lblB);
		
		txtB = new JTextField();
		txtB.setBounds(172, 191, 355, 34);
		frame.getContentPane().add(txtB);
		txtB.setColumns(10);
		
		JButton btnTinh = new JButton("Tính");
		btnTinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTinh.setBounds(276, 255, 112, 34);
		frame.getContentPane().add(btnTinh);
		
		JLabel lblkq = new JLabel("Kết quả");
		lblkq.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblkq.setBounds(60, 329, 69, 34);
		frame.getContentPane().add(lblkq);
		
		txtketqua = new JTextField();
		txtketqua.setBounds(172, 329, 355, 31);
		frame.getContentPane().add(txtketqua);
		txtketqua.setColumns(10);
		
		btnTinh.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String strA = txtA.getText();
				String strB = txtB.getText();
				double a, b, ketqua = 0;
				
				try {
					a = Double.parseDouble(strA);
				} catch (Exception ex) {
					a = 0;
					txtA.setText(String.valueOf(a));
				}
				
				try {
					b = Double.parseDouble(strB);
				} catch (Exception ex) {
					b = 0;
					txtB.setText(String.valueOf(b));
				}
				
				if (a == 0)
					txtketqua.setText("Phuong trinh vo nghiem");
				else if (b == 0)
					txtketqua.setText("Phuong trinh co vo so nghiem");
				else
					ketqua = -b / a;
					txtketqua.setText(String.valueOf(ketqua));
			}
		});
		
	}
}
