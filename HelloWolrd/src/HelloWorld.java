import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloWorld{
	public static void main(String args []) {
		new AppFrame();
	}
}

class AppFrame extends JFrame{
	JTextField in = new JTextField(10);
	JButton btn = new JButton("求平方");
	JLabel out = new JLabel("用于显示结果的标签");
	
	public AppFrame(){
		setLayout(new FlowLayout()); //加进来的东西一个个的放
		getContentPane().add(in);
		getContentPane().add(btn);
		getContentPane().add(out); 
		btn.addActionListener(new BtnActionAdapter());
		setSize(400, 100);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); //默认关闭窗口
		setVisible(true);
	}
	
	class BtnActionAdapter implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String s = in.getText();
			double d = Double.parseDouble(s);
			double sq = d * d;
			out.setText(d + "的平方是：" + sq);
		}
	}
}