import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Quiz extends JFrame {
	String[][] ques = new String[10][5];
	String[][] ans = new String[10][1];
	JLabel qn, qt;
	JRadioButton bt1, bt2, bt3, bt4;
	JButton submit, nxt;
	ButtonGroup gp1;
	int i, score;
	String name;

	Quiz(String name) {
		this.name = name;
		ques[0][0] = "What is the main goal of encapsulation in Java?";
		ques[0][1] = "To allow unrestricted access to class members";
		ques[0][2] = "To hide implementation details and protect data";
		ques[0][3] = "To inherit features from another class";
		ques[0][4] = "To allow polymorphism";
		ques[1][0] = "Which of the following best demonstrates encapsulation?";
		ques[1][1] = "Using a static method in a class";
		ques[1][2] = "Declaring variables as private and using getters/setters";
		ques[1][3] = "Making all data members public";
		ques[1][4] = "Overloading constructors";
		ques[2][0] = "Which access modifier is typically used to enforce encapsulation?";
		ques[2][1] = "public";
		ques[2][2] = "private";
		ques[2][3] = "protected";
		ques[2][4] = "default";
		ques[3][0] = "What is abstraction in Java?";
		ques[3][1] = "Hiding object identity";
		ques[3][2] = "Showing implementation details to the user";
		ques[3][3] = "Hiding internal details and showing functionality";
		ques[3][4] = "None of the above";
		ques[4][0] = "Which of these is used to achieve abstraction in Java?";
		ques[4][1] = "Constructors";
		ques[4][2] = "Abstract classes and interfaces";
		ques[4][3] = "final keyword";
		ques[4][4] = "Method overloading";
		ques[5][0] = "An abstract class can:";
		ques[5][1] = "Be instantiated directly";
		ques[5][2] = "Contain abstract and non-abstract methods";
		ques[5][3] = "Only contain static methods";
		ques[5][4] = "Only contain private constructors";
		ques[6][0] = "Which of the following is not a keyword used in exception handling?";
		ques[6][1] = "try";
		ques[6][2] = "catch";
		ques[6][3] = "extends";
		ques[6][4] = "finally";
		ques[7][0] = "What is the correct order of exception handling blocks?";
		ques[7][1] = "try → throw → catch";
		ques[7][2] = "catch → try → finally";
		ques[7][3] = "try → catch → finally";
		ques[7][4] = "finally → try → catch";
		ques[8][0] = "What happens if an exception is not caught in Java?";
		ques[8][1] = "The program skips the error and continues";
		ques[8][2] = "The JVM terminates the program and prints a stack trace";
		ques[8][3] = "The error is ignored";
		ques[8][4] = "The compiler corrects the exception automatically";
		ques[9][0] = "Which class is the superclass of all exceptions in Java?";
		ques[9][1] = "Error";
		ques[9][2] = "Throwable";
		ques[9][3] = "Exception";
		ques[9][4] = "RuntimeException";
		ans[0][0] = "To allow unrestricted access to class members";
		ans[1][0] = "Declaring variables as private and using getters/setters";
		ans[2][0] = "private";
		ans[3][0] = "Hiding internal details and showing functionality";
		ans[4][0] = "Abstract classes and interfaces";
		ans[5][0] = "Contain abstract and non-abstract methods";
		ans[6][0] = "extends";
		ans[7][0] = "try → catch → finally";
		ans[8][0] = "The JVM terminates the program and prints a stack trace";
		ans[9][0] = "Throwable";
		this.getContentPane().setBackground(Color.white);
		this.setTitle("");
		this.setSize(800, 300);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		ImageIcon icon = new ImageIcon("Images/Icon.jpg");
		this.setIconImage(icon.getImage());
		qn = new JLabel();
		qn.setBounds(0, 0, 30, 50);
		qn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(qn);
		qt = new JLabel();
		qt.setBounds(23, 0, 500, 50);
		qt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(qt);
		bt1 = new JRadioButton();
		bt1.setBounds(0, 40, 500, 50);
		bt1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bt1.setBackground(Color.white);
		this.add(bt1);
		bt2 = new JRadioButton();
		bt2.setBounds(0, 90, 500, 50);
		bt2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bt2.setBackground(Color.white);
		this.add(bt2);
		bt3 = new JRadioButton();
		bt3.setBounds(0, 140, 500, 50);
		bt3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bt3.setBackground(Color.white);
		this.add(bt3);
		bt4 = new JRadioButton();
		bt4.setBounds(0, 190, 500, 50);
		bt4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bt4.setBackground(Color.white);
		this.add(bt4);
		gp1 = new ButtonGroup();
		gp1.add(bt1);
		gp1.add(bt2);
		gp1.add(bt3);
		gp1.add(bt4);
		nxt = new JButton("Next");
		nxt.setBounds(670, 65, 100, 30);
		nxt.setFont(new Font("Roboto", Font.BOLD, 18));
		nxt.setFocusable(false);
		nxt.setBackground(new Color(120, 81, 169));
		nxt.setForeground(Color.white);
		this.add(nxt);
		submit = new JButton("Submit");
		submit.setBounds(670, 120, 100, 30);
		submit.setFont(new Font("Roboto", Font.BOLD, 18));
		submit.setFocusable(false);
		submit.setBackground(new Color(120, 81, 169));
		submit.setForeground(Color.white);
		submit.setEnabled(false);
		this.add(submit);
		Start(i);
		nxt.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String userAns = "";

		        if (gp1.getSelection() != null) {
		            if (bt1.isSelected()) userAns = bt1.getText();
		            else if (bt2.isSelected()) userAns = bt2.getText();
		            else if (bt3.isSelected()) userAns = bt3.getText();
		            else if (bt4.isSelected()) userAns = bt4.getText();

		            if (userAns.equals(ans[i][0])) {
		                score += 10;
		            }
		        }

		        i++;

			    if (i < 10) {
			        Start(i);
			    }
			    if (i == 9) { 
			        nxt.setEnabled(false);
			        submit.setEnabled(true);
			    }
		    }
			    });
		submit.addActionListener(new ActionListener() {
		   
		    public void actionPerformed(ActionEvent e) {
		    	 String userAns = "";

			        if (gp1.getSelection() != null) {
			            if (bt1.isSelected()) userAns = bt1.getText();
			            else if (bt2.isSelected()) userAns = bt2.getText();
			            else if (bt3.isSelected()) userAns = bt3.getText();
			            else if (bt4.isSelected()) userAns = bt4.getText();

			            if (userAns.equals(ans[i][0])) {
			                score += 10;
			            }
			        }
			    Quiz.this.setVisible(false);
		        new Score(name, score);
		    }
		});


		this.setVisible(true);
	}

	public void Start(int count) {
		qn.setText("" + (count + 1) + ". ");
		qt.setText(ques[count][0]);
		bt1.setText(ques[count][1]);
		bt2.setText(ques[count][2]);
		bt3.setText(ques[count][3]);
		bt4.setText(ques[count][4]);
		gp1.clearSelection();
	}
}