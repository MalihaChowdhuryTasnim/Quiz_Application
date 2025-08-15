import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame {
	String name;
	int score;
	JButton play, exit;

	Score(String name, int score) {
		this.name = name;
		this.score = score;
		this.getContentPane().setBackground(Color.white);
		this.setSize(600, 400);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(null);

		ImageIcon icon = new ImageIcon("Images/Icon.jpg");
		this.setIconImage(icon.getImage());

		JLabel sc = new JLabel("Thankyou " + name + " for playing Quiz Test");
		sc.setBounds(10, 5, 550, 50);
		sc.setFont(new Font("Tahoma", Font.BOLD, 18));
		sc.setForeground(new Color(120, 81, 169));
		this.add(sc);

		ImageIcon scores = new ImageIcon("Images/scores.png");
		Image scale_scores = scores.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);

		ImageIcon scaled = new ImageIcon(scale_scores);

		JLabel lbImg = new JLabel(scaled);
		lbImg.setBounds(10, 80, 200, 200);
		this.add(lbImg);

		JLabel scText = new JLabel("Your Scores is: " + score);
		scText.setBounds(300, 100, 300, 100);
		scText.setFont(new Font("Tahoma", Font.BOLD, 18));
		scText.setForeground(new Color(120, 81, 169));
		this.add(scText);

		play = new JButton("Play");
		play.setBounds(300, 180, 80, 30);
		play.setFont(new Font("Roboto", Font.BOLD, 18));
		play.setFocusable(false);
		play.setBackground(new Color(120, 81, 169));
		play.setForeground(Color.white);
		this.add(play);

		exit = new JButton("Exit");
		exit.setBounds(400, 180, 80, 30);
		exit.setFont(new Font("Roboto", Font.BOLD, 18));
		exit.setFocusable(false);
		exit.setBackground(new Color(120, 81, 169));
		exit.setForeground(Color.white);
		this.add(exit);

		play.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Score.this.setVisible(false);
				new Quiz(name);

			}
		});

		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		this.setVisible(true);

	}
}
