package view;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import controller.Controller;
import model.MemberVO;
import javax.swing.JPasswordField;
import java.awt.Font;

public class LoginGUI {

	private JFrame frame;
	private JTextField txt_ID;
	private JButton btn_Login;
	private JButton btn_Join;
	private JPasswordField txt_PW;
	public static Controller controller = new Controller();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI window = new LoginGUI();
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
	public LoginGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_165020780607700");
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 412, 140);
		panel.add(panel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 156, 412, 193);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);

		JLabel lblNewLabel_2 = new JLabel("FIU");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 50, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_2, 80, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, 100, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_2, -77, SpringLayout.EAST, panel_1);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_2);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setBounds(115, 55, 60, 25);
		panel_2.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("PW");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(115, 140, 60, 25);
		panel_2.add(lblNewLabel_1);

		txt_ID = new JTextField();
		txt_ID.setBounds(215, 55, 115, 25);
		panel_2.add(txt_ID);
		txt_ID.setColumns(10);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 368, 412, 120);

		txt_PW = new JPasswordField();
		txt_PW.setBounds(215, 137, 115, 25);
		panel_2.add(txt_PW);
		panel.add(panel_3);

		JCheckBox save_ID = new JCheckBox("\uC544\uC774\uB514 \uC800\uC7A5");
		save_ID.setBounds(115, 6, 145, 25);
		panel_3.add(save_ID);

		btn_Login = new JButton("\uB85C\uADF8\uC778");
		btn_Login.setBounds(70, 80, 125, 30);
		btn_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = txt_ID.getText();
				String pw = String.valueOf(txt_PW.getPassword());

				MemberVO user = new MemberVO(id, pw);
				boolean isSuccess = controller.login(user);
				if (isSuccess == true) {
					JOptionPane.showMessageDialog(frame, "로그인 성공", "로그인 결과", JOptionPane.PLAIN_MESSAGE);
					MainGUI mainGUI = new MainGUI();
					frame.dispose();
				} else {
					JOptionPane.showMessageDialog(frame, "로그인 실패", "로그인 결과", JOptionPane.PLAIN_MESSAGE);
				}
				if (save_ID.isSelected()) {
					txt_ID.setText(id);
				} else {
					txt_ID.setText("");
				}
				txt_PW.setText("");
			}
		});
		panel_3.setLayout(null);
		panel_3.add(btn_Login);

		btn_Join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_Join.setBounds(230, 80, 125, 30);
		btn_Join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JoinGUI join = new JoinGUI();
			}
		});
		panel_3.add(btn_Join);

	}
}
