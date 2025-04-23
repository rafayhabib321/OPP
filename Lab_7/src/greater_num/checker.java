package greater_num;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class checker extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JLabel lblNewLabel_1_2;
	private JTextArea t3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checker frame = new checker();
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
	public checker() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(197, 44, 96, 19);
		t1.setColumns(10);
		contentPane.add(t1);
		
		JLabel lblNewLabel_1 = new JLabel("Enter no 1");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(103, 46, 69, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a,b;
				a=Integer.parseInt(t1.getText());
				b=Integer.parseInt(t2.getText());
				if(a>b){
					t3.setText(String.valueOf(a+" is greater than "+b));
				}else if (b>a){
					t3.setText(String.valueOf(b+" is greater than "+a));
				}else {
					t3.setText(String.valueOf("Equal"));
				}
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 10));
		btnNewButton.setBounds(162, 144, 83, 21);
		contentPane.add(btnNewButton);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(197, 93, 96, 19);
		contentPane.add(t2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter no 2");
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(103, 95, 69, 14);
		contentPane.add(lblNewLabel_1_1);
		
		lblNewLabel_1_2 = new JLabel("Result");
		lblNewLabel_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblNewLabel_1_2.setBounds(114, 195, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		t3 = new JTextArea();
		t3.setBounds(197, 190, 125, 22);
		contentPane.add(t3);
	}
}
