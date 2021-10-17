import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class baitap2 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldMaSP;
	private JTextField textFieldTenSP;
	private JTextField textFieldGia;
	JTextArea textAreaDSSP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					baitap2 frame = new baitap2();
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
	public baitap2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMaSP = new JLabel("Mã Sản Phẩm");
		lblMaSP.setBounds(68, 27, 97, 14);
		contentPane.add(lblMaSP);
		
		JLabel lblTenSP = new JLabel("Tên Sản Phẩm");
		lblTenSP.setBounds(68, 66, 97, 14);
		contentPane.add(lblTenSP);
		
		JLabel lblGiaSP = new JLabel("Giá Sản Phẩm");
		lblGiaSP.setBounds(68, 106, 92, 14);
		contentPane.add(lblGiaSP);
		
		textFieldMaSP = new JTextField();
		textFieldMaSP.setBounds(193, 24, 213, 20);
		contentPane.add(textFieldMaSP);
		textFieldMaSP.setColumns(10);
		
		textFieldTenSP = new JTextField();
		textFieldTenSP.setBounds(193, 63, 213, 20);
		contentPane.add(textFieldTenSP);
		textFieldTenSP.setColumns(10);
		
		textFieldGia = new JTextField();
		textFieldGia.setBounds(193, 103, 213, 20);
		contentPane.add(textFieldGia);
		textFieldGia.setColumns(10);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addSanPham();
				hienThiSanPham();
			}

			
		});
		btnThem.setBounds(35, 145, 78, 23);
		contentPane.add(btnThem);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteSanPham();
			}

		});
		btnXoa.setHorizontalAlignment(SwingConstants.RIGHT);
		btnXoa.setBounds(135, 145, 63, 23);
		contentPane.add(btnXoa);
		
		JButton btnSua = new JButton("Sửa");
		btnSua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editSanPham();
			}

		});
		btnSua.setBounds(223, 145, 63, 23);
		contentPane.add(btnSua);
		
		JButton btnTimKiem = new JButton("Tìm Kiếm");
		btnTimKiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyTimKiem();
			}

		});
		btnTimKiem.setBounds(303, 145, 92, 23);
		contentPane.add(btnTimKiem);
		
		textAreaDSSP = new JTextArea();
		textAreaDSSP.setBounds(21, 225, 395, 144);
		contentPane.add(textAreaDSSP);
		
		JLabel lblDS = new JLabel("Danh Sách Sản Phẩm");
		lblDS.setBounds(166, 190, 240, 14);
		contentPane.add(lblDS);
	}
		XuLySanPham xlsp = new XuLySanPham();
		
		private void addSanPham() {
			StringBuilder sb = new StringBuilder();
			if (textFieldMaSP.getText().equals("")) {
				sb.append("Chưa nhập mã");
			}
			try {
				SanPham sp = getModel();
				if (xlsp.themSanPham(sp) > 0) {
					JOptionPane.showMessageDialog(this, "Thêm thành công!");
					resetForm();
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}

		private SanPham getModel() {
			SanPham sp = new SanPham();
			sp.setMaSP(textFieldMaSP.getText());
			sp.setTenSP(textFieldTenSP.getText());
			sp.setGiaSP(Double.parseDouble(textFieldGia.getText()));
			return sp;
		}
		
		private void hienThiSanPham() {
			textAreaDSSP.setText("");
			for (SanPham DSSP : xlsp.listSanPham) {
				String MaSP = DSSP.getMaSP();
				String TenSP = DSSP.getTenSP();
				double GiaSP = DSSP.getGiaSP();
				textAreaDSSP.append(MaSP + "--\t--" + TenSP + "--\t--" + GiaSP + "\n");
			}
			
		}
		
		private void XuLyTimKiem() {
			SanPham spTimKiem = xlsp.findSanPhamByMaSP(textFieldMaSP.getText());
			if (spTimKiem != null) {
				setModel(spTimKiem);
			}
			else {
				JOptionPane.showMessageDialog(this, "Không có sản phẩm");
			}
		}
		
		private SanPham setModel(SanPham sp) {
			textFieldMaSP.setText(sp.getMaSP());
			textFieldTenSP.setText(sp.getTenSP());
			textFieldGia.setText(Double.toString(sp.getGiaSP()));
			return sp;
		}
		
		public void resetForm(){
			textFieldMaSP.setText("");
			textFieldTenSP.setText("");
			textFieldGia.setText("");
		}
		
		private void editSanPham() {
			SanPham speditSP = xlsp.findSanPhamByMaSP(textFieldMaSP.getText());
			if (speditSP != null) {
				try {
					speditSP = getModel();
					xlsp.editSanPham(speditSP);
					JOptionPane.showMessageDialog(this, "Sửa thành công!");
					resetForm();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
		
		private void deleteSanPham() {
			if (xlsp.deleteSanPham(textFieldMaSP.getText())>0) {
				JOptionPane.showMessageDialog(this, "Xóa thành công!");
				resetForm();
			}
			
		}
}
