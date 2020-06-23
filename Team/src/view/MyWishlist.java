package view;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyWishlist {

	private JFrame frame;

	public MyWishlist() {
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
		frame.getContentPane().add(panel, "name_679360307678200");
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uCC1C\uD55C \uBAA9\uB85D");
		lblNewLabel.setFont(new Font("함초롬바탕", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(87, 34, 264, 59);
		panel.add(lblNewLabel);
		
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
		lbl_back.setBounds(25, 557, 75, 72);
		panel.add(lbl_back);
	}

}
