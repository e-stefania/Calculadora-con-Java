package logica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Panel;
import java.awt.Label;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 343, 443);
		getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(SystemColor.windowBorder);
		panel.setForeground(UIManager.getColor("Button.darkShadow"));
		panel.setBounds(0, 0, 325, 404);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnNewButton.setBounds(10, 91, 68, 50);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("/");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnNewButton_1.setBounds(88, 91, 68, 50);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnNewButton_2.setBounds(166, 91, 68, 50);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("-");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
				
			}
		});
		btnNewButton_3.setBounds(244, 91, 68, 50);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String IngreseNumero = textField.getText()+ btnNewButton_4.getText();
				textField.setText(IngreseNumero);
			}
		});
		btnNewButton_4.setBounds(10, 152, 68, 50);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("8");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String IngreseNumero = textField.getText()+ btnNewButton_5.getText();
				textField.setText(IngreseNumero);
			}
		});
		btnNewButton_5.setBounds(88, 152, 68, 50);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("9");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String IngreseNumero = textField.getText()+ btnNewButton_6.getText();
				textField.setText(IngreseNumero);
			}
		});
		btnNewButton_6.setBounds(166, 152, 68, 50);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("+");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
				
			}
		});
		btnNewButton_7.setBounds(244, 152, 68, 111);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_4_1 = new JButton("4");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngreseNumero = textField.getText()+ btnNewButton_4_1.getText();
				textField.setText(IngreseNumero);
			}
		});
		btnNewButton_4_1.setBounds(10, 213, 68, 50);
		panel.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton("5");
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String IngreseNumero = textField.getText()+ btnNewButton_4_2.getText();
				textField.setText(IngreseNumero);
			}
		});
		btnNewButton_4_2.setBounds(88, 213, 68, 50);
		panel.add(btnNewButton_4_2);
		
		JButton btnNewButton_4_3 = new JButton("6");
		btnNewButton_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String IngreseNumero = textField.getText()+ btnNewButton_4_3.getText();
				textField.setText(IngreseNumero);
			}
		});
		btnNewButton_4_3.setBounds(166, 213, 68, 50);
		panel.add(btnNewButton_4_3);
		
		JButton btnNewButton_4_5 = new JButton("1");
		btnNewButton_4_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String IngreseNumero = textField.getText()+ btnNewButton_4_5.getText();
				textField.setText(IngreseNumero);
			}
		});
		btnNewButton_4_5.setBounds(10, 274, 68, 50);
		panel.add(btnNewButton_4_5);
		
		JButton btnNewButton_4_6 = new JButton("2");
		btnNewButton_4_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String IngreseNumero = textField.getText()+ btnNewButton_4_6.getText();
				textField.setText(IngreseNumero);
			}
		});
		btnNewButton_4_6.setBounds(88, 274, 68, 50);
		panel.add(btnNewButton_4_6);
		
		JButton btnNewButton_4_7 = new JButton("3");
		btnNewButton_4_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String IngreseNumero = textField.getText()+ btnNewButton_4_7.getText();
				textField.setText(IngreseNumero);
			}
		});
		btnNewButton_4_7.setBounds(166, 274, 68, 50);
		panel.add(btnNewButton_4_7);
		
		JButton btnNewButton_4_8 = new JButton("=");
		btnNewButton_4_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(textField.getText());
				if (operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
			}
		});
		btnNewButton_4_8.setBounds(244, 274, 68, 111);
		panel.add(btnNewButton_4_8);
		
		JButton btnNewButton_4_9 = new JButton("0");
		btnNewButton_4_9.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
        	   
        	   String IngreseNumero = textField.getText()+ btnNewButton_4_9.getText();
				textField.setText(IngreseNumero);
			}
		});
		btnNewButton_4_9.setBounds(10, 335, 68, 50);
		panel.add(btnNewButton_4_9);
		
		JButton btnNewButton_4_11 = new JButton(".");
		btnNewButton_4_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4_11.setBounds(88, 335, 68, 50);
		panel.add(btnNewButton_4_11);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBackground(SystemColor.inactiveCaption);
		textField.setBounds(10, 11, 302, 69);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_4_9_1 = new JButton("%");
		btnNewButton_4_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnNewButton_4_9_1.setBounds(166, 335, 68, 50);
		panel.add(btnNewButton_4_9_1);
	}
}
