import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Division {

	public static void main(String[] args) {
		JFrame f = new JFrame("Integer Division");
		f.setLayout(null);
		JLabel l1 = new JLabel("Num 1");
		l1.setBounds(30, 20, 81, 37);
		l1.setFont(new Font("Tahoma",Font.BOLD,16));
		JLabel l2 = new JLabel("Num 2");
		l2.setBounds(30, 80, 81, 37);
		l2.setFont(new Font("Tafoma",Font.BOLD,16));
		JLabel l3 = new JLabel("Result");
		l3.setBounds(30,140,81,37);
		l3.setFont(new Font("Tafoma",Font.BOLD,16));
		JTextField txt1 = new JTextField();
		txt1.setBounds(130,20,81,30);
		txt1.setFont(new Font("Tafoma",Font.PLAIN,16));
		JTextField txt2 = new JTextField();
		txt2.setBounds(130,80,81,30);
		txt2.setFont(new Font("Tafoma",Font.PLAIN,16));
		JTextField txt3 = new JTextField();
		txt3.setBounds(130, 140, 81, 30);
		txt3.setFont(new Font("Tafoma",Font.PLAIN,16));
		JButton b1 = new JButton("Divide");
		b1.setBounds(30,200, 80, 30);
		b1.setFont(new Font("Tafoma",Font.PLAIN,14));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String s1 = txt1.getText();
			String s2 = txt2.getText();
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			int c=0;
			try
			{
				c = a/b;
			}
			catch(NumberFormatException e2)
			{
				JOptionPane.showMessageDialog(f, e2);
			}
			catch(ArithmeticException e1)
			{
				JOptionPane.showMessageDialog(f,e1);
			}
			
			
			
			String s3 = Integer.toString(c);
			txt3.setText(s3);
		}
		});
		f.setSize(500, 350);
		f.setVisible(true);
		f.add(txt1);
		f.add(txt2);
		f.add(txt3);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(b1);
	}

}
