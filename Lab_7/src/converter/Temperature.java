package converter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Temperature extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temperature frame = new Temperature();
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
	public Temperature() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 909, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("        Celcius");
		lblNewLabel_1.setBounds(290, 121, 92, 14);
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		contentPane.add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(404, 119, 96, 19);
		t1.setColumns(10);
		contentPane.add(t1);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a,b;
				a=Float.parseFloat(t1.getText());
				b=(a*9/5)+32;
				t2.setText(String.valueOf(b));
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 10));
		btnNewButton.setBounds(361, 174, 83, 21);
		contentPane.add(btnNewButton);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(404, 228, 96, 19);
		contentPane.add(t2);
		
		JLabel lblNewLabel_1_1 = new JLabel("     Fahrenhiet");
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(290, 233, 92, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("        Temperature Converter");
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(290, 62, 210, 14);
		contentPane.add(lblNewLabel_1_2);
	}

}
