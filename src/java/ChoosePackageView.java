
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;

public class ChoosePackageView {

	private JFrame frame_ChoosePlanView;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoosePackageView window = new ChoosePackageView();
					window.frame_ChoosePlanView.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChoosePackageView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame_ChoosePlanView = new JFrame();
		frame_ChoosePlanView.getContentPane().setBackground(Color.BLACK);
		frame_ChoosePlanView.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 766, 443);
		frame_ChoosePlanView.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(250, 0, 516, 443);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lbl_heading_CPV = new JLabel("Choose Your Plan");
		lbl_heading_CPV.setFont(new Font("Calibri", Font.BOLD, 15));
		lbl_heading_CPV.setBounds(52, 10, 190, 20);
		panel_1.add(lbl_heading_CPV);
		
		JPanel panel_Diamond = new JPanel();
		panel_Diamond.setBorder(new CompoundBorder(null, new LineBorder(new Color(0, 0, 0), 4, true)));
		panel_Diamond.setBounds(10, 60, 248, 185);
		panel_1.add(panel_Diamond);
		panel_Diamond.setLayout(null);
		
		JLabel lbl_Diamond = new JLabel("Diamond");
		lbl_Diamond.setBounds(10, 10, 45, 13);
		panel_Diamond.add(lbl_Diamond);
		
		JTextArea txt_Diamond = new JTextArea();
		txt_Diamond.setText("abc");
		txt_Diamond.setBounds(10, 33, 228, 114);
		panel_Diamond.add(txt_Diamond);
		
		JButton btn_Diamond = new JButton("Select Diamond Plan");
		btn_Diamond.setBounds(10, 154, 228, 21);
		panel_Diamond.add(btn_Diamond);
		
		JPanel panel_Platinum = new JPanel();
		panel_Platinum.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel_Platinum.setBounds(258, 60, 248, 185);
		panel_1.add(panel_Platinum);
		panel_Platinum.setLayout(null);
		
		JLabel lbl_Platinum = new JLabel("Platinum");
		lbl_Platinum.setBounds(10, 10, 45, 13);
		panel_Platinum.add(lbl_Platinum);
		
		JTextArea txt_Platinum = new JTextArea();
		txt_Platinum.setText("def");
		txt_Platinum.setBounds(10, 33, 228, 114);
		panel_Platinum.add(txt_Platinum);
		
		JButton btn_platinum = new JButton("Select Platinum Plan");
		btn_platinum.setBounds(10, 154, 228, 21);
		panel_Platinum.add(btn_platinum);
		
		JPanel panel_Gold = new JPanel();
		panel_Gold.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel_Gold.setBounds(10, 248, 248, 185);
		panel_1.add(panel_Gold);
		panel_Gold.setLayout(null);
		
		JLabel lbl_Gold = new JLabel("Gold");
		lbl_Gold.setBounds(10, 10, 45, 13);
		panel_Gold.add(lbl_Gold);
		
		JTextArea txt_Gold = new JTextArea();
		txt_Gold.setText("ghi");
		txt_Gold.setBounds(10, 33, 228, 114);
		panel_Gold.add(txt_Gold);
		
		JButton btn_Gold = new JButton("Select Gold Plan");
		btn_Gold.setBounds(10, 154, 228, 21);
		panel_Gold.add(btn_Gold);
		
		JPanel panel_Silver = new JPanel();
		panel_Silver.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel_Silver.setBounds(258, 248, 248, 185);
		panel_1.add(panel_Silver);
		panel_Silver.setLayout(null);
		
		JLabel lbl_Silver = new JLabel("Silver");
		lbl_Silver.setBounds(10, 10, 45, 13);
		panel_Silver.add(lbl_Silver);
		
		JTextArea txt_Silver = new JTextArea();
		txt_Silver.setText("jkl");
		txt_Silver.setBounds(10, 33, 228, 114);
		panel_Silver.add(txt_Silver);
		
		JButton btn_Silver = new JButton("Select Silver Plan");
		btn_Silver.setBounds(10, 154, 228, 21);
		panel_Silver.add(btn_Silver);

		
		frame_ChoosePlanView.setBounds(100, 100, 800, 500);
		frame_ChoosePlanView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
