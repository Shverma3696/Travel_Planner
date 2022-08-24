
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class CreatePackageView {

	private JFrame frame_CreatePackageView;
	private JTextField textField_Age;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreatePackageView window = new CreatePackageView();
					window.frame_CreatePackageView.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreatePackageView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame_CreatePackageView = new JFrame();
		frame_CreatePackageView.getContentPane().setBackground(Color.BLACK);
		frame_CreatePackageView.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 766, 443);
		frame_CreatePackageView.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(250, 0, 516, 443);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lbl_heading_CPV = new JLabel("Create Your Own Package");
		lbl_heading_CPV.setFont(new Font("Calibri", Font.BOLD, 15));
		lbl_heading_CPV.setBounds(63, 87, 190, 20);
		panel_1.add(lbl_heading_CPV);

		JLabel lbl_Country = new JLabel("Country");
		lbl_Country.setFont(new Font("Calibri", Font.BOLD, 15));
		lbl_Country.setBounds(63, 174, 106, 20);
		panel_1.add(lbl_Country);

		JLabel lbl_Months = new JLabel("Months");
		lbl_Months.setFont(new Font("Calibri", Font.BOLD, 15));
		lbl_Months.setBounds(63, 220, 106, 20);
		panel_1.add(lbl_Months);

		textField_Age = new JTextField();
		textField_Age.setBounds(179, 173, 161, 19);
		panel_1.add(textField_Age);
		textField_Age.setColumns(10);

		JButton btn_Next = new JButton("Next");
		btn_Next.setFont(new Font("Calibri", Font.BOLD, 15));
		btn_Next.setBounds(130, 316, 96, 29);
		panel_1.add(btn_Next);

		String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		JComboBox comboBox = new JComboBox(months);
		comboBox.setBounds(179, 218, 161, 21);
		panel_1.add(comboBox);
		frame_CreatePackageView.setBounds(100, 100, 800, 500);
		frame_CreatePackageView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
