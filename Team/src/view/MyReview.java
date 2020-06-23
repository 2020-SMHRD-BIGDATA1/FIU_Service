package view;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollBar;

public class MyReview {

	private JFrame frame;
	private JTextField txt_search;

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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, "name_676000560127500");
		panel.setLayout(null);
		
		String path2 = "C:\\Users\\SMHRD\\Desktop\\JavaStudy\\0615GUI\\src\\icon\\불꽃축제.jpg";
		ImageIcon a = new ImageIcon(path2);
		Image b = a.getImage(); 
		//추출된 Image의 크기를 조절하여 새로운 Image객체 생성
		Image img= b.getScaledInstance(142, 142, Image.SCALE_SMOOTH );
		//새로운 Image로 ImageIcon객체를 생성
		ImageIcon Icon2 = new ImageIcon(img);
		
		
		JLabel lblNewLabel_1 = new JLabel(Icon2);
		lblNewLabel_1.setBackground(Color.PINK);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(24, 208, 142, 142);
		panel.add(lblNewLabel_1);
		
		String path = "C:\\Users\\SMHRD\\Desktop\\JavaStudy\\0615GUI\\src\\icon\\검색.png";
		ImageIcon search = new ImageIcon(path);
		Image originImg2 = search.getImage(); 
		//추출된 Image의 크기를 조절하여 새로운 Image객체 생성
		Image changedImg2= originImg2.getScaledInstance(42, 41, Image.SCALE_SMOOTH );
		//새로운 Image로 ImageIcon객체를 생성
		ImageIcon Icon = new ImageIcon(changedImg2);
		
		JLabel lbl_search = new JLabel(Icon);
		lbl_search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(frame,
					    "검색 결과를 찾고 있습니다.",
					    "검색 결과",
					    JOptionPane.PLAIN_MESSAGE);
			}
		});
		lbl_search.setBounds(368, 103, 42, 41);
		panel.add(lbl_search);
		
		JLabel lblNewLabel = new JLabel("\uB0B4 \uD6C4\uAE30");
		lblNewLabel.setFont(new Font("함초롬바탕", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(63, 22, 292, 68);
		panel.add(lblNewLabel);
		
		txt_search = new JTextField();
		txt_search.setHorizontalAlignment(SwingConstants.LEFT);
		txt_search.setText("\uAC80\uC0C9\uD558\uAE30");
		txt_search.setBounds(259, 103, 108, 42);
		panel.add(txt_search);
		txt_search.setColumns(10);
		
		
		
		JLabel lblNewLabel_1_1 = new JLabel("\uCD95\uC81C\uC0AC\uC9C42");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setBackground(Color.ORANGE);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(24, 367, 142, 142);
		panel.add(lblNewLabel_1_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("\uC4F8\uC4F8\uD558\uB7B4? \uC5BC\uC74C\uC5D0 \uC2F8\uC778 \uB9CC\uBB3C\uC740 \uC5BC\uC74C\uC774 \uC788\uC744 \uBFD0\uC774\uB2E4 \uADF8\uB4E4\uC5D0\uAC8C \uC0DD\uBA85\uC744 \uBD88\uC5B4 \uB123\uB294 \uAC83\uC740 \uB530\uB73B\uD55C \uBD04\uBC14\uB78C\uC774\uB2E4 \uD480\uBC2D\uC5D0 \uC18D\uC78E\uB098\uACE0 \uAC00\uC9C0\uC5D0 \uC2F9\uC774 \uD2B8\uACE0 \uAF43 \uD53C\uACE0 \uC0C8 \uC6B0\uB294 \uBD04\uB0A0\uC758 \uCC9C\uC9C0\uB294 \uC5BC\uB9C8\uB098 \uAE30\uC058\uBA70 \uC5BC\uB9C8\uB098 \uC544\uB984\uB2E4\uC6B0\uB0D0? ");
		textPane.setBounds(198, 208, 189, 142);
		panel.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText("\uD488\uACE0 \uC788\uB294 \uC774\uC0C1! \uC774\uAC83\uC774\uC57C\uB9D0\uB85C \uBB34\uD55C\uD55C \uAC00\uCE58\uB97C \uAC00\uC9C4 \uAC83\uC774\uB2E4 \uC0AC\uB78C\uC740 \uD06C\uACE0 \uC791\uACE0 \uAC04\uC5D0 \uC774\uC0C1\uC774 \uC788\uC74C\uC73C\uB85C\uC368 \uC6A9\uAC10\uD558\uACE0 \uAD73\uC138\uAC8C \uC0B4 \uC218 \uC788\uB294 \uAC83\uC774\uB2E4 \uC11D\uAC00\uB294 \uBB34\uC5C7\uC744 \uC704\uD558\uC5EC \uC124\uC0B0\uC5D0\uC11C \uACE0\uD589\uC744 \uD558\uC600\uC73C\uBA70 \uC608\uC218\uB294 \uBB34\uC5C7\uC744 \uC704\uD558\uC5EC \uAD11\uC57C\uC5D0\uC11C \uBC29\uD669\uD558\uC600\uC73C\uBA70 \uACF5\uC790\uB294 >??????????????????");
		textPane_1.setBounds(198, 377, 189, 132);
		panel.add(textPane_1);
		
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
		lbl_back.setBounds(41, 558, 65, 62);
		panel.add(lbl_back);
		
		
	
	}
}
