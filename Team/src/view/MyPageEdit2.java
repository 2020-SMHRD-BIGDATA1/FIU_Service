package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controller.Controller;
import model.MemberVO;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Enumeration;

public class MyPageEdit2 {

	private JFrame frame;
	private JTextField txt_name;
	private JTextField txt_age;
	private JTextField txt_phone;
	private JPasswordField txt_pw;

	private Controller controller = LoginGUI.controller;
	private JComboBox comboBox_area;
	private JRadioButton RB_male;
	private JRadioButton RB_female;
	private JTextField txt_id;

	public MyPageEdit2() {

		initialize();
		MemberVO loginUser = controller.getLoginUser();
		//txt_pw.setText(loginUser.getPw());

		MemberVO id = new MemberVO(loginUser.getId());
		txt_pw.setText(controller.select(id).getPw());
		txt_id.setText(controller.select(id).getId());
		txt_id.setEnabled(false);
		txt_age.setText(controller.select(id).getAge());
		txt_name.setText(controller.select(id).getName());
		txt_phone.setText(controller.select(id).getPhone());
		comboBox_area.setSelectedItem(controller.select(id).getlocation());

		if (controller.select(id).getSex().equals("남")) {
			RB_male.doClick();
		}
		if (controller.select(id).getSex().equals("여")) {
			RB_female.doClick();
		}

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
		frame.getContentPane().add(panel, "name_672105468043500");
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("\uCDE8\uC18C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		String path3 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\main_logo.png";
		ImageIcon home = new ImageIcon(path3);
		Image originImg5 = home.getImage();
		Image changedImg4 = originImg5.getScaledInstance(75, 75, Image.SCALE_SMOOTH);   // 사이즈조절
		ImageIcon Icon4 = new ImageIcon(changedImg4);
		
		JLabel lbl_logo = new JLabel(Icon4);
		lbl_logo.setBounds(12, 21, 75, 75);
		panel.add(lbl_logo);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(243, 541, 97, 44);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("\uC218\uC815");
		btnNewButton.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				

				String id = txt_id.getText();
				String pw = String.valueOf(txt_pw.getPassword());
				String name = txt_name.getText();
				String phone = txt_phone.getText();
				String location = comboBox_area.getSelectedItem().toString();
				
				ButtonGroup group = new ButtonGroup();
				group.add(RB_male);
				group.add(RB_female);
				Enumeration<AbstractButton> enums = group.getElements();
				String sex = null;
				while (enums.hasMoreElements()) {
					AbstractButton ab = enums.nextElement();
					JRadioButton jb = (JRadioButton) ab;
					if (jb.isSelected())
						sex = jb.getText().trim();
				}

				String age = txt_age.getText();
				MemberVO joinUser = new MemberVO(id, pw, name, phone, location, sex, age);
				
				int cnt = controller.update(joinUser);
				if (cnt > 0) {
					JOptionPane.showMessageDialog(frame, "수정 성공", "수정 결과", JOptionPane.PLAIN_MESSAGE);
					frame.dispose();
				}
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(88, 541, 97, 44);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0 \uC815\uBCF4 \uC218\uC815");
		lblNewLabel.setFont(new Font("휴먼편지체", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 20, 410, 96);
		panel.add(lblNewLabel);
		
		//Font font = new Font("", Font.BOLD, 40);//font설정1(digital-7대신 다른 폰트를 입력하셔도 됩니다.)
		//lblNewLabel.setFont(font);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uB984");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(25, 296, 49, 36);
		panel.add(lblNewLabel_1);
		
		txt_name = new JTextField();
		txt_name.setBounds(82, 296, 116, 36);
		panel.add(txt_name);
		txt_name.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uB098\uC774");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(232, 296, 49, 36);
		panel.add(lblNewLabel_1_1);
		
		txt_age = new JTextField();
		txt_age.setColumns(10);
		txt_age.setBounds(289, 296, 116, 36);
		panel.add(txt_age);
		
		JLabel lblNewLabel_1_2 = new JLabel("\uD734\uB300\uD3F0");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(232, 351, 49, 36);
		panel.add(lblNewLabel_1_2);
		
		txt_phone = new JTextField();
		txt_phone.setColumns(10);
		txt_phone.setBounds(289, 351, 116, 36);
		panel.add(txt_phone);
		
		JLabel lblNewLabel_1_3 = new JLabel("\uC131\uBCC4");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(232, 403, 49, 36);
		panel.add(lblNewLabel_1_3);
		
		ButtonGroup group;
		group = new ButtonGroup();
		
		RB_male = new JRadioButton("\uB0A8");
		RB_male.setBackground(Color.WHITE);
		RB_male.setBounds(289, 410, 49, 23);
		panel.add(RB_male);
		
		RB_female = new JRadioButton("\uC5EC");
		RB_female.setBackground(Color.WHITE);
		RB_female.setBounds(355, 410, 49, 23);
		panel.add(RB_female);
		
		group.add(RB_male);
		group.add(RB_female);
		
		
		JLabel lblNewLabel_1_4 = new JLabel("PW");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setBounds(25, 351, 49, 36);
		panel.add(lblNewLabel_1_4);
		
		txt_pw = new JPasswordField();
		txt_pw.setColumns(10);
		txt_pw.setBounds(82, 351, 116, 36);
		panel.add(txt_pw);
		
		JLabel lblNewLabel_1_5 = new JLabel("\uAC70\uC8FC\uC9C0");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setBounds(25, 403, 49, 36);
		panel.add(lblNewLabel_1_5);
		
		String[] items = { "서울특별시", "대전광역시", "부산광역시", "대구광역시", "인천광역시", "울산광역시", "광주광역시", "세종시", "경기도", "강원도", "충청북도", "충청남도", "전라북도", "전라남도", "경상북도", "경상남도", "제주도"};
	
		comboBox_area = new JComboBox(items);
		comboBox_area.setBackground(Color.WHITE);
		comboBox_area.setBounds(82, 406, 116, 30);
		panel.add(comboBox_area);
		
		String path2 = "C:\\Users\\SMHRD\\Desktop\\JavaStudy\\0615GUI\\src\\icon\\불꽃.png";
		ImageIcon bg = new ImageIcon(path2);
		Image originImg2 = bg.getImage(); 
		//추출된 Image의 크기를 조절하여 새로운 Image객체 생성
		Image changedImg2= originImg2.getScaledInstance(434, 660, Image.SCALE_SMOOTH );
		//새로운 Image로 ImageIcon객체를 생성
		ImageIcon Icon3 = new ImageIcon(changedImg2);
		
		txt_id = new JTextField();
		txt_id.setText((String) null);
		txt_id.setColumns(10);
		txt_id.setBounds(82, 244, 116, 36);
		panel.add(txt_id);
		
		JLabel lblNewLabel_1_6 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setBounds(25, 244, 49, 36);
		panel.add(lblNewLabel_1_6);
		
		JLabel lbl_bg3 = new JLabel(Icon3);
		lbl_bg3.setBackground(new Color(240, 248, 255));
		lbl_bg3.setBounds(0, 0, 434, 661);
		panel.add(lbl_bg3);
		

	}
}
