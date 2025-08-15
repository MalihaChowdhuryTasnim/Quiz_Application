import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends JFrame {
	String temp;

	Login() {
		this.getContentPane().setBackground(Color.white);
		this.setSize(800, 500);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setTitle("Quiz Application");
		this.setLayout(null);

		ImageIcon icon = new ImageIcon("Images/Icon.jpg");
		this.setIconImage(icon.getImage());

		ImageIcon bg = new ImageIcon("Images/Icon.jpg");
		Image scale_bg = bg.getImage().getScaledInstance(400, 500, Image.SCALE_SMOOTH);

		ImageIcon scaled = new ImageIcon(scale_bg);

		JLabel lb1 = new JLabel(scaled);
		lb1.setBounds(0, 0, 400, 500);
		this.add(lb1);

		JLabel title = new JLabel("OOP Quiz");
		title.setBounds(500, 70, 200, 100);
		title.setFont(new Font("Segoe Script", Font.BOLD, 26));
		title.setForeground(new Color(120, 81, 169));
		this.add(title);

		JLabel name = new JLabel("Enter Your Name");
		name.setBounds(485, 120, 300, 100);
		name.setFont(new Font("Segoe Script", Font.ITALIC, 18));
		name.setForeground(new Color(120, 81, 169));
		this.add(name);

		JTextField tf = new JTextField();
		tf.setBounds(455, 190, 250, 30);
		tf.setFont(new Font("Serif", Font.PLAIN, 18));
		tf.setForeground(new Color(120, 81, 169));
		this.add(tf);

		JButton st = new JButton("START");
		st.setBounds(530, 235, 100, 30);
		st.setFont(new Font("Roboto", Font.BOLD, 18));
		st.setFocusable(false);
		st.setBackground(new Color(120, 81, 169));
		st.setForeground(Color.white);
		this.add(st);
		
		this.setVisible(true);
	}
}