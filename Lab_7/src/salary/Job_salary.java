package salary;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Job_salary extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Job_salary frame = new Job_salary();
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
	public Job_salary() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t2 = new JTextField();
		t2.setBounds(192, 68, 96, 19);
		contentPane.add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Basic Salary");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(80, 28, 89, 13);
		contentPane.add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(192, 26, 96, 19);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(192, 111, 96, 19);
		contentPane.add(t3);
		
		t4 = new JTextField();
		t4.setBounds(192, 194, 96, 19);
		contentPane.add(t4);
		t4.setColumns(10);
		
		btnNewButton = new JButton("Calculate");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a,b,c,d;
				a=Integer.parseInt(t1.getText());
				b=Integer.parseInt(t2.getText());
				c=Integer.parseInt(t3.getText());
				d=a+b-c;
				t4.setText(String.valueOf(d));
			}
			
		});
		btnNewButton.setBounds(154, 151, 96, 21);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("       Bonus");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel.setBounds(80, 71, 89, 13);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("   Deduction");
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(80, 114, 89, 13);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("       Salary");
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(80, 197, 89, 13);
		contentPane.add(lblNewLabel_3);
	}
}
