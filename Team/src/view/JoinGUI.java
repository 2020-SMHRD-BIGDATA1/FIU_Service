package view;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
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
		frame.getContentPane().add(panel, "name_242157257160200");
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 412, 80);
		panel.add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);

		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785 \uD398\uC774\uC9C0");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel, 20, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel, 100, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel, 60, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel, -100, SpringLayout.EAST, panel_1);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 128, 412, 392);
		panel.add(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 570, 412, 55);
		panel_2.setLayout(null);

		JLabel lb_ID = new JLabel("ID");
		lb_ID.setBounds(50, 10, 70, 20);
		lb_ID.setFont(new Font("굴림", Font.PLAIN, 15));
		lb_ID.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lb_ID);

		txt_ID = new JTextField();
		txt_ID.setBounds(160, 10, 110, 20);
		panel_2.add(txt_ID);
		txt_ID.setColumns(10);

		JButton btn_idCheck = new JButton("\uC911\uBCF5\uD655\uC778");
		btn_idCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txt_ID.getText().equals("")) {
					JOptionPane.showMessageDialog(frame, "ID가 중복되었습니다.", "ID 중복확인", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		btn_idCheck.setBounds(295, 10, 90, 25);
		panel_2.add(btn_idCheck);

		JLabel lb_PW = new JLabel("PW");
		lb_PW.setBounds(50, 60, 70, 20);
		lb_PW.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_PW.setFont(new Font("굴림", Font.PLAIN, 15));
		panel_2.add(lb_PW);

		txt_PW = new JPasswordField();
		txt_PW.setBounds(160, 60, 110, 20);
		panel_2.add(txt_PW);

		JLabel lb_pwCheck = new JLabel("PW\uD655\uC778");
		lb_pwCheck.setBounds(50, 110, 70, 20);
		lb_pwCheck.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_pwCheck.setFont(new Font("굴림", Font.PLAIN, 15));
		panel_2.add(lb_pwCheck);

		txt_pwCheck = new JPasswordField();
		txt_pwCheck.setBounds(160, 110, 110, 20);
		panel_2.add(txt_pwCheck);

		JLabel lb_Name = new JLabel("\uC774\uB984");
		lb_Name.setBounds(50, 160, 70, 20);
		lb_Name.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_Name.setFont(new Font("굴림", Font.PLAIN, 15));
		panel_2.add(lb_Name);

		txt_Name = new JTextField();
		txt_Name.setBounds(160, 160, 110, 21);
		txt_Name.setColumns(10);
		panel_2.add(txt_Name);

		JLabel lb_Phone = new JLabel("\uC804\uD654\uBC88\uD638");
		lb_Phone.setBounds(50, 210, 70, 20);
		lb_Phone.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_Phone.setFont(new Font("굴림", Font.PLAIN, 15));
		panel_2.add(lb_Phone);

		txt_Phone = new JTextField();
		txt_Phone.setBounds(160, 210, 110, 20);
		txt_Phone.setColumns(10);
		panel_2.add(txt_Phone);

		JLabel lb_Age = new JLabel("\uB098\uC774");
		lb_Age.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_Age.setFont(new Font("굴림", Font.PLAIN, 15));
		lb_Age.setBounds(50, 260, 70, 20);
		panel_2.add(lb_Age);

		JLabel lb_location = new JLabel("\uC9C0\uC5ED");
		lb_location.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_location.setFont(new Font("굴림", Font.PLAIN, 15));
		lb_location.setBounds(50, 310, 70, 20);
		panel_2.add(lb_location);

		JLabel lb_Sex = new JLabel("\uC131\uBCC4");
		lb_Sex.setHorizontalAlignment(SwingConstants.RIGHT);
		lb_Sex.setFont(new Font("굴림", Font.PLAIN, 15));
		lb_Sex.setBounds(50, 360, 70, 20);
		panel_2.add(lb_Sex);

		txt_Age = new JTextField();
		txt_Age.setColumns(10);
		txt_Age.setBounds(160, 260, 110, 20);
		panel_2.add(txt_Age);

		String[] x = { "서울특별시", "대전광역시", "부산광역시", "대구광역시", "인천광역시", "울산광역시", "광주광역시", "세종시", "경기도", "강원도", "충청북도",
				"충청남도", "전라북도", "전라남도", "경상북도", "경상남도", "제주도" };
		JComboBox box_location = new JComboBox(x);
		box_location.setBounds(160, 310, 110, 21);
		panel_2.add(box_location);

		ButtonGroup group = new ButtonGroup();

		JRadioButton RB_male = new JRadioButton("\uB0A8");
		RB_male.setBounds(160, 360, 50, 20);
		panel_2.add(RB_male);

		JRadioButton RB_female = new JRadioButton("\uC5EC");
		RB_female.setBounds(214, 359, 121, 23);
		panel_2.add(RB_female);
		panel.add(panel_3);
		panel_3.setLayout(null);

		group.add(RB_male);
		group.add(RB_female);

		btn_Join = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_Join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txt_ID.getText();
				String pw = String.valueOf(txt_PW.getPassword());
				String name = txt_Name.getText();
				String phone = txt_Phone.getText();
				String location = box_location.getSelectedItem().toString();
				String sex = group.getSelection().toString();
				String age = txt_Age.getText();

				MemberVO joinUser = new MemberVO(id, pw, name, phone, location, sex, age);

				int cnt = controller.join(joinUser);
				if (cnt != 0) {
					if (id == null) {
						JOptionPane.showMessageDialog(frame, "아이디를 입력해주세요", "회원가입 결과", JOptionPane.PLAIN_MESSAGE);
					} else if (pw == null) {
						JOptionPane.showMessageDialog(frame, "비밀번호를 입력해주세요", "회원가입 결과", JOptionPane.PLAIN_MESSAGE);
						if (pw.equals(String.valueOf(txt_pwCheck.getPassword()))) {
							JOptionPane.showMessageDialog(frame, "회원가입 성공", "회원가입 결과", JOptionPane.PLAIN_MESSAGE);
							frame.dispose();
						} else {
							JOptionPane.showMessageDialog(frame, "비밀번호가 일치하지 않습니다", "회원가입 결과",
									JOptionPane.PLAIN_MESSAGE);
						}
					}
				} else {
					JOptionPane.showMessageDialog(frame, "회원가입 실패", "회원가입 결과", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		btn_Join.setBounds(70, 10, 115, 30);
		panel_3.add(btn_Join);

		btn_Cancle = new JButton("\uCDE8\uC18C");
		btn_Cancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btn_Cancle.setBounds(230, 10, 115, 30);
		panel_3.add(btn_Cancle);
	}
}
