import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChiSoBMI extends JFrame{

	public static void main(String[] args) {
		JFrame fr = new JFrame("Tính BMI");
        	fr.setSize(500, 350);
        JPanel panel = new JPanel(); 
        	fr.add(panel);
        placeComponents(panel);
        	fr.setVisible(true);
        	fr.setLayout(null);
        	fr.setLocationRelativeTo(null);
}

    public static void placeComponents(JPanel p) {
        p.setLayout(null);

        JLabel L = new JLabel("CHỈ SỐ BMI");
        L.setBounds(210,10,200,25);
        p.add(L);
        
        JLabel LabelW = new JLabel("Cân nặng(kg)");
        LabelW.setBounds(50,100,100,30);
        p.add(LabelW);

        JTextField txtW  = new JTextField(20);
        txtW.setBounds(170,100,200,30);
        p.add(txtW);
        
        JLabel LabelH = new JLabel("Chiều cao(cm)");
        LabelH.setBounds(50,50,100,30);
        p.add(LabelH);

        JTextField txtH  = new JTextField(20);
        txtH .setBounds(170,50,200,30);
        p.add(txtH);

        JButton btnKQ = new JButton("TÍNH");
        btnKQ.setBounds(190, 160, 100, 30);
        p.add(btnKQ);
        
        JLabel LabelKQ = new JLabel("");
        LabelKQ.setBounds(120,200,500,25);
        p.add(LabelKQ);
        
        JLabel LabelLK = new JLabel("");
        LabelLK.setBounds(120,225,500,25);
        p.add(LabelLK);
        
        
        btnKQ.addActionListener(new ActionListener(){
        @Override
        	public void actionPerformed(ActionEvent e) {
        	
        		double Weight=Double.parseDouble(txtW.getText());
        		double Height=Double.parseDouble(txtH.getText());
                double KQBMI = Weight / Math.pow((Height/100), 2);
                
                  if (KQBMI < 16) {
                	 LabelKQ.setText("Chỉ số BMI của bạn là " + KQBMI);
                	 LabelLK.setText("Bạn gầy quá rồi! Phải ăn nhiều hơn thôi.");}
                else if (KQBMI >= 16 && KQBMI < 17) {
                	 LabelKQ.setText("Chỉ số BMI của bạn là: " + KQBMI);
                	 LabelLK.setText("Bạn gầy quá rồi! Phải ăn nhiều hơn thôi.");}
                else if (KQBMI >= 17 && KQBMI < 18.5) {
                	 LabelKQ.setText("Chỉ số BMI của bạn là: " + KQBMI);
                	 LabelLK.setText("Bạn gầy quá! Phải ăn nhiều hơn thôi.");} 
                else if (KQBMI >= 18.5 && KQBMI < 25) {
                	 LabelKQ.setText("Chỉ số BMI của bạn là: " + KQBMI);
                	 LabelLK.setText("Xin chúc mừng! Bạn có một cơ thể cân đối.");} 
                else if (KQBMI >= 25 && KQBMI < 30) {
                	 LabelKQ.setText("Chỉ số BMI của bạn là: " + KQBMI);
                	 LabelLK.setText("Bạn hơi thừa cân rồi! Phải giảm cân thôi.");}
                else if (KQBMI >= 30 && KQBMI < 35) {
                	 LabelKQ.setText("Chỉ số BMI của bạn là: " + KQBMI);
                	 LabelLK.setText("Bạn hơi béo rồi! Phải giảm cân thôi.");}
                else if (KQBMI >= 35 && KQBMI <= 40) {
                	 LabelKQ.setText("Chỉ số BMI của bạn là: " + KQBMI);
                	 LabelLK.setText("Bạn béo quá rồi! Bạn cần phải giảm cân.");}
                else {
                	 LabelKQ.setText("Chỉ số BMI của bạn là: " + KQBMI);
                	 LabelLK.setText("Bạn béo phì rồi! Cần phải giảm cân thôi.");}
            }
        });
     }
}
