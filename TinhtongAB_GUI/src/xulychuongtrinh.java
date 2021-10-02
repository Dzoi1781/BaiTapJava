import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;


public class xulychuongtrinh {
	public static void main(String[] args) {

	Frame fr = new Frame("Tính tổng A và B");
	fr.setBounds(0, 0, 300, 200);
	fr.setLocationRelativeTo(null);
	
	Panel panel = new Panel(); 
	panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); 
	
	fr.add(panel);
	fr.setBackground(Color.BLACK);
	
	Panel panelA = new Panel();
	panelA.setLayout(new FlowLayout());
	Label lblA = new Label("Nhập A");
	lblA.setForeground(Color.YELLOW);
	TextField txtA = new TextField(5);
	txtA.setBackground(Color.orange);
	panelA.add(lblA);
	panelA.add(txtA);
	panel.add(panelA);
	
	
	Panel panelB = new Panel();
	panelB.setLayout(new FlowLayout());
	Label lblB = new Label("Nhập B");
	lblB.setForeground(Color.YELLOW);
	TextField txtB = new TextField(5);
	txtB.setBackground(Color.orange);
	panelB.add(lblB);
	panelB.add(txtB);
	panel.add(panelB);
	
	Panel panelCong = new Panel();
	panelCong.setLayout(new FlowLayout());
	JButton btnCong = new JButton("   =   ");
	panel.add(btnCong);	 
	
	Panel panelKQ = new Panel();
	panelKQ.setLayout(new FlowLayout());
	Label lblKQ = new Label("             ");
	TextField txtKQ = new TextField(5);
	txtKQ.setBackground(Color.RED);
	panelKQ.add(lblKQ);
	panelKQ.add(txtKQ);
	panel.add(panelKQ);
	

	ActionListener bolangnghe = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String strA = txtA.getText();
			String strB = txtB.getText();
			
			int a = Integer.parseInt(strA);
			int b = Integer.parseInt(strB);
			
			int c = a + b;
			
			txtKQ.setText(String.valueOf(c));
		}
	};
		
		btnCong.addActionListener(bolangnghe);
	
	
		fr.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
		}
	});
	
	
	fr.setVisible(true);
	
	}
}