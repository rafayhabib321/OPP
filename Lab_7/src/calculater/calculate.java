package calculater;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculate extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t3;
	private JTextField t1;
	private JTextField t2;
	private JTextField t4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculate frame = new calculate();
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
	public calculate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t3 = new JTextField();
		t3.setBounds(457, 203, 96, 19);
		t3.setColumns(10);
		contentPane.add(t3);
		
		JLabel lblNewLabel_1 = new JLabel("Principal Amount");
		lblNewLabel_1.setBounds(314, 80, 96, 14);
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		contentPane.add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(457, 78, 96, 19);
		t1.setColumns(10);
		contentPane.add(t1);
		
		t2 = new JTextField();
		t2.setBounds(457, 142, 96, 19);
		t2.setColumns(10);
		contentPane.add(t2);
		
		t4 = new JTextField();
		t4.setBounds(457, 326, 96, 19);
		t4.setColumns(10);
		contentPane.add(t4);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a,c;
				float b,d;
				a=Integer.parseInt(t1.getText());
				b=Float.parseFloat(t2.getText());
				c=Integer.parseInt(t3.getText());
				d=(a*b*c)/100;
				t4.setText(String.valueOf(d));
				
			}
		});
		btnNewButton.setBounds(409, 268, 83, 21);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 10));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel(" Rate of Interest");
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(314, 145, 96, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel(" Time of Interest");
		lblNewLabel_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_1_2.setBounds(314, 206, 96, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("          Result");
		lblNewLabel_1_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_1_2_1.setBounds(314, 329, 96, 14);
		contentPane.add(lblNewLabel_1_2_1);
	}

}
