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
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Color;
import javax.swing.ImageIcon;

public class LoginGUI {

	private JFrame frame;
	private JTextField txt_ID;
	private JButton btn_Login;
	private JButton btn_Join;
	private JPasswordField txt_PW;
	public static Controller controller = new Controller();

	private FontMake fm = new FontMake();

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
		panel.setBackground(new Color(240, 248, 255));
		frame.getContentPane().add(panel, "name_165020780607700");
		panel.setLayout(null);

		String path3 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\main_logo.png";
		ImageIcon home = new ImageIcon(path3);
		Image originImg5 = home.getImage();
		Image changedImg4 = originImg5.getScaledInstance(250, 250, Image.SCALE_SMOOTH); // 사이즈조절
		ImageIcon Icon4 = new ImageIcon(changedImg4);

		JLabel lbl_image = new JLabel(Icon4);
		lbl_image.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_image.setBounds(92, 90, 250, 250);
		panel.add(lbl_image);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 248, 255));
		panel_2.setBounds(12, 350, 412, 116);
		panel.add(panel_2);
		panel_2.setLayout(null);

		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

		fm.FontChange(ge);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\lb_id.PNG"));
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setBounds(71, 24, 40, 35);
		panel_2.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("PW");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\lb_pw.PNG"));
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(71, 69, 40, 35);
		panel_2.add(lblNewLabel_1);

		txt_ID = new JTextField();
		txt_ID.setFont(new Font("빙그레체", Font.PLAIN, 15));
		txt_ID.setHorizontalAlignment(SwingConstants.CENTER);
		txt_ID.setBounds(108, 24, 223, 35);
		txt_ID.setBorder(null);
		panel_2.add(txt_ID);
		txt_ID.setColumns(10);

		txt_PW = new JPasswordField();
		txt_PW.setHorizontalAlignment(SwingConstants.CENTER);
		txt_PW.setBounds(108, 69, 223, 35);
		txt_PW.setBorder(null);
		panel_2.add(txt_PW);
		
				btn_Login = new JButton("");
				btn_Login.setIcon(new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\btn_log.png"));
				btn_Login.setBounds(92, 488, 250, 35);
				panel.add(btn_Login);
				btn_Login.setFont(new Font("빙그레체", Font.PLAIN, 14));
				
						btn_Join = new JButton("");
						btn_Join.setIcon(new ImageIcon("C:\\Users\\SMHRD\\git\\repository\\Team\\img\\btn_join.PNG"));
						btn_Join.setBounds(92, 533, 250, 30);
						panel.add(btn_Join);
						btn_Join.setFont(new Font("빙그레체", Font.PLAIN, 15));
						btn_Join.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								JoinGUI join = new JoinGUI();
							}
						});
				
						btn_Login.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								String id = txt_ID.getText();
								String pw = String.valueOf(txt_PW.getPassword());
				
								MemberVO user = new MemberVO(id, pw);
								boolean isSuccess = controller.login(user);
								if (isSuccess == true) {
									// JOptionPane.showMessageDialog(frame, "로그인 성공", "로그인 결과",
									// JOptionPane.PLAIN_MESSAGE);
									MainGUI mainGUI = new MainGUI();
									frame.dispose();
								} else {
									JOptionPane.showMessageDialog(frame, "로그인 실패", "로그인 결과", JOptionPane.ERROR_MESSAGE);
								}
							}
						});
	}
}
