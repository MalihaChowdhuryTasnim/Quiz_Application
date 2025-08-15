import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rules extends JFrame {

	String name;

	Rules(String name) {
		this.name = name;
		this.getContentPane().setBackground(Color.white);
		this.setSize(600, 400);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(null);

		JLabel wlc = new JLabel("Welcome " + name + " to Quiz Test");
		wlc.setBounds(150, 5, 450, 50);
		wlc.setFont(new Font("Tahoma", Font.BOLD, 18));
		wlc.setForeground(new Color(120, 81, 169));
		this.add(wlc);

		ImageIcon rule = new ImageIcon("Images/Rules.png");

		Image sc = rule.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		ImageIcon rule_scale = new ImageIcon(sc);

		JLabel img = new JLabel(rule_scale);
		img.setBounds(10, 90, 150, 150);

		JLabel r = new JLabel("Rules");
		r.setBounds(48, 55, 300, 50);
		r.setFont(new Font("Tahoma", Font.BOLD, 20));
		r.setForeground(Color.white);
		img.add(r);
		this.add(img);

		JLabel first_rule = new JLabel("1.Total Questions: 10");
		JLabel second_rule = new JLabel("2.Each question carries 10 marks");
		JLabel third_rule = new JLabel("3.Questions are based on Object-Oriented Programming");
		JLabel fourth_rule = new JLabel("4.No negative marking");
		JLabel fifth_rule = new JLabel("5.Read each question carefully before answering!");
		JLabel sixth_rule = new JLabel("6.Once you click Next, you cannot go back");
	
		first_rule.setBounds(180, 60, 400, 50);
		second_rule.setBounds(180, 95, 400, 50);
		third_rule.setBounds(180, 130, 400, 50);
		fourth_rule.setBounds(180, 165, 400, 50);
		fifth_rule.setBounds(180, 200, 400, 50);
		sixth_rule.setBounds(180, 235, 500, 50);

		first_rule.setForeground(new Color(120, 81, 169));
		first_rule.setFont(new Font("Tahoma", Font.PLAIN, 15));

		second_rule.setForeground(new Color(120, 81, 169));
		second_rule.setFont(new Font("Tahoma", Font.PLAIN, 15));

		third_rule.setForeground(new Color(120, 81, 169));
		third_rule.setFont(new Font("Tahoma", Font.PLAIN, 15));

		fourth_rule.setForeground(new Color(120, 81, 169));
		fourth_rule.setFont(new Font("Tahoma", Font.PLAIN, 15));

		fifth_rule.setForeground(new Color(120, 81, 169));
		fifth_rule.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		sixth_rule.setForeground(new Color(120, 81, 169));
		sixth_rule.setFont(new Font("Tahoma", Font.PLAIN, 15));

		this.add(first_rule);
		this.add(second_rule);
		this.add(third_rule);
		this.add(fourth_rule);
		this.add(fifth_rule);
		this.add(sixth_rule);

		ImageIcon icon = new ImageIcon("Images/Icon.jpg");
		this.setIconImage(icon.getImage());

		JButton ok = new JButton("OK");
		ok.setBounds(260, 290, 100, 30);
		ok.setFont(new Font("Roboto", Font.BOLD, 18));
		ok.setFocusable(false);
		ok.setBackground(new Color(120, 81, 169));
		ok.setForeground(Color.white);
		this.add(ok);

		ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Rules.this.setVisible(false);
				new Quiz(name);

			}
		});

		this.setVisible(true);

	}
}
