import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField; 

public class tinhtoan {
	
    public static void main(String[] args) {    

        JFrame frame = new JFrame("Tính Toán");
        frame.setSize(410, 310);
        JPanel panel = new JPanel(); 
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }

    public static void placeComponents(JPanel p) {

        p.setLayout(null);

        JLabel Label = new JLabel("PHÉP TÍNH TOÁN HỌC");
        Label.setBounds(140,10,200,25);
        p.add(Label);
        
        JLabel LabelA = new JLabel("A");
        LabelA.setBounds(70,50,20,25);
        p.add(LabelA);

        JTextField txtA  = new JTextField(20);
        txtA .setBounds(100,50,200,25);
        p.add(txtA );
        
        JLabel LabelB = new JLabel("B");
        LabelB.setBounds(70,90,20,25);
        p.add(LabelB);

        JTextField txtB  = new JTextField(20);
        txtB .setBounds(100,90,200,25);
        p.add(txtB );


        JButton btnCong = new JButton("+");
        btnCong.setBounds(75,140,45,30);
        p.add(btnCong);
        
        JButton btnTru = new JButton("-");
        btnTru.setBounds(145,140,45,30);
        p.add(btnTru);
        
        JButton btnNhan = new JButton("*");
        btnNhan.setBounds(215,140,45,30);
        p.add(btnNhan);
        
        JButton btnChia = new JButton("/");
        btnChia.setBounds(285,140,45,30);
        p.add(btnChia);
       
        JLabel LabelKQ = new JLabel("Kết quả");
        LabelKQ.setBounds(70,200,100,25);
        p.add(LabelKQ);

        JTextField txtKQ = new JTextField(20);
        txtKQ .setBounds(150,200,150,25);
        p.add(txtKQ);
        
		ActionListener bolangnghe = new ActionListener() {
			public void cong() {
				double A = Double.parseDouble(txtA.getText());
				double B = Double.parseDouble(txtB.getText());
		        double KQ = A + B;
		        txtKQ.setText(String.valueOf(KQ));
		    }

		    public void tru() {
		    	double A = Double.parseDouble(txtA.getText());
			    double B = Double.parseDouble(txtB.getText());
		        double KQ = A - B;
		        txtKQ.setText(String.valueOf(KQ));
		    }

		    public void nhan() {
			    double A = Double.parseDouble(txtA.getText());
			    double B = Double.parseDouble(txtB.getText());
		        double KQ = A * B;
		        txtKQ.setText(String.valueOf(KQ));
		    }

		    public void chia() {
		    	double A = Double.parseDouble(txtA.getText());
			    double B = Double.parseDouble(txtB.getText());
			    double KQ = A / B;
		        txtKQ.setText(String.valueOf(KQ));
		    }

		    @Override
		    public void actionPerformed(ActionEvent e) {
		        if (e.getActionCommand() == "+") {
		            cong();
		        } else if (e.getActionCommand() == "-") {
		            tru();
		        } else if (e.getActionCommand() == "*") {
		            nhan();
		        } else if (e.getActionCommand() == "/") {
		            chia();
		        }
		    }
		};
			btnCong.addActionListener(bolangnghe);
			btnTru.addActionListener(bolangnghe);
			btnNhan.addActionListener(bolangnghe);
			btnChia.addActionListener(bolangnghe);
			WindowAdapter a = new WindowAdapter() {
		@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		
    }
}
