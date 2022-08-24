
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginView {

	private JFrame frame;
	private JTextField textField_Email;
	private JPasswordField passwordField_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView window = new LoginView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 766, 443);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(250, 0, 516, 443);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl_Email = new JLabel("Email");
		lbl_Email.setFont(new Font("Calibri", Font.BOLD, 15));
		lbl_Email.setBounds(96, 151, 62, 25);
		panel_1.add(lbl_Email);
		
		JLabel lbl_Password = new JLabel("Password");
		lbl_Password.setFont(new Font("Calibri", Font.BOLD, 15));
		lbl_Password.setBounds(96, 209, 62, 25);
		panel_1.add(lbl_Password);
		
		textField_Email = new JTextField();
		textField_Email.setBounds(210, 152, 96, 19);
		panel_1.add(textField_Email);
		textField_Email.setColumns(10);
		
		passwordField_password = new JPasswordField();
		passwordField_password.setBounds(210, 210, 96, 19);
		panel_1.add(passwordField_password);
		
		JButton btn_Login = new JButton("Login");
		btn_Login.setBounds(148, 260, 85, 21);
		panel_1.add(btn_Login);
		
		JLabel lbl_text1 = new JLabel("----------------- OR -----------------");
		lbl_text1.setFont(new Font("Calibri", Font.BOLD, 15));
		lbl_text1.setBounds(96, 303, 210, 25);
		panel_1.add(lbl_text1);
		
		JLabel lbl_txt2 = new JLabel("New users >>> ");
		lbl_txt2.setFont(new Font("Calibri", Font.BOLD, 15));
		lbl_txt2.setBounds(108, 357, 96, 25);
		panel_1.add(lbl_txt2);
		
		JButton btn_Register = new JButton("Register");
		btn_Register.setBounds(221, 357, 85, 21);
		panel_1.add(btn_Register);
	}
}
