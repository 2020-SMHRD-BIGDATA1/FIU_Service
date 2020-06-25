package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.awt.Font;
import javax.swing.SwingConstants;

import controller.Controller;
import model.ReviewVO;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;


public class ReviewGUI2 {

	private JFrame frame;
	private Controller controller = LoginGUI.controller;
	public ReviewGUI2() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_title = new JLabel("\uCD94\uCC9C \uD6C4\uAE30 \uBAA9\uB85D");
		lbl_title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_title.setFont(new Font("빙그레체", Font.PLAIN, 30));
		lbl_title.setBounds(81, 0, 271, 69);
		frame.getContentPane().add(lbl_title);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 69, 434, 516);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(4, 3, 0, 0));
		
		ArrayList<ReviewVO> review = controller.getReview();
		
		JLabel lblNewLabel = new JLabel("<html>"+"5."+"<br>"+review.get(41).getRev_no()+"<br>" +"울산고래축제"+"<html>");
		lblNewLabel.setFont(new Font("빙그레체", Font.PLAIN, 13));
		panel.add(lblNewLabel);
		
		String path5 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\울산 고래축제2020.jpg";
		ImageIcon home5 = new ImageIcon(path5);
		Image originImg5 = home5.getImage();
		Image changedImg5 = originImg5.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		ImageIcon Icon5 = new ImageIcon(changedImg5);
		
		JLabel lblNewLabel_8 = new JLabel(Icon5);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_4 = new JLabel("<html>"+review.get(41).getRev_date()+"<br>평점 : " +review.get(41).getRev_score()+"점 \t 연령: " + review.get(41).getAge()+"대 <br>" + review.get(41).getRev_con()+"<html>");
		lblNewLabel_4.setFont(new Font("빙그레체", Font.PLAIN, 12));
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("<html>"+"6."+"<br>"+review.get(23).getRev_no()+"<br>" +"대전국제와인페스티벌"+"<html>");
		lblNewLabel_2.setFont(new Font("빙그레체", Font.PLAIN, 13));
		panel.add(lblNewLabel_2);
		
		String path6 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\대전국제와인페스티벌2020.jpg";
		ImageIcon home6 = new ImageIcon(path6);
		Image originImg6 = home6.getImage();
		Image changedImg6 = originImg6.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		ImageIcon Icon6 = new ImageIcon(changedImg6);
		
		JLabel lblNewLabel_5 = new JLabel(Icon6);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3 = new JLabel("<html>"+review.get(23).getRev_date()+"<br>평점 : " +review.get(23).getRev_score()+"점 \t 연령: " + review.get(23).getAge()+"대 <br>" + review.get(23).getRev_con()+"<html>");
		lblNewLabel_3.setFont(new Font("빙그레체", Font.PLAIN, 12));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_9 = new JLabel("<html>"+"7."+"<br>"+review.get(28).getRev_no()+"<br>" +"이월드 아쿠아판타지"+"<html>");
		lblNewLabel_9.setFont(new Font("빙그레체", Font.PLAIN, 13));
		panel.add(lblNewLabel_9);
		
		String path7 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\이월드 아쿠아판타지2020.jpg";
		ImageIcon home7 = new ImageIcon(path7);
		Image originImg7 = home7.getImage();
		Image changedImg7 = originImg7.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		ImageIcon Icon7 = new ImageIcon(changedImg7);
		
		JLabel lblNewLabel_6 = new JLabel(Icon7);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_1 = new JLabel("<html>"+review.get(28).getRev_date()+"<br>평점 : " +review.get(28).getRev_score()+"점 \t 연령: " + review.get(28).getAge()+"대 <br>" + review.get(28).getRev_con()+"<html>");
		lblNewLabel_1.setFont(new Font("빙그레체", Font.PLAIN, 12));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_7 = new JLabel("<html>"+"8."+"<br>"+review.get(34).getRev_no()+"<br>" +"광주문화재야행 동구 달빛걸음"+"<html>");
		lblNewLabel_7.setFont(new Font("빙그레체", Font.PLAIN, 13));
		panel.add(lblNewLabel_7);
		
		String path8 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\시흥갯골축제2020.jpg";
		ImageIcon home8 = new ImageIcon(path8);
		Image originImg8 = home8.getImage();
		Image changedImg8 = originImg8.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		ImageIcon Icon8 = new ImageIcon(changedImg8);
		
		JLabel lblNewLabel_10 = new JLabel(Icon8);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("<html>"+review.get(34).getRev_date()+"<br>평점 : " +review.get(34).getRev_score()+"점 \t 연령: " + review.get(34).getAge()+"대 <br>" + review.get(34).getRev_con()+"<html>");
		lblNewLabel_11.setFont(new Font("빙그레체", Font.PLAIN, 12));
		panel.add(lblNewLabel_11);
		
		String path = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\main_logo.png";
		ImageIcon home = new ImageIcon(path);
		Image originImg = home.getImage();
		Image changedImg = originImg.getScaledInstance(60, 60, Image.SCALE_SMOOTH);   // 사이즈조절
		ImageIcon Icon = new ImageIcon(changedImg);
		
		JLabel lbl_logo = new JLabel(Icon);
		lbl_logo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainGUI mainGUI = new MainGUI();
				frame.dispose();
			}
		});
		lbl_logo.setBounds(0, 0, 60, 60);
		frame.getContentPane().add(lbl_logo);
		
		JButton btnNewButton = new JButton("\uB2E4\uC74C \uB9AC\uBDF0");
		btnNewButton.setFont(new Font("빙그레체", Font.PLAIN, 12));
		btnNewButton.setBounds(307, 595, 90, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC774\uC804 \uB9AC\uBDF0");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReviewGUI reviewGUI = new ReviewGUI();
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("빙그레체", Font.PLAIN, 12));
		btnNewButton_1.setBounds(36, 595, 90, 49);
		frame.getContentPane().add(btnNewButton_1);
	}

}
