package view;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Collator;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import controller.Controller;
import model.MemberVO;
import java.awt.Color;
import javax.swing.Icon;

public class JoinGUI {

	private JFrame frame;
	private JButton btn_Cancle;
	private JButton btn_Join;
	private JTextField txt_ID;
	private JPasswordField txt_PW;
	private JPasswordField txt_pwCheck;
	private JTextField txt_Name;
	private JTextField txt_Phone;
	private JTextField txt_Age;
	private Controller controller = LoginGUI.controller;

	private FontMake fm = new FontMake();

	public JoinGUI() {
		initialize();
		frame.setVisible(true);
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
		frame.getContentPane().add(panel, "name_242157257160200");
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 248, 255));
		panel_1.setBounds(10, 10, 412, 80);
		panel.add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);

		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

		fm.FontChange(ge);

		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785 \uD398\uC774\uC9C0");
		lblNewLabel.setFont(new Font("빙그레체", Font.PLAIN, 20));
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel, 20, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel, 100, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel, 60, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel, -100, SpringLayout.EAST, panel_1);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel);

		String path1 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\main_logo.png";
		ImageIcon main_logo = new ImageIcon(path1);
		Image originImg1 = main_logo.getImage();
		Image changedImg1 = originImg1.getScaledInstance(80, 80, Image.SCALE_SMOOTH); // 사이즈조절
		ImageIcon Icon1 = new ImageIcon(changedImg1);

		JLabel lbl_image = new JLabel(Icon1);
		sl_panel_1.putConstraint(SpringLayout.NORTH, lbl_image, 0, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lbl_image, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lbl_image, 80, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lbl_image, 90, SpringLayout.WEST, panel_1);
		panel_1.add(lbl_image);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 248, 255));
		panel_2.setBounds(10, 128, 412, 392);
		panel.add(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 248, 255));
		panel_3.setBounds(10, 570, 412, 55);
		panel_2.setLayout(null);

		JLabel lb_ID = new JLabel("ID");
		lb_ID.setBounds(60, 10, 60, 30);
		lb_ID.setFont(new Font("빙그레체", Font.PLAIN, 15));
		lb_ID.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lb_ID);

		txt_ID = new JTextField();
		txt_ID.setBounds(160, 10, 110, 30);
		panel_2.add(txt_ID);
		txt_ID.setColumns(10);

		JLabel lb_PW = new JLabel("PW");
		lb_PW.setBackground(Color.LIGHT_GRAY);
		lb_PW.setBounds(60, 60, 60, 30);
		lb_PW.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_PW.setFont(new Font("빙그레체", Font.PLAIN, 15));
		panel_2.add(lb_PW);

		txt_PW = new JPasswordField();
		txt_PW.setBounds(160, 60, 110, 30);
		panel_2.add(txt_PW);

		JLabel lb_pwCheck = new JLabel("PW\uD655\uC778");
		lb_pwCheck.setBounds(60, 110, 60, 30);
		lb_pwCheck.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_pwCheck.setFont(new Font("빙그레체", Font.PLAIN, 15));
		panel_2.add(lb_pwCheck);

		txt_pwCheck = new JPasswordField();
		txt_pwCheck.setBounds(160, 110, 110, 30);
		panel_2.add(txt_pwCheck);

		JLabel lb_Name = new JLabel("\uC774\uB984");
		lb_Name.setBounds(60, 160, 60, 30);
		lb_Name.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_Name.setFont(new Font("빙그레체", Font.PLAIN, 15));
		panel_2.add(lb_Name);

		txt_Name = new JTextField();
		txt_Name.setBounds(160, 160, 110, 30);
		txt_Name.setColumns(10);
		panel_2.add(txt_Name);

		JLabel lb_Phone = new JLabel("\uC804\uD654\uBC88\uD638");
		lb_Phone.setBounds(60, 210, 60, 30);
		lb_Phone.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_Phone.setFont(new Font("빙그레체", Font.PLAIN, 15));
		panel_2.add(lb_Phone);

		txt_Phone = new JTextField();
		txt_Phone.setBounds(160, 210, 110, 30);
		txt_Phone.setColumns(10);
		panel_2.add(txt_Phone);

		JLabel lb_Age = new JLabel("\uB098\uC774");
		lb_Age.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_Age.setFont(new Font("빙그레체", Font.PLAIN, 15));
		lb_Age.setBounds(60, 260, 60, 30);
		panel_2.add(lb_Age);

		JLabel lb_location = new JLabel("\uC9C0\uC5ED");
		lb_location.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_location.setFont(new Font("빙그레체", Font.PLAIN, 15));
		lb_location.setBounds(60, 310, 60, 30);
		panel_2.add(lb_location);

		JLabel lb_Sex = new JLabel("\uC131\uBCC4");
		lb_Sex.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_Sex.setFont(new Font("빙그레체", Font.PLAIN, 15));
		lb_Sex.setBounds(60, 360, 60, 30);
		panel_2.add(lb_Sex);

		txt_Age = new JTextField();
		txt_Age.setColumns(10);
		txt_Age.setBounds(160, 260, 110, 30);
		panel_2.add(txt_Age);

		String[] x = { "서울특별시", "대전광역시", "부산광역시", "대구광역시", "인천광역시", "울산광역시", "광주광역시", "세종시", "경기도", "강원도", "충청북도",
				"충청남도", "전라북도", "전라남도", "경상북도", "경상남도", "제주도" };
		JComboBox box_location = new JComboBox(x);
		box_location.setFont(new Font("빙그레체", Font.PLAIN, 15));
		box_location.setBounds(160, 310, 110, 30);
		panel_2.add(box_location);

		ButtonGroup group = new ButtonGroup();

		JRadioButton RB_male = new JRadioButton("\uB0A8");
		RB_male.setBackground(new Color(240, 248, 255));
		RB_male.setFont(new Font("빙그레체", Font.PLAIN, 15));
		RB_male.setBounds(160, 360, 50, 30);
		panel_2.add(RB_male);

		JRadioButton RB_female = new JRadioButton("\uC5EC");
		RB_female.setBackground(new Color(240, 248, 255));
		RB_female.setFont(new Font("빙그레체", Font.PLAIN, 15));
		RB_female.setBounds(215, 360, 50, 30);
		panel_2.add(RB_female);
		panel.add(panel_3);
		panel_3.setLayout(null);

		group.add(RB_male);
		group.add(RB_female);

		btn_Join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_Join.setFont(new Font("빙그레체", Font.PLAIN, 15));
		btn_Join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt_ID.getText();
				String pw = String.valueOf(txt_PW.getPassword());
				String name = txt_Name.getText();
				String phone = txt_Phone.getText();
				String location = box_location.getSelectedItem().toString();

				Enumeration<AbstractButton> enums = group.getElements();
				String sex = null;
				while (enums.hasMoreElements()) {
					AbstractButton ab = enums.nextElement();
					JRadioButton jb = (JRadioButton) ab;
					if (jb.isSelected())
						sex = jb.getText().trim();
				}

				String age = txt_Age.getText();

				MemberVO joinUser = new MemberVO(id, pw, name, phone, location, sex, age);

				if (pw.equals(String.valueOf(txt_pwCheck.getPassword()))) {
					int cnt = controller.join(joinUser);
					if (cnt > 0) {
						JOptionPane.showMessageDialog(frame, "회원가입 성공", "회원가입 결과", JOptionPane.PLAIN_MESSAGE);
						frame.dispose();
					} else {
						JOptionPane.showMessageDialog(frame, "회원가입 실패", "회원가입 결과", JOptionPane.PLAIN_MESSAGE);
					}

				} else {
					JOptionPane.showMessageDialog(frame, "비밀번호가 일치하지 않습니다", "회원가입 결과", JOptionPane.PLAIN_MESSAGE);
					txt_pwCheck.setText("");
				}
			}
		});
		btn_Join.setBounds(70, 10, 115, 30);
		panel_3.add(btn_Join);

		JButton btn_idCheck = new JButton("\uC911\uBCF5\uD655\uC778");
		btn_idCheck.setFont(new Font("빙그레체", Font.PLAIN, 13));
		btn_idCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt_ID.getText();
				boolean is_Check = controller.check(id);
				if (is_Check == true) {
					JOptionPane.showMessageDialog(frame, "ID가 중복되었습니다", "ID 중복확인", JOptionPane.PLAIN_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(frame, "사용 가능한 ID입니다", "ID 중복확인", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		btn_idCheck.setBounds(295, 10, 90, 30);
		panel_2.add(btn_idCheck);

		String path2 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\join_id.png";
		ImageIcon id = new ImageIcon(path2);
		Image originImg2 = id.getImage();
		Image changedImg2 = originImg2.getScaledInstance(30, 30, Image.SCALE_SMOOTH); // 사이즈조절
		ImageIcon Icon2 = new ImageIcon(changedImg2);

		JLabel lbl_image_ID = new JLabel(Icon2);
		lbl_image_ID.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_image_ID.setBounds(129, 10, 30, 30);
		panel_2.add(lbl_image_ID);

		String path3 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\join_pw.png";
		ImageIcon pw = new ImageIcon(path3);
		Image originImg3 = pw.getImage();
		Image changedImg3 = originImg3.getScaledInstance(30, 30, Image.SCALE_SMOOTH); // 사이즈조절
		ImageIcon Icon3 = new ImageIcon(changedImg3);

		JLabel lbl_image_PW = new JLabel(Icon3);
		lbl_image_PW.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_image_PW.setBounds(129, 60, 30, 30);
		panel_2.add(lbl_image_PW);

		String path4 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\join_check.png";
		ImageIcon pw_Check = new ImageIcon(path4);
		Image originImg4 = pw_Check.getImage();
		Image changedImg4 = originImg4.getScaledInstance(30, 30, Image.SCALE_SMOOTH); // 사이즈조절
		ImageIcon Icon4 = new ImageIcon(changedImg4);

		JLabel lbl_image_pwCheck = new JLabel(Icon4);
		lbl_image_pwCheck.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_image_pwCheck.setBounds(129, 110, 30, 30);
		panel_2.add(lbl_image_pwCheck);

		String path5 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\join_name.png";
		ImageIcon name = new ImageIcon(path5);
		Image originImg5 = name.getImage();
		Image changedImg5 = originImg5.getScaledInstance(30, 30, Image.SCALE_SMOOTH); // 사이즈조절
		ImageIcon Icon5 = new ImageIcon(changedImg5);

		JLabel lbl_image_NAME = new JLabel(Icon5);
		lbl_image_NAME.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_image_NAME.setBounds(129, 160, 30, 30);
		panel_2.add(lbl_image_NAME);

		String path6 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\join_phone.png";
		ImageIcon phone = new ImageIcon(path6);
		Image originImg6 = phone.getImage();
		Image changedImg6 = originImg6.getScaledInstance(30, 30, Image.SCALE_SMOOTH); // 사이즈조절
		ImageIcon Icon6 = new ImageIcon(changedImg6);

		JLabel lbl_image_PHONE = new JLabel(Icon6);
		lbl_image_PHONE.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_image_PHONE.setBounds(129, 210, 30, 30);
		panel_2.add(lbl_image_PHONE);

		String path7 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\join_age.png";
		ImageIcon age = new ImageIcon(path7);
		Image originImg7 = age.getImage();
		Image changedImg7 = originImg7.getScaledInstance(30, 30, Image.SCALE_SMOOTH); // 사이즈조절
		ImageIcon Icon7 = new ImageIcon(changedImg7);

		JLabel lbl_image_AGE = new JLabel(Icon7);
		lbl_image_AGE.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_image_AGE.setBounds(129, 260, 30, 30);
		panel_2.add(lbl_image_AGE);

		String path8 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\join_home.png";
		ImageIcon home = new ImageIcon(path8);
		Image originImg8 = home.getImage();
		Image changedImg8 = originImg8.getScaledInstance(30, 30, Image.SCALE_SMOOTH); // 사이즈조절
		ImageIcon Icon8 = new ImageIcon(changedImg8);

		JLabel lbl_image_HOME = new JLabel(Icon8);
		lbl_image_HOME.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_image_HOME.setBounds(129, 310, 30, 30);
		panel_2.add(lbl_image_HOME);

		String path9 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\join_sex.png";
		ImageIcon sex = new ImageIcon(path9);
		Image originImg9 = sex.getImage();
		Image changedImg9 = originImg9.getScaledInstance(30, 30, Image.SCALE_SMOOTH); // 사이즈조절
		ImageIcon Icon9 = new ImageIcon(changedImg9);

		JLabel lbl_image_SEX = new JLabel(Icon9);
		lbl_image_SEX.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_image_SEX.setBounds(129, 360, 30, 30);
		panel_2.add(lbl_image_SEX);

		btn_Cancle = new JButton("\uCDE8\uC18C");
		btn_Cancle.setFont(new Font("빙그레체", Font.PLAIN, 15));
		btn_Cancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btn_Cancle.setBounds(230, 10, 115, 30);
		panel_3.add(btn_Cancle);
	}
}
