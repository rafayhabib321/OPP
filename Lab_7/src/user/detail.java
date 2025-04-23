package user;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class detail extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField pass;
	private JTextField name;
	private JTextField msg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					detail frame = new detail();
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
	public detail() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pass = new JPasswordField();
		pass.setBounds(161, 139, 147, 19);
		contentPane.add(pass);
		
		name = new JTextField();
		name.setBounds(161, 81, 147, 19);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("      Username");
		lblNewLabel_1.setBounds(49, 83, 92, 14);
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("       Password");
		lblNewLabel_1_1.setBounds(49, 141, 92, 14);
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("                    SIGN IN");
		lblNewLabel_1_2.setBounds(98, 34, 210, 14);
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String a;
				final String c="admin";
				int b;
				final int d=123;
				a=name.getText();
				b=Integer.parseInt(pass.getText());
				if(name.getText().equals(c)&&pass.getText().equals(d)) {
					msg.setText("LOG");
				}else {
					msg.setText("ERROR");
				}
			}
		});
		btnNewButton.setBounds(161, 195, 83, 21);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 10));
		contentPane.add(btnNewButton);
		
		msg = new JTextField();
		msg.setBounds(78, 248, 245, 19);
		contentPane.add(msg);
		msg.setColumns(10);
	}
}
