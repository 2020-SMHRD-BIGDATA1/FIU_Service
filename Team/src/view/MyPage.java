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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyPage {

	private JFrame frame;
	private Controller controller = LoginGUI.controller;
	private JLabel lbl_username;
	private JLabel lblNewLabel_1_1;
	private JLabel lbl_home;

	public MyPage() {
		initialize();
		MemberVO loginUser = controller.getLoginUser();
		MemberVO id = new MemberVO(loginUser.getId());
		lbl_username.setText(controller.select(id).getName());
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
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, "name_667309913231400");
		panel.setLayout(null);

		String path3 = "C:\\Users\\SMHRD\\Desktop\\JavaStudy\\0615GUI\\src\\icon\\Ȩ��ư.png";
		ImageIcon home = new ImageIcon(path3);
		Image originImg5 = home.getImage();
		// ����� Image�� ũ�⸦ �����Ͽ� ���ο� Image��ü ����
		Image changedImg4 = originImg5.getScaledInstance(75, 73, Image.SCALE_SMOOTH);
		// ���ο� Image�� ImageIcon��ü�� ����
		ImageIcon Icon4 = new ImageIcon(changedImg4);

		lbl_home = new JLabel(Icon4);
		lbl_home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainGUI main = new MainGUI();

			}
		});
		lbl_home.setBounds(12, 10, 75, 73);
		panel.add(lbl_home);

		JLabel lblNewLabel = new JLabel("My Fest");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 0, 410, 113);
		panel.add(lblNewLabel);

		JButton btn2 = new JButton("\uD6C4\uAE30 \uAD00\uB9AC                              \u3009");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyReview join = new MyReview();
				frame.dispose();
			}
		});
		btn2.setFont(new Font("���ʷҵ���", Font.PLAIN, 25));
		btn2.setHorizontalAlignment(SwingConstants.LEFT);
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(12, 335, 410, 73);
		panel.add(btn2);

		JButton btn1 = new JButton("\uD68C\uC6D0 \uC815\uBCF4                              \u3009");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MyPageEdit join = new MyPageEdit();
			}

		});
		btn1.setHorizontalAlignment(SwingConstants.LEFT);
		btn1.setFont(new Font("���ʷҵ���", Font.PLAIN, 25));
		btn1.setBackground(Color.WHITE);
		btn1.setBounds(12, 255, 410, 73);
		panel.add(btn1);

		JButton btn3 = new JButton("\uCC1C \uBAA9\uB85D                                 \u3009");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyWishlist join = new MyWishlist();

			}
		});
		btn3.setHorizontalAlignment(SwingConstants.LEFT);
		btn3.setFont(new Font("���ʷҵ���", Font.PLAIN, 25));
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(12, 414, 410, 73);
		panel.add(btn3);

		JButton btn4 = new JButton("\uB85C\uADF8\uC544\uC6C3                               \u3009");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Logout join = new Logout();

				int result = JOptionPane.showConfirmDialog(null, "�α׾ƿ� �Ͻðڽ��ϱ�?", "Ȯ��", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					frame.setVisible(false);
					LoginGUI.main(null);
				} else if (result == JOptionPane.NO_OPTION) {

				}

				// JOptionPane.YES_NO_OPTION("yes","no");
				// JOptionPane.showMessageDialog(frame,
				// "ȸ������ ����",
				// "ȸ������ ���",
				// JOptionPane.PLAIN_MESSAGE);

			}
		});
		btn4.setHorizontalAlignment(SwingConstants.LEFT);
		btn4.setFont(new Font("���ʷҵ���", Font.PLAIN, 25));
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(12, 494, 410, 73);
		panel.add(btn4);

		JButton btn5 = new JButton("\uD0C8\uD1F4\uD558\uAE30                               \u3009");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Ż�� �Ͻðڽ��ϱ�?", "Ȯ��", JOptionPane.YES_NO_CANCEL_OPTION);
				if (result == JOptionPane.YES_OPTION) {

				} else if (result == JOptionPane.NO_OPTION) {

				} else if (result == JOptionPane.CANCEL_OPTION) {

				}

			}
		});
		btn5.setHorizontalAlignment(SwingConstants.LEFT);
		btn5.setFont(new Font("���ʷҵ���", Font.PLAIN, 25));
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(12, 573, 410, 73);
		panel.add(btn5);

		btn1.setBorderPainted(false);
		btn2.setBorderPainted(false);
		btn3.setBorderPainted(false);
		btn4.setBorderPainted(false);
		btn5.setBorderPainted(false);

		String path = "C:\\Users\\SMHRD\\Desktop\\JavaStudy\\0615GUI\\src\\icon\\Ǫ��.jpeg";
		ImageIcon originIcon = new ImageIcon(path);
		Image originImg = originIcon.getImage();
		// ����� Image�� ũ�⸦ �����Ͽ� ���ο� Image��ü ����
		Image changedImg = originImg.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		// ���ο� Image�� ImageIcon��ü�� ����
		ImageIcon Icon = new ImageIcon(changedImg);

		JLabel lbl_profile = new JLabel(Icon);
		lbl_profile.setBounds(22, 138, 100, 100);
		panel.add(lbl_profile);

		lblNewLabel_1_1 = new JLabel("\uB2D8 \uD658\uC601\uD569\uB2C8\uB2E4");
		lblNewLabel_1_1.setFont(new Font("���ʷҵ���", Font.BOLD, 20));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setBounds(274, 173, 148, 70);
		panel.add(lblNewLabel_1_1);

		lbl_username = new JLabel("");
		lbl_username.setFont(new Font("���ʷҵ���", Font.PLAIN, 20));
		lbl_username.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_username.setBounds(156, 173, 117, 70);
		panel.add(lbl_username);

		String path2 = "C:\\Users\\SMHRD\\Desktop\\JavaStudy\\0615GUI\\src\\icon\\�Ҳ�.png";
		ImageIcon bg = new ImageIcon(path2);
		Image originImg2 = bg.getImage();
		// ����� Image�� ũ�⸦ �����Ͽ� ���ο� Image��ü ����
		Image changedImg2 = originImg2.getScaledInstance(434, 660, Image.SCALE_SMOOTH);
		// ���ο� Image�� ImageIcon��ü�� ����
		ImageIcon Icon2 = new ImageIcon(changedImg2);

		JLabel lbl_bg = new JLabel(Icon2);
		lbl_bg.setBounds(0, 0, 434, 661);
		panel.add(lbl_bg);

	}
}