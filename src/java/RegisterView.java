
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class RegisterView {

	private JFrame frame_RegisterView;
	private JTextField textField_FullName;
	private JTextField textField_Age;
	private JTextField textField_Email;
	private JPasswordField passwordField_CreatePassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterView window = new RegisterView();
					window.frame_RegisterView.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public JFrame getFrame_RegisterView() {
		return frame_RegisterView;
	}

	public void setFrame_RegisterView(JFrame frame_RegisterView) {
		this.frame_RegisterView = frame_RegisterView;
	}

	/**
	 * Create the application.
	 */
	public RegisterView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame_RegisterView = new JFrame();
		frame_RegisterView.getContentPane().setBackground(Color.BLACK);
		frame_RegisterView.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 766, 443);
		frame_RegisterView.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(250, 0, 516, 443);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Details");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel.setBounds(63, 87, 106, 20);
		panel_1.add(lblNewLabel);
		
		JLabel lbl_FullName = new JLabel("Full Name");
		lbl_FullName.setFont(new Font("Calibri", Font.BOLD, 15));
		lbl_FullName.setBounds(63, 129, 106, 20);
		panel_1.add(lbl_FullName);
		
		JLabel lbl_Age = new JLabel("Age");
		lbl_Age.setFont(new Font("Calibri", Font.BOLD, 15));
		lbl_Age.setBounds(63, 174, 106, 20);
		panel_1.add(lbl_Age);
		
		JLabel lbl_Email = new JLabel("Email");
		lbl_Email.setFont(new Font("Calibri", Font.BOLD, 15));
		lbl_Email.setBounds(63, 220, 106, 20);
		panel_1.add(lbl_Email);
		
		JLabel lbl_CreatePassword = new JLabel("Create Password");
		lbl_CreatePassword.setFont(new Font("Calibri", Font.BOLD, 15));
		lbl_CreatePassword.setBounds(63, 271, 106, 20);
		panel_1.add(lbl_CreatePassword);
		
		textField_FullName = new JTextField();
		textField_FullName.setBounds(179, 128, 161, 19);
		panel_1.add(textField_FullName);
		textField_FullName.setColumns(10);
		
		textField_Age = new JTextField();
		textField_Age.setBounds(179, 173, 161, 19);
		panel_1.add(textField_Age);
		textField_Age.setColumns(10);
		
		textField_Email = new JTextField();
		textField_Email.setBounds(179, 219, 161, 19);
		panel_1.add(textField_Email);
		textField_Email.setColumns(10);
		
		passwordField_CreatePassword = new JPasswordField();
		passwordField_CreatePassword.setBounds(179, 270, 161, 19);
		panel_1.add(passwordField_CreatePassword);
		
		JButton btn_Register = new JButton("Register");
		btn_Register.setFont(new Font("Calibri", Font.BOLD, 15));
		btn_Register.setBounds(130, 316, 96, 29);
		panel_1.add(btn_Register);
		frame_RegisterView.setBounds(100, 100, 800, 500);
		frame_RegisterView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
