package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import controller.Controller;
import model.MemberVO;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyPageEdit {

	private JFrame frame;
	private JPasswordField txt_pw;
	private Controller controller = LoginGUI.controller;


	public MyPageEdit() {
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
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, "name_670626550243000");
		panel.setLayout(null);
		
		String path1 = "C:\\Users\\SMHRD\\Desktop\\JavaStudy\\0615GUI\\src\\icon\\뒤로가기.png";
		ImageIcon search1 = new ImageIcon(path1);
		Image originImg1 = search1.getImage(); 
		//추출된 Image의 크기를 조절하여 새로운 Image객체 생성
		Image changedImg1= originImg1.getScaledInstance(65, 62, Image.SCALE_SMOOTH );
		//새로운 Image로 ImageIcon객체를 생성
		ImageIcon Icon1 = new ImageIcon(changedImg1);
		
		JLabel lbl_back = new JLabel(Icon1);
		lbl_back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		lbl_back.setBounds(27, 564, 74, 68);
		panel.add(lbl_back);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0 \uC815\uBCF4 \uC218\uC815");
		lblNewLabel.setFont(new Font("함초롬바탕", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 26, 407, 86);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uD68C\uC6D0\uC815\uBCF4\uB97C \uC218\uC815\uD558\uC2DC\uB824\uBA74 \uBE44\uBC00\uBC88\uD638\uB97C \uC785\uB825\uD574\uC8FC\uC138\uC694.");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("함초롬바탕", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(12, 305, 407, 86);
		panel.add(lblNewLabel_1);
		
		txt_pw = new JPasswordField();
		txt_pw.setBounds(45, 392, 271, 41);
		panel.add(txt_pw);
		txt_pw.setColumns(10);
		
		JButton btnNewButton = new JButton("Go");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemberVO loginUser = controller.getLoginUser();
				MemberVO id = new MemberVO(loginUser.getId());
				
				String pw = String.valueOf(txt_pw.getPassword());
				
				if (pw.equals(controller.select(id).getPw())) {
					MemberVO password = new MemberVO(pw);
					frame.dispose();
					MyPageEdit2 page2 = new MyPageEdit2();
				}else {
					JOptionPane.showMessageDialog(frame,
						    "비밀번호를 확인해주세요",
						    "회원 정보 수정",
						    JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(335, 392, 57, 41);
		panel.add(btnNewButton);
		
		String path2 = "C:\\Users\\SMHRD\\Desktop\\JavaStudy\\0615GUI\\src\\icon\\불꽃.png";
		ImageIcon bg = new ImageIcon(path2);
		Image originImg2 = bg.getImage(); 
		//추출된 Image의 크기를 조절하여 새로운 Image객체 생성
		Image changedImg2= originImg2.getScaledInstance(434, 660, Image.SCALE_SMOOTH );
		//새로운 Image로 ImageIcon객체를 생성
		ImageIcon Icon2 = new ImageIcon(changedImg2);
		
		JLabel lbl_bg2 = new JLabel(Icon2);
		lbl_bg2.setBounds(0, 0, 434, 661);
		panel.add(lbl_bg2);
	
	}
}
