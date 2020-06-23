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
import java.awt.Color;
import javax.swing.ImageIcon;

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
		panel.setBackground(new Color(51, 153, 153));
		frame.getContentPane().add(panel, "name_165020780607700");
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 102));
		panel_1.setBounds(10, 10, 412, 414);
		panel.add(panel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(51, 153, 153));
		panel_2.setBounds(10, 434, 412, 116);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);

		JLabel lblNewLabel_2 = new JLabel("\uCD95\uC81C \uC5B4\uB54C");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 175, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_2, 75, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, 225, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_2, -82, SpringLayout.EAST, panel_1);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_2);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SMHRD\\Desktop\\lb_id.PNG"));
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setBounds(71, 24, 40, 35);
		panel_2.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("PW");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SMHRD\\Desktop\\lb_pw.PNG"));
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(71, 69, 40, 35);
		panel_2.add(lblNewLabel_1);

		txt_ID = new JTextField();
		txt_ID.setHorizontalAlignment(SwingConstants.CENTER);
		txt_ID.setBounds(108, 24, 135, 35);
		txt_ID.setBorder(null);
		panel_2.add(txt_ID);
		txt_ID.setColumns(10);

		txt_PW = new JPasswordField();
		txt_PW.setHorizontalAlignment(SwingConstants.CENTER);
		txt_PW.setBounds(108, 69, 135, 35);
		txt_PW.setBorder(null);
		panel_2.add(txt_PW);

		btn_Login = new JButton("Login");
		btn_Login.setIcon(new ImageIcon("C:\\Users\\SMHRD\\Desktop\\btn_login.PNG"));
		btn_Login.setFont(new Font("굴림", Font.PLAIN, 15));
		btn_Login.setBounds(269, 24, 75, 35);
		panel_2.add(btn_Login);

		btn_Join = new JButton("Join");
		btn_Join.setIcon(new ImageIcon("C:\\Users\\SMHRD\\Desktop\\btn_join.PNG"));
		btn_Join.setFont(new Font("굴림", Font.PLAIN, 15));
		btn_Join.setBounds(269, 69, 75, 35);
		panel_2.add(btn_Join);
		btn_Join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JoinGUI join = new JoinGUI();
			}
		});

		JCheckBox save_ID = new JCheckBox("\uC544\uC774\uB514 \uC800\uC7A5");
		save_ID.setFont(new Font("휴먼편지체", Font.PLAIN, 15));
		save_ID.setBackground(new Color(51, 153, 153));
		save_ID.setBounds(80, 555, 145, 25);
		panel.add(save_ID);

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
	}
}
