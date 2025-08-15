import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Quiz extends JFrame{
	JLabel questionNumber, questionLabel;
	JRadioButton option1, option2, option3, option4;
	JButton submit, nxt;
	ButtonGroup gp1;
	int ind, score;
	String name;
	ArrayList<String[]> question = new ArrayList<>();
	Quiz(String name){
		this.name = name;
		question.add(new String[] {
		    "Which access modifier is typically used to enforce encapsulation?",
		    "public",
		    "private",
		    "protected",
		    "default",
		    "private"
		});

		question.add(new String[] {
		    "Encapsulation in Java is implemented mainly using:",
		    "Inheritance and Polymorphism",
		    "Classes and Methods",
		    "Access Modifiers and Getter/Setter methods",
		    "Interfaces and Abstract Classes",
		    "Access Modifiers and Getter/Setter methods"
		});

		question.add(new String[] {
		    "Which OOP principle hides the internal details and shows only functionality?",
		    "Inheritance",
		    "Encapsulation",
		    "Abstraction",
		    "Polymorphism",
		    "Abstraction"
		});

		question.add(new String[] {
		    "In encapsulation, variables are usually declared as:",
		    "private",
		    "public",
		    "protected",
		    "package-private",
		    "private"
		});

		question.add(new String[] {
		    "Which method type is used to provide controlled access to a private field?",
		    "Constructors",
		    "Getters and Setters",
		    "Static Methods",
		    "Overloaded Methods",
		    "Getters and Setters"
		});

		question.add(new String[] {
		    "Which block is used to handle exceptions in Java?",
		    "if-else",
		    "try-catch",
		    "for loop",
		    "switch",
		    "try-catch"
		});

		question.add(new String[] {
		    "Which keyword is used to throw an exception explicitly?",
		    "throws",
		    "throw",
		    "catch",
		    "error",
		    "throw"
		});

		question.add(new String[] {
		    "Which of these is a checked exception in Java?",
		    "NullPointerException",
		    "IOException",
		    "ArithmeticException",
		    "ArrayIndexOutOfBoundsException",
		    "IOException"
		});

		question.add(new String[] {
		    "What will happen if an exception is not caught in Java?",
		    "It is ignored",
		    "Program crashes",
		    "It retries the operation",
		    "It logs and continues",
		    "Program crashes"
		});

		question.add(new String[] {
		    "Which block is always executed regardless of an exception occurring or not?",
		    "finally",
		    "lastly",
		    "always",
		    "end",
		    "finally"
		});
		question.add(new String[] {
		    "Which keyword is used to declare an abstract class in Java?",
		    "abstract",
		    "interface",
		    "class",
		    "virtual",
		    "abstract"
		});

		question.add(new String[] {
		    "Which type of method must be implemented in a subclass of an abstract class?",
		    "Static method",
		    "Final method",
		    "Abstract method",
		    "Private method",
		    "Abstract method"
		});

		question.add(new String[] {
		    "Can we create an object of an abstract class in Java?",
		    "Yes, always",
		    "No, never",
		    "Yes, if it has no abstract methods",
		    "Only if it is final",
		    "No, never"
		});

		question.add(new String[] {
		    "Which OOP concept focuses on exposing only essential details to the user?",
		    "Encapsulation",
		    "Polymorphism",
		    "Abstraction",
		    "Inheritance",
		    "Abstraction"
		});

		question.add(new String[] {
		    "In Java, interfaces provide:",
		    "Implementation of methods",
		    "Full abstraction",
		    "Partial abstraction",
		    "No abstraction",
		    "Full abstraction"
		});

        Collections.shuffle(question);
		
		this.getContentPane().setBackground(Color.white);
		this.setTitle("");
		this.setSize(800, 300);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		ImageIcon icon = new ImageIcon("Images/Icon.jpg");
		this.setIconImage(icon.getImage());
		
		questionNumber = new JLabel();
		questionNumber.setBounds(0, 0, 30, 50);
		questionNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		questionNumber.setForeground(new Color(120, 81, 169));
		
		this.add(questionNumber);
		
	    questionLabel = new JLabel();
		questionLabel.setBounds(23, 0, 600, 50);
		questionLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		questionLabel.setForeground(new Color(120, 81, 169));
		this.add(questionLabel);
		
	    option1 = new JRadioButton();
		option1.setBounds(0, 40, 500, 50);
		option1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		option1.setBackground(Color.white);
		option1.setForeground(new Color(120, 81, 169));
		this.add(option1);
		
		option2 = new JRadioButton();
		option2.setBounds(0, 90, 500, 50);
		option2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		option2.setBackground(Color.white);
		option2.setForeground(new Color(120, 81, 169));
		this.add(option2);
		
	    option3 = new JRadioButton();
		option3.setBounds(0, 140, 500, 50);
		option3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		option3.setBackground(Color.white);
		option3.setForeground(new Color(120, 81, 169));
		this.add(option3);
		
	    option4 = new JRadioButton();
		option4.setBounds(0, 190, 500, 50);
		option4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		option4.setBackground(Color.white);
		option4.setForeground(new Color(120, 81, 169));
		this.add(option4);
		
	    gp1 = new ButtonGroup();
	    gp1.add(option1);
	    gp1.add(option2);
	    gp1.add(option3);
	    gp1.add(option4);
	    
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
		Start(ind);
		nxt.addActionListener(e -> {
		    String userAns = "";
		    if (gp1.getSelection() != null) {
		        if (option1.isSelected()) userAns = option1.getText();
		        else if (option2.isSelected()) userAns = option2.getText();
		        else if (option3.isSelected()) userAns = option3.getText();
		        else if (option4.isSelected()) userAns = option4.getText();

		        if (userAns.equals(question.get(ind)[5])) score += 10;
		    }
		    ind++;

		    if (ind < 10) {
		        Start(ind);
		    }
		    if (ind == 9) { 
		        nxt.setEnabled(false);
		        submit.setEnabled(true);
		    }
		});
		submit.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
	
						 String userAns = "";
						if (gp1.getSelection() != null) {
					        if (option1.isSelected()) userAns = option1.getText();
					        else if (option2.isSelected()) userAns = option2.getText();
					        else if (option3.isSelected()) userAns = option3.getText();
					        else if (option4.isSelected()) userAns = option4.getText();

					        if (userAns.equals(question.get(ind)[5])) score += 10;}
						Quiz.this.setVisible(false);
						new Score(name, score);
						
					}
				});
				
		this.setVisible(true);
	}
	public void Start(int count) {
		String[] q = question.get(count);
	    questionNumber.setText((count + 1) + ". ");
	    questionLabel.setText(q[0]);
	    option1.setText(q[1]);
	    option2.setText(q[2]);
	    option3.setText(q[3]);
	    option4.setText(q[4]);
	    gp1.clearSelection();
	}
}
