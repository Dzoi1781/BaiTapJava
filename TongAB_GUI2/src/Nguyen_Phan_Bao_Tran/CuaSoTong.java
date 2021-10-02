package Nguyen_Phan_Bao_Tran;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Label;

public class CuaSoTong extends Frame{

	public CuaSoTong(){
		
		FlowLayout fl = new FlowLayout();
		setLayout(fl);
		
		setBounds(0,0,400,200);
		
		lblA = new Label("A = ");
		lblB = new Label("B = ");
		lblKQ = new Label("KQ = ");
		txtA = new TextField();
		txtB = new TextField();
		txtKQ = new TextField();
		
		btnCong = new Button("Tính ");
		
		add(lblA); 
		add(txtA);
		add(lblB); 
		add(txtB);
		add(btnCong);
		
		btnCong.addActionListener(new bolangnghe_xuly_cong());
		add(lblKQ); 
		add(txtKQ);
		setTitle("Chương trình tính tổng AB");
		setVisible(true);
		
		addWindowListener(new bolangnghe_xuly_cuaso());
	}
	
	class bolangnghe_xuly_cong implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String strA = txtA.getText();
			String strB = txtB.getText();
			
			int a = Integer.parseInt(strA);
			int b = Integer.parseInt(strB);
			
			int c = a + b;
			
			txtKQ.setText(String.valueOf(c));
		}
		
	}
	
	class bolangnghe_xuly_cuaso implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {}

		@Override
		public void windowClosing(WindowEvent e) {}

		@Override
		public void windowClosed(WindowEvent e) {}

		@Override
		public void windowIconified(WindowEvent e) {}

		@Override
		public void windowDeiconified(WindowEvent e) {}

		@Override
		public void windowActivated(WindowEvent e) {}

		@Override
		public void windowDeactivated(WindowEvent e) {}
		
	}
	
	TextField txtA, txtB, txtKQ;
	Label lblA, lblB, lblKQ;
	Button btnCong;
}

