package view;

import java.awt.EventQueue;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import controller.Controller;
import model.MemberVO;
import model.NewReviewDAO;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyReview {

	private JFrame frame;
	private FontMake fm = new FontMake();
	private JTextField txt_age;
	NewReviewDAO dao = new NewReviewDAO();
	int result;
	private Controller controller = LoginGUI.controller;

	public MyReview() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fm.FontChange(ge);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, "name_676000560127500");
		panel.setLayout(null);

		String path3 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\main_logo.png";
		ImageIcon home = new ImageIcon(path3);
		Image originImg5 = home.getImage();
		Image changedImg4 = originImg5.getScaledInstance(60, 60, Image.SCALE_SMOOTH); // 사이즈조절
		ImageIcon Icon4 = new ImageIcon(changedImg4);

		JLabel lbl_logo = new JLabel(Icon4);
		lbl_logo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainGUI mainGUI = new MainGUI();
			}
		});
		lbl_logo.setBounds(12, 10, 60, 60);
		panel.add(lbl_logo);

		String path2 = "C:\\Users\\SMHRD\\Desktop\\JavaStudy\\0615GUI\\src\\icon\\불꽃축제.jpg";
		ImageIcon a = new ImageIcon(path2);
		Image b = a.getImage();
		// 추출된 Image의 크기를 조절하여 새로운 Image객체 생성
		Image img = b.getScaledInstance(142, 142, Image.SCALE_SMOOTH);
		// 새로운 Image로 ImageIcon객체를 생성
		ImageIcon Icon2 = new ImageIcon(img);

		String path = "C:\\Users\\SMHRD\\Desktop\\JavaStudy\\0615GUI\\src\\icon\\검색.png";
		ImageIcon search = new ImageIcon(path);
		Image originImg2 = search.getImage();
		// 추출된 Image의 크기를 조절하여 새로운 Image객체 생성
		Image changedImg2 = originImg2.getScaledInstance(42, 41, Image.SCALE_SMOOTH);
		// 새로운 Image로 ImageIcon객체를 생성
		ImageIcon Icon = new ImageIcon(changedImg2);

		JLabel lblNewLabel = new JLabel("\uD6C4\uAE30 \uC791\uC131");
		lblNewLabel.setFont(new Font("빙그레체", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(63, 22, 292, 68);
		panel.add(lblNewLabel);

		String[] y = { "축제 선택", "장승마을 빛 축제", "전북관광브랜드공연 뮤지컬 '홍도1589'", "휴애리 수국축제" };

		JComboBox comboBox = new JComboBox(y);

		comboBox.setBounds(111, 124, 239, 29);
		panel.add(comboBox);

		ButtonGroup group = new ButtonGroup();

		JRadioButton btn_1 = new JRadioButton("1");
		btn_1.setBackground(new Color(255, 255, 255));
		btn_1.setBounds(111, 205, 47, 23);
		panel.add(btn_1);

		JRadioButton btn2 = new JRadioButton("2");
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(162, 205, 47, 23);
		panel.add(btn2);

		JRadioButton btn3 = new JRadioButton("3");
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(215, 205, 47, 23);
		panel.add(btn3);

		JRadioButton btn4 = new JRadioButton("4");
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(267, 205, 47, 23);
		panel.add(btn4);

		JRadioButton btn5 = new JRadioButton("5");
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(318, 205, 47, 23);
		panel.add(btn5);

		group.add(btn_1);
		group.add(btn2);
		group.add(btn3);
		group.add(btn4);
		group.add(btn5);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(74, 274, 276, 226);
		panel.add(scrollPane);

		JTextArea txt_review = new JTextArea();
		scrollPane.setViewportView(txt_review);

		JButton btnNewButton = new JButton("\uB4F1\uB85D");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (comboBox.getSelectedItem().toString().equals("장승마을 빛 축제")) {
					result = 20112006;
					result++;
				} else if (comboBox.getSelectedItem().toString().equals("전북관광브랜드공연 뮤지컬 '홍도1589'")) {
					result = 20115006;
					result++;
				} else if (comboBox.getSelectedItem(). toString().equals("휴애리 수국축제")) {
					result = 20117006;
					result++;
				}
				String num = String.valueOf(result);
				
				String name = comboBox.getSelectedItem().toString();
				
				String review = txt_review.getText();
				
				String age = txt_age.getText();
				
				Enumeration<AbstractButton> enums = group.getElements();
				String score = null;
				while (enums.hasMoreElements()) {
					AbstractButton ab = enums.nextElement();
					JRadioButton jb = (JRadioButton) ab;
					if (jb.isSelected())
						score = jb.getText().trim();
				}
				
				SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
				Date time = new Date();
				String date = format1.format(time);

				MemberVO loginUser = controller.getLoginUser();
				MemberVO id = new MemberVO(loginUser.getId());
				String userid = id.getId();
				
				int row = dao.input(num, name, review, age, score, date, userid);

				if (row != 0) {
					System.out.println("저장 성공");
				} else {
					System.out.println("저장 실패");
				}

				JOptionPane.showMessageDialog(frame, "후기가 등록되었습니다.", "후기 등록", JOptionPane.PLAIN_MESSAGE);
				frame.dispose();
				MainGUI maingui = new MainGUI();
			}
		});

		btnNewButton.setFont(new Font("빙그레체", Font.PLAIN, 12));
		btnNewButton.setBounds(63, 565, 95, 48);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uCDE8\uC18C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(null, "취소하시겠습니까?", "확인", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					frame.dispose();
					MyPage mypage = new MyPage();
				} else if (result == JOptionPane.NO_OPTION) {
				}
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnNewButton_1.setBounds(272, 565, 95, 48);
		panel.add(btnNewButton_1);

		JLabel lbl_festname = new JLabel("\uCD95\uC81C\uBA85");
		lbl_festname.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_festname.setBounds(12, 124, 87, 29);
		panel.add(lbl_festname);

		JLabel lblNewLabel_1 = new JLabel("\uD3C9\uC810");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(12, 202, 87, 29);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("\uB098\uC774");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(12, 163, 87, 29);
		panel.add(lblNewLabel_2);

		txt_age = new JTextField();
		txt_age.setBounds(111, 163, 87, 29);
		panel.add(txt_age);
		txt_age.setColumns(10);

		JLabel lbl_review = new JLabel("\uD6C4\uAE30");
		lbl_review.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_review.setBounds(12, 241, 87, 23);
		panel.add(lbl_review);

		String path1 = "C:\\Users\\SMHRD\\Desktop\\JavaStudy\\0615GUI\\src\\icon\\뒤로가기.png";
		ImageIcon search1 = new ImageIcon(path1);
		Image originImg1 = search1.getImage();
		// 추출된 Image의 크기를 조절하여 새로운 Image객체 생성
		Image changedImg1 = originImg1.getScaledInstance(65, 62, Image.SCALE_SMOOTH);
		// 새로운 Image로 ImageIcon객체를 생성
		ImageIcon Icon1 = new ImageIcon(changedImg1);

		JLabel lbl_back = new JLabel(Icon1);
		lbl_back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});

	}
}
