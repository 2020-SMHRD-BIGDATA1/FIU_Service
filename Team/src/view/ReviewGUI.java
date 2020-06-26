package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import controller.Controller;
import model.ReviewVO;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;

public class ReviewGUI {

	private JFrame frame;
	private JLabel lbl_revno2;
	private JLabel lbl_revno3;
	private JLabel lbl_revno4;
	private JLabel lbl_revno1;
	private JLabel lbl_img1;
	private JLabel lbl_img2;
	private JLabel lbl_img3;
	private JLabel lbl_img4;
	private JLabel lbl_review1;
	private JLabel lbl_review2;
	private JLabel lbl_review3;
	private JLabel lbl_review4;
	
	private Controller controller = LoginGUI.controller;
	private JLabel lbl_logo;

	/**
	 * Launch the application.
	 */

	public ReviewGUI() {
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
		
		JLabel lblNewLabel = new JLabel("\uB9CC\uC810 \uD6C4\uAE30 \uBAA9\uB85D");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("빙그레체", Font.PLAIN, 30));
		lblNewLabel.setBounds(71, 0, 289, 70);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		String path = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\main_logo.png";
		ImageIcon home = new ImageIcon(path);
		Image originImg = home.getImage();
		Image changedImg = originImg.getScaledInstance(75, 75, Image.SCALE_SMOOTH);   // 사이즈조절
		ImageIcon Icon = new ImageIcon(changedImg);
		
		lbl_logo = new JLabel(Icon);
		lbl_logo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				MainGUI mainGUI = new MainGUI();
			}
		});
		lbl_logo.setBounds(0, 0, 70, 70);
		frame.getContentPane().add(lbl_logo);
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 70, 434, 522);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(4, 3, 0, 0));
		
		ArrayList<ReviewVO> review = controller.getReview();
		
		
		lbl_revno1 = new JLabel("<html>"+"1."+"<br>"+review.get(2).getRev_no()+"<br>" +"한성백제문화제"+"<html>");
		lbl_revno1.setBackground(new Color(255, 255, 255));
		lbl_revno1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_revno1.setFont(new Font("빙그레체", Font.PLAIN, 13));
		panel.add(lbl_revno1);
		
		String path1 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\한성백제문화제2020.jpg";
		ImageIcon home1 = new ImageIcon(path1);
		Image originImg1 = home1.getImage();
		Image changedImg1 = originImg1.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		ImageIcon Icon1 = new ImageIcon(changedImg1);
		
		lbl_img1 = new JLabel("<html>"+review.get(1).getRev_date()+"<br>평점 : " +review.get(1).getRev_score()+"점 \t 연령: " + review.get(1).getAge()+"대 <br>" + review.get(1).getRev_con()+"<html>");
		lbl_img1.setBackground(new Color(255, 255, 255));
		lbl_img1.setFont(new Font("빙그레체", Font.PLAIN, 12));
		panel.add(lbl_img1);
		
		lbl_review1 = new JLabel(Icon1);
		
		panel.add(lbl_review1);
		
		lbl_revno2 = new JLabel("<html>"+"2."+"<br>"+review.get(9).getRev_no()+"<br>"+"시흥갯골축제"+"<html>");
		lbl_revno2.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_revno2.setFont(new Font("빙그레체", Font.PLAIN, 13));
		panel.add(lbl_revno2);
		
		String path2 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\시흥갯골축제2020.jpg";
		ImageIcon home2 = new ImageIcon(path2);
		Image originImg2 = home2.getImage();
		Image changedImg2 = originImg2.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		ImageIcon Icon2 = new ImageIcon(changedImg2);
		
		lbl_img2 = new JLabel("<html>"+review.get(9).getRev_date()+"<br>평점 : " +review.get(9).getRev_score()+"점 \t 연령: " + review.get(9).getAge()+"대 <br>" + review.get(9).getRev_con()+"<html>");
		lbl_img2.setFont(new Font("빙그레체", Font.PLAIN, 12));
		panel.add(lbl_img2);
		
		lbl_review2 = new JLabel(Icon2);
		panel.add(lbl_review2);
		
		lbl_revno3 = new JLabel("<html>"+"3."+"<br>"+review.get(12).getRev_no()+"<br>"+"인천소래포구축제"+"<html>");
		lbl_revno3.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_revno3.setFont(new Font("빙그레체", Font.PLAIN, 13));
		panel.add(lbl_revno3);
		
		String path3 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\인천소래포구축제2020.jpg";
		ImageIcon home3 = new ImageIcon(path3);
		Image originImg3 = home3.getImage();
		Image changedImg3 = originImg3.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		ImageIcon Icon3 = new ImageIcon(changedImg3);
		
		lbl_img3 = new JLabel("<html>"+review.get(12).getRev_date()+"<br>평점 : " +review.get(12).getRev_score()+"점 \t 연령: " + review.get(12).getAge()+"대 <br>" + review.get(12).getRev_con()+"<html>");
		lbl_img3.setFont(new Font("빙그레체", Font.PLAIN, 12));
		panel.add(lbl_img3);
		
		lbl_review3 = new JLabel(Icon3);
		panel.add(lbl_review3);
		
		lbl_revno4 = new JLabel("<html>"+"4."+"<br>"+review.get(16).getRev_no()+"<br>"+"베어트리파크 철쭉제"+"<html>");
		lbl_revno4.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_revno4.setFont(new Font("빙그레체", Font.PLAIN, 13));
		panel.add(lbl_revno4);
		
		String path4 = "C:\\Users\\SMHRD\\git\\repository\\Team\\img\\베어트리파크 철쭉제.jpg";
		ImageIcon home4 = new ImageIcon(path4);
		Image originImg4 = home4.getImage();
		Image changedImg4 = originImg4.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		ImageIcon Icon4 = new ImageIcon(changedImg4);
		
		lbl_img4 = new JLabel("<html>"+review.get(17).getRev_date()+"<br>평점 : " +review.get(17).getRev_score()+"점 \t 연령: " + review.get(17).getAge()+"대 <br>" + review.get(17).getRev_con()+"<html>");
		lbl_img4.setFont(new Font("빙그레체", Font.PLAIN, 12));
		panel.add(lbl_img4);
		
		lbl_review4 = new JLabel(Icon4);
		panel.add(lbl_review4);
		
		
		JButton btnNewButton = new JButton("\uB2E4\uC74C \uB9AC\uBDF0");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ReviewGUI2 review2 = new ReviewGUI2();
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("빙그레체", Font.PLAIN, 13));
		btnNewButton.setBounds(308, 602, 90, 49);
		frame.getContentPane().add(btnNewButton);
	}
}
